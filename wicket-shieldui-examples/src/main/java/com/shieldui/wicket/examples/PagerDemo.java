package com.shieldui.wicket.examples;

import com.shieldui.wicket.pager.Pager;
import com.shieldui.wicket.pager.PagerOptions;
import org.apache.wicket.markup.html.WebPage;

public class PagerDemo extends WebPage {
    private static final long serialVersionUID = 1L;
    
    public PagerDemo()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        final Pager pager = new Pager("pager");
        add(pager);
        
        pager.getOptions()
              .setTotalItems(99)
              .setMessages(new PagerOptions.MessagesOptions()
                                           .setPreviousText("prev")
                                           .setNextText("next")
                                           .setFirstText("first")
                                           .setLastText("last"));
    }
}
