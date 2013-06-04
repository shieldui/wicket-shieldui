package com.shieldui.wicket.chart.events;

import com.shieldui.wicket.chart.Options;

public abstract class ClickEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public ClickEventListener()
    {
        super(Options.Event.CLICK);
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +
                "\"clientX\": " + this.eventVarName + ".domEvent.originalEvent.clientX," + 
                "\"clientY\": " + this.eventVarName + ".domEvent.originalEvent.clientY" + 
                "}";
    }
}
