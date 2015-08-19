package com.shieldui.wicket.examples;

import com.shieldui.wicket.numerictextbox.NumericTextBoxOptions;
import com.shieldui.wicket.numerictextbox.NumericTextBox;
import org.apache.wicket.markup.html.WebPage;

public class NumericTextBoxDemo extends WebPage {
    private static final long serialVersionUID = 1L;
    
    public NumericTextBoxDemo()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        final NumericTextBox numerictextbox = new NumericTextBox("numerictextbox");
        add(numerictextbox);
        
        numerictextbox.getOptions()
              .setEnabled(true)
              .setMin((double)0)
              .setMax((double)20)
              .setStep((double)1)
              .setValue((double)5)
              .setSpinners(true);
    }
}
