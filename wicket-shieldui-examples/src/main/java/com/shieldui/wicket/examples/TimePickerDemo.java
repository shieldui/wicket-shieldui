package com.shieldui.wicket.examples;

import com.shieldui.wicket.timepicker.TimePickerOptions;
import com.shieldui.wicket.timepicker.TimePicker;
import java.util.Date;
import org.apache.wicket.markup.html.WebPage;

public class TimePickerDemo extends WebPage
{
    private static final long serialVersionUID = 1L;
    
    public TimePickerDemo()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        final TimePicker timepicker = new TimePicker("timepicker");
        add(timepicker);
        
        timepicker.getOptions()
              .setOpenOnFocus(false)
              .setShowButton(true)
              .setEditable(true)
              .setMessages(new TimePickerOptions.MessagesOptions()
                                                .setCalendarIconTooltip("open"))
              .setValue(new Date());
    }

}
