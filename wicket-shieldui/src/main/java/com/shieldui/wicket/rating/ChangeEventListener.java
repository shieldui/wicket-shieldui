package com.shieldui.wicket.rating;

import com.shieldui.wicket.AbstractEventListenerBehavior;

public abstract class ChangeEventListener extends AbstractEventListenerBehavior {
    private static final long serialVersionUID = 1L;
    
    public ChangeEventListener()
    {
        super(RatingOptions.Event.CHANGE.toString());
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
