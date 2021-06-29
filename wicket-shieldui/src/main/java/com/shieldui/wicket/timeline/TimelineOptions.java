package com.shieldui.wicket.timeline;

import com.shieldui.wicket.HashMapSerializable;
import com.shieldui.wicket.OptionsBase;
import com.shieldui.wicket.datasource.DataSource;
import com.shieldui.wicket.datasource.DataSourceOptions;
import java.util.HashMap;
import org.apache.wicket.ajax.json.JSONFunction;

public class TimelineOptions extends OptionsBase
{
    private static final long serialVersionUID = 1L;
    
    public enum Event
    {
        EXPAND ("expand"),
        COLLAPSE ("collapse");
        
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
    
    public enum Layout
    {
        LEFT ("expand"),
        RIGHT ("right"),
        CENTERED ("centered");
        
        private final String value;
        
        private Layout(String val)
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
    
    public String cls;
    public Object dataSource;
    public Boolean readDataSource;
    public Layout layout;
    public AnimationOptions animation = new AnimationOptions();
    public Object positionTemplate;
    public Object iconTemplate;
    public Object titleTemplate;
    public Object textTemplate;
    public Object collapsedTemplate;
    public Object iconUrlTemplate;
    public Object iconClsTemplate;
    public Boolean collapsible;
    public Object width;
    public Object height;
    public HashMap<Event, JSONFunction> events = new HashMap<Event, JSONFunction>();
    
    public String getCls() {
        return cls;
    }

    public TimelineOptions setCls(String cls) {
        this.cls = cls;
        return this;
    }

    public Object getDataSource() {
        return dataSource;
    }
    
    public TimelineOptions setDataSource(DataSourceOptions dataSource) {
        // NOTE: serialize the DS to a hash explicitly in this case
        this.dataSource = dataSource.toHashMap();
        return this;
    }
    
    public TimelineOptions setDataSource(JSONFunction dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    
    public TimelineOptions setDataSource(DataSource dataSourceObject) {
        this.dataSource = new JSONFunction("window." + dataSourceObject.getJsVariableName());
        return this;
    }

    public Boolean getReadDataSource() {
        return readDataSource;
    }

    public TimelineOptions setReadDataSource(Boolean readDataSource) {
        this.readDataSource = readDataSource;
        return this;
    }

    public Layout getLayout() {
        return layout;
    }

    public TimelineOptions setLayout(Layout layout) {
        this.layout = layout;
        return this;
    }

    public AnimationOptions getAnimation() {
        return animation;
    }

    public TimelineOptions setAnimation(AnimationOptions animation) {
        this.animation = animation;
        return this;
    }

    public Object getPositionTemplate() {
        return positionTemplate;
    }

    public TimelineOptions setPositionTemplate(String positionTemplate) {
        this.positionTemplate = positionTemplate;
        return this;
    }
    
    public TimelineOptions setPositionTemplate(JSONFunction positionTemplate) {
        this.positionTemplate = positionTemplate;
        return this;
    }

    public Object getIconTemplate() {
        return iconTemplate;
    }

    public TimelineOptions setIconTemplate(String iconTemplate) {
        this.iconTemplate = iconTemplate;
        return this;
    }
    
    public TimelineOptions setIconTemplate(JSONFunction iconTemplate) {
        this.iconTemplate = iconTemplate;
        return this;
    }

    public Object getTitleTemplate() {
        return titleTemplate;
    }

    public TimelineOptions setTitleTemplate(String titleTemplate) {
        this.titleTemplate = titleTemplate;
        return this;
    }
    
    public TimelineOptions setTitleTemplate(JSONFunction titleTemplate) {
        this.titleTemplate = titleTemplate;
        return this;
    }

    public Object getTextTemplate() {
        return textTemplate;
    }

    public TimelineOptions setTextTemplate(String textTemplate) {
        this.textTemplate = textTemplate;
        return this;
    }
    
    public TimelineOptions setTextTemplate(JSONFunction textTemplate) {
        this.textTemplate = textTemplate;
        return this;
    }

    public Object getCollapsedTemplate() {
        return collapsedTemplate;
    }

    public TimelineOptions setCollapsedTemplate(String collapsedTemplate) {
        this.collapsedTemplate = collapsedTemplate;
        return this;
    }
    
    public TimelineOptions setCollapsedTemplate(JSONFunction collapsedTemplate) {
        this.collapsedTemplate = collapsedTemplate;
        return this;
    }

    public Object getIconUrlTemplate() {
        return iconUrlTemplate;
    }

    public TimelineOptions setIconUrlTemplate(String iconUrlTemplate) {
        this.iconUrlTemplate = iconUrlTemplate;
        return this;
    }
    
    public TimelineOptions setIconUrlTemplate(JSONFunction iconUrlTemplate) {
        this.iconUrlTemplate = iconUrlTemplate;
        return this;
    }

    public Object getIconClsTemplate() {
        return iconClsTemplate;
    }

    public TimelineOptions setIconClsTemplate(String iconClsTemplate) {
        this.iconClsTemplate = iconClsTemplate;
        return this;
    }
    
    public TimelineOptions setIconClsTemplate(JSONFunction iconClsTemplate) {
        this.iconClsTemplate = iconClsTemplate;
        return this;
    }

    public Boolean getCollapsible() {
        return collapsible;
    }

    public TimelineOptions setCollapsible(Boolean collapsible) {
        this.collapsible = collapsible;
        return this;
    }

    public Object getWidth() {
        return width;
    }

    public TimelineOptions setWidth(Integer width) {
        this.width = width;
        return this;
    }
    
    public TimelineOptions setWidth(String width) {
        this.width = width;
        return this;
    }

    public Object getHeight() {
        return height;
    }

    public TimelineOptions setHeight(String height) {
        this.height = height;
        return this;
    }
    
    public TimelineOptions setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public HashMap<Event, JSONFunction> getEvents() {
        return events;
    }

    public TimelineOptions setEvents(HashMap<Event, JSONFunction> events) {
        this.events = events;
        return this;
    }
}
