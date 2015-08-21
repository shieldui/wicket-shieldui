package com.shieldui.wicket.examples;

import com.shieldui.wicket.monthyearpicker.MonthYearPickerOptions;
import com.shieldui.wicket.monthyearpicker.MonthYearPicker;
import java.util.Date;
import org.apache.wicket.markup.html.WebPage;

public class MonthYearPickerDemo extends WebPage {
    private static final long serialVersionUID = 1L;
    
    public MonthYearPickerDemo()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        final MonthYearPicker monthyearpicker = new MonthYearPicker("monthyearpicker");
        add(monthyearpicker);
        
        monthyearpicker.getOptions()
              .setOpenOnFocus(false)
              .setShowButton(true)
              .setEditable(true)
              .setMessages(new MonthYearPickerOptions.MessagesOptions()
                                                .setCalendarIconTooltip("open"))
              .setValue(new Date());
    }

}
