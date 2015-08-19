/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shieldui.wicket.examples;

import com.shieldui.wicket.maskedtextbox.MaskedTextBoxOptions;
import com.shieldui.wicket.maskedtextbox.MaskedTextBox;
import org.apache.wicket.markup.html.WebPage;

/**
 *
 * @author Lyubo
 */
public class MaskedTextBoxDemo extends WebPage {
    private static final long serialVersionUID = 1L;
    
    public MaskedTextBoxDemo()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        final MaskedTextBox maskedtextbox = new MaskedTextBox("maskedtextbox");
        add(maskedtextbox);
        
        maskedtextbox.getOptions()
              .setEnabled(true)
              .setMask("000-000-000")
              .setPromptChar('_');
    }
}
