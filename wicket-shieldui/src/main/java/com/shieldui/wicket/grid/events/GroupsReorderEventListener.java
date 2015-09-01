package com.shieldui.wicket.grid.events;

import com.shieldui.wicket.AbstractEventListenerBehavior;
import com.shieldui.wicket.grid.GridOptions;

public abstract class GroupsReorderEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public GroupsReorderEventListener()
    {
        super(GridOptions.Event.GROUPS_REORDER.toString());
    }
}
