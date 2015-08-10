package com.shieldui.wicket.datasource;

import com.shieldui.wicket.AbstractEventListenerBehavior;

public abstract class StartEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public StartEventListener()
    {
        super(DataSourceOptions.Event.START.toString());
    }
}
