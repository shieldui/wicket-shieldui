package com.shieldui.wicket.examples;

import com.shieldui.wicket.colorpicker.ColorPicker;
import com.shieldui.wicket.colorpicker.ColorPickerOptions;
import org.apache.wicket.markup.html.WebPage;

public class ColorPickerDemo extends WebPage {
    private static final long serialVersionUID = 1L;
    
    public ColorPickerDemo()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        final ColorPicker colorpicker = new ColorPicker("colorpicker");
        add(colorpicker);
        
        colorpicker.getOptions()
              .setPalette(ColorPickerOptions.PaletteType.ADVANCED)
              .setValue("#66FF99");
    }
}
