package com.shieldui.wicket.examples;

import com.shieldui.wicket.combobox.ComboBoxOptions;
import com.shieldui.wicket.combobox.ComboBox;
import org.apache.wicket.markup.html.WebPage;

public class ComboBoxDemo extends WebPage {
    private static final long serialVersionUID = 1L;
    
    public ComboBoxDemo()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        final ComboBox combobox = new ComboBox("combobox");
        add(combobox);
        
        combobox.getOptions()
              .setAutoComplete(new ComboBoxOptions.AutoCompleteOptions()
                                                  .setEnabled(true)
                                                  .setMinLength(0));
    }
}
