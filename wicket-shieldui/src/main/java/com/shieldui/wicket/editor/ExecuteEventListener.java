package com.shieldui.wicket.editor;

import com.shieldui.wicket.AbstractEventListenerBehavior;

public abstract class ExecuteEventListener extends AbstractEventListenerBehavior
{
    private static final long serialVersionUID = 1L;
    
    public ExecuteEventListener()
    {
        super(EditorOptions.Event.EXECUTE.toString());
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +
                "\"commandName\":" + eventVarName + ".commandName," + 
                "\"state\":" + eventVarName + ".state," + 
                "\"enabled\":" + eventVarName + ".target.enabled()," + 
                "\"visible\":" + eventVarName + ".target.visible()" + 
                "}";
    }
}
