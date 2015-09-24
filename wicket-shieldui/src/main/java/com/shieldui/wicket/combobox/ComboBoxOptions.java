package com.shieldui.wicket.combobox;

import com.shieldui.wicket.HashMapSerializable;
import com.shieldui.wicket.OptionsBase;
import com.shieldui.wicket.datasource.DataSource;
import com.shieldui.wicket.datasource.DataSourceOptions;
import java.util.HashMap;
import org.apache.wicket.ajax.json.JsonFunction;

public class ComboBoxOptions extends OptionsBase {
    private static final long serialVersionUID = 1L;
    
    // client events
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
    
    public static final class AutoCompleteOptions extends HashMapSerializable {
        public Boolean enabled;
        public Integer delay;
        public Integer minLength;
        public Object filter;

        public Boolean getEnabled() {
            return enabled;
        }

        public AutoCompleteOptions setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Integer getDelay() {
            return delay;
        }

        public AutoCompleteOptions setDelay(Integer delay) {
            this.delay = delay;
            return this;
        }

        public Integer getMinLength() {
            return minLength;
        }

        public AutoCompleteOptions setMinLength(Integer minLength) {
            this.minLength = minLength;
            return this;
        }

        public Object getFilter() {
            return filter;
        }

        public AutoCompleteOptions setFilter(String filter) {
            this.filter = filter;
            return this;
        }
        
        public AutoCompleteOptions setFilter(JsonFunction filter) {
            this.filter = filter;
            return this;
        }
    }
    
    public static final class AnimationOptions extends HashMapSerializable {
        public Boolean enabled;
        public Integer openDelay;
        public Integer closeDelay;

        public Boolean getEnabled() {
            return enabled;
        }

        public AnimationOptions setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Integer getOpenDelay() {
            return openDelay;
        }

        public AnimationOptions setOpenDelay(Integer openDelay) {
            this.openDelay = openDelay;
            return this;
        }

        public Integer getCloseDelay() {
            return closeDelay;
        }

        public AnimationOptions setCloseDelay(Integer closeDelay) {
            this.closeDelay = closeDelay;
            return this;
        }
    }
    
    public Boolean editable;
    public Boolean enabled;
    public Boolean open;
    public String cls;
    public Object dataSource;
    public Object textTemplate;
    public Object valueTemplate;
    public Object inputTemplate;
    public Integer selected;
    public Object value;
    public Integer width;
    public Integer height;
    public Integer dropDownWidth;
    public Integer dropDownHeight;
    public HashMap<Event, JsonFunction> events = new HashMap<Event, JsonFunction>();
    public AutoCompleteOptions autoComplete = new AutoCompleteOptions();
    public AnimationOptions animation = new AnimationOptions();

    public Boolean getEditable() {
        return editable;
    }

    public ComboBoxOptions setEditable(Boolean editable) {
        this.editable = editable;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public ComboBoxOptions setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getOpen() {
        return open;
    }

    public ComboBoxOptions setOpen(Boolean open) {
        this.open = open;
        return this;
    }

    public String getCls() {
        return cls;
    }

    public ComboBoxOptions setCls(String cls) {
        this.cls = cls;
        return this;
    }

    public Object getDataSource() {
        return dataSource;
    }

    public ComboBoxOptions setDataSource(DataSourceOptions dataSource) {
        // NOTE: serialize the DS to a hash explicitly in this case
        this.dataSource = dataSource.toHashMap();
        return this;
    }
    
    public ComboBoxOptions setDataSource(JsonFunction dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    
    public ComboBoxOptions setDataSource(DataSource dataSourceObject) {
        this.dataSource = new JsonFunction("window." + dataSourceObject.getJsVariableName());
        return this;
    }

    public Object getTextTemplate() {
        return textTemplate;
    }

    public ComboBoxOptions setTextTemplate(String textTemplate) {
        this.textTemplate = textTemplate;
        return this;
    }
    
    public ComboBoxOptions setTextTemplate(JsonFunction textTemplate) {
        this.textTemplate = textTemplate;
        return this;
    }

    public Object getValueTemplate() {
        return valueTemplate;
    }

    public ComboBoxOptions setValueTemplate(String valueTemplate) {
        this.valueTemplate = valueTemplate;
        return this;
    }
    
    public ComboBoxOptions setValueTemplate(JsonFunction valueTemplate) {
        this.valueTemplate = valueTemplate;
        return this;
    }

    public Object getInputTemplate() {
        return inputTemplate;
    }

    public ComboBoxOptions setInputTemplate(String inputTemplate) {
        this.inputTemplate = inputTemplate;
        return this;
    }
    
    public ComboBoxOptions setInputTemplate(JsonFunction inputTemplate) {
        this.inputTemplate = inputTemplate;
        return this;
    }

    public Integer getSelected() {
        return selected;
    }

    public ComboBoxOptions setSelected(Integer selected) {
        this.selected = selected;
        return this;
    }

    public Object getValue() {
        return value;
    }

    public ComboBoxOptions setValue(Object value) {
        this.value = value;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public ComboBoxOptions setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public ComboBoxOptions setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Integer getDropDownWidth() {
        return dropDownWidth;
    }

    public ComboBoxOptions setDropDownWidth(Integer dropDownWidth) {
        this.dropDownWidth = dropDownWidth;
        return this;
    }

    public Integer getDropDownHeight() {
        return dropDownHeight;
    }

    public ComboBoxOptions setDropDownHeight(Integer dropDownHeight) {
        this.dropDownHeight = dropDownHeight;
        return this;
    }

    public HashMap<Event, JsonFunction> getEvents() {
        return events;
    }

    public ComboBoxOptions setEvents(HashMap<Event, JsonFunction> events) {
        this.events = events;
        return this;
    }

    public AutoCompleteOptions getAutoComplete() {
        return autoComplete;
    }

    public ComboBoxOptions setAutoComplete(AutoCompleteOptions autoComplete) {
        this.autoComplete = autoComplete;
        return this;
    }

    public AnimationOptions getAnimation() {
        return animation;
    }

    public ComboBoxOptions setAnimation(AnimationOptions animation) {
        this.animation = animation;
        return this;
    }
}
