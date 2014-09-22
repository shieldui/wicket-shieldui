package com.shieldui.wicket;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.request.http.WebRequest;

public abstract class WidgetBase extends WebMarkupContainer
{
    private static final long serialVersionUID = 1L;
    
    private final String widgetName;
    
    public WidgetBase(String id, String name)
    {
        super(id);
        widgetName = name;
        setOutputMarkupId(true);
    }
    
    public abstract OptionsBase getOptions();
    
    protected String getWidgetName()
    {
        return widgetName;
    }
    
    protected String jsClosure(String code)
    {
        return "(function($){" + code + "})(jQuery);";
    }
    
    protected String getInitializationJS()
    {
        return "$('#" + getMarkupId() + "')." + getWidgetName() + "(" + getOptions().toJson() + ");";
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
        target.prependJavaScript(jsClosure("var sw = $('#" + getMarkupId() + "').swidget(); if (sw) { sw.destroy(); }"));
        target.appendJavaScript(jsClosure(getInitializationJS()));
    }
    
    public void setVisible(AjaxRequestTarget target, Boolean visible)
    {
        //target.add(this);
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(); if (sw) { sw.visible(" + (visible ? "true" : "false") + "); }"
                )
        );
    }
}
