package com.shieldui.wicket.chart;

import com.shieldui.wicket.WidgetBase;

public class Chart extends WidgetBase
{
    private static final long serialVersionUID = 1L;

    private final ChartOptions options = new ChartOptions();
    
    // Chart class
    public Chart(String id)
    {
        super(id);
    }
    
    @Override
    public String getWidgetName()
    {
        return "shieldChart";
    }
    
    @Override
    public ChartOptions getOptions()
    {
        return options;
    }
}
