package com.shieldui.wicket.datepicker;

import com.shieldui.wicket.HashMapSerializable;
import com.shieldui.wicket.OptionsBase;
import com.shieldui.wicket.calendar.CalendarOptions;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import org.apache.wicket.ajax.json.JSONFunction;

public class DatePickerOptions extends OptionsBase
{
    private static final long serialVersionUID = 1L;
    
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
    
    public static final class MessagesOptions extends HashMapSerializable {
        public String calendarIconTooltip;
        public String buttonText;

        public String getCalendarIconTooltip() {
            return calendarIconTooltip;
        }

        public MessagesOptions setCalendarIconTooltip(String calendarIconTooltip) {
            this.calendarIconTooltip = calendarIconTooltip;
            return this;
        }

        public String getButtonText() {
            return buttonText;
        }

        public MessagesOptions setButtonText(String buttonText) {
            this.buttonText = buttonText;
            return this;
        }
    }
    
    // override the serializeVariable to handle serialization of some settings that deai with dates
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
    
    public CalendarOptions calendar = new CalendarOptions();
    public String format;
    public Object textTemplate;
    public Date value;
    public List<String> parseFormats = new ArrayList<String>();
    public Boolean openOnFocus;
    public Boolean showButton;
    public Boolean editable;
    public Boolean enabled;
    public Date min;
    public Date max;
    public MessagesOptions messages = new MessagesOptions();
    public HashMap<Event, JSONFunction> events = new HashMap<Event, JSONFunction>();

    public CalendarOptions getCalendar() {
        return calendar;
    }

    public DatePickerOptions setCalendar(CalendarOptions calendar) {
        this.calendar = calendar;
        return this;
    }

    public String getFormat() {
        return format;
    }

    public DatePickerOptions setFormat(String format) {
        this.format = format;
        return this;
    }

    public Object getTextTemplate() {
        return textTemplate;
    }

    public DatePickerOptions setTextTemplate(String textTemplate) {
        this.textTemplate = textTemplate;
        return this;
    }
    
    public DatePickerOptions setTextTemplate(JSONFunction textTemplate) {
        this.textTemplate = textTemplate;
        return this;
    }

    public Date getValue() {
        return value;
    }

    public DatePickerOptions setValue(Date value) {
        this.value = value;
        return this;
    }
    
    public DatePickerOptions setValue(java.util.Calendar calendar) {
        this.value = calendar.getTime();
        return this;
    }

    public List<String> getParseFormats() {
        return parseFormats;
    }

    public DatePickerOptions setParseFormats(List<String> parseFormats) {
        this.parseFormats = parseFormats;
        return this;
    }

    public Boolean getOpenOnFocus() {
        return openOnFocus;
    }

    public DatePickerOptions setOpenOnFocus(Boolean openOnFocus) {
        this.openOnFocus = openOnFocus;
        return this;
    }

    public Boolean getShowButton() {
        return showButton;
    }

    public DatePickerOptions setShowButton(Boolean showButton) {
        this.showButton = showButton;
        return this;
    }

    public Boolean getEditable() {
        return editable;
    }

    public DatePickerOptions setEditable(Boolean editable) {
        this.editable = editable;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public DatePickerOptions setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Date getMin() {
        return min;
    }

    public DatePickerOptions setMin(Date min) {
        this.min = min;
        return this;
    }
    
    public DatePickerOptions setMin(java.util.Calendar calendar) {
        this.min = calendar.getTime();
        return this;
    }

    public Date getMax() {
        return max;
    }

    public DatePickerOptions setMax(Date max) {
        this.max = max;
        return this;
    }
    
    public DatePickerOptions setMax(java.util.Calendar calendar) {
        this.max = calendar.getTime();
        return this;
    }

    public MessagesOptions getMessages() {
        return messages;
    }

    public DatePickerOptions setMessages(MessagesOptions messages) {
        this.messages = messages;
        return this;
    }

    public HashMap<Event, JSONFunction> getEvents() {
        return events;
    }

    public DatePickerOptions setEvents(HashMap<Event, JSONFunction> events) {
        this.events = events;
        return this;
    }
}
