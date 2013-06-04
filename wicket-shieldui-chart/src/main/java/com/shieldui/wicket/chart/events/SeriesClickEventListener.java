package com.shieldui.wicket.chart.events;

import com.shieldui.wicket.chart.Options;

public abstract class SeriesClickEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public SeriesClickEventListener()
    {
        super(Options.Event.SERIES_CLICK);
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
