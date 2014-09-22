package com.shieldui.wicket.examples;

import com.shieldui.wicket.button.ClickEventListener;
import com.shieldui.wicket.qrcode.QRCodeOptions;
import java.util.Arrays;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.PropertyModel;

public class QrCode extends WebPage
{
    private static final long serialVersionUID = 1L;
    
    public QrCode()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        final com.shieldui.wicket.qrcode.QRCode qrcode = new com.shieldui.wicket.qrcode.QRCode("qrcode");
        final QRCodeOptions options = qrcode.getOptions();
        
        options.setValue("http://www.shieldui.com");
        options.setMode(QRCodeOptions.Mode.BYTE);
        options.setErrorLevel(QRCodeOptions.ErrorLevel.L);
        
        Form form = new Form("form");
        
        form.add(new TextField("value", new PropertyModel(options, "value")));
        form.add(new DropDownChoice<QRCodeOptions.Mode>("mode", new PropertyModel(options, "mode"), 
                Arrays.asList(
                        QRCodeOptions.Mode.NUMERIC,
                        QRCodeOptions.Mode.ALPHA_NUMERIC,
                        QRCodeOptions.Mode.BYTE
                )
        ));
        form.add(new DropDownChoice<QRCodeOptions.ErrorLevel>("errorLevel", new PropertyModel(options, "errorLevel"), 
                Arrays.asList(
                        QRCodeOptions.ErrorLevel.L,
                        QRCodeOptions.ErrorLevel.M,
                        QRCodeOptions.ErrorLevel.Q,
                        QRCodeOptions.ErrorLevel.H
                )
        ));
        form.add(new TextField("size", new PropertyModel<Integer>(options, "size")));
        
        form.add(new TextField("background", new PropertyModel(options.style, "background")));
        form.add(new TextField("borderColor", new PropertyModel(options.style, "borderColor")));
        form.add(new TextField("borderStyle", new PropertyModel(options.style, "borderStyle")));
        form.add(new TextField("borderWidth", new PropertyModel(options.style, "borderWidth")));
        form.add(new TextField("color", new PropertyModel(options.style, "color")));
        form.add(new TextField("padding", new PropertyModel(options.style, "padding")));
        
        form.add(qrcode);
        
        // add an Update button to the form, which will resubmit it
        final com.shieldui.wicket.button.Button updateButton = new com.shieldui.wicket.button.Button("update");
        updateButton.add(new ClickEventListener() {
            @Override
            protected void handleEvent(AjaxRequestTarget target, Object event) {
                System.err.println("Update button was clicked");
            }
        });
        form.add(updateButton);
        
        add(form);
    }
}
