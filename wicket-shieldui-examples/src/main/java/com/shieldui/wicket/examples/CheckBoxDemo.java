package com.shieldui.wicket.examples;

import com.shieldui.wicket.checkbox.CheckBoxOptions;
import com.shieldui.wicket.checkbox.CheckBox;
import org.apache.wicket.markup.html.WebPage;

public class CheckBoxDemo extends WebPage {
    private static final long serialVersionUID = 1L;
    
    public CheckBoxDemo()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        final CheckBox checkbox = new CheckBox("checkbox");
        add(checkbox);
        
        checkbox.getOptions()
              .setEnabled(true)
              .setLabel("checkbox1")
              .setChecked(true);
    }
}
