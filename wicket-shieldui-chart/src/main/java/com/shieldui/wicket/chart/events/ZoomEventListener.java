package com.shieldui.wicket.chart.events;

import com.shieldui.wicket.chart.Options;

public abstract class ZoomEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public ZoomEventListener()
    {
        super(Options.Event.ZOOM);
    }
}
