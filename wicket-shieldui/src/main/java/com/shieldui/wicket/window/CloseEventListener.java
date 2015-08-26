package com.shieldui.wicket.window;

import com.shieldui.wicket.AbstractEventListenerBehavior;

public abstract class CloseEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public CloseEventListener()
    {
        super(WindowOptions.Event.CLOSE.toString());
    }
}
