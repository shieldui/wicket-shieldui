package com.shieldui.wicket.examples;

import com.shieldui.wicket.datetimepicker.DateTimePickerOptions;
import com.shieldui.wicket.datetimepicker.DateTimePicker;
import java.util.Date;
import org.apache.wicket.markup.html.WebPage;

public class DateTimePickerDemo extends WebPage {
    private static final long serialVersionUID = 1L;
    
    public DateTimePickerDemo()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        final DateTimePicker datetimepicker = new DateTimePicker("datetimepicker");
        add(datetimepicker);
        
        datetimepicker.getOptions()
              .setOpenOnFocus(false)
              .setShowButton(true)
              .setEditable(true)
              .setMessages(new DateTimePickerOptions.MessagesOptions()
                                                .setCalendarIconTooltip("open"))
              .setValue(new Date());
    }
}
