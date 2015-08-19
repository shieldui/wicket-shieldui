/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shieldui.wicket.maskedtextbox;

import com.shieldui.wicket.OptionsBase;
import org.apache.wicket.ajax.json.JsonFunction;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Lyubo
 */
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
    public HashMap<Character, JsonFunction> rules = new HashMap<Character, JsonFunction>();
    public HashMap<Event, JsonFunction> events = new HashMap<Event, JsonFunction>();
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

    public HashMap<Character, JsonFunction> getRules() {
        return rules;
    }

    public MaskedTextBoxOptions setRules(HashMap<Character, JsonFunction> rules) {
        this.rules = rules;
        return this;
    }

    public HashMap<Event, JsonFunction> getEvents() {
        return events;
    }

    public MaskedTextBoxOptions setEvents(HashMap<Event, JsonFunction> events) {
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
