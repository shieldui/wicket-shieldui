package com.shieldui.wicket.window;

import com.shieldui.wicket.WidgetComponentBase;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class Window extends WidgetComponentBase {
    private static final long serialVersionUID = 1L;
    
    private final WindowOptions options = new WindowOptions();
    
    public Window(String id)
    {
        super(id, "Window");
    }
    
    @Override
    public WindowOptions getOptions()
    {
        return options;
    }
    
    public void setVisible(AjaxRequestTarget target, Boolean visible)
    {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.visible(" + (visible ? "true" : "false") + "); }"
                )
        );
    }
    
    public void setPinned(AjaxRequestTarget target, Boolean pinned)
    {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.pinned(" + (pinned ? "true" : "false") + "); }"
                )
        );
    }
    
    public void setMinimized(AjaxRequestTarget target, Boolean minimized)
    {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.minimized(" + (minimized ? "true" : "false") + "); }"
                )
        );
    }
    
    public void setMaximized(AjaxRequestTarget target, Boolean maximized)
    {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.maximized(" + (maximized ? "true" : "false") + "); }"
                )
        );
    }
    
    public void close(AjaxRequestTarget target)
    {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.close(); }"
                )
        );
    }
    
    public void center(AjaxRequestTarget target)
    {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.center(); }"
                )
        );
    }
    
    public void setPosition(AjaxRequestTarget target, WindowOptions.PositionOptions position)
    {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.position({ 'left':" + position.getLeft() + ", 'top':" + position.getTop() + "}); }"
                )
        );
    }
}
