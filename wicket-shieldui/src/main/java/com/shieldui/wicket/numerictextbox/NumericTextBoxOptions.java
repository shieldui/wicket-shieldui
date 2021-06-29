package com.shieldui.wicket.numerictextbox;

import com.shieldui.wicket.HashMapSerializable;
import com.shieldui.wicket.OptionsBase;
import org.apache.wicket.ajax.json.JSONFunction;
import java.util.HashMap;

public class NumericTextBoxOptions extends OptionsBase {
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
    
    public static final class LabelsOptions extends HashMapSerializable
    {
        public String increase;
        public String decrease;

        public String getIncrease() {
            return increase;
        }

        public LabelsOptions setIncrease(String increase) {
            this.increase = increase;
            return this;
        }

        public String getDecrease() {
            return decrease;
        }

        public LabelsOptions setDecrease(String decrease) {
            this.decrease = decrease;
            return this;
        }
    }
    
    public Boolean enabled;
    public String cls;
    public Double min;
    public Double max;
    public Double step;
    public Double value;
    public Boolean editable;
    public Boolean spinners;
    public Object textTemplate;
    public Object valueTemplate;
    public LabelsOptions labels = new LabelsOptions();
    public HashMap<Event, JSONFunction> events = new HashMap<Event, JSONFunction>();

    public Boolean getEnabled() {
        return enabled;
    }

    public NumericTextBoxOptions setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getCls() {
        return cls;
    }

    public NumericTextBoxOptions setCls(String cls) {
        this.cls = cls;
        return this;
    }

    public Double getMin() {
        return min;
    }

    public NumericTextBoxOptions setMin(Double min) {
        this.min = min;
        return this;
    }

    public Double getMax() {
        return max;
    }

    public NumericTextBoxOptions setMax(Double max) {
        this.max = max;
        return this;
    }

    public Double getStep() {
        return step;
    }

    public NumericTextBoxOptions setStep(Double step) {
        this.step = step;
        return this;
    }

    public Double getValue() {
        return value;
    }

    public NumericTextBoxOptions setValue(Double value) {
        this.value = value;
        return this;
    }

    public Boolean getEditable() {
        return editable;
    }

    public NumericTextBoxOptions setEditable(Boolean editable) {
        this.editable = editable;
        return this;
    }

    public Boolean getSpinners() {
        return spinners;
    }

    public NumericTextBoxOptions setSpinners(Boolean spinners) {
        this.spinners = spinners;
        return this;
    }

    public Object getTextTemplate() {
        return textTemplate;
    }

    public NumericTextBoxOptions setTextTemplate(String textTemplate) {
        this.textTemplate = textTemplate;
        return this;
    }
    
    public NumericTextBoxOptions setTextTemplate(JSONFunction textTemplate) {
        this.textTemplate = textTemplate;
        return this;
    }

    public Object getValueTemplate() {
        return valueTemplate;
    }

    public NumericTextBoxOptions setValueTemplate(String valueTemplate) {
        this.valueTemplate = valueTemplate;
        return this;
    }
    
    public NumericTextBoxOptions setValueTemplate(JSONFunction valueTemplate) {
        this.valueTemplate = valueTemplate;
        return this;
    }

    public LabelsOptions getLabels() {
        return labels;
    }

    public NumericTextBoxOptions setLabels(LabelsOptions labels) {
        this.labels = labels;
        return this;
    }

    public HashMap<Event, JSONFunction> getEvents() {
        return events;
    }

    public NumericTextBoxOptions setEvents(HashMap<Event, JSONFunction> events) {
        this.events = events;
        return this;
    }
}
