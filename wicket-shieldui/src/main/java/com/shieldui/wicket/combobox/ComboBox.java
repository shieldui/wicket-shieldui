package com.shieldui.wicket.combobox;

import com.shieldui.wicket.WidgetComponentBase;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class ComboBox extends WidgetComponentBase {
    private static final long serialVersionUID = 1L;
    
    private final ComboBoxOptions options = new ComboBoxOptions();
    
    public ComboBox(String id)
    {
        super(id, "ComboBox");
    }
    
    @Override
    public ComboBoxOptions getOptions()
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
