package com.shieldui.wicket.dropdown;

import com.shieldui.wicket.WidgetComponentBase;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class DropDown extends WidgetComponentBase {
    private static final long serialVersionUID = 1L;
    
    private final DropDownOptions options = new DropDownOptions();
    
    public DropDown(String id)
    {
        super(id, "DropDown");
    }
    
    @Override
    public DropDownOptions getOptions()
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
    
    public void setSelected(AjaxRequestTarget target, Integer selected)
    {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.selected(" + selected + "); }"
                )
        );
    }
}
