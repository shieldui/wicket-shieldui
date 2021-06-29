package com.shieldui.wicket.splitter;

import com.shieldui.wicket.HashMapSerializable;
import com.shieldui.wicket.OptionsBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.apache.wicket.ajax.json.JSONFunction;

public class SplitterOptions extends OptionsBase
{
    private static final long serialVersionUID = 1L;
    
    // client events
    public enum Event
    {
        COLLAPSE ("collapse"),
        EXPAND ("expand"),
        RESIZE ("resize");
        
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
    
    public static final class PaneOptions extends HashMapSerializable
    {
        public Boolean collapsed;
        public Boolean collapsible;
        public Boolean resizable;
        public Boolean scrollable;
        public String size;
        public String min;
        public String max;

        public Boolean getCollapsed() {
            return collapsed;
        }

        public PaneOptions setCollapsed(Boolean collapsed) {
            this.collapsed = collapsed;
            return this;
        }

        public Boolean getCollapsible() {
            return collapsible;
        }

        public PaneOptions setCollapsible(Boolean collapsible) {
            this.collapsible = collapsible;
            return this;
        }

        public Boolean getResizable() {
            return resizable;
        }

        public PaneOptions setResizable(Boolean resizable) {
            this.resizable = resizable;
            return this;
        }

        public Boolean getScrollable() {
            return scrollable;
        }

        public PaneOptions setScrollable(Boolean scrollable) {
            this.scrollable = scrollable;
            return this;
        }

        public String getSize() {
            return size;
        }

        public PaneOptions setSize(Integer size) {
            this.size = size.toString();
            return this;
        }
        
        public PaneOptions setSize(String size) {
            this.size = size;
            return this;
        }

        public String getMin() {
            return min;
        }

        public PaneOptions setMin(Integer min) {
            this.min = min.toString();
            return this;
        }
        
        public PaneOptions setMin(String min) {
            this.min = size;
            return this;
        }

        public String getMax() {
            return max;
        }

        public PaneOptions setMax(Integer max) {
            this.max = max.toString();
            return this;
        }
        
        public PaneOptions setMax(String max) {
            this.max = max;
            return this;
        }
    }
    
    public String cls;
    public Orientation orientation;
    public List<PaneOptions> panes = new ArrayList<PaneOptions>();
    public HashMap<Event, JSONFunction> events = new HashMap<Event, JSONFunction>();
    
    public String getCls() {
        return cls;
    }

    public SplitterOptions setCls(String cls) {
        this.cls = cls;
        return this;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public SplitterOptions setOrientation(Orientation orientation) {
        this.orientation = orientation;
        return this;
    }

    public List<PaneOptions> getPanes() {
        return panes;
    }

    public SplitterOptions setPanes(List<PaneOptions> panes) {
        this.panes = panes;
        return this;
    }
    
    public SplitterOptions setPanes(PaneOptions... panes) {
        this.panes = Arrays.asList(panes);
        return this;
    }
    
    public HashMap<Event, JSONFunction> getEvents() {
        return events;
    }

    public SplitterOptions setEvents(HashMap<Event, JSONFunction> events) {
        this.events = events;
        return this;
    }
}
