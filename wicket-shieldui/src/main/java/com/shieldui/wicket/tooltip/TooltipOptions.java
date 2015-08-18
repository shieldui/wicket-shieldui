package com.shieldui.wicket.tooltip;

import com.shieldui.wicket.HashMapSerializable;
import com.shieldui.wicket.OptionsBase;
import java.util.HashMap;
import org.apache.wicket.ajax.json.JsonFunction;

public class TooltipOptions extends OptionsBase
{
    private static final long serialVersionUID = 1L;
    
    public enum Position
    {
        TOP ("top"),
        BOTTOM ("bottom"),
        LEFT ("left"),
        RIGHT ("right"),
        CENTER ("center");
        
        private final String value;
        
        private Position(String val)
        {
            value = val;
        }

        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public enum Trigger
    {
        MOUSEENTER ("mouseenter"),
        CLICK ("click"),
        FOCUS ("focus");
        
        private final String value;
        
        private Trigger(String val)
        {
            value = val;
        }

        @Override
        public String toString()
        {
            return value;
        }
    }
    
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
    
    public static final class TooltipContent extends HashMapSerializable
    {
        public static final class Remote extends HashMapSerializable
        {
            public String url;
            public Boolean iframe;
            
            public String getUrl() {
                return url;
            }

            public Remote setUrl(String url) {
                this.url = url;
                return this;
            }

            public Boolean getIframe() {
                return iframe;
            }

            public Remote setIframe(Boolean iframe) {
                this.iframe = iframe;
                return this;
            }
        }
        
        public Remote remote = new Remote();

        public Remote getRemote() {
            return remote;
        }

        public TooltipContent setRemote(Remote remote) {
            this.remote = remote;
            return this;
        }
    }
    
    public String cls;
    public Boolean enabled;
    public String visible;
    public Integer width;
    public Integer height;
    public Integer delay;
    public String filter;
    public Object content;
    public Position position;
    public Trigger trigger;
    public Boolean autoHide;
    public Boolean callout;
    public HashMap<Event, JsonFunction> events = new HashMap<Event, JsonFunction>();
    
    public String getCls() {
        return cls;
    }

    public TooltipOptions setCls(String cls) {
        this.cls = cls;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public TooltipOptions setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getVisible() {
        return visible;
    }

    public TooltipOptions setVisible(String visible) {
        this.visible = visible;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public TooltipOptions setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public TooltipOptions setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Integer getDelay() {
        return delay;
    }

    public TooltipOptions setDelay(Integer delay) {
        this.delay = delay;
        return this;
    }

    public String getFilter() {
        return filter;
    }

    public TooltipOptions setFilter(String filter) {
        this.filter = filter;
        return this;
    }

    public Object getContent() {
        return content;
    }

    public TooltipOptions setContent(JsonFunction content) {
        this.content = content;
        return this;
    }
    
    public TooltipOptions setContent(String content) {
        this.content = content;
        return this;
    }
    
    public TooltipOptions setContent(TooltipContent content) {
        this.content = content;
        return this;
    }

    public Position getPosition() {
        return position;
    }

    public TooltipOptions setPosition(Position position) {
        this.position = position;
        return this;
    }

    public Trigger getTrigger() {
        return trigger;
    }

    public TooltipOptions setTrigger(Trigger trigger) {
        this.trigger = trigger;
        return this;
    }

    public Boolean getAutoHide() {
        return autoHide;
    }

    public TooltipOptions setAutoHide(Boolean autoHide) {
        this.autoHide = autoHide;
        return this;
    }

    public Boolean getCallout() {
        return callout;
    }

    public TooltipOptions setCallout(Boolean callout) {
        this.callout = callout;
        return this;
    }

    public HashMap<Event, JsonFunction> getEvents() {
        return events;
    }

    public TooltipOptions setEvents(HashMap<Event, JsonFunction> events) {
        this.events = events;
        return this;
    }
}
