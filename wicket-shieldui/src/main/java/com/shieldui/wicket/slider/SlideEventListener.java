package com.shieldui.wicket.slider;

import com.shieldui.wicket.AbstractEventListenerBehavior;

public abstract class SlideEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public SlideEventListener()
    {
        super(SliderOptions.Event.SLIDE.toString());
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +                                
                "\"value\":" + eventVarName + ".target.value()," + 
                "\"enabled\":" + eventVarName + ".target.enabled()," + 
                "\"visible\":" + eventVarName + ".target.visible()" + 
                "}";
    }
}
