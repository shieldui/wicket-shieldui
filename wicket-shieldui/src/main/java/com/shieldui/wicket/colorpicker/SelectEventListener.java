package com.shieldui.wicket.colorpicker;

import com.shieldui.wicket.AbstractEventListenerBehavior;

public abstract class SelectEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public SelectEventListener()
    {
        super(ColorPickerOptions.Event.SELECT.toString());
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +                                
                "\"value\":" + eventVarName + "target.value()," + 
                "\"enabled\":" + eventVarName + ".target.enabled()" + 
                "}";
    }
}
