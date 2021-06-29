package com.shieldui.wicket.grid;

import com.shieldui.wicket.WidgetComponentBase;
import com.shieldui.wicket.datasource.DataSourceOptions;
import java.util.HashMap;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.json.JSONFunction;

public class Grid extends WidgetComponentBase
{
    private static final long serialVersionUID = 1L;
    
    private final GridOptions options = new GridOptions();
    
    public Grid(String id)
    {
        super(id, "Grid");
    }
    
    @Override
    public GridOptions getOptions()
    {
        return options;
    }
    
    public void addRow(AjaxRequestTarget target, HashMap<String, Object> item)
    {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.addRow(" + hashToJson(item) + "); }"
                )
        );
    }
    
    public void cancelEditing(AjaxRequestTarget target)
    {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.cancelEditing(); }"
                )
        );
    }
    
    public void clearSelection(AjaxRequestTarget target)
    {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.clearSelection(); }"
                )
        );
    }
    
    public void collapseRow(AjaxRequestTarget target, Integer index) {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.collapseRow(" + index + "); }"
                )
        );
    }
    
    public void collapseRow(AjaxRequestTarget target, JSONFunction row) {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.collapseRow(" + row + "); }"
                )
        );
    }
    
    public void deleteRow(AjaxRequestTarget target, Integer index) {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.deleteRow(" + index + "); }"
                )
        );
    }
    
    public void editCell(AjaxRequestTarget target, Integer rowIndex, Integer colIndex) {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.editCell(" + rowIndex + ", " + colIndex + "); }"
                )
        );
    }
    
    public void editRow(AjaxRequestTarget target, Integer index) {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.editRow(" + index + "); }"
                )
        );
    }
    
    public void expandRow(AjaxRequestTarget target, Integer index) {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.expandRow(" + index + "); }"
                )
        );
    }
    
    public void expandRow(AjaxRequestTarget target, JSONFunction row) {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.expandRow(" + row + "); }"
                )
        );
    }
    
    public void filter(AjaxRequestTarget target, DataSourceOptions.FilterOption filter) {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.filter(" + hashToJson(filter.toHashMap()) + "); }"
                )
        );
    }
    
    public void insertRow(AjaxRequestTarget target, HashMap<String, Object> item, Integer index)
    {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.insertRow(" + hashToJson(item) + ", " + index + "); }"
                )
        );
    }
    
    public void page(AjaxRequestTarget target, Integer page)
    {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.page(" + page + "); }"
                )
        );
    }
    
    public void pageSize(AjaxRequestTarget target, Integer pageSize)
    {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.pageSize(" + pageSize + "); }"
                )
        );
    }
    
    public void refresh(AjaxRequestTarget target)
    {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.refresh(); }"
                )
        );
    }
    
    public void reorderColumn(AjaxRequestTarget target, Integer oldIndex, Integer newIndex)
    {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.reorderColumn(" + oldIndex + ", " + newIndex + "); }"
                )
        );
    }
    
    public void revertChanges(AjaxRequestTarget target)
    {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.revertChanges(); }"
                )
        );
    }
    
    public void saveChanges(AjaxRequestTarget target)
    {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.saveChanges(); }"
                )
        );
    }
    
    public void select(AjaxRequestTarget target, String selector)
    {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.select(" + selector + "); }"
                )
        );
    }
    
    public void sort(AjaxRequestTarget target, String field, Boolean desc, Boolean unsort)
    {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.sort(\"" + field + "\", " + (desc ? "true" : "false") + "," + (unsort ? "true" : "false") + ")); }"
                )
        );
    }
}
