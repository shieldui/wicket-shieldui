package com.shieldui.wicket.splitter;

import com.shieldui.wicket.AbstractEventListenerBehavior;

public abstract class ExpandEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public ExpandEventListener()
    {
        super(SplitterOptions.Event.EXPAND.toString());
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +                                
                "\"paneIndex\":" + eventVarName + ".paneIndex" +                
                "}";
    }
}
