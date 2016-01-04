package com.shieldui.wicket.button;

import com.shieldui.wicket.WidgetComponentBase;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class SplitButton extends WidgetComponentBase
{
    private static final long serialVersionUID = 1L;
    
    private final SplitButtonOptions options = new SplitButtonOptions();
    
    public SplitButton(String id)
    {
        super(id, "SplitButton");
    }
    
    @Override
    public SplitButtonOptions getOptions()
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
    
    public void closeMenu(AjaxRequestTarget target)
    {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.menu.visible(false); }"
                )
        );
    }
}
