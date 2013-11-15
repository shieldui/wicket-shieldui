package com.shieldui.wicket.examples;

import com.shieldui.wicket.barcode.BarcodeOptions;
import java.util.Arrays;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.form.CheckBox;
import org.apache.wicket.model.PropertyModel;

public class Barcode extends WebPage
{
    private static final long serialVersionUID = 1L;
    
    public Barcode()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        final com.shieldui.wicket.barcode.Barcode barcode = new com.shieldui.wicket.barcode.Barcode("barcode");
        final BarcodeOptions options = barcode.getOptions();
        
        options.setValue("123456");
        options.setType(BarcodeOptions.Type.CODE_128);
        
        Form form = new Form("form");
        
        form.add(new TextField("value", new PropertyModel(options, "value")));
        form.add(new DropDownChoice<BarcodeOptions.Type>("type", new PropertyModel(options, "type"), 
                Arrays.asList(
                        BarcodeOptions.Type.CODABAR, 
                        BarcodeOptions.Type.CODE_11, 
                        BarcodeOptions.Type.CODE_39, 
                        BarcodeOptions.Type.CODE_93,
                        BarcodeOptions.Type.CODE_128, 
                        BarcodeOptions.Type.CODE_128_A, 
                        BarcodeOptions.Type.CODE_128_B, 
                        BarcodeOptions.Type.CODE_128_C,
                        BarcodeOptions.Type.CODE_25_STANDARD,
                        BarcodeOptions.Type.CODE_25_INTERLEAVED,
                        BarcodeOptions.Type.EAN_8,
                        BarcodeOptions.Type.EAN_13,
                        BarcodeOptions.Type.UPC_A,
                        BarcodeOptions.Type.UPC_E,
                        BarcodeOptions.Type.MSI_10,
                        BarcodeOptions.Type.MSI_10_10,
                        BarcodeOptions.Type.MSI_11,
                        BarcodeOptions.Type.MSI_11_10,
                        BarcodeOptions.Type.POSTNET
                )));
        form.add(new CheckBox("checksum", new PropertyModel<Boolean>(options, "checksum")));
        form.add(new TextField("width", new PropertyModel<Integer>(options, "width")));
        form.add(new TextField("height", new PropertyModel<Integer>(options, "height")));
        
        form.add(new TextField("background", new PropertyModel(options.style, "background")));
        form.add(new TextField("borderColor", new PropertyModel(options.style, "borderColor")));
        form.add(new TextField("borderStyle", new PropertyModel(options.style, "borderStyle")));
        form.add(new TextField("borderWidth", new PropertyModel(options.style, "borderWidth")));
        form.add(new TextField("color", new PropertyModel(options.style, "color")));
        form.add(new TextField("paddingTop", new PropertyModel(options.style, "paddingTop")));
        form.add(new TextField("paddingLeft", new PropertyModel(options.style, "paddingLeft")));
        form.add(new TextField("paddingRight", new PropertyModel(options.style, "paddingRight")));
        form.add(new TextField("paddingBottom", new PropertyModel(options.style, "paddingBottom")));
        
        form.add(new CheckBox("textEnabled", new PropertyModel<Boolean>(options.text, "enabled")));
        form.add(new CheckBox("textChecksum", new PropertyModel<Boolean>(options.text, "checksum")));
        form.add(new TextField("textColor", new PropertyModel(options.text.style, "color")));
        form.add(new TextField("textFontFamily", new PropertyModel(options.text.style, "fontFamily")));
        form.add(new TextField("textFontSize", new PropertyModel(options.text.style, "fontSize")));
        form.add(new TextField("textPaddingTop", new PropertyModel(options.text.style, "paddingTop")));
        form.add(new TextField("textPaddingBottom", new PropertyModel(options.text.style, "paddingBottom")));
        
        form.add(barcode);
        add(form);
    }
}
