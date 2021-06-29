package com.shieldui.wicket.radiobutton;

import com.shieldui.wicket.OptionsBase;
import java.util.HashMap;
import org.apache.wicket.ajax.json.JSONFunction;

public class RadioButtonOptions extends OptionsBase {
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
     public Boolean enableLabelClick;
     public Boolean checked;
     public String label;
     public HashMap<Event, JSONFunction> events = new HashMap<Event, JSONFunction>();

    public Boolean getEnabled() {
        return enabled;
    }

    public RadioButtonOptions setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnableLabelClick() {
        return enableLabelClick;
    }

    public RadioButtonOptions setEnableLabelClick(Boolean enableLabelClick) {
        this.enableLabelClick = enableLabelClick;
        return this;
    }

    public Boolean getChecked() {
        return checked;
    }

    public RadioButtonOptions setChecked(Boolean checked) {
        this.checked = checked;
        return this;
    }

    public String getLabel() {
        return label;
    }

    public RadioButtonOptions setLabel(String label) {
        this.label = label;
        return this;
    }

    public HashMap<Event, JSONFunction> getEvents() {
        return events;
    }

    public RadioButtonOptions setEvents(HashMap<Event, JSONFunction> events) {
        this.events = events;
        return this;
    }
}
