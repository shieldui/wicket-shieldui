package com.shieldui.wicket.button;

import com.shieldui.wicket.WidgetComponentBase;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class Button extends WidgetComponentBase
{
    private static final long serialVersionUID = 1L;
    
    private final ButtonOptions options = new ButtonOptions();
    
    public Button(String id)
    {
        super(id, "Button");
    }
    
    @Override
    public ButtonOptions getOptions()
    {
        return options;
    }
    
    public void setEnabled(AjaxRequestTarget target, Boolean enabled)
    {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.enabled(" + (enabled ? "true" : "false") + "); }"
                )
        );
    }
    
    public void setChecked(AjaxRequestTarget target, Boolean checked)
    {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.checked(" + (checked ? "true" : "false") + "); }"
                )
        );
    }
}
