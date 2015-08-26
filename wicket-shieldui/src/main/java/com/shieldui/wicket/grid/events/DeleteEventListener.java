package com.shieldui.wicket.grid.events;

import com.shieldui.wicket.AbstractEventListenerBehavior;
import com.shieldui.wicket.grid.GridOptions;

public abstract class DeleteEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public DeleteEventListener()
    {
        super(GridOptions.Event.DELETE.toString());
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +
                "\"rowIndex\": " + eventVarName + ".rowIndex" + 
                "}";
    }
}
