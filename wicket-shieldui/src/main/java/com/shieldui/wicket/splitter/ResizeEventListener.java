/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shieldui.wicket.splitter;

import com.shieldui.wicket.AbstractEventListenerBehavior;

/**
 *
 * @author Lyubo
 */
public abstract class ResizeEventListener extends AbstractEventListenerBehavior {
    private static final long serialVersionUID = 1L;
    
    public ResizeEventListener()
    {
        super(SplitterOptions.Event.RESIZE.toString());
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +                                
                "\"paneIndex\":" + eventVarName + ".paneIndex," +                
                "}";
    }
}
