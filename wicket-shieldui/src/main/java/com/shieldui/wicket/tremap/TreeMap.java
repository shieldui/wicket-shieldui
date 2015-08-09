package com.shieldui.wicket.tremap;

import com.shieldui.wicket.WidgetComponentBase;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class TreeMap extends WidgetComponentBase
{
    private static final long serialVersionUID = 1L;
    
    private final TreeMapOptions options = new TreeMapOptions();
    
    public TreeMap(String id)
    {
        super(id, "TreeMap");
    }
    
    @Override
    public TreeMapOptions getOptions()
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
