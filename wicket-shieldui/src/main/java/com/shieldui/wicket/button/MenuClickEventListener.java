package com.shieldui.wicket.button;

import com.shieldui.wicket.AbstractEventListenerBehavior;

public abstract class MenuClickEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public MenuClickEventListener()
    {
        super(SplitButtonOptions.Event.MENU_CLICK.toString());
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +
                "\"visible\":this.visible()," + 
                "\"enabled\":this.enabled()," + 
                "\"checked\":this.checked()," +
                "\"item\":" + eventVarName + ".item" +
                "}";
    }
}
