package com.shieldui.wicket.slider;

import com.shieldui.wicket.HashMapSerializable;
import com.shieldui.wicket.OptionsBase;
import org.apache.wicket.ajax.json.JsonFunction;
import java.util.HashMap;

public class SliderOptions extends OptionsBase
{
    private static final long serialVersionUID = 1L;
    
    // client events
    public enum Event
    {
        CHANGE ("change"),
        SLIDE ("slide"),
        FOCUS ("focus"),
        BLUR ("blur");
        
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
    
    public enum Orientation
    {
        HORIZONTAL ("horizontal"),
        VERTICAL ("vertical");
        
        private final String value;
        
        private Orientation(String val)
        {
            value = val;
        }

        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public enum TickType
    {
        BOTH ("both"),
        TOP ("top"),
        BOTTOM ("bottom"),
        LEFT ("left"),
        RIGHT ("right");
        
        private final String value;
        
        private TickType(String val)
        {
            value = val;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public static final class TicksOptions extends HashMapSerializable
    {
        public Boolean enabled;
        public TickType type;
        public Double step;
        
        public Boolean getEnabled() {
            return enabled;
        }

        public SliderOptions.TicksOptions setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        
        public TickType getType() {
            return type;
        }

        public SliderOptions.TicksOptions setType(TickType type) {
            this.type = type;
            return this;
        }
        
        public Double getStep() {
            return step;
        }

        public SliderOptions.TicksOptions setStep(Double step) {
            this.step = step;
            return this;
        }
    }
    
    public static final class TooltipOptions extends HashMapSerializable
    {
        public Boolean enabled;
        public Object template;
        
        public Boolean getEnabled() {
            return enabled;
        }

        public SliderOptions.TooltipOptions setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Object getTemplate() {
            return template;
        }

        public SliderOptions.TooltipOptions setTemplate(String template) {
            this.template = template;
            return this;
        }
        
        public SliderOptions.TooltipOptions setTemplate(JsonFunction template) {
            this.template = template;
            return this;
        }
    }
    
    public static final class ValuesOptions extends HashMapSerializable
    {
        public Boolean enabled;
        public Object template;
        
        public Boolean getEnabled() {
            return enabled;
        }

        public SliderOptions.ValuesOptions setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Object getTemplate() {
            return template;
        }

        public SliderOptions.ValuesOptions setTemplate(String template) {
            this.template = template;
            return this;
        }
        
        public SliderOptions.ValuesOptions setTemplate(JsonFunction template) {
            this.template = template;
            return this;
        }
    }
    
    public String cls;
    public Orientation orientation;
    public Double min;
    public Double max;
    public Double value;
    public Double step;
    public Double largeStep;
    public Boolean enabled;
    public Boolean buttons;
    public Integer width;
    public Integer height;
    public TicksOptions ticks = new TicksOptions();
    public TooltipOptions tooltip = new TooltipOptions();    
    public ValuesOptions values = new ValuesOptions();
    public HashMap<Event, JsonFunction> events = new HashMap<Event, JsonFunction>();

    public String getCls() {
        return cls;
    }
    
    public SliderOptions setCls(String cls) {
        this.cls = cls;
        return this;
    }

    public Orientation getOrientation() {
        return orientation;
    }
    
    public SliderOptions setOrientation(Orientation orientation) {
        this.orientation = orientation;
        return this;
    }

    public Double getMin() {
        return min;
    }
    
    public SliderOptions setMin(Double min) {
        this.min = min;
        return this;
    }

    public Double getMax() {
        return max;
    }
    
    public SliderOptions setMax(Double max) {
        this.max = max;
        return this;
    }

    public Double getValue() {
        return value;
    }
    
    public SliderOptions setValue(Double value) {
        this.value = value;
        return this;
    }

    public Double getStep() {
        return step;
    }
    
    public SliderOptions setStep(Double step) {
        this.step = step;
        return this;
    }

    public Double getLargeStep() {
        return largeStep;
    }
    
    public SliderOptions setLargeStep(Double largeStep) {
        this.largeStep = largeStep;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }
    
    public SliderOptions setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getButtons() {
        return buttons;
    }
    
    public SliderOptions setButtons(Boolean buttons) {
        this.buttons = buttons;
        return this;
    }

    public Integer getWidth() {
        return width;
    }
    
    public SliderOptions setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getHeight() {
        return height;
    }
    
    public SliderOptions setHeight(Integer height) {
        this.height = height;
        return this;
    }
    
    public TicksOptions getTicks() {
        return ticks;
    }

    public SliderOptions setTicks(TicksOptions ticks) {
        this.ticks = ticks;
        return this;
    }
    
    public TooltipOptions getTooltip() {
        return tooltip;
    }

    public SliderOptions setTooltip(TooltipOptions tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public ValuesOptions getValues() {
        return values;
    }

    public SliderOptions setValues(ValuesOptions values) {
        this.values = values;
        return this;
    }
    
     public HashMap<Event, JsonFunction> getEvents() {
        return events;
    }

    public SliderOptions setEvents(HashMap<Event, JsonFunction> events) {
        this.events = events;
        return this;
    }
}
