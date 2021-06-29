package com.shieldui.wicket.grid;

import com.shieldui.wicket.HashMapSerializable;
import com.shieldui.wicket.OptionsBase;
import com.shieldui.wicket.datasource.DataSourceOptions;
import com.shieldui.wicket.pager.PagerOptions.MessagesOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.apache.wicket.ajax.json.JSONFunction;

public class GridOptions extends OptionsBase
{
    private static final long serialVersionUID = 1L;
    
    // client events
    public enum Event
    {
        CANCEL ("cancel"),
        COLUMN_REORDER ("columnReorder"),
        COLUMN_RESIZE ("columnResize"),
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
        EXCEL ("excel"),
        PDF ("pdf"),
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
    
    public enum ExcelCellHorizontalAlignment
    {
        LEFT ("left"),
        RIGHT ("right"),
        CENTER ("center");
        
        private final String value;
        
        private ExcelCellHorizontalAlignment(String val)
        {
            value = val;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public enum ExcelCellVerticalAlignment
    {
        TOP ("top"),
        BOTTOM ("bottom"),
        CENTER ("center");
        
        private final String value;
        
        private ExcelCellVerticalAlignment(String val)
        {
            value = val;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public enum ExcelFileFormat
    {
        XML ("xml"),
        XLSX ("xlsx");
        
        private final String value;
        
        private ExcelFileFormat(String val)
        {
            value = val;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public enum PDFPageSize
    {
        A0 ("a0"),
        A1 ("a1"),
        A2 ("a2"),
        A3 ("a3"),
        A4 ("a4"),
        A5 ("a5"),
        A6 ("a6"),
        A7 ("a7"),
        A8 ("a8"),
        LETTER ("letter"),
        GOVERNMENT_LETTER ("government-letter"),
        LEGAL ("legal"),
        CREDIT_CARD ("credit-card");
        
        private final String value;
        
        private PDFPageSize(String val)
        {
            value = val;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public enum PDFPageOrientation
    {
        PORTRAIT ("portrait"),
        LANDSCAPE ("landscape");
        
        private final String value;
        
        private PDFPageOrientation(String val)
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
        public JSONFunction click;

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

        public JSONFunction getClick() {
            return click;
        }

        public RowButtonOption setClick(JSONFunction click) {
            this.click = click;
            return this;
        }
    }
    
    public static final class ColumnOption extends HashMapSerializable
    {
        public HashMap<String, String> attributes = new HashMap<String, String>();
        public List<RowButtonOption> buttons = new ArrayList<RowButtonOption>();
        public Object columnTemplate;
        public JSONFunction customFilter;
        public Object editor;
        public String field;
        public Boolean filterable;
        public Boolean visible;
        public Boolean locked;
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
        
        public ColumnOption setColumnTemplate(JSONFunction columnTemplate) {
            this.columnTemplate = columnTemplate;
            return this;
        }

        public Object getCustomFilter() {
            return customFilter;
        }

        public ColumnOption setCustomFilter(JSONFunction customFilter) {
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
        
        public ColumnOption setEditor(JSONFunction editor) {
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

        public Boolean getVisible() {
            return visible;
        }

        public ColumnOption setVisible(Boolean visible) {
            this.visible = visible;
            return this;
        }

        public Boolean getLocked() {
            return locked;
        }

        public ColumnOption setLocked(Boolean locked) {
            this.locked = locked;
            return this;
        }

        public Object getFooterTemplate() {
            return footerTemplate;
        }

        public ColumnOption setFooterTemplate(String footerTemplate) {
            this.footerTemplate = footerTemplate;
            return this;
        }
        
        public ColumnOption setFooterTemplate(JSONFunction footerTemplate) {
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
        
        public ColumnOption setFormat(JSONFunction format) {
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
        
        public ColumnOption setGroupFooterTemplate(JSONFunction groupFooterTemplate) {
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
        
        public ColumnOption setHeaderTemplate(JSONFunction headerTemplate) {
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
        
        public DeleteConfirmation setTemplate(JSONFunction template) {
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
        public JSONFunction click;

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

        public JSONFunction getClick() {
            return click;
        }

        public ToolbarButtonOption setClick(JSONFunction click) {
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
        
        public ToolbarOptions setButtons(ToolbarButtonOption ... buttons) {
            this.buttons = Arrays.asList(buttons);
            return this;
        }
        
        public ToolbarOptions addButton(ToolbarButtonOption button) {
            this.buttons.add(button);
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
        
        public ToolbarOptions setTemplate(JSONFunction template) {
            this.template = template;
            return this;
        }
    }
    
    public static final class WorksheetColumnOptions extends HashMapSerializable
    {
        public Boolean autoWidth;
        public Integer index;
        public Integer width;

        public Boolean getAutoWidth() {
            return autoWidth;
        }

        public WorksheetColumnOptions setAutoWidth(Boolean autoWidth) {
            this.autoWidth = autoWidth;
            return this;
        }

        public Integer getIndex() {
            return index;
        }

        public WorksheetColumnOptions setIndex(Integer index) {
            this.index = index;
            return this;
        }

        public Integer getWidth() {
            return width;
        }

        public WorksheetColumnOptions setWidth(Integer width) {
            this.width = width;
            return this;
        }
    }
    
    public static final class WorksheetCellStyle extends HashMapSerializable
    {
        public ExcelCellHorizontalAlignment textAlign;
        public ExcelCellVerticalAlignment verticalAlign;
        public Boolean wrap;
        public String format;
        public Boolean bold;
        public Boolean italic;
        public String color;
        public String fontName;
        public Integer fontSize;

        public ExcelCellHorizontalAlignment getTextAlign() {
            return textAlign;
        }

        public WorksheetCellStyle setTextAlign(ExcelCellHorizontalAlignment textAlign) {
            this.textAlign = textAlign;
            return this;
        }

        public ExcelCellVerticalAlignment getVerticalAlign() {
            return verticalAlign;
        }

        public WorksheetCellStyle setVerticalAlign(ExcelCellVerticalAlignment verticalAlign) {
            this.verticalAlign = verticalAlign;
            return this;
        }

        public Boolean getWrap() {
            return wrap;
        }

        public WorksheetCellStyle setWrap(Boolean wrap) {
            this.wrap = wrap;
            return this;
        }

        public String getFormat() {
            return format;
        }

        public WorksheetCellStyle setFormat(String format) {
            this.format = format;
            return this;
        }

        public Boolean getBold() {
            return bold;
        }

        public WorksheetCellStyle setBold(Boolean bold) {
            this.bold = bold;
            return this;
        }

        public Boolean getItalic() {
            return italic;
        }

        public WorksheetCellStyle setItalic(Boolean italic) {
            this.italic = italic;
            return this;
        }

        public String getColor() {
            return color;
        }

        public WorksheetCellStyle setColor(String color) {
            this.color = color;
            return this;
        }

        public String getFontName() {
            return fontName;
        }

        public WorksheetCellStyle setFontName(String fontName) {
            this.fontName = fontName;
            return this;
        }

        public Integer getFontSize() {
            return fontSize;
        }

        public WorksheetCellStyle setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
    }
    
    public static final class WorksheetCellOptions extends HashMapSerializable
    {
        public WorksheetCellStyle style = new WorksheetCellStyle();
        public DataSourceOptions.SchemaFieldType type;
        public Object value;
        public Integer index;
        public Integer colSpan;
        public Integer rowSpan;

        public WorksheetCellStyle getStyle() {
            return style;
        }

        public WorksheetCellOptions setStyle(WorksheetCellStyle style) {
            this.style = style;
            return this;
        }

        public DataSourceOptions.SchemaFieldType getType() {
            return type;
        }

        public WorksheetCellOptions setType(DataSourceOptions.SchemaFieldType type) {
            this.type = type;
            return this;
        }

        public Object getValue() {
            return value;
        }

        public WorksheetCellOptions setValue(Object value) {
            this.value = value;
            return this;
        }

        public Integer getIndex() {
            return index;
        }

        public WorksheetCellOptions setIndex(Integer index) {
            this.index = index;
            return this;
        }

        public Integer getColSpan() {
            return colSpan;
        }

        public WorksheetCellOptions setColSpan(Integer colSpan) {
            this.colSpan = colSpan;
            return this;
        }

        public Integer getRowSpan() {
            return rowSpan;
        }

        public WorksheetCellOptions setRowSpan(Integer rowSpan) {
            this.rowSpan = rowSpan;
            return this;
        }
    }
    
    public static final class WorksheetRowOptions extends HashMapSerializable
    {
        public Integer index;
        public Integer height;
        public List<WorksheetCellOptions> cells = new ArrayList<WorksheetCellOptions>();

        public Integer getIndex() {
            return index;
        }

        public WorksheetRowOptions setIndex(Integer index) {
            this.index = index;
            return this;
        }

        public Integer getHeight() {
            return height;
        }

        public WorksheetRowOptions setHeight(Integer height) {
            this.height = height;
            return this;
        }

        public List<WorksheetCellOptions> getCells() {
            return cells;
        }

        public WorksheetRowOptions setCells(List<WorksheetCellOptions> cells) {
            this.cells = cells;
            return this;
        }
        
        public WorksheetRowOptions setCells(WorksheetCellOptions ... cells) {
            this.cells = Arrays.asList(cells);
            return this;
        }
        
        public WorksheetRowOptions addCell(WorksheetCellOptions cell) {
            this.cells.add(cell);
            return this;
        }
    }
    
    public static final class WorksheetOptions extends HashMapSerializable
    {
        public String name;
        public List<WorksheetColumnOptions> columns = new ArrayList<WorksheetColumnOptions>();
        public List<WorksheetRowOptions> rows = new ArrayList<WorksheetRowOptions>();

        public String getName() {
            return name;
        }

        public WorksheetOptions setName(String name) {
            this.name = name;
            return this;
        }

        public List<WorksheetColumnOptions> getColumns() {
            return columns;
        }

        public WorksheetOptions setColumns(List<WorksheetColumnOptions> columns) {
            this.columns = columns;
            return this;
        }
        
        public WorksheetOptions setColumns(WorksheetColumnOptions ... columns) {
            this.columns = Arrays.asList(columns);
            return this;
        }
        
        public WorksheetOptions addColumn(WorksheetColumnOptions column) {
            this.columns.add(column);
            return this;
        }

        public List<WorksheetRowOptions> getRows() {
            return rows;
        }

        public WorksheetOptions setRows(List<WorksheetRowOptions> rows) {
            this.rows = rows;
            return this;
        }
        
        public WorksheetOptions setRows(WorksheetRowOptions ... rows) {
            this.rows = Arrays.asList(rows);
            return this;
        }
        
        public WorksheetOptions addRow(WorksheetRowOptions row) {
            this.rows.add(row);
            return this;
        }
    }
    
    public static final class ExcelOptionsHeader extends HashMapSerializable
    {
        public Boolean enabled;
        public WorksheetCellStyle style = new WorksheetCellStyle();
        public List<WorksheetCellOptions> cells = new ArrayList<WorksheetCellOptions>();

        public Boolean getEnabled() {
            return enabled;
        }

        public ExcelOptionsHeader setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public WorksheetCellStyle getStyle() {
            return style;
        }

        public ExcelOptionsHeader setStyle(WorksheetCellStyle style) {
            this.style = style;
            return this;
        }

        public List<WorksheetCellOptions> getCells() {
            return cells;
        }

        public ExcelOptionsHeader setCells(List<WorksheetCellOptions> cells) {
            this.cells = cells;
            return this;
        }
        
        public ExcelOptionsHeader setCells(WorksheetCellOptions ... cells) {
            this.cells = Arrays.asList(cells);
            return this;
        }
        
        public ExcelOptionsHeader addCell(WorksheetCellOptions cell) {
            this.cells.add(cell);
            return this;
        }
    }
    
    public static final class ExcelOptions extends HashMapSerializable
    {
        // override the serializeVariable to handle serialization of some settings that deal with dates
        @Override
        protected void serializeVariable(Class type, String name, Object value, HashMap<String, Object> result)
        {
            if (value != null && name.equals("created")) {
                result.put(name, new JSONFunction("new Date(" + ((Date)value).getTime() + ")"));
            }
            else {
                // default functionality
                super.serializeVariable(type, name, value, result);
            }
        }
        
        public String fileName;
        public ExcelFileFormat fileFormat;
        public Boolean noLegacyFallback;
        public Date created;
        public String author;
        public Object dataSource;
        public Boolean readDataSource;
        public List<String> columnFields = new ArrayList<String>();
        public ExcelOptionsHeader header = new ExcelOptionsHeader();
        public WorksheetOptions worksheet = new WorksheetOptions();
        public List<WorksheetOptions> worksheets = new ArrayList<WorksheetOptions>();
        public Integer worksheetIndex;

        public String getFileName() {
            return fileName;
        }

        public ExcelOptions setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        public ExcelFileFormat getFileFormat() {
            return fileFormat;
        }

        public ExcelOptions setFileFormat(ExcelFileFormat fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }

        public Boolean getNoLegacyFallback() {
            return noLegacyFallback;
        }

        public ExcelOptions setNoLegacyFallback(Boolean noLegacyFallback) {
            this.noLegacyFallback = noLegacyFallback;
            return this;
        }

        public Date getCreated() {
            return created;
        }

        public ExcelOptions setCreated(Date created) {
            this.created = created;
            return this;
        }
        
        public ExcelOptions setCreated(java.util.Calendar created) {
            this.created = created.getTime();
            return this;
        }

        public String getAuthor() {
            return author;
        }

        public ExcelOptions setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Object getDataSource() {
            return dataSource;
        }

        public ExcelOptions setDataSource(DataSourceOptions dataSource) {
            // NOTE: serialize the DS to a hash explicitly in this case
            this.dataSource = dataSource.toHashMap();
            return this;
        }

        public ExcelOptions setDataSource(JSONFunction dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        public Boolean getReadDataSource() {
            return readDataSource;
        }

        public ExcelOptions setReadDataSource(Boolean readDataSource) {
            this.readDataSource = readDataSource;
            return this;
        }

        public List<String> getColumnFields() {
            return columnFields;
        }

        public ExcelOptions setColumnFields(List<String> columnFields) {
            this.columnFields = columnFields;
            return this;
        }
        
        public ExcelOptions setColumnFields(String ... columnFields) {
            this.columnFields = Arrays.asList(columnFields);
            return this;
        }
        
        public ExcelOptions addColumnField(String columnField) {
            this.columnFields.add(columnField);
            return this;
        }

        public ExcelOptionsHeader getHeader() {
            return header;
        }

        public ExcelOptions setHeader(ExcelOptionsHeader header) {
            this.header = header;
            return this;
        }

        public WorksheetOptions getWorksheet() {
            return worksheet;
        }

        public ExcelOptions setWorksheet(WorksheetOptions worksheet) {
            this.worksheet = worksheet;
            return this;
        }

        public List<WorksheetOptions> getWorksheets() {
            return worksheets;
        }

        public ExcelOptions setWorksheets(List<WorksheetOptions> worksheets) {
            this.worksheets = worksheets;
            return this;
        }
        
        public ExcelOptions setWorksheets(WorksheetOptions ... worksheets) {
            this.worksheets = Arrays.asList(worksheets);
            return this;
        }
        
        public ExcelOptions addWorksheet(WorksheetOptions worksheet) {
            this.worksheets.add(worksheet);
            return this;
        }

        public Integer getWorksheetIndex() {
            return worksheetIndex;
        }

        public ExcelOptions setWorksheetIndex(Integer worksheetIndex) {
            this.worksheetIndex = worksheetIndex;
            return this;
        }
    }
    
    public static final class PdfOptionsHeaderCell extends HashMapSerializable
    {
        public String field;
        public String title;
        public Integer width;

        public String getField() {
            return field;
        }

        public PdfOptionsHeaderCell setField(String field) {
            this.field = field;
            return this;
        }

        public String getTitle() {
            return title;
        }

        public PdfOptionsHeaderCell setTitle(String title) {
            this.title = title;
            return this;
        }

        public Integer getWidth() {
            return width;
        }

        public PdfOptionsHeaderCell setWidth(Integer width) {
            this.width = width;
            return this;
        }
    }
    
    public static final class PdfOptionsHeader extends HashMapSerializable
    {
        public Boolean enabled;
        public List<PdfOptionsHeaderCell> cells = new ArrayList<PdfOptionsHeaderCell>();

        public Boolean getEnabled() {
            return enabled;
        }

        public PdfOptionsHeader setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public List<PdfOptionsHeaderCell> getCells() {
            return cells;
        }

        public PdfOptionsHeader setCells(List<PdfOptionsHeaderCell> cells) {
            this.cells = cells;
            return this;
        }
        
        public PdfOptionsHeader setCells(PdfOptionsHeaderCell... cells) {
            this.cells = Arrays.asList(cells);
            return this;
        }
        
        public PdfOptionsHeader addCell(PdfOptionsHeaderCell cell) {
            this.cells.add(cell);
            return this;
        }
    }
    
    public static final class PdfOptionsMargins extends HashMapSerializable
    {
        public Integer left;
        public Integer top;
        public Integer bottom;

        public Integer getLeft() {
            return left;
        }

        public PdfOptionsMargins setLeft(Integer left) {
            this.left = left;
            return this;
        }

        public Integer getTop() {
            return top;
        }

        public PdfOptionsMargins setTop(Integer top) {
            this.top = top;
            return this;
        }

        public Integer getBottom() {
            return bottom;
        }

        public PdfOptionsMargins setBottom(Integer bottom) {
            this.bottom = bottom;
            return this;
        }
    }
    
    public static final class PdfOptions extends HashMapSerializable
    {
        public String fileName;
        public String author;
        public Date created;
        public PDFPageSize size;
        public PDFPageOrientation orientation;
        public Integer fontSize;
        public Object dataSource;
        public Boolean readDataSource;
        public List<String> columnFields = new ArrayList<String>();
        public PdfOptionsHeader header = new PdfOptionsHeader();
        public PdfOptionsMargins margins = new PdfOptionsMargins();

        public String getFileName() {
            return fileName;
        }

        public PdfOptions setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        public String getAuthor() {
            return author;
        }

        public PdfOptions setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Date getCreated() {
            return created;
        }

        public PdfOptions setCreated(Date created) {
            this.created = created;
            return this;
        }

        public PDFPageSize getSize() {
            return size;
        }

        public PdfOptions setSize(PDFPageSize size) {
            this.size = size;
            return this;
        }

        public PDFPageOrientation getOrientation() {
            return orientation;
        }

        public PdfOptions setOrientation(PDFPageOrientation orientation) {
            this.orientation = orientation;
            return this;
        }

        public Integer getFontSize() {
            return fontSize;
        }

        public PdfOptions setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }

        public Object getDataSource() {
            return dataSource;
        }
        
        public PdfOptions setDataSource(DataSourceOptions dataSource) {
            // NOTE: serialize the DS to a hash explicitly in this case
            this.dataSource = dataSource.toHashMap();
            return this;
        }

        public PdfOptions setDataSource(JSONFunction dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        public Boolean getReadDataSource() {
            return readDataSource;
        }

        public PdfOptions setReadDataSource(Boolean readDataSource) {
            this.readDataSource = readDataSource;
            return this;
        }

        public List<String> getColumnFields() {
            return columnFields;
        }

        public PdfOptions setColumnFields(List<String> columnFields) {
            this.columnFields = columnFields;
            return this;
        }
        
        public PdfOptions setColumnFields(String... columnFields) {
            this.columnFields = Arrays.asList(columnFields);
            return this;
        }
        
        public PdfOptions addColumnField(String columnField) {
            this.columnFields.add(columnField);
            return this;
        }

        public PdfOptionsHeader getHeader() {
            return header;
        }

        public PdfOptions setHeader(PdfOptionsHeader header) {
            this.header = header;
            return this;
        }

        public PdfOptionsMargins getMargins() {
            return margins;
        }

        public PdfOptions setMargins(PdfOptionsMargins margins) {
            this.margins = margins;
            return this;
        }
    }
    
    public static final class ExportOptions extends HashMapSerializable
    {
        public String proxy;
        public ExcelOptions excel = new ExcelOptions();
        public PdfOptions pdf = new PdfOptions();

        public String getProxy() {
            return proxy;
        }

        public ExportOptions setProxy(String proxy) {
            this.proxy = proxy;
            return this;
        }

        public ExcelOptions getExcel() {
            return excel;
        }

        public ExportOptions setExcel(ExcelOptions excel) {
            this.excel = excel;
            return this;
        }
        
        public PdfOptions getPdf() {
            return pdf;
        }

        public ExportOptions setPdf(PdfOptions pdf) {
            this.pdf = pdf;
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
    public ExportOptions exportOptions = new ExportOptions();

    public Object getAltRowTemplate() {
        return altRowTemplate;
    }

    public GridOptions setAltRowTemplate(String altRowTemplate) {
        this.altRowTemplate = altRowTemplate;
        return this;
    }
    
    public GridOptions setAltRowTemplate(JSONFunction altRowTemplate) {
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
    
    public GridOptions setDataSource(JSONFunction dataSource) {
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
    
    public GridOptions setDetailTemplate(JSONFunction detailTemplate) {
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
    
    public GridOptions setRowTemplate(JSONFunction rowTemplate) {
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

    public GridOptions setToolbar(List<ToolbarOptions> toolbars) {
        this.toolbar = toolbars;
        return this;
    }
    
    public GridOptions setToolbar(ToolbarOptions... toolbars) {
        this.toolbar = Arrays.asList(toolbars);
        return this;
    }
    
    public GridOptions addToolbar(ToolbarOptions toolbar) {
        this.toolbar.add(toolbar);
        return this;
    }

    public ExportOptions getExportOptions() {
        return exportOptions;
    }

    public GridOptions setExportOptions(ExportOptions exportOptions) {
        this.exportOptions = exportOptions;
        return this;
    }
}
