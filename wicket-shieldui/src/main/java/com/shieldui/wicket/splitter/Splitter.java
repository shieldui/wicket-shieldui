package com.shieldui.wicket.splitter;

import com.shieldui.wicket.WidgetComponentBase;

public class Splitter extends WidgetComponentBase
{
    private static final long serialVersionUID = 1L;
    
    private final SplitterOptions options = new SplitterOptions();
    
    public Splitter(String id)
    {
        super(id, "Splitter");
    }
    
    @Override
    public SplitterOptions getOptions()
    {
        return options;
    }
}
