package com.shieldui.wicket.grid.events;

import com.shieldui.wicket.AbstractEventListenerBehavior;
import com.shieldui.wicket.grid.GridOptions;

public abstract class InsertEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public InsertEventListener()
    {
        super(GridOptions.Event.INSERT.toString());
    }
}
