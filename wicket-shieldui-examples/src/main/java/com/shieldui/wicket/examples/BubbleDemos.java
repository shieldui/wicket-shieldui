package com.shieldui.wicket.examples;

import com.shieldui.wicket.chart.Chart;
import com.shieldui.wicket.chart.ChartOptions;
import java.util.HashMap;
import org.apache.wicket.markup.html.WebPage;

public class BubbleDemos extends WebPage
{
    private static final long serialVersionUID = 1L;
    
    public BubbleDemos()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        // add the bubble chart
        Chart bubble = new Chart("bubble");
        add(bubble);
        
        // configure the bubble chart
        bubble.getOptions().setSeriesType(ChartOptions.SeriesType.BUBBLE);
        
        bubble.getOptions().setDataSeries(
            new ChartOptions.DataSeriesItem()
                .setCollectionAlias("Collection One")
                .setData(
                    new HashMap() {{
                        put("x", 161);
                        put("y", 51);
                        put("size", 1200);
                        put("pointName", "London");
                    }},
                    new HashMap() {{
                        put("x", 170);
                        put("y", 59);
                        put("size", 14000);
                        put("pointName", "New York");
                    }},
                    new HashMap() {{
                        put("x", 147);
                        put("y", 49);
                        put("size", 135);
                        put("pointName", "Paris");
                    }},
                    new HashMap() {{
                        put("x", 159);
                        put("y", 50);
                        put("size", 125);
                        put("pointName", "Moscow");
                    }}
                ),
            new ChartOptions.DataSeriesItem()
                .setCollectionAlias("Collection Two")
                .setData(
                    new HashMap() {{
                        put("x", 161);
                        put("y", 140);
                        put("size", 1);
                        put("pointName", "London");
                    }},
                    new HashMap() {{
                        put("x", 170);
                        put("y", 159);
                        put("size", 2);
                        put("pointName", "New York");
                    }},
                    new HashMap() {{
                        put("x", 172);
                        put("y", 120);
                        put("size", 3);
                        put("pointName", "Paris");
                    }},
                    new HashMap() {{
                        put("x", 180);
                        put("y", 80);
                        put("size", 4);
                        put("pointName", "Moscow");
                    }}
                )
        );
    }
}
