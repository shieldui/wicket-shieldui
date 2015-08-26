package com.shieldui.wicket.colorpicker;

import com.shieldui.wicket.WidgetComponentBase;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class ColorPicker extends WidgetComponentBase {
    private static final long serialVersionUID = 1L;
    
    private final ColorPickerOptions options = new ColorPickerOptions();
    
    public ColorPicker(String id)
    {
        super(id, "ColorPicker");
    }
    
    @Override
    public ColorPickerOptions getOptions()
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
    
    public void setValue(AjaxRequestTarget target, String value)
    {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.value(" + value + "); }"
                )
        );
    }
}
