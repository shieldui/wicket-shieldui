package com.shieldui.wicket.chart.events;

import com.shieldui.wicket.AbstractEventListenerBehavior;
import com.shieldui.wicket.chart.ChartOptions;

public abstract class SeriesClickEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public SeriesClickEventListener()
    {
        super(ChartOptions.Event.SERIES_CLICK.toString());
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
