package com.shieldui.wicket;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.request.http.WebRequest;

public abstract class WidgetBase extends WebMarkupContainer
{
    private static final long serialVersionUID = 1L;
    
    public WidgetBase(String id)
    {
        super(id);
        setOutputMarkupId(true);
    }
    
    public abstract OptionsBase getOptions();
    public abstract String getWidgetName();
    
    public String getInitializationJS()
    {
        return "$('#" + getMarkupId() + "')." + getWidgetName() + "(" + getOptions().toJson() + ");";
    }
    
    public String getDestroyJS()
    {
        return "var sw = $('#" + getMarkupId() + "').swidget(); if (sw) { sw.destroy(); }";
    }
    
    @Override
    public void renderHead(IHeaderResponse response)
    {
        super.renderHead(response);
        
        // insert the initialization javascript in the head only if not ajax (i.e. when page reload)
        if (!((WebRequest)getRequest()).isAjax()) {
            response.render(OnDomReadyHeaderItem.forScript("$(document).ready(function(){" + getInitializationJS() + "});"));
        }
    }
    
    public void reInitialize(AjaxRequestTarget target)
    {
        target.add(this);
        target.prependJavaScript(getDestroyJS());
        target.appendJavaScript(getInitializationJS());
    }
}