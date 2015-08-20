package com.shieldui.wicket.checkbox;

import com.shieldui.wicket.WidgetComponentBase;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class CheckBox extends WidgetComponentBase {
    private static final long serialVersionUID = 1L;
    
    private final CheckBoxOptions options = new CheckBoxOptions();
    
    public CheckBox(String id)
    {
        super(id, "CheckBox");
    }
    
    @Override
    public CheckBoxOptions getOptions()
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
