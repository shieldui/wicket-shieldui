package com.shieldui.wicket.treeview;

import com.shieldui.wicket.AbstractEventListenerBehavior;

public abstract class ChangeEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public ChangeEventListener()
    {
        super(TreeViewOptions.Event.CHANGE.toString());
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +
                "\"item\":" + eventVarName + ".item," + 
                "\"path\":this.getPath(" + eventVarName + ".element)" + 
                "}";
    }
}
