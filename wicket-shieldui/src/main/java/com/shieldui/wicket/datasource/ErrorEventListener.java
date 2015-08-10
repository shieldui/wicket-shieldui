package com.shieldui.wicket.datasource;

import com.shieldui.wicket.AbstractEventListenerBehavior;

public abstract class ErrorEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public ErrorEventListener()
    {
        super(DataSourceOptions.Event.ERROR.toString());
    }
}
