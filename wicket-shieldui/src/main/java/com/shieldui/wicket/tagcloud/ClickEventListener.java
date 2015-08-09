package com.shieldui.wicket.tagcloud;

import com.shieldui.wicket.AbstractEventListenerBehavior;

public abstract class ClickEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public ClickEventListener()
    {
        super(TagCloudOptions.Event.CLICK.toString());
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +
                "\"item\":" + eventVarName + ".item," + 
                "\"visible\":" + eventVarName + ".target.visible()" + 
                "}";
    }
}
