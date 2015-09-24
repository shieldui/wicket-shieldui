package com.shieldui.wicket.menu;

import com.shieldui.wicket.AbstractEventListenerBehavior;

public abstract class ClickEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public ClickEventListener()
    {
        super(MenuOptions.Event.CLICK.toString());
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +
                "\"item\":" + eventVarName + ".item" + 
                "}";
    }
}
