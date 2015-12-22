package com.shieldui.wicket.tabs;

import com.shieldui.wicket.WidgetComponentBase;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class Tabs extends WidgetComponentBase
{
    private static final long serialVersionUID = 1L;
    
    private final TabsOptions options = new TabsOptions();
    
    public Tabs(String id)
    {
        super(id, "Tabs");
    }
    
    @Override
    public TabsOptions getOptions()
    {
        return options;
    }
    
    public void setEnabled(AjaxRequestTarget target, Integer index, Boolean enabled)
    {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.enabled(" + 
                                index + ", " + (enabled ? "true" : "false") + "); }"
                )
        );
    }
    
    public void setActive(AjaxRequestTarget target, Integer index, Boolean active)
    {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.active(" + 
                                index + ", " + (active ? "true" : "false") + "); }"
                )
        );
    }
}
