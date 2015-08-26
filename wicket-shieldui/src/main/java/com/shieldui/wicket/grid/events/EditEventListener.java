package com.shieldui.wicket.grid.events;

import com.shieldui.wicket.AbstractEventListenerBehavior;
import com.shieldui.wicket.grid.GridOptions;

public abstract class EditEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public EditEventListener()
    {
        super(GridOptions.Event.EDIT.toString());
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +
                "\"row\": " + eventVarName + ".row," + 
                "\"cell\": " + eventVarName + ".cell" + 
                "}";
    }
}
