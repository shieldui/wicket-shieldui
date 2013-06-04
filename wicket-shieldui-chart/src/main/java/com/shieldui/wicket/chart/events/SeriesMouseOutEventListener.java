package com.shieldui.wicket.chart.events;

import com.shieldui.wicket.chart.Options;

public abstract class SeriesMouseOutEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public SeriesMouseOutEventListener()
    {
        super(Options.Event.SERIES_MOUSE_OUT);
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
