package com.shieldui.wicket.datasource;

import com.shieldui.wicket.AbstractEventListenerBehavior;

public abstract class ChangeEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public ChangeEventListener()
    {
        super(DataSourceOptions.Event.CHANGE.toString());
    }
}
