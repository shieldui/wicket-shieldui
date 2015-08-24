package com.shieldui.wicket.datetimepicker;

import com.shieldui.wicket.datepicker.DatePickerOptions;
import com.shieldui.wicket.listbox.ListBoxOptions;

public class DateTimePickerOptions extends DatePickerOptions
{
    private static final long serialVersionUID = 1L;
    
    public ListBoxOptions listBox = new ListBoxOptions();

    public ListBoxOptions getListBox() {
        return listBox;
    }

    public DateTimePickerOptions setListBox(ListBoxOptions listBox) {
        this.listBox = listBox;
        return this;
    }
}
