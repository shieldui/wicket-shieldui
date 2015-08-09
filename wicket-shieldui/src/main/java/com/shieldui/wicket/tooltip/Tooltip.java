package com.shieldui.wicket.tooltip;

import com.shieldui.wicket.WidgetBehaviorBase;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class Tooltip extends WidgetBehaviorBase
{
    private static final long serialVersionUID = 1L;

    private final TooltipOptions options = new TooltipOptions();
    
    public Tooltip(String selector)
    {
        super(selector, "Tooltip");
    }
    
    @Override
    public TooltipOptions getOptions()
    {
        return options;
    }
    
    public void setEnabled(AjaxRequestTarget target, Boolean enabled)
    {
        target.appendJavaScript(
            jsClosure(
                "var sw = $('" + getSelector() + "').swidget('" + getWidgetType() + "'); if (sw) { sw.enabled(" + (enabled ? "true" : "false") + "); }"
            )
        );
    }
}
