package com.shieldui.wicket.grid.events;

import com.shieldui.wicket.AbstractEventListenerBehavior;
import com.shieldui.wicket.grid.GridOptions;

public abstract class SortEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public SortEventListener()
    {
        super(GridOptions.Event.SORT.toString());
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +
                "\"column\": " + eventVarName + ".column," + 
                "\"desc\": " + eventVarName + ".desc," + 
                "\"unsort\": " + eventVarName + ".unsort" + 
                "}";
    }
}
