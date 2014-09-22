package com.shieldui.wicket.button;

import com.shieldui.wicket.WidgetBase;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class Button extends WidgetBase
{
    private static final long serialVersionUID = 1L;
    
    private final ButtonOptions options = new ButtonOptions();
    
    public Button(String id)
    {
        super(id, "shieldButton");
    }
    
    @Override
    public ButtonOptions getOptions()
    {
        return options;
    }
    
    public void setEnabled(AjaxRequestTarget target, Boolean enabled)
    {
        //target.add(this);
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(); if (sw) { sw.enabled(" + (enabled ? "true" : "false") + "); }"
                )
        );
    }
    
    public void setChecked(AjaxRequestTarget target, Boolean checked)
    {
        //target.add(this);
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(); if (sw) { sw.checked(" + (checked ? "true" : "false") + "); }"
                )
        );
    }
}
