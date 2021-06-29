package com.shieldui.wicket.examples;

import com.shieldui.wicket.chart.Chart;
import com.shieldui.wicket.chart.ChartOptions;
import java.util.HashMap;
import org.apache.wicket.ajax.json.JSONFunction;
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
        
        bar.getOptions().setTheme(ChartOptions.Theme.BOOTSTRAP);
        bar.getOptions().setSeriesType(ChartOptions.SeriesType.BAR);
        bar.getOptions().getPrimaryHeader().setText("Internet usage statistics");
        
        ChartOptions.Axis axisX = new ChartOptions.Axis();
        axisX.getAxisTickText().setFormat(new JSONFunction("function(text) { return text + '%%'; }"));
        bar.getOptions().addAxisX(axisX);
        
        ChartOptions.Axis axisY = new ChartOptions.Axis();
        axisY.getTitle().setText("Visitor statistics");
        axisY.getAxisTickText().setFormat("{text:c}");
        axisY.setPlotLines(
                new ChartOptions.Axis.PlotLine()
                    .setDrawColor("red")
                    .setDrawWidth(3)
                    .setStart(1000000)
        );
        bar.getOptions().addAxisY(axisY);
        
        bar.getOptions().getTooltipSettings().setCustomHeaderText(new JSONFunction("function() { return '<b>HEADER</b>'; }"));
        bar.getOptions().getSeriesSettings().getBar().getDataPointText().setEnabled(true);
        bar.getOptions().getSeriesSettings().getBar().getDataPointText().setFormat("{point.y} / {point.x}");
        
        ChartOptions.DataSeriesItem dataSeriesItem1 = new ChartOptions.DataSeriesItem();
        dataSeriesItem1.setCollectionAlias("Total Visits");
        dataSeriesItem1.setData(
            565000, 
            630400, 
            new HashMap<String, Object>(){{
                put("y", 910200);
                put("selected", true);
            }}, 
            1170200, 
            1383000
        );
        
        ChartOptions.DataSeriesItem dataSeriesItem2 = new ChartOptions.DataSeriesItem();
        dataSeriesItem2.setCollectionAlias("Unique Visits");
        dataSeriesItem2.setData(152000, 234000, 123000, 348000, 167000, 283000);
        
        bar.getOptions().setDataSeries(dataSeriesItem1, dataSeriesItem2);
    }
}
