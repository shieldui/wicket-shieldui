package com.shieldui.wicket.toggle;

import com.shieldui.wicket.WidgetBase;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class Switch extends WidgetBase
{
    private static final long serialVersionUID = 1L;
    
    private final SwitchOptions options = new SwitchOptions();
    
    public Switch(String id)
    {
        super(id, "shieldSwitch");
    }
    
    @Override
    public SwitchOptions getOptions()
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
