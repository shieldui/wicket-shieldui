package com.shieldui.wicket.textbox;

import com.shieldui.wicket.AbstractEventListenerBehavior;

public abstract class ChangeEventListener extends AbstractEventListenerBehavior {
    private static final long serialVersionUID = 1L;
    
    public ChangeEventListener()
    {
        super(TextBoxOptions.Event.CHANGE.toString());
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +                                
                "\"value\":" + eventVarName + ".value," + 
                "\"oldValue\":" + eventVarName + ".old," + 
                "\"enabled\":" + eventVarName + ".target.enabled()," + 
                "\"visible\":" + eventVarName + ".target.visible()" + 
                "}";
    }
}
