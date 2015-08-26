package com.shieldui.wicket.colorpicker;

import com.shieldui.wicket.AbstractEventListenerBehavior;

public abstract class ChangeEventListener extends AbstractEventListenerBehavior {
    private static final long serialVersionUID = 1L;
    
    public ChangeEventListener()
    {
        super(ColorPickerOptions.Event.CHANGE.toString());
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +                                
                "\"value\":" + eventVarName + "target.value()," + 
                "\"enabled\":" + eventVarName + ".target.enabled()," + 
                "}";
    }
}
