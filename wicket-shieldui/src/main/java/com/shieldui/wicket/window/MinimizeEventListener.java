package com.shieldui.wicket.window;

import com.shieldui.wicket.AbstractEventListenerBehavior;

public abstract class MinimizeEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public MinimizeEventListener()
    {
        super(WindowOptions.Event.MINIMIZE.toString());
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +
                "\"minimized\":" + eventVarName + ".minimized" + 
                "}";
    }
}
