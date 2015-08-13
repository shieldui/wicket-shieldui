package com.shieldui.wicket.accordion;

import com.shieldui.wicket.WidgetComponentBase;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class Accordion extends WidgetComponentBase
{
    private static final long serialVersionUID = 1L;
    
    private final AccordionOptions options = new AccordionOptions();
    
    public Accordion(String id)
    {
        super(id, "Accordion");
    }
    
    @Override
    public AccordionOptions getOptions()
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
