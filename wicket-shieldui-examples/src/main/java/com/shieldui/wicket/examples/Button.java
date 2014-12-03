package com.shieldui.wicket.examples;

import com.shieldui.wicket.button.ClickEventListener;
import java.util.HashMap;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.form.AjaxFormSubmitBehavior;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.PropertyModel;

public class Button extends WebPage
{
    private static final long serialVersionUID = 1L;
    
    private static int counter = 0;
    
    private int increment = 1;
    
    public Button()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        // initialize the four buttons
        final com.shieldui.wicket.button.Button checkedButton = new com.shieldui.wicket.button.Button("checked");
        checkedButton.getOptions().setToggle(true);
        
        final com.shieldui.wicket.button.Button enabledButton = new com.shieldui.wicket.button.Button("enabled");
        enabledButton.getOptions()
                .setToggle(true)
                .setChecked(true);
        
        final com.shieldui.wicket.button.Button visibleButton = new com.shieldui.wicket.button.Button("visible");
        visibleButton.getOptions()
                .setToggle(true)
                .setChecked(true);
        
        final com.shieldui.wicket.button.Button sampleButton = new com.shieldui.wicket.button.Button("sample");
        sampleButton.getOptions().setToggle(true);
        
        // initialize a hashmap to store the state of the sample button,
        // which we will access from the event handlers below
        final HashMap<String, Boolean> sampleButtonState = new HashMap<String, Boolean>() {{
            put("checked", false);
            put("enabled", true);
            put("visible", true);
        }};
        
        // add event handlers for the click events of the first three buttons
        checkedButton.add(new ClickEventListener() {
            @Override
            protected void handleEvent(AjaxRequestTarget target, Object event) {
                // toggle the check on the sample button
                sampleButtonState.put("checked", !sampleButtonState.get("checked"));
                sampleButton.setChecked(target, sampleButtonState.get("checked"));
            }
        });
        
        enabledButton.add(new ClickEventListener() {
            @Override
            protected void handleEvent(AjaxRequestTarget target, Object event) {
                // toggle the enabled on the sample button
                sampleButtonState.put("enabled", !sampleButtonState.get("enabled"));
                sampleButton.setEnabled(target, sampleButtonState.get("enabled"));
            }
        });
        
        visibleButton.add(new ClickEventListener() {
            @Override
            protected void handleEvent(AjaxRequestTarget target, Object event) {
                // toggle the visibility on the sample button
                sampleButtonState.put("visible", !sampleButtonState.get("visible"));
                sampleButton.setVisible(target, sampleButtonState.get("visible"));
            }
        });
        
        // add the four buttons to the page
        add(checkedButton, enabledButton, visibleButton, sampleButton);
        
        // add a form
        final Form form = new Form("myform") {
            @Override
            protected void onSubmit() {
                counter += increment;
            }
        };
        
        final com.shieldui.wicket.button.Button formButton = new com.shieldui.wicket.button.Button("button");
        
        form.add(new AjaxFormSubmitBehavior(form, "onsubmit") {
            @Override
            protected void onSubmit(AjaxRequestTarget target) {
                target.add(form);
                formButton.reInitialize(target);
            }
        });
        
        form.add(new Label("counter", new PropertyModel(this, "counter")));
        
        form.add(new TextField("increment", new PropertyModel(this, "increment")));
        
        form.add(formButton);
        
        add(form);
    }
}
