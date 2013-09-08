package com.shieldui.wicket.chart;

import java.util.Arrays;
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
        
        Options.DataSeriesItem dataSeriesItem1 = new Options.DataSeriesItem();
        dataSeriesItem1.setCollectionAlias("Total Visits");
        dataSeriesItem1.setData(565000, 630400, 910200, 1170200, 1383000, 1580000);
        dataSeriesItem1.setSeriesType(Options.SeriesType.STEP_LINE);
        
        Options.DataSeriesItem dataSeriesItem2 = new Options.DataSeriesItem();
        dataSeriesItem2.setCollectionAlias("Unique Visits");
        dataSeriesItem2.setData(152000, 234000, 123000, 348000, 167000, 283000);
        dataSeriesItem2.setSeriesType(Options.SeriesType.STEP_AREA);
        
        step.getOptions().setDataSeries(dataSeriesItem1, dataSeriesItem2);
    }
}
