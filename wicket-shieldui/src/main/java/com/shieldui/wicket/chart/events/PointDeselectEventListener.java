package com.shieldui.wicket.chart.events;

import com.shieldui.wicket.AbstractEventListenerBehavior;
import com.shieldui.wicket.chart.ChartOptions;

public abstract class PointDeselectEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public PointDeselectEventListener()
    {
        super(ChartOptions.Event.POINT_DESELECT.toString());
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
