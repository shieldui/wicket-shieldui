package com.shieldui.wicket.calendar;

import com.shieldui.wicket.HashMapSerializable;
import com.shieldui.wicket.OptionsBase;
import java.util.Date;
import java.util.HashMap;
import org.apache.wicket.ajax.json.JSONFunction;

public class CalendarOptions extends OptionsBase
{
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
    
    public enum Depth
    {
        MONTH ("month"),
        YEAR ("year"),
        DECADE ("decade"),
        CENTURY ("century");
        
        private final String value;
        
        private Depth(String val)
        {
            value = val;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public static final class Footer extends HashMapSerializable
    {
        public Boolean enabled;
        public Object footerTemplate;
        
        public Boolean getEnabled() {
            return enabled;
        }

        public Footer setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Object getFooterTemplate() {
            return footerTemplate;
        }
        
        public Footer setFooterTemplate(String footerTemplate) {
            this.footerTemplate = footerTemplate;
            return this;
        }

        public Footer setFooterTemplate(JSONFunction footerTemplate) {
            this.footerTemplate = footerTemplate;
            return this;
        }
    }
    
    public static final class Labels extends HashMapSerializable
    {
        public String previous;
        public String next;
        
        public String getPrevious() {
            return previous;
        }

        public Labels setPrevious(String previous) {
            this.previous = previous;
            return this;
        }

        public String getNext() {
            return next;
        }

        public Labels setNext(String next) {
            this.next = next;
            return this;
        }
    }
    
    public static final class View extends HashMapSerializable
    {
        public Depth depth;
        public Depth start;
    }

    // override the serializeVariable to handle serialization of some settings that deal with dates
    @Override
    protected void serializeVariable(Class type, String name, Object value, HashMap<String, Object> result)
    {
        if (value != null && (name.equals("value") || name.equals("min") || name.equals("max"))) {
            result.put(name, new JSONFunction("new Date(" + ((Date)value).getTime() + ")"));
        }
        else {
            // default functionality
            super.serializeVariable(type, name, value, result);
        }
    }
    
    public Object dateTooltipTemplate;
    public Object dayTemplate;
    public Boolean enabled;
    public HashMap<Event, JSONFunction> events = new HashMap<Event, JSONFunction>();
    public JSONFunction focused;
    public Footer footer = new Footer();
    public Boolean hover;
    public Labels labels = new Labels();
    public Date max;
    public Date min;
    public Object otherMonthDayTemplate;
    public Object outOfRangeDayTemplate;
    public Boolean readOnly;
    public Date value;
    public View view = new View();
    
    public Object getDateTooltipTemplate() {
        return dateTooltipTemplate;
    }

    public CalendarOptions setDateTooltipTemplate(String dateTooltipTemplate) {
        this.dateTooltipTemplate = dateTooltipTemplate;
        return this;
    }
    
    public CalendarOptions setDateTooltipTemplate(JSONFunction dateTooltipTemplate) {
        this.dateTooltipTemplate = dateTooltipTemplate;
        return this;
    }

    public Object getDayTemplate() {
        return dayTemplate;
    }

    public CalendarOptions setDayTemplate(String dayTemplate) {
        this.dayTemplate = dayTemplate;
        return this;
    }
    
    public CalendarOptions setDayTemplate(JSONFunction dayTemplate) {
        this.dayTemplate = dayTemplate;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public CalendarOptions setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public HashMap<Event, JSONFunction> getEvents() {
        return events;
    }

    public CalendarOptions setEvents(HashMap<Event, JSONFunction> events) {
        this.events = events;
        return this;
    }

    public JSONFunction getFocused() {
        return focused;
    }

    public CalendarOptions setFocused(JSONFunction focused) {
        this.focused = focused;
        return this;
    }

    public Footer getFooter() {
        return footer;
    }

    public CalendarOptions setFooter(Footer footer) {
        this.footer = footer;
        return this;
    }

    public Boolean getHover() {
        return hover;
    }

    public CalendarOptions setHover(Boolean hover) {
        this.hover = hover;
        return this;
    }

    public Labels getLabels() {
        return labels;
    }

    public CalendarOptions setLabels(Labels labels) {
        this.labels = labels;
        return this;
    }

    public Date getMax() {
        return max;
    }

    public CalendarOptions setMax(Date max) {
        this.max = max;
        return this;
    }
    
    public CalendarOptions setMax(java.util.Calendar calendar) {
        this.max = calendar.getTime();
        return this;
    }

    public Date getMin() {
        return min;
    }

    public CalendarOptions setMin(Date min) {
        this.min = min;
        return this;
    }
    
    public CalendarOptions setMin(java.util.Calendar calendar) {
        this.min = calendar.getTime();
        return this;
    }

    public Object getOtherMonthDayTemplate() {
        return otherMonthDayTemplate;
    }

    public CalendarOptions setOtherMonthDayTemplate(String otherMonthDayTemplate) {
        this.otherMonthDayTemplate = otherMonthDayTemplate;
        return this;
    }
    
    public CalendarOptions setOtherMonthDayTemplate(JSONFunction otherMonthDayTemplate) {
        this.otherMonthDayTemplate = otherMonthDayTemplate;
        return this;
    }

    public Object getOutOfRangeDayTemplate() {
        return outOfRangeDayTemplate;
    }

    public CalendarOptions setOutOfRangeDayTemplate(String outOfRangeDayTemplate) {
        this.outOfRangeDayTemplate = outOfRangeDayTemplate;
        return this;
    }
    
    public CalendarOptions setOutOfRangeDayTemplate(JSONFunction outOfRangeDayTemplate) {
        this.outOfRangeDayTemplate = outOfRangeDayTemplate;
        return this;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public CalendarOptions setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public Date getValue() {
        return value;
    }

    public CalendarOptions setValue(Date value) {
        this.value = value;
        return this;
    }
    
    public CalendarOptions setValue(java.util.Calendar calendar) {
        this.value = calendar.getTime();
        return this;
    }

    public View getView() {
        return view;
    }

    public CalendarOptions setView(View view) {
        this.view = view;
        return this;
    }
}
