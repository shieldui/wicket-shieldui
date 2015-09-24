package com.shieldui.wicket;

import java.util.HashMap;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.json.JsonFunction;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.request.http.WebRequest;

public abstract class WidgetComponentBase extends WebMarkupContainer implements IWidget
{
    private static final long serialVersionUID = 1L;
    
    private final String widgetType;
    private final HashMap<String, JsonFunction> serverEvents = new HashMap<String, JsonFunction>();
    
    public WidgetComponentBase(String id, String type)
    {
        super(id);
        widgetType = type;
        setOutputMarkupId(true);
    }
    
    public void setServerEvent(String eventName, JsonFunction jsonFunc)
    {
        serverEvents.put(eventName, jsonFunc);
    }
    
    public HashMap<String, JsonFunction> getServerEvents()
    {
        return serverEvents;
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
        String javascript = "$('#" + getMarkupId() + "').shield" + getWidgetType() + "(" + getOptions().toJson() + ")";
        
        // add all server events if any
        HashMap<String, JsonFunction> events = getServerEvents();
        if (events.size() > 0) {
            javascript += ".swidget('" + getWidgetType() + "')";
            for (String event : events.keySet()) {
                javascript += ".on('" + event + "', " + events.get(event) + ")";
            }
        }
        
        return javascript + ";";
    }
    
    @Override
    public void renderHead(IHeaderResponse response)
    {
        super.renderHead(response);
        
        // insert the initialization javascript in the head only if not ajax request (i.e. when page reloads)
        if (!((WebRequest)getRequest()).isAjax()) {
            response.render(OnDomReadyHeaderItem.forScript("jQuery(function($){" + getInitializationJS() + "});"));
        }
    }
    
    public void reInitialize(AjaxRequestTarget target)
    {
        target.add(this);
        target.prependJavaScript(jsClosure("var sw = $('#" + getMarkupId() + "').swidget('" + getWidgetType() + "'); if (sw) { sw.destroy(); }"));
        target.appendJavaScript(jsClosure(getInitializationJS()));
    }
    
    public void setVisible(AjaxRequestTarget target, Boolean visible)
    {
        target.appendJavaScript(
            jsClosure(
                "var sw = $('#" + getMarkupId() + "').swidget('" + getWidgetType() + "'); if (sw) { sw.visible(" + (visible ? "true" : "false") + "); }"
            )
        );
    }
    
    public void focus(AjaxRequestTarget target)
    {
        target.appendJavaScript(
            jsClosure(
                "var sw = $('#" + getMarkupId() + "').swidget('" + getWidgetType() + "'); if (sw) { sw.focus(); }"
            )
        );
    }
}
