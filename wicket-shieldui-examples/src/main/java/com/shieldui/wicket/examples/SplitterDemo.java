package com.shieldui.wicket.examples;

import com.shieldui.wicket.splitter.SplitterOptions;
import com.shieldui.wicket.splitter.Splitter;
import org.apache.wicket.markup.html.WebPage;

public class SplitterDemo extends WebPage
{
    private static final long serialVersionUID = 1L;
    
    public SplitterDemo()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        final Splitter splitter = new Splitter("splitter");
        add(splitter);
        
        splitter.getOptions()
              .setOrientation(SplitterOptions.Orientation.VERTICAL)
              .setPanes(
                      new SplitterOptions.PaneOptions().setSize(100),
                      new SplitterOptions.PaneOptions().setSize(50).setScrollable(true),
                      new SplitterOptions.PaneOptions().setScrollable(true)
              );
    }
}
