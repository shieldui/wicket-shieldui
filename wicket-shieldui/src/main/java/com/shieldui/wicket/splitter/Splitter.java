/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shieldui.wicket.splitter;

import com.shieldui.wicket.WidgetComponentBase;

/**
 *
 * @author Lyubo
 */
public class Splitter extends WidgetComponentBase {
    private static final long serialVersionUID = 1L;
    
    private final SplitterOptions options = new SplitterOptions();
    
    public Splitter(String id)
    {
        super(id, "Splitter");
    }
    
    @Override
    public SplitterOptions getOptions()
    {
        return options;
    }
}
