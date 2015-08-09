package com.shieldui.wicket.chart;

import com.shieldui.wicket.WidgetComponentBase;

public class Chart extends WidgetComponentBase
{
    private static final long serialVersionUID = 1L;

    private final ChartOptions options = new ChartOptions();
    
    public Chart(String id)
    {
        super(id, "Chart");
    }
    
    @Override
    public ChartOptions getOptions()
    {
        return options;
    }
}
