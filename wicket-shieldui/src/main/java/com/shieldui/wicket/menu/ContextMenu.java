package com.shieldui.wicket.menu;

import com.shieldui.wicket.WidgetComponentBase;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class ContextMenu extends WidgetComponentBase
{
    private static final long serialVersionUID = 1L;
    
    private final ContextMenuOptions options = new ContextMenuOptions();
    
    public ContextMenu(String id)
    {
        super(id, "ContextMenu");
    }
    
    @Override
    public ContextMenuOptions getOptions()
    {
        return options;
    }
    
    private String strJoin(String delimiter, Object[] items)
    {
        String result = "";
        
        for (int i=0; i<items.length; i++) {
            result += items[i];
            if (i < items.length - 1) {
                result += delimiter;
            }
        }
        
        return result;
    }
    
    public void setEnabled(AjaxRequestTarget target, Boolean enabled, Integer ... indices)
    {
        target.appendJavaScript(
            jsClosure(
                "var sw = $('#" + getMarkupId() + "').swidget('" + getWidgetType() + "'); if (sw) { " + 
                    "sw.enabled(" + (enabled ? "true" : "false") + ", " + strJoin(",", indices) + "); }"
            )
        );
    }
    
    public void setExpanded(AjaxRequestTarget target, Boolean expanded, Integer ... indices)
    {
        target.appendJavaScript(
            jsClosure(
                "var sw = $('#" + getMarkupId() + "').swidget('" + getWidgetType() + "'); if (sw) { " + 
                    "sw.expanded(" + (expanded ? "true" : "false") + ", " + strJoin(",", indices) + "); }"
            )
        );
    }
    
    public void setSelected(AjaxRequestTarget target, Boolean selected, Integer ... indices)
    {
        target.appendJavaScript(
            jsClosure(
                "var sw = $('#" + getMarkupId() + "').swidget('" + getWidgetType() + "'); if (sw) { " + 
                    "sw.selected(" + (selected ? "true" : "false") + ", " + strJoin(",", indices) + "); }"
            )
        );
    }
}
