package com.shieldui.wicket.calendar;

import com.shieldui.wicket.AbstractEventListenerBehavior;

public abstract class ChangeEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public ChangeEventListener()
    {
        super(CalendarOptions.Event.CHANGE.toString());
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +
                "\"visible\":" + eventVarName + ".target.visible()," + 
                "\"enabled\":" + eventVarName + ".target.enabled()," + 
                "\"value\":" + eventVarName + ".target.value()" +
                "}";
    }
}
