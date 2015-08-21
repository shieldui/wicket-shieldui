package com.shieldui.wicket.datetimepicker;

import com.shieldui.wicket.WidgetComponentBase;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class DateTimePicker extends WidgetComponentBase {
    private static final long serialVersionUID = 1L;
    
    private final DateTimePickerOptions options = new DateTimePickerOptions();
    
    public DateTimePicker(String id)
    {
        super(id, "DateTimePicker");
    }
    
    @Override
    public DateTimePickerOptions getOptions()
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
