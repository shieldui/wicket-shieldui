package com.shieldui.wicket.grid.events;

import com.shieldui.wicket.AbstractEventListenerBehavior;
import com.shieldui.wicket.grid.GridOptions;

public abstract class SelectionChangedEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public SelectionChangedEventListener()
    {
        super(GridOptions.Event.SELECTION_CHANGED.toString());
    }
}
