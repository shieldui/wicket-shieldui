package com.shieldui.wicket.window;

import com.shieldui.wicket.AbstractEventListenerBehavior;

public abstract class MaximizeEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public MaximizeEventListener()
    {
        super(WindowOptions.Event.MAXIMIZE.toString());
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +
                "\"maximized\":" + eventVarName + ".maximized" + 
                "}";
    }
}
