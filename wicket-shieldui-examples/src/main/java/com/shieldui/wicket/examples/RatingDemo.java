package com.shieldui.wicket.examples;

import com.shieldui.wicket.rating.Rating;
import org.apache.wicket.markup.html.WebPage;

public class RatingDemo extends WebPage {
    private static final long serialVersionUID = 1L;
    
    public RatingDemo()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        final Rating rating = new Rating("rating");
        add(rating);
        
        rating.getOptions()
              .setStep((double)1)
              .setValue((double)3)
              .setMarkPreset(false);
    }
}
