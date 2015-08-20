package com.shieldui.wicket.examples;

import com.shieldui.wicket.textbox.TextBoxOptions;
import com.shieldui.wicket.textbox.TextBox;
import org.apache.wicket.markup.html.WebPage;

public class TextBoxDemo extends WebPage {
    private static final long serialVersionUID = 1L;
    
    public TextBoxDemo()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        final TextBox textbox = new TextBox("textbox");
        add(textbox);
        
        textbox.getOptions()
              .setEnabled(true)
              .setValue("test");
    }
}
