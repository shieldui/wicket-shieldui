package com.shieldui.wicket.autocomplete;

import com.shieldui.wicket.HashMapSerializable;
import com.shieldui.wicket.OptionsBase;
import com.shieldui.wicket.datasource.DataSource;
import com.shieldui.wicket.datasource.DataSourceOptions;
import java.util.HashMap;
import org.apache.wicket.ajax.json.JSONFunction;

public class AutoCompleteOptions extends OptionsBase
{
    private static final long serialVersionUID = 1L;
    
    // client events
    public enum Event
    {
        CHANGE ("change");
        
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
    
    public static final class Animation extends HashMapSerializable
    {
        public Integer closeDelay;
        public Boolean enabled;
        public Integer openDelay;

        public Integer getCloseDelay() {
            return closeDelay;
        }

        public Animation setCloseDelay(Integer closeDelay) {
            this.closeDelay = closeDelay;
            return this;
        }

        public Boolean getEnabled() {
            return enabled;
        }

        public Animation setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Integer getOpenDelay() {
            return openDelay;
        }

        public Animation setOpenDelay(Integer openDelay) {
            this.openDelay = openDelay;
            return this;
        }
    }
    
    public Animation animation = new Animation();
    public Object dataSource;
    public Integer delay;
    public HashMap<Event, JSONFunction> events = new HashMap<Event, JSONFunction>();
    public Integer minLength;
    public Boolean open;
    public Object textTemplate;
    public Object valueTemplate;

    public Animation getAnimation() {
        return animation;
    }

    public AutoCompleteOptions setAnimation(Animation animation) {
        this.animation = animation;
        return this;
    }

    public Object getDataSource() {
        return dataSource;
    }

    public AutoCompleteOptions setDataSource(DataSourceOptions dataSource) {
        // NOTE: serialize the DS to a hash explicitly in this case
        this.dataSource = dataSource.toHashMap();
        return this;
    }
    
    public AutoCompleteOptions setDataSource(JSONFunction dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    
    public AutoCompleteOptions setDataSource(DataSource dataSourceObject) {
        this.dataSource = new JSONFunction("window." + dataSourceObject.getJsVariableName());
        return this;
    }

    public Integer getDelay() {
        return delay;
    }

    public AutoCompleteOptions setDelay(Integer delay) {
        this.delay = delay;
        return this;
    }

    public HashMap<Event, JSONFunction> getEvents() {
        return events;
    }

    public AutoCompleteOptions setEvents(HashMap<Event, JSONFunction> events) {
        this.events = events;
        return this;
    }

    public Integer getMinLength() {
        return minLength;
    }

    public AutoCompleteOptions setMinLength(Integer minLength) {
        this.minLength = minLength;
        return this;
    }

    public Boolean getOpen() {
        return open;
    }

    public AutoCompleteOptions setOpen(Boolean open) {
        this.open = open;
        return this;
    }

    public Object getTextTemplate() {
        return textTemplate;
    }

    public AutoCompleteOptions setTextTemplate(String textTemplate) {
        this.textTemplate = textTemplate;
        return this;
    }
    
    public AutoCompleteOptions setTextTemplate(JSONFunction textTemplate) {
        this.textTemplate = textTemplate;
        return this;
    }

    public Object getValueTemplate() {
        return valueTemplate;
    }

    public AutoCompleteOptions setValueTemplate(String valueTemplate) {
        this.valueTemplate = valueTemplate;
        return this;
    }
    
    public AutoCompleteOptions setValueTemplate(JSONFunction valueTemplate) {
        this.valueTemplate = valueTemplate;
        return this;
    }
}
