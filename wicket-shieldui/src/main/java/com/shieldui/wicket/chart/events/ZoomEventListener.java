package com.shieldui.wicket.chart.events;

import com.shieldui.wicket.chart.ChartOptions;

public abstract class ZoomEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public ZoomEventListener()
    {
        super(ChartOptions.Event.ZOOM);
    }
}
