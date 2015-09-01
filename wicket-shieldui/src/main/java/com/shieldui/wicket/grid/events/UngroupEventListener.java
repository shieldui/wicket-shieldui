package com.shieldui.wicket.grid.events;

import com.shieldui.wicket.AbstractEventListenerBehavior;
import com.shieldui.wicket.grid.GridOptions;

public abstract class UngroupEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public UngroupEventListener()
    {
        super(GridOptions.Event.UNGROUP.toString());
    }
}
