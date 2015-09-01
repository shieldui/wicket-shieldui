package com.shieldui.wicket.grid;

import com.shieldui.wicket.HashMapSerializable;
import com.shieldui.wicket.OptionsBase;
import com.shieldui.wicket.datasource.DataSourceOptions;
import com.shieldui.wicket.pager.PagerOptions.MessagesOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.apache.wicket.ajax.json.JsonFunction;

public class GridOptions extends OptionsBase
{
    private static final long serialVersionUID = 1L;
    
    // client events
    public enum Event
    {
        CANCEL ("cancel"),
        COLUMN_REORDER ("columnReorder"),
        COMMAND ("command"),
        DATA_BOUND ("dataBound"),
        DELETE ("delete"),
        DETAIL_CREATED ("detailCreated"),
        EDIT ("edit"),
        EDIT_WINDOW_OPEN ("editWindowOpen"),
        EDITOR_CREATING ("editorCreating"),
        ERROR ("error"),
        FILTER_WIDGET_CREATING ("filterWidgetCreating"),
        GET_CUSTOM_EDITOR_VALUE ("getCustomEditorValue"),
        GET_CUSTOM_FILTER_VALUE ("getCustomFilterValue"),
        GROUP ("group"),
        GROUPS_REORDER ("groupsReorder"),
        INSERT ("insert"),
        INSERT_WINDOW_OPEN ("insert_window_open"),
        SAVE ("save"),
        SELECTION_CHANGED ("selectionChanged"),
        SORT ("sort"),
        UNGROUP ("ungroup");
        
        private final String value;
        
        private Event(String val)
        {
            value = val;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public enum RowButtonCommand
    {
        DELETE ("delete"),
        EDIT ("edit");
        
        private final String value;
        
        private RowButtonCommand(String val)
        {
            value = val;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public enum EditingEvent
    {
        CLICK ("click"),
        DOUBLECLICK ("doubleclick");
        
        private final String value;
        
        private EditingEvent(String val)
        {
            value = val;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public enum EditingInsertNewRowsAt
    {
        PAGETOP ("pagetop"),
        PAGEBOTTOM ("pagebottom");
        
        private final String value;
        
        private EditingInsertNewRowsAt(String val)
        {
            value = val;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public enum EditingMode
    {
        INLINE ("inline"),
        POPUP ("popup");
        
        private final String value;
        
        private EditingMode(String val)
        {
            value = val;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public enum EditingType
    {
        CELL ("cell"),
        ROW ("row");
        
        private final String value;
        
        private EditingType(String val)
        {
            value = val;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public enum SelectionType
    {
        CELL ("cell"),
        ROW ("row");
        
        private final String value;
        
        private SelectionType(String val)
        {
            value = val;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public enum ToolbarButtonCommand
    {
        SAVE ("save"),
        INSERT ("insert"),
        CANCEL ("cancel");
        
        private final String value;
        
        private ToolbarButtonCommand(String val)
        {
            value = val;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public enum ToolbarPosition
    {
        TOP ("top"),
        BOTTOM ("bottom");
        
        private final String value;
        
        private ToolbarPosition(String val)
        {
            value = val;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public static final class RowButtonOption extends HashMapSerializable
    {
        public String cls;
        public String caption;
        public RowButtonCommand commandName;
        public JsonFunction click;

        public String getCls() {
            return cls;
        }

        public RowButtonOption setCls(String cls) {
            this.cls = cls;
            return this;
        }

        public String getCaption() {
            return caption;
        }

        public RowButtonOption setCaption(String caption) {
            this.caption = caption;
            return this;
        }

        public RowButtonCommand getCommandName() {
            return commandName;
        }

        public RowButtonOption setCommandName(RowButtonCommand commandName) {
            this.commandName = commandName;
            return this;
        }

        public JsonFunction getClick() {
            return click;
        }

        public RowButtonOption setClick(JsonFunction click) {
            this.click = click;
            return this;
        }
    }
    
    public static final class ColumnOption extends HashMapSerializable
    {
        public HashMap<String, String> attributes = new HashMap<String, String>();
        public List<RowButtonOption> buttons = new ArrayList<RowButtonOption>();
        public Object columnTemplate;
        public JsonFunction customFilter;
        public Object editor;
        public String field;
        public Boolean filterable;
        public Object footerTemplate;
        public Object format;
        public Object groupFooterTemplate;
        public HashMap<String, String> headerAttributes = new HashMap<String, String>();
        public Object headerTemplate;
        public Object maxWidth;
        public Object minWidth;
        public Boolean resizable;
        public Boolean sortable;
        public String title;
        public Object width;

        public HashMap<String, String> getAttributes() {
            return attributes;
        }

        public ColumnOption setAttributes(HashMap<String, String> attributes) {
            this.attributes = attributes;
            return this;
        }
        
        public ColumnOption setAttribute(String key, String value) {
            this.attributes.put(key, value);
            return this;
        }

        public List<RowButtonOption> getButtons() {
            return buttons;
        }

        public ColumnOption setButtons(List<RowButtonOption> buttons) {
            this.buttons = buttons;
            return this;
        }
        
        public ColumnOption setButtons(RowButtonOption... buttons) {
            this.buttons = Arrays.asList(buttons);
            return this;
        }

        public Object getColumnTemplate() {
            return columnTemplate;
        }

        public ColumnOption setColumnTemplate(String columnTemplate) {
            this.columnTemplate = columnTemplate;
            return this;
        }
        
        public ColumnOption setColumnTemplate(JsonFunction columnTemplate) {
            this.columnTemplate = columnTemplate;
            return this;
        }

        public Object getCustomFilter() {
            return customFilter;
        }

        public ColumnOption setCustomFilter(JsonFunction customFilter) {
            this.customFilter = customFilter;
            return this;
        }

        public Object getEditor() {
            return editor;
        }

        public ColumnOption setEditor(String editor) {
            this.editor = editor;
            return this;
        }
        
        public ColumnOption setEditor(JsonFunction editor) {
            this.editor = editor;
            return this;
        }

        public String getField() {
            return field;
        }

        public ColumnOption setField(String field) {
            this.field = field;
            return this;
        }

        public Boolean getFilterable() {
            return filterable;
        }

        public ColumnOption setFilterable(Boolean filterable) {
            this.filterable = filterable;
            return this;
        }

        public Object getFooterTemplate() {
            return footerTemplate;
        }

        public ColumnOption setFooterTemplate(String footerTemplate) {
            this.footerTemplate = footerTemplate;
            return this;
        }
        
        public ColumnOption setFooterTemplate(JsonFunction footerTemplate) {
            this.footerTemplate = footerTemplate;
            return this;
        }

        public Object getFormat() {
            return format;
        }

        public ColumnOption setFormat(String format) {
            this.format = format;
            return this;
        }
        
        public ColumnOption setFormat(JsonFunction format) {
            this.format = format;
            return this;
        }

        public Object getGroupFooterTemplate() {
            return groupFooterTemplate;
        }

        public ColumnOption setGroupFooterTemplate(String groupFooterTemplate) {
            this.groupFooterTemplate = groupFooterTemplate;
            return this;
        }
        
        public ColumnOption setGroupFooterTemplate(JsonFunction groupFooterTemplate) {
            this.groupFooterTemplate = groupFooterTemplate;
            return this;
        }

        public HashMap<String, String> getHeaderAttributes() {
            return headerAttributes;
        }

        public ColumnOption setHeaderAttributes(HashMap<String, String> headerAttributes) {
            this.headerAttributes = headerAttributes;
            return this;
        }
        
        public ColumnOption setHeaderAttribute(String key, String value) {
            this.headerAttributes.put(key, value);
            return this;
        }

        public Object getHeaderTemplate() {
            return headerTemplate;
        }

        public ColumnOption setHeaderTemplate(String headerTemplate) {
            this.headerTemplate = headerTemplate;
            return this;
        }
        
        public ColumnOption setHeaderTemplate(JsonFunction headerTemplate) {
            this.headerTemplate = headerTemplate;
            return this;
        }

        public Object getMaxWidth() {
            return maxWidth;
        }

        public ColumnOption setMaxWidth(String maxWidth) {
            this.maxWidth = maxWidth;
            return this;
        }
        
        public ColumnOption setMaxWidth(Integer maxWidth) {
            this.maxWidth = maxWidth;
            return this;
        }

        public Object getMinWidth() {
            return minWidth;
        }

        public ColumnOption setMinWidth(String minWidth) {
            this.minWidth = minWidth;
            return this;
        }
        
        public ColumnOption setMinWidth(Integer minWidth) {
            this.minWidth = minWidth;
            return this;
        }

        public Boolean getResizable() {
            return resizable;
        }

        public ColumnOption setResizable(Boolean resizable) {
            this.resizable = resizable;
            return this;
        }

        public Boolean getSortable() {
            return sortable;
        }

        public ColumnOption setSortable(Boolean sortable) {
            this.sortable = sortable;
            return this;
        }

        public String getTitle() {
            return title;
        }

        public ColumnOption setTitle(String title) {
            this.title = title;
            return this;
        }

        public Object getWidth() {
            return width;
        }

        public ColumnOption setWidth(String width) {
            this.width = width;
            return this;
        }
        
        public ColumnOption setWidth(Integer width) {
            this.width = width;
            return this;
        }
    }
    
    public static final class DeleteConfirmation extends HashMapSerializable
    {
        public Boolean enabled;
        public Object template;

        public Boolean getEnabled() {
            return enabled;
        }

        public DeleteConfirmation setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Object getTemplate() {
            return template;
        }

        public DeleteConfirmation setTemplate(String template) {
            this.template = template;
            return this;
        }
        
        public DeleteConfirmation setTemplate(JsonFunction template) {
            this.template = template;
            return this;
        }
    }
    
    public static final class EditingConfirmation extends HashMapSerializable
    {
        public DeleteConfirmation delete = new DeleteConfirmation();

        public DeleteConfirmation getDelete() {
            return delete;
        }

        public EditingConfirmation setDelete(DeleteConfirmation delete) {
            this.delete = delete;
            return this;
        }
    }
    
    public static final class Editing extends HashMapSerializable
    {
        public Boolean batch;
        public EditingConfirmation confirmation = new EditingConfirmation();
        public Boolean enabled;
        public EditingEvent event;
        public EditingInsertNewRowsAt insertNewRowAt;
        public EditingMode mode;
        public EditingType type;

        public Boolean getBatch() {
            return batch;
        }

        public Editing setBatch(Boolean batch) {
            this.batch = batch;
            return this;
        }

        public EditingConfirmation getConfirmation() {
            return confirmation;
        }

        public Editing setConfirmation(EditingConfirmation confirmation) {
            this.confirmation = confirmation;
            return this;
        }

        public Boolean getEnabled() {
            return enabled;
        }

        public Editing setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public EditingEvent getEvent() {
            return event;
        }

        public Editing setEvent(EditingEvent event) {
            this.event = event;
            return this;
        }

        public EditingInsertNewRowsAt getInsertNewRowAt() {
            return insertNewRowAt;
        }

        public Editing setInsertNewRowAt(EditingInsertNewRowsAt insertNewRowAt) {
            this.insertNewRowAt = insertNewRowAt;
            return this;
        }

        public EditingMode getMode() {
            return mode;
        }

        public Editing setMode(EditingMode mode) {
            this.mode = mode;
            return this;
        }

        public EditingType getType() {
            return type;
        }

        public Editing setType(EditingType type) {
            this.type = type;
            return this;
        }
    }
    
    public static final class Filtering extends HashMapSerializable
    {
        public Boolean enabled;

        public Boolean getEnabled() {
            return enabled;
        }

        public Filtering setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
    }
    
    public static final class Grouping extends HashMapSerializable
    {
        public Boolean allowDragToGroup;
        public String message;
        public Boolean showGroupHeader;

        public Boolean getAllowDragToGroup() {
            return allowDragToGroup;
        }

        public Grouping setAllowDragToGroup(Boolean allowDragToGroup) {
            this.allowDragToGroup = allowDragToGroup;
            return this;
        }

        public String getMessage() {
            return message;
        }

        public Grouping setMessage(String message) {
            this.message = message;
            return this;
        }

        public Boolean getShowGroupHeader() {
            return showGroupHeader;
        }

        public Grouping setShowGroupHeader(Boolean showGroupHeader) {
            this.showGroupHeader = showGroupHeader;
            return this;
        }
    }
    
    public static final class Paging extends HashMapSerializable
    {
        public MessagesOptions messages = new MessagesOptions();
        public Integer page;
        public Integer pageLinksCount;
        public Integer pageSize;
        public Boolean showBoundaryLinks;
        public Boolean showDirectionLinks;

        public MessagesOptions getMessages() {
            return messages;
        }

        public Paging setMessages(MessagesOptions messages) {
            this.messages = messages;
            return this;
        }

        public Integer getPage() {
            return page;
        }

        public Paging setPage(Integer page) {
            this.page = page;
            return this;
        }

        public Integer getPageLinksCount() {
            return pageLinksCount;
        }

        public Paging setPageLinksCount(Integer pageLinksCount) {
            this.pageLinksCount = pageLinksCount;
            return this;
        }

        public Integer getPageSize() {
            return pageSize;
        }

        public Paging setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public Boolean getShowBoundaryLinks() {
            return showBoundaryLinks;
        }

        public Paging setShowBoundaryLinks(Boolean showBoundaryLinks) {
            this.showBoundaryLinks = showBoundaryLinks;
            return this;
        }

        public Boolean getShowDirectionLinks() {
            return showDirectionLinks;
        }

        public Paging setShowDirectionLinks(Boolean showDirectionLinks) {
            this.showDirectionLinks = showDirectionLinks;
            return this;
        }
    }
    
    public static final class Scrolling extends HashMapSerializable
    {
        public Boolean virtual;

        public Boolean getVirtual() {
            return virtual;
        }

        public Scrolling setVirtual(Boolean virtual) {
            this.virtual = virtual;
            return this;
        }
    }
    
    public static final class Selection extends HashMapSerializable
    {
        public Boolean multiple;
        public Boolean spreadsheet;
        public Boolean toggle;
        public SelectionType type;

        public Boolean getMultiple() {
            return multiple;
        }

        public Selection setMultiple(Boolean multiple) {
            this.multiple = multiple;
            return this;
        }

        public Boolean getSpreadsheet() {
            return spreadsheet;
        }

        public Selection setSpreadsheet(Boolean spreadsheet) {
            this.spreadsheet = spreadsheet;
            return this;
        }

        public Boolean getToggle() {
            return toggle;
        }

        public Selection setToggle(Boolean toggle) {
            this.toggle = toggle;
            return this;
        }

        public SelectionType getType() {
            return type;
        }

        public Selection setType(SelectionType type) {
            this.type = type;
            return this;
        }
    }
    
    public static final class Sorting extends HashMapSerializable
    {
        public Boolean allowUnsort;
        public String ascText;
        public String descText;
        public Boolean firstAscending;
        public Boolean multiple;

        public Boolean getAllowUnsort() {
            return allowUnsort;
        }

        public Sorting setAllowUnsort(Boolean allowUnsort) {
            this.allowUnsort = allowUnsort;
            return this;
        }

        public String getAscText() {
            return ascText;
        }

        public Sorting setAscText(String ascText) {
            this.ascText = ascText;
            return this;
        }

        public String getDescText() {
            return descText;
        }

        public Sorting setDescText(String descText) {
            this.descText = descText;
            return this;
        }

        public Boolean getFirstAscending() {
            return firstAscending;
        }

        public Sorting setFirstAscending(Boolean firstAscending) {
            this.firstAscending = firstAscending;
            return this;
        }

        public Boolean getMultiple() {
            return multiple;
        }

        public Sorting setMultiple(Boolean multiple) {
            this.multiple = multiple;
            return this;
        }
    }
    
    public static final class ToolbarButtonOption extends HashMapSerializable
    {
        public String cls;
        public String caption;
        public ToolbarButtonCommand commandName;
        public JsonFunction click;

        public String getCls() {
            return cls;
        }

        public ToolbarButtonOption setCls(String cls) {
            this.cls = cls;
            return this;
        }

        public String getCaption() {
            return caption;
        }

        public ToolbarButtonOption setCaption(String caption) {
            this.caption = caption;
            return this;
        }

        public ToolbarButtonCommand getCommandName() {
            return commandName;
        }

        public ToolbarButtonOption setCommandName(ToolbarButtonCommand commandName) {
            this.commandName = commandName;
            return this;
        }

        public JsonFunction getClick() {
            return click;
        }

        public ToolbarButtonOption setClick(JsonFunction click) {
            this.click = click;
            return this;
        }
    }
    
    public static final class ToolbarOptions extends HashMapSerializable
    {
        public List<ToolbarButtonOption> buttons = new ArrayList<ToolbarButtonOption>();
        public ToolbarPosition position;
        public Object template;

        public List<ToolbarButtonOption> getButtons() {
            return buttons;
        }

        public ToolbarOptions setButtons(List<ToolbarButtonOption> buttons) {
            this.buttons = buttons;
            return this;
        }

        public ToolbarPosition getPosition() {
            return position;
        }

        public ToolbarOptions setPosition(ToolbarPosition position) {
            this.position = position;
            return this;
        }

        public Object getTemplate() {
            return template;
        }

        public ToolbarOptions setTemplate(String template) {
            this.template = template;
            return this;
        }
        
        public ToolbarOptions setTemplate(JsonFunction template) {
            this.template = template;
            return this;
        }
    }
    
    public Object altRowTemplate;
    public Boolean altRows;
    public Boolean columnReorder;
    public List<ColumnOption> columns = new ArrayList<ColumnOption>();
    public Object dataSource;
    public String detailCollapseCssClass;
    public String detailCollapseText;
    public Boolean detailExpandCollapse;
    public String detailExpandCssClass;
    public String detailExpandText;
    public Object detailTemplate;
    public Editing editing = new Editing();
    public Filtering filtering = new Filtering();
    public Grouping grouping = new Grouping();
    public String noRecordsTemplate;
    public String noRecordsText;
    public Paging paging = new Paging();
    public Boolean resizing;
    public Boolean rowHover;
    public Object rowTemplate;
    public Scrolling scrolling = new Scrolling();
    public Selection selection = new Selection();
    public Boolean showHeader;
    public Sorting sorting = new Sorting();
    public List<ToolbarOptions> toolbar = new ArrayList<ToolbarOptions>();

    public Object getAltRowTemplate() {
        return altRowTemplate;
    }

    public GridOptions setAltRowTemplate(String altRowTemplate) {
        this.altRowTemplate = altRowTemplate;
        return this;
    }
    
    public GridOptions setAltRowTemplate(JsonFunction altRowTemplate) {
        this.altRowTemplate = altRowTemplate;
        return this;
    }

    public Boolean getAltRows() {
        return altRows;
    }

    public GridOptions setAltRows(Boolean altRows) {
        this.altRows = altRows;
        return this;
    }

    public Boolean getColumnReorder() {
        return columnReorder;
    }

    public GridOptions setColumnReorder(Boolean columnReorder) {
        this.columnReorder = columnReorder;
        return this;
    }

    public List<ColumnOption> getColumns() {
        return columns;
    }

    public GridOptions setColumns(List<ColumnOption> columns) {
        this.columns = columns;
        return this;
    }
    
    public GridOptions setColumns(ColumnOption... columns) {
        this.columns = Arrays.asList(columns);
        return this;
    }

    public Object getDataSource() {
        return dataSource;
    }

    public GridOptions setDataSource(DataSourceOptions dataSource) {
        // NOTE: serialize the DS to a hash explicitly in this case
        this.dataSource = dataSource.toHashMap();
        return this;
    }
    
    public GridOptions setDataSource(JsonFunction dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    public String getDetailCollapseCssClass() {
        return detailCollapseCssClass;
    }

    public GridOptions setDetailCollapseCssClass(String detailCollapseCssClass) {
        this.detailCollapseCssClass = detailCollapseCssClass;
        return this;
    }

    public String getDetailCollapseText() {
        return detailCollapseText;
    }

    public GridOptions setDetailCollapseText(String detailCollapseText) {
        this.detailCollapseText = detailCollapseText;
        return this;
    }

    public Boolean getDetailExpandCollapse() {
        return detailExpandCollapse;
    }

    public GridOptions setDetailExpandCollapse(Boolean detailExpandCollapse) {
        this.detailExpandCollapse = detailExpandCollapse;
        return this;
    }

    public String getDetailExpandCssClass() {
        return detailExpandCssClass;
    }

    public GridOptions setDetailExpandCssClass(String detailExpandCssClass) {
        this.detailExpandCssClass = detailExpandCssClass;
        return this;
    }

    public String getDetailExpandText() {
        return detailExpandText;
    }

    public GridOptions setDetailExpandText(String detailExpandText) {
        this.detailExpandText = detailExpandText;
        return this;
    }

    public Object getDetailTemplate() {
        return detailTemplate;
    }

    public GridOptions setDetailTemplate(String detailTemplate) {
        this.detailTemplate = detailTemplate;
        return this;
    }
    
    public GridOptions setDetailTemplate(JsonFunction detailTemplate) {
        this.detailTemplate = detailTemplate;
        return this;
    }

    public Editing getEditing() {
        return editing;
    }

    public GridOptions setEditing(Editing editing) {
        this.editing = editing;
        return this;
    }

    public Filtering getFiltering() {
        return filtering;
    }

    public GridOptions setFiltering(Filtering filtering) {
        this.filtering = filtering;
        return this;
    }

    public Grouping getGrouping() {
        return grouping;
    }

    public GridOptions setGrouping(Grouping grouping) {
        this.grouping = grouping;
        return this;
    }

    public String getNoRecordsTemplate() {
        return noRecordsTemplate;
    }

    public GridOptions setNoRecordsTemplate(String noRecordsTemplate) {
        this.noRecordsTemplate = noRecordsTemplate;
        return this;
    }

    public String getNoRecordsText() {
        return noRecordsText;
    }

    public GridOptions setNoRecordsText(String noRecordsText) {
        this.noRecordsText = noRecordsText;
        return this;
    }

    public Paging getPaging() {
        return paging;
    }

    public GridOptions setPaging(Paging paging) {
        this.paging = paging;
        return this;
    }

    public Boolean getResizing() {
        return resizing;
    }

    public GridOptions setResizing(Boolean resizing) {
        this.resizing = resizing;
        return this;
    }

    public Boolean getRowHover() {
        return rowHover;
    }

    public GridOptions setRowHover(Boolean rowHover) {
        this.rowHover = rowHover;
        return this;
    }

    public Object getRowTemplate() {
        return rowTemplate;
    }

    public GridOptions setRowTemplate(String rowTemplate) {
        this.rowTemplate = rowTemplate;
        return this;
    }
    
    public GridOptions setRowTemplate(JsonFunction rowTemplate) {
        this.rowTemplate = rowTemplate;
        return this;
    }

    public Scrolling getScrolling() {
        return scrolling;
    }

    public GridOptions setScrolling(Scrolling scrolling) {
        this.scrolling = scrolling;
        return this;
    }

    public Selection getSelection() {
        return selection;
    }

    public GridOptions setSelection(Selection selection) {
        this.selection = selection;
        return this;
    }

    public Boolean getShowHeader() {
        return showHeader;
    }

    public GridOptions setShowHeader(Boolean showHeader) {
        this.showHeader = showHeader;
        return this;
    }

    public Sorting getSorting() {
        return sorting;
    }

    public GridOptions setSorting(Sorting sorting) {
        this.sorting = sorting;
        return this;
    }

    public List<ToolbarOptions> getToolbar() {
        return toolbar;
    }

    public GridOptions setToolbar(List<ToolbarOptions> toolbar) {
        this.toolbar = toolbar;
        return this;
    }
    
    public GridOptions setToolbar(ToolbarOptions... toolbar) {
        this.toolbar = Arrays.asList(toolbar);
        return this;
    }
}
