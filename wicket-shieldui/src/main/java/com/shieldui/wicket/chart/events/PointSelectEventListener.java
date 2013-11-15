package com.shieldui.wicket.chart.events;

import com.shieldui.wicket.chart.ChartOptions;

public abstract class PointSelectEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public PointSelectEventListener()
    {
        super(ChartOptions.Event.POINT_SELECT);
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
