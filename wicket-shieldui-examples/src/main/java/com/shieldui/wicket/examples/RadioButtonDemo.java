package com.shieldui.wicket.examples;

import com.shieldui.wicket.radiobutton.RadioButton;
import org.apache.wicket.markup.html.WebPage;

public class RadioButtonDemo extends WebPage {
    private static final long serialVersionUID = 1L;
    
    public RadioButtonDemo()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        final RadioButton radiobutton = new RadioButton("radiobutton");
        add(radiobutton);
        
        radiobutton.getOptions()
              .setEnabled(true)
              .setLabel("radioButton1")
              .setChecked(true);
    }
}
