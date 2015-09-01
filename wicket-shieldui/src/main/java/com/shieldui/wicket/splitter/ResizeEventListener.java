package com.shieldui.wicket.splitter;

import com.shieldui.wicket.AbstractEventListenerBehavior;

public abstract class ResizeEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public ResizeEventListener()
    {
        super(SplitterOptions.Event.RESIZE.toString());
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +                                
                "\"paneIndex\":" + eventVarName + ".paneIndex" +                
                "}";
    }
}
