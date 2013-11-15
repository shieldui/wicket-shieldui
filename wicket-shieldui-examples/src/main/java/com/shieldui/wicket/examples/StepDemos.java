package com.shieldui.wicket.examples;

import com.shieldui.wicket.chart.Chart;
import com.shieldui.wicket.chart.ChartOptions;
import org.apache.wicket.markup.html.WebPage;

public class StepDemos extends WebPage
{
    private static final long serialVersionUID = 1L;
    
    public StepDemos()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        final Chart step = new Chart("step");
        add(step);
        
        step.getOptions().getSeriesSettings().getStepline().getDataPointText().setEnabled(true);
        step.getOptions().getSeriesSettings().getStepline().getDataPointText().setFormat("{point.y:c0}");
        
        ChartOptions.DataSeriesItem dataSeriesItem1 = new ChartOptions.DataSeriesItem();
        dataSeriesItem1.setCollectionAlias("Total Visits");
        dataSeriesItem1.setData(565000, 630400, 910200, 1170200, 1383000, 1580000);
        dataSeriesItem1.setSeriesType(ChartOptions.SeriesType.STEP_LINE);
        
        ChartOptions.DataSeriesItem dataSeriesItem2 = new ChartOptions.DataSeriesItem();
        dataSeriesItem2.setCollectionAlias("Unique Visits");
        dataSeriesItem2.setData(152000, 234000, 123000, 348000, 167000, 283000);
        dataSeriesItem2.setSeriesType(ChartOptions.SeriesType.STEP_AREA);
        
        step.getOptions().setDataSeries(dataSeriesItem1, dataSeriesItem2);
    }
}
