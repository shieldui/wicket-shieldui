package com.shieldui.wicket.editor;

import com.shieldui.wicket.WidgetComponentBase;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class Editor extends WidgetComponentBase
{
    private static final long serialVersionUID = 1L;
    
    private final EditorOptions options = new EditorOptions();
    
    public Editor(String id)
    {
        super(id, "Editor");
    }
    
    @Override
    public EditorOptions getOptions()
    {
        return options;
    }
    
    public void setEnabled(AjaxRequestTarget target, Boolean enabled)
    {
        target.appendJavaScript(
            jsClosure(
                "var sw = $('#" + getMarkupId() + "').swidget('" + getWidgetType() + "'); if (sw) { " + 
                    "sw.enabled(" + (enabled ? "true" : "false") + "); }"
            )
        );
    }
}
