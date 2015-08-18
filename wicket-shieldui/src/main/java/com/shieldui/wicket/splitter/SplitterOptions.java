/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shieldui.wicket.splitter;

import com.shieldui.wicket.HashMapSerializable;
import com.shieldui.wicket.OptionsBase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.wicket.ajax.json.JsonFunction;

/**
 *
 * @author Lyubo
 */
public class SplitterOptions extends OptionsBase {
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
    
    public static final class PaneOptions extends HashMapSerializable {
        public Boolean collapsed;
        public Boolean collapsible;
        public Boolean resizable;
        public Boolean scrollable;
        public Integer size;
        public Integer min;
        public Integer max;

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

        public Integer getSize() {
            return size;
        }

        public PaneOptions setSize(Integer size) {
            this.size = size;
            return this;
        }

        public Integer getMin() {
            return min;
        }

        public PaneOptions setMin(Integer min) {
            this.min = min;
            return this;
        }

        public Integer getMax() {
            return max;
        }

        public PaneOptions setMax(Integer max) {
            this.max = max;
            return this;
        }
    }
    
    public String cls;
    public Orientation orientation;
    public List<PaneOptions> panes = new ArrayList<PaneOptions>();
    public HashMap<Event, JsonFunction> events = new HashMap<Event, JsonFunction>();
    
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
    
    public HashMap<Event, JsonFunction> getEvents() {
        return events;
    }

    public SplitterOptions setEvents(HashMap<Event, JsonFunction> events) {
        this.events = events;
        return this;
    }
}
