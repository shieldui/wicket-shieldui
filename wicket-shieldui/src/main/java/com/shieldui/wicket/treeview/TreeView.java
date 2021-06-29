package com.shieldui.wicket.treeview;

import com.shieldui.wicket.WidgetComponentBase;
import java.util.HashMap;
import java.util.List;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class TreeView extends WidgetComponentBase
{
    private static final long serialVersionUID = 1L;
    
    private final TreeViewOptions options = new TreeViewOptions();
    
    public TreeView(String id)
    {
        super(id, "TreeView");
    }
    
    @Override
    public TreeViewOptions getOptions()
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
    
    public void setEnabled(AjaxRequestTarget target, Boolean enabled, List<Integer> path)
    {
        target.appendJavaScript(
            jsClosure(
                "var sw = $('#" + getMarkupId() + "').swidget('" + getWidgetType() + "'); if (sw) { " + 
                    "sw.enabled(" + (enabled ? "true" : "false") + ", [" + strJoin(",", path.toArray()) + "]); }"
            )
        );
    }
    
    public void setExpanded(AjaxRequestTarget target, Boolean expanded, List<Integer> path)
    {
        target.appendJavaScript(
            jsClosure(
                "var sw = $('#" + getMarkupId() + "').swidget('" + getWidgetType() + "'); if (sw) { " + 
                    "sw.expanded(" + (expanded ? "true" : "false") + ", [" + strJoin(",", path.toArray()) + "]); }"
            )
        );
    }
    
    public void select(AjaxRequestTarget target, List<Integer> path)
    {
        target.appendJavaScript(
            jsClosure(
                "var sw = $('#" + getMarkupId() + "').swidget('" + getWidgetType() + "'); if (sw) { " + 
                    "sw.selected([" + strJoin(",", path.toArray()) + "]); }"
            )
        );
    }
    
    public void setChecked(AjaxRequestTarget target, Boolean checked, List<Integer> path)
    {
        target.appendJavaScript(
            jsClosure(
                "var sw = $('#" + getMarkupId() + "').swidget('" + getWidgetType() + "'); if (sw) { " + 
                    "sw.checked(" + (checked ? "true" : "false") + ", [" + strJoin(",", path.toArray()) + "]); }"
            )
        );
    }
    
    public void append(AjaxRequestTarget target, HashMap data, List<Integer> targetPath)
    {
        target.appendJavaScript(
            jsClosure(
                "var sw = $('#" + getMarkupId() + "').swidget('" + getWidgetType() + "'); if (sw) { " + 
                    "sw.append(" + hashToJson(data) + ", [" + strJoin(",", targetPath.toArray()) + "]); }"
            )
        );
    }
    
    public void append(AjaxRequestTarget target, List<Integer> sourcePath, List<Integer> targetPath)
    {
        target.appendJavaScript(
            jsClosure(
                "var sw = $('#" + getMarkupId() + "').swidget('" + getWidgetType() + "'); if (sw) { " + 
                    "sw.append([" + strJoin(",", sourcePath.toArray()) + "], [" + strJoin(",", targetPath.toArray()) + "]); }"
            )
        );
    }
    
    public void insertBefore(AjaxRequestTarget target, HashMap data, List<Integer> targetPath)
    {
        target.appendJavaScript(
            jsClosure(
                "var sw = $('#" + getMarkupId() + "').swidget('" + getWidgetType() + "'); if (sw) { " + 
                    "sw.insertBefore(" + hashToJson(data) + ", [" + strJoin(",", targetPath.toArray()) + "]); }"
            )
        );
    }
    
    public void insertBefore(AjaxRequestTarget target, List<Integer> sourcePath, List<Integer> targetPath)
    {
        target.appendJavaScript(
            jsClosure(
                "var sw = $('#" + getMarkupId() + "').swidget('" + getWidgetType() + "'); if (sw) { " + 
                    "sw.insertBefore([" + strJoin(",", sourcePath.toArray()) + "], [" + strJoin(",", targetPath.toArray()) + "]); }"
            )
        );
    }
    
    public void insertAfter(AjaxRequestTarget target, HashMap data, List<Integer> targetPath)
    {
        target.appendJavaScript(
            jsClosure(
                "var sw = $('#" + getMarkupId() + "').swidget('" + getWidgetType() + "'); if (sw) { " + 
                    "sw.insertAfter(" + hashToJson(data) + ", [" + strJoin(",", targetPath.toArray()) + "]); }"
            )
        );
    }
    
    public void insertAfter(AjaxRequestTarget target, List<Integer> sourcePath, List<Integer> targetPath)
    {
        target.appendJavaScript(
            jsClosure(
                "var sw = $('#" + getMarkupId() + "').swidget('" + getWidgetType() + "'); if (sw) { " + 
                    "sw.insertAfter([" + strJoin(",", sourcePath.toArray()) + "], [" + strJoin(",", targetPath.toArray()) + "]); }"
            )
        );
    }
    
    public void remove(AjaxRequestTarget target, List<Integer> path)
    {
        target.appendJavaScript(
            jsClosure(
                "var sw = $('#" + getMarkupId() + "').swidget('" + getWidgetType() + "'); if (sw) { " + 
                    "sw.remove([" + strJoin(",", path.toArray()) + "]); }"
            )
        );
    }
}
