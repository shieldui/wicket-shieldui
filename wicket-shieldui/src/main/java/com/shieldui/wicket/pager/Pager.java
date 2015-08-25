package com.shieldui.wicket.pager;

import com.shieldui.wicket.WidgetComponentBase;

public class Pager extends WidgetComponentBase {
    private static final long serialVersionUID = 1L;
    
    private final PagerOptions options = new PagerOptions();
    
    public Pager(String id)
    {
        super(id, "Pager");
    }
    
    @Override
    public PagerOptions getOptions()
    {
        return options;
    }
}
