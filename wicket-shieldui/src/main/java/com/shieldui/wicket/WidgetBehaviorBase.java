package com.shieldui.wicket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.apache.wicket.Component;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.attributes.CallbackParameter;
import org.apache.wicket.ajax.json.JSONFunction;
import org.apache.wicket.behavior.Behavior;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;
import org.apache.wicket.markup.head.PriorityHeaderItem;
import org.apache.wicket.request.http.WebRequest;

public abstract class WidgetBehaviorBase extends Behavior implements IWidget
{
    private static final long serialVersionUID = 1L;
    
    private final String selector;
    private final String widgetType;
    private final Boolean priorityHI;
    private final HashMap<String, JSONFunction> serverEvents = new HashMap<String, JSONFunction>();
    private final List<AbstractEventListenerBehavior> listeners = new ArrayList<AbstractEventListenerBehavior>();
    
    public WidgetBehaviorBase(String selector, String type)
    {
        this(selector, type, false);
    }
    
    public WidgetBehaviorBase(String selector, String type, Boolean priorityHI)
    {
        this.selector = selector;
        this.widgetType = type;
        this.priorityHI = priorityHI;
    }
    
    public abstract OptionsBase getOptions();
    
    public void setServerEvent(String eventName, JSONFunction jsonFunc)
    {
        serverEvents.put(eventName, jsonFunc);
    }
    
    public HashMap<String, JSONFunction> getServerEvents()
    {
        return serverEvents;
    }
    
    protected String getSelector()
    {
        return selector;
    }
    
    protected String getWidgetType()
    {
        return widgetType;
    }
    
    protected String jsClosure(String code)
    {
        return "(function($){" + code + "})(jQuery);";
    }
    
    protected String getInitializationJS()
    {
        String javascript = "$('" + selector + "').shield" + getWidgetType() + "(" + getOptions().toJson() + ")";
        
        // (re)process server events
        //attachServerEvents(compo);
        
        // add all server events if any
        HashMap<String, JSONFunction> events = getServerEvents();
        if (events.size() > 0) {
            javascript += ".swidget('" + getWidgetType() + "')";
            for (String event : events.keySet()) {
                javascript += ".on('" + event + "', " + events.get(event) + ")";
            }
        }
        
        return javascript + ";";
    }
    
    @Override
    public void renderHead(Component component, IHeaderResponse response)
    {
        super.renderHead(component, response);
        
        // insert the initialization javascript in the head only if not ajax request (i.e. when page reloads)
        if (!((WebRequest)component.getRequest()).isAjax()) {
            if (priorityHI) {
                // if specified, insert the resource on the top (as a priority header item)
                response.render(new PriorityHeaderItem(OnDomReadyHeaderItem.forScript("jQuery(function($){" + getInitializationJS() + "});")));
            }
            else {
                response.render(OnDomReadyHeaderItem.forScript("jQuery(function($){" + getInitializationJS() + "});"));
            }
        }
    }
    
    public void reInitialize(AjaxRequestTarget target)
    {
        target.prependJavaScript(jsClosure("var sw = $('" + selector + "').swidget('" + getWidgetType() + "'); if (sw) { sw.destroy(); }"));
        target.appendJavaScript(jsClosure(getInitializationJS()));
    }
    
    public void setVisible(AjaxRequestTarget target, Boolean visible)
    {
        target.appendJavaScript(
            jsClosure(
                "var sw = $('" + selector + "').swidget('" + getWidgetType() + "'); if (sw) { sw.visible(" + (visible ? "true" : "false") + "); }"
            )
        );
    }
    
    public WidgetBehaviorBase add(AbstractEventListenerBehavior ... listeners)
    {
        // save the listener behavior(s) for later processing
        // (see the onConfigure() function below)
        this.listeners.addAll(Arrays.asList(listeners));
        return this;
    }
    
    @Override
    public void onConfigure(Component component)
    {
        for (AbstractEventListenerBehavior listener : listeners) {
            // add the listener behavior to the 
            component.add(listener);
            
            String callback = listener.getCallbackFunction(CallbackParameter.converted(listener.eventName, "JSON.stringify(" + listener.toJson(listener.eventVarName) + ")")).toString();
            setServerEvent(listener.eventName, new JSONFunction(callback));
        }
    }
}
