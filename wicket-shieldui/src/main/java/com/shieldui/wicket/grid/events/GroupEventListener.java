package com.shieldui.wicket.grid.events;

import com.shieldui.wicket.AbstractEventListenerBehavior;
import com.shieldui.wicket.grid.GridOptions;

public abstract class GroupEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public GroupEventListener()
    {
        super(GridOptions.Event.GROUP.toString());
    }
}
