package com.shieldui.wicket.toggle;

import com.shieldui.wicket.OptionsBase;
import java.util.HashMap;
import org.apache.wicket.ajax.json.JSONFunction;

public class SwitchOptions extends OptionsBase
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
    
    public String cls;
    public Boolean enabled;
    public Boolean checked;
    public String onText;
    public String offText;
    public HashMap<Event, JSONFunction> events = new HashMap<Event, JSONFunction>();

    public String getCls() {
        return cls;
    }

    public SwitchOptions setCls(String cls) {
        this.cls = cls;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public SwitchOptions setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getChecked() {
        return checked;
    }

    public SwitchOptions setChecked(Boolean checked) {
        this.checked = checked;
        return this;
    }

    public String getOnText() {
        return onText;
    }

    public SwitchOptions setOnText(String onText) {
        this.onText = onText;
        return this;
    }

    public String getOffText() {
        return offText;
    }

    public SwitchOptions setOffText(String offText) {
        this.offText = offText;
        return this;
    }

    public HashMap<Event, JSONFunction> getEvents() {
        return events;
    }

    public SwitchOptions setEvents(HashMap<Event, JSONFunction> events) {
        this.events = events;
        return this;
    }
    
    
}
