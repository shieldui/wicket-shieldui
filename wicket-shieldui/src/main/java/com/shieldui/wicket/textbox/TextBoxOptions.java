package com.shieldui.wicket.textbox;

import com.shieldui.wicket.HashMapSerializable;
import com.shieldui.wicket.OptionsBase;
import com.shieldui.wicket.datasource.DataSource;
import com.shieldui.wicket.datasource.DataSourceOptions;
import com.shieldui.wicket.textbox.TextBoxOptions.AutoCompleteOptions.AnimationOptions;
import java.util.HashMap;
import org.apache.wicket.ajax.json.JsonFunction;

public class TextBoxOptions extends OptionsBase
{
    private static final long serialVersionUID = 1L;
    
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
    
    public static final class AutoCompleteOptions extends HashMapSerializable
    {
        private static final long serialVersionUID = 1L;
        
        public static final class AnimationOptions extends HashMapSerializable
        {
            private static final long serialVersionUID = 1L;
            
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
        public Object dataSource;
        public Object textTemplate;
        public Object valueTemplate;
        public Boolean open;
        public Integer delay;
        public Integer minLength;
        public AnimationOptions animation = new AnimationOptions();

        public Object getDataSource() {
            return dataSource;
        }

        public AutoCompleteOptions setDataSource(DataSourceOptions dataSource) {
            // NOTE: serialize the DS to a hash explicitly in this case
            this.dataSource = dataSource.toHashMap();
            return this;
        }

        public AutoCompleteOptions setDataSource(JsonFunction dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        
        public AutoCompleteOptions setDataSource(DataSource dataSourceObject) {
            this.dataSource = new JsonFunction("window." + dataSourceObject.getJsVariableName());
            return this;
        }

        public Object getTextTemplate() {
            return textTemplate;
        }

        public AutoCompleteOptions setTextTemplate(String textTemplate) {
            this.textTemplate = textTemplate;
            return this;
        }
        
        public AutoCompleteOptions setTextTemplate(JsonFunction textTemplate) {
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
        
        public AutoCompleteOptions setValueTemplate(JsonFunction valueTemplate) {
            this.valueTemplate = valueTemplate;
            return this;
        }

        public Boolean getOpen() {
            return open;
        }

        public AutoCompleteOptions setOpen(Boolean open) {
            this.open = open;
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

        public AnimationOptions getAnimation() {
            return animation;
        }

        public AutoCompleteOptions setAnimation(AnimationOptions animation) {
            this.animation = animation;
            return this;
        }
    }
    
    public Boolean enabled;
    public String cls;
    public String value;
    public AutoCompleteOptions autoComplete = new AutoCompleteOptions();
    public HashMap<Event, JsonFunction> events = new HashMap<Event, JsonFunction>();

    public Boolean getEnabled() {
        return enabled;
    }

    public TextBoxOptions setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getCls() {
        return cls;
    }

    public TextBoxOptions setCls(String cls) {
        this.cls = cls;
        return this;
    }

    public String getValue() {
        return value;
    }

    public TextBoxOptions setValue(String value) {
        this.value = value;
        return this;
    }

    public AutoCompleteOptions getAnimation() {
        return autoComplete;
    }

    public TextBoxOptions setAnimation(AutoCompleteOptions autoComplete) {
        this.autoComplete = autoComplete;
        return this;
    }

    public HashMap<Event, JsonFunction> getEvents() {
        return events;
    }

    public TextBoxOptions setEvents(HashMap<Event, JsonFunction> events) {
        this.events = events;
        return this;
    }
}
