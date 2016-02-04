package com.shieldui.wicket.treeview;

import com.shieldui.wicket.HashMapSerializable;
import com.shieldui.wicket.OptionsBase;
import com.shieldui.wicket.datasource.DataSource;
import com.shieldui.wicket.datasource.DataSourceOptions;
import java.util.HashMap;
import org.apache.wicket.ajax.json.JsonFunction;

public class TreeViewOptions extends OptionsBase
{
    private static final long serialVersionUID = 1L;
    
    public enum Event
    {
        FOCUS ("focus"),
        BLUR ("blur"),
        EXPAND ("expand"),
        COLLAPSE ("collapse"),
        SELECT ("select"),
        CHANGE ("change"),
        CHECK ("check"),
        DATA_BOUND ("dataBound"),
        DRAG_START ("dragStart"),
        DRAG_STOP ("dragStop"),
        DROPPABLE_OVER ("droppableOver"),
        DROPPABLE_OUT ("droppableOut"),
        DROP ("drop");        
        
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
    
    public static final class AnimationOptions extends HashMapSerializable {
        public Boolean enabled;
        public Integer expandDuration;
        public Integer collapseDuration;

        public Boolean getEnabled() {
            return enabled;
        }

        public AnimationOptions setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Integer getExpandDuration() {
            return expandDuration;
        }

        public AnimationOptions setExpandDuration(Integer expandDuration) {
            this.expandDuration = expandDuration;
            return this;
        }

        public Integer getCollapseDuration() {
            return collapseDuration;
        }

        public AnimationOptions setCollapseDuration(Integer collapseDuration) {
            this.collapseDuration = collapseDuration;
            return this;
        }
    }
    
    public static final class CheckboxOptions extends HashMapSerializable {
        public Boolean enabled;
        public Boolean children;
        public Object template;

        public Boolean getEnabled() {
            return enabled;
        }

        public CheckboxOptions setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Boolean isChildren() {
            return children;
        }

        public CheckboxOptions setChildren(Boolean children) {
            this.children = children;
            return this;
        }

        public Object getTemplate() {
            return template;
        }

        public CheckboxOptions setTemplate(String template) {
            this.template = template;
            return this;
        }
        
        public CheckboxOptions setTemplate(JsonFunction template) {
            this.template = template;
            return this;
        }
    }
    
    public String cls;
    public Object width;
    public Object minWidth;
    public Object height;
    public Object dataSource;
    public Boolean readDataSource;
    public AnimationOptions animation = new AnimationOptions();
    public CheckboxOptions checkboxes = new CheckboxOptions();
    public Boolean dragDrop;
    public String dragDropScope;
    public Object textTemplate;
    public Object hrefTemplate;
    public Object expandedTemplate;
    public Object checkedTemplate;
    public Object disabledTemplate;
    public Object iconUrlTemplate;
    public Object iconClsTemplate;
    public Object hasChildrenTemplate;
    public HashMap<Event, JsonFunction> events = new HashMap<Event, JsonFunction>();

    public String getCls() {
        return cls;
    }

    public TreeViewOptions setCls(String cls) {
        this.cls = cls;
        return this;
    }

    public Object getWidth() {
        return width;
    }

    public TreeViewOptions setWidth(Integer width) {
        this.width = width;
        return this;
    }
    
    public TreeViewOptions setWidth(String width) {
        this.width = width;
        return this;
    }

    public Object getMinWidth() {
        return minWidth;
    }

    public TreeViewOptions setMinWidth(Integer minWidth) {
        this.minWidth = minWidth;
        return this;
    }
    
    public TreeViewOptions setMinWidth(String minWidth) {
        this.minWidth = minWidth;
        return this;
    }

    public Object getHeight() {
        return height;
    }

    public TreeViewOptions setHeight(Integer height) {
        this.height = height;
        return this;
    }
    
    public TreeViewOptions setHeight(String height) {
        this.height = height;
        return this;
    }

    public Object getDataSource() {
        return dataSource;
    }
    
    public TreeViewOptions setDataSource(DataSourceOptions dataSource) {
        // NOTE: serialize the DS to a hash explicitly in this case
        this.dataSource = dataSource.toHashMap();
        return this;
    }
    
    public TreeViewOptions setDataSource(JsonFunction dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    
    public TreeViewOptions setDataSource(DataSource dataSourceObject) {
        this.dataSource = new JsonFunction("window." + dataSourceObject.getJsVariableName());
        return this;
    }

    public Boolean getReadDataSource() {
        return readDataSource;
    }

    public TreeViewOptions setReadDataSource(Boolean readDataSource) {
        this.readDataSource = readDataSource;
        return this;
    }

    public AnimationOptions getAnimation() {
        return animation;
    }

    public TreeViewOptions setAnimation(AnimationOptions animation) {
        this.animation = animation;
        return this;
    }

    public CheckboxOptions getCheckboxes() {
        return checkboxes;
    }

    public TreeViewOptions setCheckboxes(CheckboxOptions checkboxes) {
        this.checkboxes = checkboxes;
        return this;
    }

    public Boolean getDragDrop() {
        return dragDrop;
    }

    public TreeViewOptions setDragDrop(Boolean dragDrop) {
        this.dragDrop = dragDrop;
        return this;
    }

    public String getDragDropScope() {
        return dragDropScope;
    }

    public TreeViewOptions setDragDropScope(String dragDropScope) {
        this.dragDropScope = dragDropScope;
        return this;
    }

    public Object getTextTemplate() {
        return textTemplate;
    }

    public TreeViewOptions setTextTemplate(String textTemplate) {
        this.textTemplate = textTemplate;
        return this;
    }
    
    public TreeViewOptions setTextTemplate(JsonFunction textTemplate) {
        this.textTemplate = textTemplate;
        return this;
    }

    public Object getHrefTemplate() {
        return hrefTemplate;
    }

    public TreeViewOptions setHrefTemplate(String hrefTemplate) {
        this.hrefTemplate = hrefTemplate;
        return this;
    }
    
    public TreeViewOptions setHrefTemplate(JsonFunction hrefTemplate) {
        this.hrefTemplate = hrefTemplate;
        return this;
    }

    public Object getExpandedTemplate() {
        return expandedTemplate;
    }

    public TreeViewOptions setExpandedTemplate(String expandedTemplate) {
        this.expandedTemplate = expandedTemplate;
        return this;
    }
    
    public TreeViewOptions setExpandedTemplate(JsonFunction expandedTemplate) {
        this.expandedTemplate = expandedTemplate;
        return this;
    }

    public Object getCheckedTemplate() {
        return checkedTemplate;
    }

    public TreeViewOptions setCheckedTemplate(String checkedTemplate) {
        this.checkedTemplate = checkedTemplate;
        return this;
    }
    
    public TreeViewOptions setCheckedTemplate(JsonFunction checkedTemplate) {
        this.checkedTemplate = checkedTemplate;
        return this;
    }

    public Object getDisabledTemplate() {
        return disabledTemplate;
    }

    public TreeViewOptions setDisabledTemplate(String disabledTemplate) {
        this.disabledTemplate = disabledTemplate;
        return this;
    }
    
    public TreeViewOptions setDisabledTemplate(JsonFunction disabledTemplate) {
        this.disabledTemplate = disabledTemplate;
        return this;
    }

    public Object getIconUrlTemplate() {
        return iconUrlTemplate;
    }

    public TreeViewOptions setIconUrlTemplate(String iconUrlTemplate) {
        this.iconUrlTemplate = iconUrlTemplate;
        return this;
    }
    
    public TreeViewOptions setIconUrlTemplate(JsonFunction iconUrlTemplate) {
        this.iconUrlTemplate = iconUrlTemplate;
        return this;
    }

    public Object getIconClsTemplate() {
        return iconClsTemplate;
    }

    public TreeViewOptions setIconClsTemplate(String iconClsTemplate) {
        this.iconClsTemplate = iconClsTemplate;
        return this;
    }
    
    public TreeViewOptions setIconClsTemplate(JsonFunction iconClsTemplate) {
        this.iconClsTemplate = iconClsTemplate;
        return this;
    }

    public Object getHasChildrenTemplate() {
        return hasChildrenTemplate;
    }

    public TreeViewOptions setHasChildrenTemplate(String hasChildrenTemplate) {
        this.hasChildrenTemplate = hasChildrenTemplate;
        return this;
    }
    
    public TreeViewOptions setHasChildrenTemplate(JsonFunction hasChildrenTemplate) {
        this.hasChildrenTemplate = hasChildrenTemplate;
        return this;
    }

    public HashMap<Event, JsonFunction> getEvents() {
        return events;
    }

    public TreeViewOptions setEvents(HashMap<Event, JsonFunction> events) {
        this.events = events;
        return this;
    }
}
