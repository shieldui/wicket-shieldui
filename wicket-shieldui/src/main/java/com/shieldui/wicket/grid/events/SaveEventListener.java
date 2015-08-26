package com.shieldui.wicket.grid.events;

import com.shieldui.wicket.AbstractEventListenerBehavior;
import com.shieldui.wicket.grid.GridOptions;

public abstract class SaveEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public SaveEventListener()
    {
        super(GridOptions.Event.SAVE.toString());
    }
}
