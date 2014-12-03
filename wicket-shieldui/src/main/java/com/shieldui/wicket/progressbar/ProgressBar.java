package com.shieldui.wicket.progressbar;

import com.shieldui.wicket.WidgetBase;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class ProgressBar extends WidgetBase
{
    private static final long serialVersionUID = 1L;
    
    private final ProgressBarOptions options = new ProgressBarOptions();
    
    public ProgressBar(String id)
    {
        super(id, "shieldProgressBar");
    }
    
    @Override
    public ProgressBarOptions getOptions()
    {
        return options;
    }
    
    public void setEnabled(AjaxRequestTarget target, Boolean enabled)
    {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(); if (sw) { sw.enabled(" + (enabled ? "true" : "false") + "); }"
                )
        );
    }
    
    public void setValue(AjaxRequestTarget target, Integer value)
    {
        _setValue(target, value);
    }
    
    public void setValue(AjaxRequestTarget target, Double value)
    {
        _setValue(target, value);
    }
    
    public void setValue(AjaxRequestTarget target, Float value)
    {
        _setValue(target, value);
    }
    
    private void _setValue(AjaxRequestTarget target, Object value)
    {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(); if (sw) { sw.value(" + value + "); }"
                )
        );
    }
}
