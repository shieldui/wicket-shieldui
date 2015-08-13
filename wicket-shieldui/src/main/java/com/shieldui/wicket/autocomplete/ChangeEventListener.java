package com.shieldui.wicket.autocomplete;

import com.shieldui.wicket.AbstractEventListenerBehavior;

public abstract class ChangeEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public ChangeEventListener()
    {
        super(AutoCompleteOptions.Event.CHANGE.toString());
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +
                "\"visible\":" + eventVarName + ".target.visible()," + 
                "\"value\":" + eventVarName + ".value" +
                "}";
    }
}
