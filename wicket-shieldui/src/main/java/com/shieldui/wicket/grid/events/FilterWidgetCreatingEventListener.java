package com.shieldui.wicket.grid.events;

import com.shieldui.wicket.AbstractEventListenerBehavior;
import com.shieldui.wicket.grid.GridOptions;

public abstract class FilterWidgetCreatingEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public FilterWidgetCreatingEventListener()
    {
        super(GridOptions.Event.FILTER_WIDGET_CREATING.toString());
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +
                "\"field\": " + eventVarName + ".field," + 
                "\"options\": " + eventVarName + ".options" + 
                "}";
    }
}
