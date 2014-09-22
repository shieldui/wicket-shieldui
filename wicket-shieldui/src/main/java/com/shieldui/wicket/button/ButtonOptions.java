package com.shieldui.wicket.button;

import com.shieldui.wicket.OptionsBase;
import java.util.HashMap;
import org.apache.wicket.ajax.json.JsonFunction;

public class ButtonOptions extends OptionsBase
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
    
    public Boolean checked;
    public Boolean enabled;
    public HashMap<Event, JsonFunction> events = new HashMap<Event, JsonFunction>();
    public String cls;
    public Boolean toggle;

    public Boolean getChecked() {
        return checked;
    }

    public ButtonOptions setChecked(Boolean checked) {
        this.checked = checked;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public ButtonOptions setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public HashMap<Event, JsonFunction> getEvents() {
        return events;
    }

    public ButtonOptions setEvents(HashMap<Event, JsonFunction> events) {
        this.events = events;
        return this;
    }

    public String getCls() {
        return cls;
    }

    public ButtonOptions setCls(String cls) {
        this.cls = cls;
        return this;
    }

    public Boolean getToggle() {
        return toggle;
    }

    public ButtonOptions setToggle(Boolean toggle) {
        this.toggle = toggle;
        return this;
    }
}
