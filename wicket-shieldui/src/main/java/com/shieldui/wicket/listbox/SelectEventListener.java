package com.shieldui.wicket.listbox;

import com.shieldui.wicket.AbstractEventListenerBehavior;

public abstract class SelectEventListener extends AbstractEventListenerBehavior {
    private static final long serialVersionUID = 1L;
    
    public SelectEventListener()
    {
        super(ListBoxOptions.Event.SELECT.toString());
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +
                "\"index\":" + eventVarName + ".index," + 
                "\"item\":" + eventVarName + ".item," + 
                "\"value\":" + eventVarName + ".value," + 
                "\"text\":" + eventVarName + ".text," +
                "}";
    }
}
