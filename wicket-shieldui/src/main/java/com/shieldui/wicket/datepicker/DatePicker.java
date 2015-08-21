package com.shieldui.wicket.datepicker;

import com.shieldui.wicket.WidgetComponentBase;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class DatePicker extends WidgetComponentBase {
    private static final long serialVersionUID = 1L;
    
    private final DatePickerOptions options = new DatePickerOptions();
    
    public DatePicker(String id)
    {
        super(id, "DatePicker");
    }
    
    @Override
    public DatePickerOptions getOptions()
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
