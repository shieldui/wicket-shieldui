package com.shieldui.wicket.splitter;

import com.shieldui.wicket.AbstractEventListenerBehavior;

public abstract class CollapseEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public CollapseEventListener()
    {
        super(SplitterOptions.Event.COLLAPSE.toString());
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +                                
                "\"paneIndex\":" + eventVarName + ".paneIndex" +                
                "}";
    }
}
