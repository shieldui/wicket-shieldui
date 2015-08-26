package com.shieldui.wicket.grid.events;

import com.shieldui.wicket.AbstractEventListenerBehavior;
import com.shieldui.wicket.grid.GridOptions;

public abstract class DataBoundEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public DataBoundEventListener()
    {
        super(GridOptions.Event.DATA_BOUND.toString());
    }
}
