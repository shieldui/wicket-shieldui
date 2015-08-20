package com.shieldui.wicket.radiobutton;

import com.shieldui.wicket.WidgetComponentBase;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class RadioButton extends WidgetComponentBase {
    private static final long serialVersionUID = 1L;
    
    private final RadioButtonOptions options = new RadioButtonOptions();
    
    public RadioButton(String id)
    {
        super(id, "RadioButton");
    }
    
    @Override
    public RadioButtonOptions getOptions()
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
