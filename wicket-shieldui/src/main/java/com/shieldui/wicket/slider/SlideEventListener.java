/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shieldui.wicket.slider;

import com.shieldui.wicket.AbstractEventListenerBehavior;

/**
 *
 * @author Lyubo
 */
public abstract class SlideEventListener extends AbstractEventListenerBehavior {
    private static final long serialVersionUID = 1L;
    
    public SlideEventListener()
    {
        super(SliderOptions.Event.SLIDE.toString());
    }
    
    @Override
    protected String toJson(String varName)
    {
        return "{" +                                
                "\"value\":" + eventVarName + ".target.value()," + 
                "\"enabled\":" + eventVarName + ".target.enabled()," + 
                "\"visible\":" + eventVarName + ".target.visible()" + 
                "}";
    }
}
