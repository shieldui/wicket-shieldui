package com.shieldui.wicket.timepicker;

import com.shieldui.wicket.WidgetComponentBase;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class TimePicker extends WidgetComponentBase {
    private static final long serialVersionUID = 1L;
    
    private final TimePickerOptions options = new TimePickerOptions();
    
    public TimePicker(String id)
    {
        super(id, "TimePicker");
    }
    
    @Override
    public TimePickerOptions getOptions()
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
