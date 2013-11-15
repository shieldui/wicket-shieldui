package com.shieldui.wicket.chart.events;

import com.shieldui.wicket.chart.ChartOptions;

public abstract class LoadEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public LoadEventListener()
    {
        super(ChartOptions.Event.LOAD);
    }
}
