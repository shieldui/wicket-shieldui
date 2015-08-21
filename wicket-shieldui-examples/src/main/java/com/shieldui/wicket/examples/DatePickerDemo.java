package com.shieldui.wicket.examples;

import com.shieldui.wicket.datepicker.DatePickerOptions;
import com.shieldui.wicket.datepicker.DatePicker;
import java.util.Date;
import org.apache.wicket.markup.html.WebPage;

public class DatePickerDemo extends WebPage {
    private static final long serialVersionUID = 1L;
    
    public DatePickerDemo()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        final DatePicker datepicker = new DatePicker("datepicker");
        add(datepicker);
        
        datepicker.getOptions()
              .setOpenOnFocus(false)
              .setShowButton(true)
              .setEditable(true)
              .setTextTemplate("{0:dd-MM-yyyy}")
              .setMessages(new DatePickerOptions.MessagesOptions()
                                                .setCalendarIconTooltip("open"))
              .setValue(new Date());
    }
}
