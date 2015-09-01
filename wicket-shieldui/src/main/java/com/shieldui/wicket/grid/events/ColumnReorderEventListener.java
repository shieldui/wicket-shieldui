package com.shieldui.wicket.grid.events;

import com.shieldui.wicket.AbstractEventListenerBehavior;
import com.shieldui.wicket.grid.GridOptions;

public abstract class ColumnReorderEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public ColumnReorderEventListener()
    {
        super(GridOptions.Event.COLUMN_REORDER.toString());
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +
                "\"index\": " + eventVarName + ".index," + 
                "\"newIndex\": " + eventVarName + ".newIndex" + 
                "}";
    }
}
