/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shieldui.wicket.examples;

import com.shieldui.wicket.splitter.SplitterOptions;
import com.shieldui.wicket.splitter.Splitter;
import com.shieldui.wicket.splitter.CollapseEventListener;
import com.shieldui.wicket.splitter.ExpandEventListener;
import com.shieldui.wicket.splitter.ResizeEventListener;
import java.util.ArrayList;
import org.apache.wicket.markup.html.WebPage;
/**
 *
 * @author Lyubo
 */
public class SplitterDemo extends WebPage {
    private static final long serialVersionUID = 1L;
    
    public SplitterDemo() {
        // add the menu
        add(new MenuPanel("menu"));
        
        final Splitter splitter = new Splitter("splitter");
        add(splitter);
        
        splitter.getOptions()
              .setOrientation(SplitterOptions.Orientation.VERTICAL)
              .setPanes(new ArrayList<SplitterOptions.PaneOptions>() {{
                  add(new SplitterOptions.PaneOptions().setSize(100));
                  add(new SplitterOptions.PaneOptions().setSize(50).setScrollable(true));
                  add(new SplitterOptions.PaneOptions().setScrollable(true));
              }});
    }
}
