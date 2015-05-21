package com.shieldui.wicket.toggle;

import com.shieldui.wicket.AbstractEventListenerBehavior;

public abstract class ClickEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public ClickEventListener()
    {
        super(SwitchOptions.Event.CLICK.toString());
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
