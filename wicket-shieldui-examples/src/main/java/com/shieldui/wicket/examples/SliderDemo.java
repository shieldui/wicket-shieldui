package com.shieldui.wicket.examples;

import com.shieldui.wicket.slider.SliderOptions;
import com.shieldui.wicket.slider.Slider;
import org.apache.wicket.markup.html.WebPage;

public class SliderDemo extends WebPage
{
    private static final long serialVersionUID = 1L;
    
    public SliderDemo()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        final Slider slider = new Slider("slider");
        add(slider);
        
        slider.getOptions()
              .setMin((double)0)
              .setMax((double)10)
              .setStep((double)1)
              .setButtons(true)
              .setTicks(new SliderOptions.TicksOptions()
                            .setEnabled(true)
                            .setType(SliderOptions.TickType.BOTH))
              .setValues(new SliderOptions.ValuesOptions()
                            .setTemplate("<b>{0:c}</b>"))
              .setTooltip(new SliderOptions.TooltipOptions()
                            .setEnabled(true));
    }
}
