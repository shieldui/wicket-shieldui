package com.shieldui.wicket.combobox;

import com.shieldui.wicket.AbstractEventListenerBehavior;

public abstract class ChangeEventListener extends AbstractEventListenerBehavior {
    private static final long serialVersionUID = 1L;
    
    public ChangeEventListener()
    {
        super(ComboBoxOptions.Event.CHANGE.toString());
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +                                
                "\"selected\":" + eventVarName + ".target.selected()," + 
                "\"value\":" + eventVarName + ".target.value()," + 
                "\"enabled\":" + eventVarName + ".target.enabled()," + 
                "\"visible\":" + eventVarName + ".target.visible()" + 
                "}";
    }
}
