package com.shieldui.wicket.examples;

import org.apache.wicket.markup.html.WebPage;

public class ProgressBar extends WebPage
{
    private static final long serialVersionUID = 1L;
    
    public ProgressBar()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        final com.shieldui.wicket.progressbar.ProgressBar progress = new com.shieldui.wicket.progressbar.ProgressBar("progress");
        add(progress);
        
        // get runtime instance
        Runtime instance = Runtime.getRuntime();
        
        // get total and used memory in mb
        int mb = 1024 * 1024;
        long total = instance.totalMemory() / mb;
        long used = total - instance.freeMemory() / mb;
        
        progress.getOptions()
                .setMin(0)
                .setMax(total)
                .setValue(used)
                .getText()
                    .setEnabled(true)
                    .setTemplate("{0} of " + total + " MB");
    }
}
