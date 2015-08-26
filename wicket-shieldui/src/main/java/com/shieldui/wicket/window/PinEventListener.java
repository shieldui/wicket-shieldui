package com.shieldui.wicket.window;

import com.shieldui.wicket.AbstractEventListenerBehavior;

public abstract class PinEventListener extends AbstractEventListenerBehavior {
    private static final long serialVersionUID = 1L;
    
    public PinEventListener()
    {
        super(WindowOptions.Event.PIN.toString());
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +
                "\"pinned\":" + eventVarName + ".pinned," + 
                "}";
    }
}
