package com.shieldui.wicket.examples;

import com.shieldui.wicket.button.ButtonOptions;
import com.shieldui.wicket.button.ClickEventListener;
import com.shieldui.wicket.button.MenuClickEventListener;
import com.shieldui.wicket.button.SplitButton;
import com.shieldui.wicket.datasource.DataSourceOptions;
import com.shieldui.wicket.toggle.Switch;
import com.shieldui.wicket.tooltip.Tooltip;
import java.util.HashMap;
import org.apache.wicket.AttributeModifier;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.form.AjaxFormSubmitBehavior;
import org.apache.wicket.ajax.json.JSONFunction;
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
        checkedButton.getOptions()
                .setToggle(true)
                .getEvents()
                    .put(ButtonOptions.Event.CLICK, new JSONFunction("function(e) { console.log(\"check button clicked\"); }"));
        
        final Tooltip checkedTooltip = new Tooltip("#" + checkedButton.getMarkupId());
        checkedTooltip.getOptions()
                .setWidth(300)
                .setHeight(300)
                .setDelay(0);
        add(checkedTooltip);
        
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
        
        // add event handlers for the click events of the first three buttons
        checkedButton.add(new ClickEventListener() {
            @Override
            protected void handleEvent(AjaxRequestTarget target, Object event) {
                // set the check on the sample button
                sampleButton.setChecked(target, ((HashMap<String, Boolean>)event).get("checked"));
            }
        });
        
        enabledButton.add(new ClickEventListener() {
            @Override
            protected void handleEvent(AjaxRequestTarget target, Object event) {
                // set the enabled on the sample button
                sampleButton.setEnabled(target, ((HashMap<String, Boolean>)event).get("checked"));
                checkedTooltip.setEnabled(target, ((HashMap<String, Boolean>)event).get("checked"));
            }
        });
        
        visibleButton.add(new ClickEventListener() {
            @Override
            protected void handleEvent(AjaxRequestTarget target, Object event) {
                // set the visibility on the sample button
                sampleButton.setVisible(target, ((HashMap<String, Boolean>)event).get("checked"));
                checkedTooltip.setVisible(target, ((HashMap<String, Boolean>)event).get("checked"));
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
        
        // add a switch and a label
        final Label swlbl = new Label("switchlbl");
        swlbl.setOutputMarkupId(true);
        
        final Switch sw = new Switch("switch");
        sw.getOptions()
                .setOnText("YES")
                .setOffText("NO");
        
        sw.add(new com.shieldui.wicket.toggle.ClickEventListener() {
            @Override
            protected void handleEvent(AjaxRequestTarget target, Object event) {
                target.add(swlbl);
                swlbl.add(
                        new AttributeModifier(
                                "style", 
                                "display:" + (((HashMap<String, Boolean>)event).get("checked") ? "block" : "none")
                        )
                );
            }
        });
        
        add(swlbl, sw);
        
        // split button
        final SplitButton splitButton1 = new SplitButton("splitButton1");
        add(splitButton1);
        
        splitButton1.getOptions()
                .setMenu("#sbMenu1");
        
        final SplitButton splitButton2 = new SplitButton("splitButton2");
        splitButton2.getOptions()
                .setDataSource(new DataSourceOptions()
                        .setData(
                                new HashMap<String, String>() {{
                                    put("content", "Menu One");
                                }},
                                new HashMap<String, String>() {{
                                    put("content", "Menu 222");
                                }},
                                new HashMap<String, String>() {{
                                    put("content", "Menu 333");
                                }}
                        ));
        splitButton2.add(new ClickEventListener() {
            @Override
            protected void handleEvent(AjaxRequestTarget target, Object event) {
                System.err.println("Split Button 2 Click");
            }
        });
        splitButton2.add(new MenuClickEventListener() {
            @Override
            protected void handleEvent(AjaxRequestTarget target, Object event) {
                System.err.println("Split Button 2 MenuClick");
                
                HashMap<String, Object> item = (HashMap<String, Object>) ((HashMap<String, Object>) event).get("item");
                System.err.println(item);
                
                splitButton2.closeMenu(target);
            }
        });
        
        add(splitButton2);
    }
}
