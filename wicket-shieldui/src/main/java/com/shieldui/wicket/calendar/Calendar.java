package com.shieldui.wicket.calendar;

import com.shieldui.wicket.WidgetComponentBase;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class Calendar extends WidgetComponentBase
{
    private static final long serialVersionUID = 1L;
    
    private final CalendarOptions options = new CalendarOptions();
    
    public Calendar(String id)
    {
        super(id, "Calendar");
    }

    @Override
    public CalendarOptions getOptions()
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
