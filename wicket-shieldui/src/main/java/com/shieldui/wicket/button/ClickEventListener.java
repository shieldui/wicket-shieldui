package com.shieldui.wicket.button;

import com.shieldui.wicket.AbstractEventListenerBehavior;

public abstract class ClickEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public ClickEventListener()
    {
        super(ButtonOptions.Event.CLICK.toString());
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +
                "\"visible\":" + eventVarName + ".target.visible()," + 
                "\"enabled\":" + eventVarName + ".target.enabled()," + 
                "\"checked\":" + eventVarName + ".target.checked()" +
                "}";
    }
}
