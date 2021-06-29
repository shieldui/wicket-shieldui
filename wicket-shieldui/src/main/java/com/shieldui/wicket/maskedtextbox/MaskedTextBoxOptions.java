package com.shieldui.wicket.maskedtextbox;

import com.shieldui.wicket.OptionsBase;
import org.apache.wicket.ajax.json.JSONFunction;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class MaskedTextBoxOptions extends OptionsBase {
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
    
    public Boolean enabled;
    public String cls;
    public String mask;
    public Character promptChar;
    public String value;
    public HashMap<Character, JSONFunction> rules = new HashMap<Character, JSONFunction>();
    public HashMap<Event, JSONFunction> events = new HashMap<Event, JSONFunction>();
    public List<Character> cultureSpecific = new ArrayList<Character>();
    public List<Character> separators = new ArrayList<Character>();

    public Boolean getEnabled() {
        return enabled;
    }

    public MaskedTextBoxOptions setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getCls() {
        return cls;
    }

    public MaskedTextBoxOptions setCls(String cls) {
        this.cls = cls;
        return this;
    }

    public String getMask() {
        return mask;
    }

    public MaskedTextBoxOptions setMask(String mask) {
        this.mask = mask;
        return this;
    }

    public Character getPromptChar() {
        return promptChar;
    }

    public MaskedTextBoxOptions setPromptChar(Character promptChar) {
        this.promptChar = promptChar;
        return this;
    }

    public String getValue() {
        return value;
    }

    public MaskedTextBoxOptions setValue(String value) {
        this.value = value;
        return this;
    }

    public HashMap<Character, JSONFunction> getRules() {
        return rules;
    }

    public MaskedTextBoxOptions setRules(HashMap<Character, JSONFunction> rules) {
        this.rules = rules;
        return this;
    }

    public HashMap<Event, JSONFunction> getEvents() {
        return events;
    }

    public MaskedTextBoxOptions setEvents(HashMap<Event, JSONFunction> events) {
        this.events = events;
        return this;
    }

    public List<Character> getCultureSpecific() {
        return cultureSpecific;
    }

    public MaskedTextBoxOptions setCultureSpecific(List<Character> cultureSpecific) {
        this.cultureSpecific = cultureSpecific;
        return this;
    }

    public List<Character> getSeparators() {
        return separators;
    }

    public MaskedTextBoxOptions setSeparators(List<Character> separators) {
        this.separators = separators;
        return this;
    }
}
