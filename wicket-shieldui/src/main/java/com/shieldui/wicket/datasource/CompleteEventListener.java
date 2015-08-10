package com.shieldui.wicket.datasource;

import com.shieldui.wicket.AbstractEventListenerBehavior;

public abstract class CompleteEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public CompleteEventListener()
    {
        super(DataSourceOptions.Event.COMPLETE.toString());
    }
}
