package com.shieldui.wicket.checkbox;

import com.shieldui.wicket.OptionsBase;
import java.util.HashMap;
import org.apache.wicket.ajax.json.JSONFunction;

public class CheckBoxOptions extends OptionsBase {
    private static final long serialVersionUID = 1L;
    
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
     
    public Boolean enabled;
    public Boolean enableThreeStates;
    public Boolean enableLabelClick;
    public Boolean checked;
    public String label;
    public HashMap<Event, JSONFunction> events = new HashMap<Event, JSONFunction>();

    public Boolean getEnabled() {
        return enabled;
    }

    public CheckBoxOptions setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnableThreeStates() {
        return enableThreeStates;
    }

    public CheckBoxOptions setEnableThreeStates(Boolean enableThreeStates) {
        this.enableThreeStates = enableThreeStates;
        return this;
    }

    public Boolean getEnableLabelClick() {
        return enableLabelClick;
    }

    public CheckBoxOptions setEnableLabelClick(Boolean enableLabelClick) {
        this.enableLabelClick = enableLabelClick;
        return this;
    }

    public Boolean getChecked() {
        return checked;
    }

    public CheckBoxOptions setChecked(Boolean checked) {
        this.checked = checked;
        return this;
    }

    public String getLabel() {
        return label;
    }

    public CheckBoxOptions setLabel(String label) {
        this.label = label;
        return this;
    }

    public HashMap<Event, JSONFunction> getEvents() {
        return events;
    }

    public CheckBoxOptions setEvents(HashMap<Event, JSONFunction> events) {
        this.events = events;
        return this;
    }
}
