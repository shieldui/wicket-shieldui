package com.shieldui.wicket.chart.events;

import com.shieldui.wicket.AbstractEventListenerBehavior;
import com.shieldui.wicket.chart.ChartOptions;

public abstract class SeriesVisibilityChangeEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public SeriesVisibilityChangeEventListener()
    {
        super(ChartOptions.Event.SERIES_VISIBILITY_CHANGE.toString());
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +
                "\"dataSeries\": " + this.eventVarName + ".dataSeries" + 
                "}";
    }
}
