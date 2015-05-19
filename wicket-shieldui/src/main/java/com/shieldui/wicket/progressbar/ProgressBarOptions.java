package com.shieldui.wicket.progressbar;

import com.shieldui.wicket.HashMapSerializable;
import com.shieldui.wicket.OptionsBase;
import java.util.HashMap;
import org.apache.wicket.ajax.json.JsonFunction;

public class ProgressBarOptions extends OptionsBase
{
    private static final long serialVersionUID = 1L;
    
    // client events
    public enum Event
    {
        CHANGE ("change"),
        COMPLETE ("complete");
        
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
    
    // layouts
    public enum Layout
    {
        HORIZONTAL ("horizontal"),
        VERTICAL ("vertical"),
        CIRCULAR ("circular");
        
        private final String value;
        
        private Layout(String val)
        {
            value = val;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public static final class LayoutOptions extends HashMapSerializable
    {
        public static final class Circular extends HashMapSerializable
        {
            public Integer width;
            public String color;
            public String colorDisabled;
            public String borderColor;
            public Integer borderWidth;
            public String backgroundColor;
            
            public Integer getWidth() {
                return width;
            }

            public Circular setWidth(Integer width) {
                this.width = width;
                return this;
            }

            public String getColor() {
                return color;
            }

            public Circular setColor(String color) {
                this.color = color;
                return this;
            }

            public String getColorDisabled() {
                return colorDisabled;
            }

            public Circular setColorDisabled(String colorDisabled) {
                this.colorDisabled = colorDisabled;
                return this;
            }

            public String getBorderColor() {
                return borderColor;
            }

            public Circular setBorderColor(String borderColor) {
                this.borderColor = borderColor;
                return this;
            }

            public Integer getBorderWidth() {
                return borderWidth;
            }

            public Circular setBorderWidth(Integer borderWidth) {
                this.borderWidth = borderWidth;
                return this;
            }

            public String getBackgroundColor() {
                return backgroundColor;
            }

            public Circular setBackgroundColor(String backgroundColor) {
                this.backgroundColor = backgroundColor;
                return this;
            }
        }
        
        public Circular circular = new Circular();
        
        public Circular getCircular() {
            return circular;
        }

        public LayoutOptions setCircular(Circular circular) {
            this.circular = circular;
            return this;
        }
    }
    
    public static final class Text extends HashMapSerializable
    {
        public Boolean enabled;
        public Object template;
        
        public Boolean getEnabled() {
            return enabled;
        }

        public Text setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        
        public Object getTemplate() {
            return template;
        }

        public Text setTemplate(String template) {
            this.template = template;
            return this;
        }
        
        public Text setTemplate(JsonFunction template) {
            this.template = template;
            return this;
        }
    }
    
    public Boolean enabled;
    public HashMap<Event, JsonFunction> events = new HashMap<Event, JsonFunction>();
    public Object min;
    public Object max;
    public Object value;
    public Layout layout;
    public LayoutOptions layoutOptions = new LayoutOptions();
    public Boolean reversed;
    public Text text = new Text();
    
    public Boolean getEnabled() {
        return enabled;
    }

    public ProgressBarOptions setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    
    public HashMap<Event, JsonFunction> getEvents() {
        return events;
    }

    public ProgressBarOptions setEvents(HashMap<Event, JsonFunction> events) {
        this.events = events;
        return this;
    }

    public Object getMin() {
        return min;
    }

    public ProgressBarOptions setMin(Long min) {
        this.min = min;
        return this;
    }
    
    public ProgressBarOptions setMin(Integer min) {
        this.min = min;
        return this;
    }
    
    public ProgressBarOptions setMin(Double min) {
        this.min = min;
        return this;
    }
    
    public ProgressBarOptions setMin(Float min) {
        this.min = min;
        return this;
    }

    public Object getMax() {
        return max;
    }

    public ProgressBarOptions setMax(Long max) {
        this.max = max;
        return this;
    }
    
    public ProgressBarOptions setMax(Integer max) {
        this.max = max;
        return this;
    }
    
    public ProgressBarOptions setMax(Double max) {
        this.max = max;
        return this;
    }
    
    public ProgressBarOptions setMax(Float max) {
        this.max = max;
        return this;
    }

    public Object getValue() {
        return value;
    }

    public ProgressBarOptions setValue(Long value) {
        this.value = value;
        return this;
    }
    
    public ProgressBarOptions setValue(Integer value) {
        this.value = value;
        return this;
    }
    
    public ProgressBarOptions setValue(Double value) {
        this.value = value;
        return this;
    }
    
    public ProgressBarOptions setValue(Float value) {
        this.value = value;
        return this;
    }

    public Layout getLayout() {
        return layout;
    }

    public ProgressBarOptions setLayout(Layout layout) {
        this.layout = layout;
        return this;
    }

    public LayoutOptions getLayoutOptions() {
        return layoutOptions;
    }

    public ProgressBarOptions setLayoutOptions(LayoutOptions layoutOptions) {
        this.layoutOptions = layoutOptions;
        return this;
    }

    public Boolean getReversed() {
        return reversed;
    }

    public ProgressBarOptions setReversed(Boolean reversed) {
        this.reversed = reversed;
        return this;
    }

    public Text getText() {
        return text;
    }

    public ProgressBarOptions setText(Text text) {
        this.text = text;
        return this;
    }
}
