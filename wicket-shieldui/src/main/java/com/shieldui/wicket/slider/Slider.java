package com.shieldui.wicket.slider;

import com.shieldui.wicket.WidgetComponentBase;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class Slider extends WidgetComponentBase
{
    private static final long serialVersionUID = 1L;
    
    private final SliderOptions options = new SliderOptions();
    
    public Slider(String id)
    {
        super(id, "Slider");
    }
    
    @Override
    public SliderOptions getOptions()
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
