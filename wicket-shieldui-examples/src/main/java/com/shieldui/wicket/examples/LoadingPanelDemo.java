package com.shieldui.wicket.examples;

import com.shieldui.wicket.loadingpanel.LoadingPanel;
import org.apache.wicket.markup.html.WebPage;

public class LoadingPanelDemo extends WebPage{
    
    private static final long serialVersionUID = 1L;
    
    public LoadingPanelDemo()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        final LoadingPanel loadingpanel = new LoadingPanel("loadingpanel");
        add(loadingpanel);
        
        loadingpanel.getOptions()
              .setShow(true)
              .setText("loading...")
              .setShowImage(true)
              .setUseSmallImage(false);
    }
}
