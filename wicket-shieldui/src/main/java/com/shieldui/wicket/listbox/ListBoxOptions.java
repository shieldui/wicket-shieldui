package com.shieldui.wicket.listbox;

import com.shieldui.wicket.OptionsBase;
import com.shieldui.wicket.datasource.DataSource;
import com.shieldui.wicket.datasource.DataSourceOptions;
import java.util.HashMap;
import java.util.List;
import org.apache.wicket.ajax.json.JSONFunction;

public class ListBoxOptions extends OptionsBase
{
    private static final long serialVersionUID = 1L;
    
    public enum Event
    {
        CHANGE ("change"),
        SELECT ("select");
        
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
    
    public Boolean enabled;
    public String cls;
    public Object dataSource;
    public Boolean readDataSource;
    public Object textTemplate;
    public Object valueTemplate;
    public Boolean multiple;
    public Object selected;
    public Object values;
    public Integer width;
    public Integer height;
    public Integer maxHeight;
    public HashMap<Event, JSONFunction> events = new HashMap<Event, JSONFunction>();

    public Boolean getEnabled() {
        return enabled;
    }

    public ListBoxOptions setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getCls() {
        return cls;
    }

    public ListBoxOptions setCls(String cls) {
        this.cls = cls;
        return this;
    }

    public Object getDataSource() {
        return dataSource;
    }

    public ListBoxOptions setDataSource(DataSourceOptions dataSource) {
        // NOTE: serialize the DS to a hash explicitly in this case
        this.dataSource = dataSource.toHashMap();
        return this;
    }
    
    public ListBoxOptions setDataSource(JSONFunction dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    
    public ListBoxOptions setDataSource(DataSource dataSourceObject) {
        this.dataSource = new JSONFunction("window." + dataSourceObject.getJsVariableName());
        return this;
    }

    public Boolean getReadDataSource() {
        return readDataSource;
    }

    public ListBoxOptions setReadDataSource(Boolean readDataSource) {
        this.readDataSource = readDataSource;
        return this;
    }

    public Object getTextTemplate() {
        return textTemplate;
    }

    public ListBoxOptions setTextTemplate(String textTemplate) {
        this.textTemplate = textTemplate;
        return this;
    }
    
    public ListBoxOptions setTextTemplate(JSONFunction textTemplate) {
        this.textTemplate = textTemplate;
        return this;
    }

    public Object getValueTemplate() {
        return valueTemplate;
    }

    public ListBoxOptions setValueTemplate(String valueTemplate) {
        this.valueTemplate = valueTemplate;
        return this;
    }
    
    public ListBoxOptions setValueTemplate(JSONFunction valueTemplate) {
        this.valueTemplate = valueTemplate;
        return this;
    }

    public Boolean getMultiple() {
        return multiple;
    }

    public ListBoxOptions setMultiple(Boolean multiple) {
        this.multiple = multiple;
        return this;
    }

    public Object getSelected() {
        return selected;
    }

    public ListBoxOptions setSelected(Integer selected) {
        this.selected = selected;
        return this;
    }
    
    public ListBoxOptions setSelected(List<Integer> selected) {
        this.selected = selected;
        return this;
    }

    public Object getValues() {
        return values;
    }

    public ListBoxOptions setValues(Object values) {
        this.values = values;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public ListBoxOptions setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public ListBoxOptions setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Integer getMaxHeight() {
        return maxHeight;
    }

    public ListBoxOptions setMaxHeight(Integer maxHeight) {
        this.maxHeight = maxHeight;
        return this;
    }
}
