package com.shieldui.wicket.textbox;

import com.shieldui.wicket.WidgetComponentBase;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class TextBox extends WidgetComponentBase {
    private static final long serialVersionUID = 1L;
    
    private final TextBoxOptions options = new TextBoxOptions();
    
    public TextBox(String id)
    {
        super(id, "TextBox");
    }
    
    @Override
    public TextBoxOptions getOptions()
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
