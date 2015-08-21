package com.shieldui.wicket.datepicker;

import com.shieldui.wicket.HashMapSerializable;
import com.shieldui.wicket.OptionsBase;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import org.apache.wicket.ajax.json.JsonFunction;

public class DatePickerOptions extends OptionsBase {
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
    
    public Object calendar;
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
    public HashMap<Event, JsonFunction> events = new HashMap<Event, JsonFunction>();

    public Object getCalendar() {
        return calendar;
    }

    public DatePickerOptions setCalendar(Object calendar) {
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
    
    public DatePickerOptions setTextTemplate(JsonFunction textTemplate) {
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

    public Date getMax() {
        return max;
    }

    public DatePickerOptions setMax(Date max) {
        this.max = max;
        return this;
    }

    public MessagesOptions getMessages() {
        return messages;
    }

    public DatePickerOptions setMessages(MessagesOptions messages) {
        this.messages = messages;
        return this;
    }

    public HashMap<Event, JsonFunction> getEvents() {
        return events;
    }

    public DatePickerOptions setEvents(HashMap<Event, JsonFunction> events) {
        this.events = events;
        return this;
    }
}
