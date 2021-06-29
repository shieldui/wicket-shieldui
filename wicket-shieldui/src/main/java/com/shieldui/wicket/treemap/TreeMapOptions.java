package com.shieldui.wicket.treemap;

import com.shieldui.wicket.HashMapSerializable;
import com.shieldui.wicket.OptionsBase;
import com.shieldui.wicket.datasource.DataSource;
import com.shieldui.wicket.datasource.DataSourceOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.apache.wicket.ajax.json.JSONFunction;

public class TreeMapOptions extends OptionsBase
{
    private static final long serialVersionUID = 1L;
    
    // client events
    public enum Event
    {
        CLICK ("click");
        
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
    
    public enum Type
    {
        SQUARIFIED ("squarified"),
        HORIZONTAL ("horizontal"),
        VERTICAL ("vertical");
        
        private final String value;
        
        private Type(String val)
        {
            value = val;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public static final class TooltipOptions extends HashMapSerializable
    {
        public Boolean enabled;
        public Object template;
        
        public Boolean getEnabled() {
            return enabled;
        }

        public TooltipOptions setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Object getTemplate() {
            return template;
        }

        public TooltipOptions setTemplate(String template) {
            this.template = template;
            return this;
        }
        
        public TooltipOptions setTemplate(JSONFunction template) {
            this.template = template;
            return this;
        }
    }
    
    public String cls;
    public Object colorTemplate;
    public List<String> colors = new ArrayList<String>();
    public Object dataSource;
    public Boolean enabled;
    public HashMap<Event, JSONFunction> events = new HashMap<Event, JSONFunction>();
    public Integer height;
    public Boolean readDataSource;
    public Object textTemplate;
    public String title;
    public TooltipOptions tooltip = new TooltipOptions();
    public Type type;
    public Object valueTemplate;
    public Integer width;

    public String getCls() {
        return cls;
    }

    public TreeMapOptions setCls(String cls) {
        this.cls = cls;
        return this;
    }

    public Object getColorTemplate() {
        return colorTemplate;
    }

    public TreeMapOptions setColorTemplate(String colorTemplate) {
        this.colorTemplate = colorTemplate;
        return this;
    }
    
    public TreeMapOptions setColorTemplate(JSONFunction colorTemplate) {
        this.colorTemplate = colorTemplate;
        return this;
    }

    public List<String> getColors() {
        return colors;
    }

    public TreeMapOptions setColors(List<String> colors) {
        this.colors = colors;
        return this;
    }
    
    public TreeMapOptions setColors(String ... colors) {
        this.colors = Arrays.asList(colors);
        return this;
    }

    public Object getDataSource() {
        return dataSource;
    }

    public TreeMapOptions setDataSource(DataSourceOptions dataSource) {
        // NOTE: serialize the DS to a hash explicitly in this case
        this.dataSource = dataSource.toHashMap();
        return this;
    }
    
    public TreeMapOptions setDataSource(JSONFunction dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    
    public TreeMapOptions setDataSource(DataSource dataSourceObject) {
        this.dataSource = new JSONFunction("window." + dataSourceObject.getJsVariableName());
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public TreeMapOptions setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public HashMap<Event, JSONFunction> getEvents() {
        return events;
    }

    public TreeMapOptions setEvents(HashMap<Event, JSONFunction> events) {
        this.events = events;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public TreeMapOptions setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Boolean getReadDataSource() {
        return readDataSource;
    }

    public TreeMapOptions setReadDataSource(Boolean readDataSource) {
        this.readDataSource = readDataSource;
        return this;
    }

    public Object getTextTemplate() {
        return textTemplate;
    }

    public TreeMapOptions setTextTemplate(String textTemplate) {
        this.textTemplate = textTemplate;
        return this;
    }
    
    public TreeMapOptions setTextTemplate(JSONFunction textTemplate) {
        this.textTemplate = textTemplate;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public TreeMapOptions setTitle(String title) {
        this.title = title;
        return this;
    }

    public TooltipOptions getTooltip() {
        return tooltip;
    }

    public TreeMapOptions setTooltip(TooltipOptions tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public Type getType() {
        return type;
    }

    public TreeMapOptions setType(Type type) {
        this.type = type;
        return this;
    }

    public Object getValueTemplate() {
        return valueTemplate;
    }

    public TreeMapOptions setValueTemplate(String valueTemplate) {
        this.valueTemplate = valueTemplate;
        return this;
    }
    
    public TreeMapOptions setValueTemplate(JSONFunction valueTemplate) {
        this.valueTemplate = valueTemplate;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public TreeMapOptions setWidth(Integer width) {
        this.width = width;
        return this;
    }
}
