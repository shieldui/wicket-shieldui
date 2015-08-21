package com.shieldui.wicket.examples;

import com.shieldui.wicket.dropdown.DropDownOptions;
import com.shieldui.wicket.dropdown.DropDown;
import org.apache.wicket.markup.html.WebPage;

public class DropDownDemo extends WebPage {
    private static final long serialVersionUID = 1L;
    
    public DropDownDemo()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        final DropDown dropdown = new DropDown("dropdown");
        add(dropdown);
        
        dropdown.getOptions()
              .setAutoComplete(new DropDownOptions.AutoCompleteOptions()
                                                  .setEnabled(true)
                                                  .setMinLength(0));
    }
}
