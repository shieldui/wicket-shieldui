package com.shieldui.wicket.numerictextbox;

import com.shieldui.wicket.WidgetComponentBase;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class NumericTextBox extends WidgetComponentBase {
    private static final long serialVersionUID = 1L;
    
    private final NumericTextBoxOptions options = new NumericTextBoxOptions();
    
    public NumericTextBox(String id)
    {
        super(id, "NumericTextBox");
    }
    
    @Override
    public NumericTextBoxOptions getOptions()
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
