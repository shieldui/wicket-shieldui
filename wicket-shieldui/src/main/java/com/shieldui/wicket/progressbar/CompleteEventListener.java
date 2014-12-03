package com.shieldui.wicket.progressbar;

import com.shieldui.wicket.AbstractEventListenerBehavior;

public abstract class CompleteEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public CompleteEventListener()
    {
        super(ProgressBarOptions.Event.COMPLETE.toString());
    }
}
