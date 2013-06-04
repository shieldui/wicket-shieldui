package com.shieldui.wicket.chart;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.request.http.WebRequest;

public class Chart extends WebMarkupContainer
{
    private static final long serialVersionUID = 1L;

    private final Options options = new Options();
    
    // Chart class
    public Chart(String id)
    {
        super(id);
        setOutputMarkupId(true);
    }
    
    public Options getOptions()
    {
        return options;
    }
    
    public String getInitializationJS()
    {
        return "$('#" + getMarkupId() + "').shieldChart(" + options.toJson() + ");";
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
