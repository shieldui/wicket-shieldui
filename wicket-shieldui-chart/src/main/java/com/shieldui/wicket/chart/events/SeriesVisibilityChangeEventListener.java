package com.shieldui.wicket.chart.events;

import com.shieldui.wicket.chart.Options;

public abstract class SeriesVisibilityChangeEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public SeriesVisibilityChangeEventListener()
    {
        super(Options.Event.SERIES_VISIBILITY_CHANGE);
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +
                "\"dataSeries\": " + this.eventVarName + ".dataSeries" + 
                "}";
    }
}
