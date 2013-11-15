package com.shieldui.wicket.chart.events;

import com.shieldui.wicket.chart.ChartOptions;

public abstract class SeriesMouseOverEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public SeriesMouseOverEventListener()
    {
        super(ChartOptions.Event.SERIES_MOUSE_OVER);
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +
                "\"point\": " + this.eventVarName + ".point," + 
                "\"dataSeries\": " + this.eventVarName + ".dataSeries," + 
                "\"clientX\": " + this.eventVarName + ".domEvent.originalEvent.clientX," + 
                "\"clientY\": " + this.eventVarName + ".domEvent.originalEvent.clientY" + 
                "}";
    }
}
