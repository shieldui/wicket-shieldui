package com.shieldui.wicket.rating;

import com.shieldui.wicket.OptionsBase;
import org.apache.wicket.ajax.json.JSONFunction;
import java.util.HashMap;

public class RatingOptions extends OptionsBase {
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
    
    public Double min;
    public Double max;
    public Double step;
    public Double value;
    public Integer symbolWidth;
    public Integer symbolHeight;
    public Boolean enabled;
    public Boolean markPreset;
    public HashMap<Event, JSONFunction> events = new HashMap<Event, JSONFunction>();

    public Double getMin() {
        return min;
    }

    public RatingOptions setMin(Double min) {
        this.min = min;
        return this;
    }

    public Double getMax() {
        return max;
    }

    public RatingOptions setMax(Double max) {
        this.max = max;
        return this;
    }

    public Double getStep() {
        return step;
    }

    public RatingOptions setStep(Double step) {
        this.step = step;
        return this;
    }

    public Double getValue() {
        return value;
    }

    public RatingOptions setValue(Double value) {
        this.value = value;
        return this;
    }

    public Integer getSymbolWidth() {
        return symbolWidth;
    }

    public RatingOptions setSymbolWidth(Integer symbolWidth) {
        this.symbolWidth = symbolWidth;
        return this;
    }

    public Integer getSymbolHeight() {
        return symbolHeight;
    }

    public RatingOptions setSymbolHeight(Integer symbolHeight) {
        this.symbolHeight = symbolHeight;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public RatingOptions setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getMarkPreset() {
        return markPreset;
    }

    public RatingOptions setMarkPreset(Boolean markPreset) {
        this.markPreset = markPreset;
        return this;
    }

    public HashMap<Event, JSONFunction> getEvents() {
        return events;
    }

    public RatingOptions setEvents(HashMap<Event, JSONFunction> events) {
        this.events = events;
        return this;
    }
}
