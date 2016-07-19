package com.shieldui.wicket.timeline;

import com.shieldui.wicket.WidgetComponentBase;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class Timeline extends WidgetComponentBase
{
    private static final long serialVersionUID = 1L;
    
    private final TimelineOptions options = new TimelineOptions();
    
    public Timeline(String id)
    {
        super(id, "Timeline");
    }
    
    @Override
    public TimelineOptions getOptions()
    {
        return options;
    }
    
    public void setExpanded(AjaxRequestTarget target, Boolean expanded, Integer index)
    {
        target.appendJavaScript(
            jsClosure(
                "var sw = $('#" + getMarkupId() + "').swidget('" + getWidgetType() + "'); if (sw) { " + 
                    "sw.expanded(" + (expanded ? "true" : "false") + ", " + index + "); }"
            )
        );
    }
    
    public void expandAll(AjaxRequestTarget target)
    {
        target.appendJavaScript(
            jsClosure(
                "var sw = $('#" + getMarkupId() + "').swidget('" + getWidgetType() + "'); if (sw) { sw.expandAll(); }"
            )
        );
    }
    
    public void collapseAll(AjaxRequestTarget target)
    {
        target.appendJavaScript(
            jsClosure(
                "var sw = $('#" + getMarkupId() + "').swidget('" + getWidgetType() + "'); if (sw) { sw.collapseAll(); }"
            )
        );
    }
}
