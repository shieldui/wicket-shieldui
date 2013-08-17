package com.shieldui.wicket.chart;

import java.util.Arrays;
import java.util.HashMap;
import org.apache.wicket.markup.html.WebPage;

public class BarDemos extends WebPage
{
    private static final long serialVersionUID = 1L;
    
    public BarDemos()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        final Chart bar = new Chart("bar");
        add(bar);
        
        bar.getOptions().setTheme(Options.Theme.BOOTSTRAP);
        bar.getOptions().setSeriesType(Options.SeriesType.BAR);
        bar.getOptions().getPrimaryHeader().setText("Internet usage statistics");
        bar.getOptions().getAxisX().setCategoricalValues(Arrays.asList(new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun"}));
        bar.getOptions().getAxisY().getTitle().setText("Visitor statistics");
        
        Options.DataSeriesItem dataSeriesItem1 = new Options.DataSeriesItem();
        dataSeriesItem1.setCollectionAlias("Total Visits");
        dataSeriesItem1.setData(Arrays.asList(new Object[]{
            565000, 
            630400, 
            new HashMap<String, Object>(){{
                put("y", 910200);
                put("selected", true);
            }}, 
            1170200, 
            1383000
        }));
        
        Options.DataSeriesItem dataSeriesItem2 = new Options.DataSeriesItem();
        dataSeriesItem2.setCollectionAlias("Unique Visits");
        dataSeriesItem2.setData(Arrays.asList(new Object[]{152000, 234000, 123000, 348000, 167000, 283000}));
        
        bar.getOptions().setDataSeries(Arrays.asList(dataSeriesItem1, dataSeriesItem2));
    }
}
