package com.shieldui.wicket.examples;

import com.shieldui.wicket.window.Window;
import org.apache.wicket.markup.html.WebPage;

public class WindowDemo extends WebPage {
    private static final long serialVersionUID = 1L;
    
    public WindowDemo()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        final Window window = new Window("window");
        add(window);
        
        window.getOptions()
              .setWidth(400)
              .setHeight(300)
              .setTitle("Window Title &copy; 2015");
    }
}
