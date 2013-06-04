package com.shieldui.wicket.chart.events;

import com.shieldui.wicket.chart.Options;

public abstract class PointDeselectEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public PointDeselectEventListener()
    {
        super(Options.Event.POINT_DESELECT);
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +
                "\"point\": " + this.eventVarName + ".point," + 
                "\"dataSeries\": " + this.eventVarName + ".dataSeries" + 
                "}";
    }
}
