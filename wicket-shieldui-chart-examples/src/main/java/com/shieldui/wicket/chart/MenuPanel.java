/*
 * A Wicket panel for the top menu shared between websites
 */
package com.shieldui.wicket.chart;

import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.Panel;

public class MenuPanel extends Panel
{
    public MenuPanel(String id)
    {
        super(id);
        
        add(new BookmarkablePageLink("home", HomePage.class));
        add(new BookmarkablePageLink("bar", BarDemos.class));
        add(new BookmarkablePageLink("range", RangeDemos.class));
        add(new BookmarkablePageLink("step", StepDemos.class));
    }
}
