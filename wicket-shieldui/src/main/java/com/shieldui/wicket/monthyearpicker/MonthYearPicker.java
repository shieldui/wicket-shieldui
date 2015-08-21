package com.shieldui.wicket.monthyearpicker;

import com.shieldui.wicket.WidgetComponentBase;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class MonthYearPicker extends WidgetComponentBase {
    private static final long serialVersionUID = 1L;
    
    private final MonthYearPickerOptions options = new MonthYearPickerOptions();
    
    public MonthYearPicker(String id)
    {
        super(id, "MonthYearPicker");
    }
    
    @Override
    public MonthYearPickerOptions getOptions()
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
}
