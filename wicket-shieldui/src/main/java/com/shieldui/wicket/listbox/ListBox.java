package com.shieldui.wicket.listbox;

import com.shieldui.wicket.WidgetComponentBase;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class ListBox extends WidgetComponentBase
{
    private static final long serialVersionUID = 1L;
    
    private final ListBoxOptions options = new ListBoxOptions();
    
    public ListBox(String id)
    {
        super(id, "ListBox");
    }
    
    @Override
    public ListBoxOptions getOptions()
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
