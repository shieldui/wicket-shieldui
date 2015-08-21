package com.shieldui.wicket.combobox;

import com.shieldui.wicket.AbstractEventListenerBehavior;

public abstract class SelectEventListener extends AbstractEventListenerBehavior {
    private static final long serialVersionUID = 1L;
    
    public SelectEventListener()
    {
        super(ComboBoxOptions.Event.SELECT.toString());
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +                                
                "\"index\":" + eventVarName + ".index," + 
                "\"item\":" + eventVarName + ".item," + 
                "\"text\":" + eventVarName + ".text," + 
                "\"value\":" + eventVarName + ".value" + 
                "}";
    }
}
