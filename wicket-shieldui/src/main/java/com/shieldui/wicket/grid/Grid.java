package com.shieldui.wicket.grid;

import com.shieldui.wicket.WidgetComponentBase;

public class Grid extends WidgetComponentBase
{
    private static final long serialVersionUID = 1L;
    
    private final GridOptions options = new GridOptions();
    
    public Grid(String id)
    {
        super(id, "Grid");
    }
    
    @Override
    public GridOptions getOptions()
    {
        return options;
    }
    
    
}
