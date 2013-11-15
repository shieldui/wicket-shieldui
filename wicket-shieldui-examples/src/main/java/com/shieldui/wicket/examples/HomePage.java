package com.shieldui.wicket.examples;

import com.shieldui.wicket.chart.Chart;
import com.shieldui.wicket.chart.ChartOptions;
import com.shieldui.wicket.chart.events.PointSelectEventListener;
import java.util.HashMap;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.WebPage;

public class HomePage extends WebPage
{
    private static final long serialVersionUID = 1L;

    public HomePage() 
    {        
        // add the menu
        add(new MenuPanel("menu"));
        
        // declare the two shield charts and add them to the page
        final Chart mainChart = new Chart("mainchart");
        final Chart detailsChart = new Chart("detailschart");
        add(mainChart);
        add(detailsChart);
        
        // initialize the main chart properties and events
        
        // set the theme
        mainChart.getOptions().setTheme(ChartOptions.Theme.BOOTSTRAP);
        
        // add main title
        mainChart.getOptions().getPrimaryHeader().setText("Web Server Usage");
        
        // add subtitle
        mainChart.getOptions().getSecondaryHeader().setText("Click on the sectors for details");
        
        // set the border color
        mainChart.getOptions().setBorderColor("red");
        
        // set the chart type to PIE
        mainChart.getOptions().setSeriesType(ChartOptions.SeriesType.PIE);
        
        // set some custom text formatter
        mainChart.getOptions().getTooltipSettings().setCustomPointText("{point.pointName}: {point.y:p}");
        
        // add some data to the main chart
        HashMap<String, Object> apache = new HashMap<String, Object>();
        apache.put("pointName", "Apache");
        apache.put("y", 0.65);
        
        HashMap<String, Object> iis = new HashMap<String, Object>();
        iis.put("pointName", "IIS");
        iis.put("y", 0.158);
        
        HashMap<String, Object> nginx = new HashMap<String, Object>();
        nginx.put("pointName", "Nginx");
        nginx.put("y", 0.144);
        
        HashMap<String, Object> other = new HashMap<String, Object>();
        other.put("pointName", "Other");
        other.put("y", 0.048);
        
        ChartOptions.DataSeriesItem dataSeriesItem = new ChartOptions.DataSeriesItem();
        dataSeriesItem.setData(apache, iis, nginx, other);
        mainChart.getOptions().setDataSeries(dataSeriesItem);
        
        // allow point selection for the PIE charts and set the cursor to pointer
        mainChart.getOptions().getSeriesSettings().getPie().setEnablePointSelection(true);
        mainChart.getOptions().getSeriesSettings().getPie().setCursor("pointer");
        
        // register event handlers for the chart's pointSelect and pointDeselect events
        mainChart.add(new PointSelectEventListener() {
            @Override
            protected void handleEvent(AjaxRequestTarget target, Object event) {
                // update the details chart accordingly to which point was clicked
                HashMap<String, Object> point = (HashMap<String, Object>) ((HashMap<String, Object>) event).get("point");
                String pointName = point.get("name").toString();
                Object[] data = null;
                if (pointName.equals("Apache")) {
                    data = new Object[]{65.7, 65.5, 65.2, 64.8, 64.6, 64.6, 64.3, 63.9, 63.5, 62.9, 62.3, 61.8, 65.0};
                }
                else if (pointName.equals("IIS")) {
                    data = new Object[]{18, 17.9, 17.9, 17.8, 17.6, 17.3, 17.1, 16.8, 16.7, 16.7, 16.6, 16.4, 15.8};
                }
                else if (pointName.equals("Nginx")) {
                    data = new Object[]{11.4, 11.6, 12.0, 12.4, 12.8, 13.0, 13.5, 14.1, 14.6, 15.1, 15.7, 16.3, 14.5};
                }
                else {  // Other
                    data = new Object[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                }
                
                detailsChart.getOptions().getPrimaryHeader().setText("Details for " + pointName);
                
                ChartOptions.DataSeriesItem dsi = new ChartOptions.DataSeriesItem();
                dsi.setData(data);
                detailsChart.getOptions().setDataSeries(dsi);
                
                // call reInitialize with the AjaxRequestTarget in ordet to update on the client
                detailsChart.reInitialize(target);
            }
        });
        
        // initialize some default details chart properties
        detailsChart.getOptions().setSeriesType(ChartOptions.SeriesType.SPLINE);
        detailsChart.getOptions().getPrimaryHeader().setText("Click on the pie above to populate");
        detailsChart.getOptions().getAxisX().setCategoricalValues("Jun 2012", "Jul 2012", "Aug 2012", "Sep 2012", "Oct 2012", 
            "Nov 2012", "Dec 2012", "Jan 2013", "Feb 2013", "Mar 2013", "Apr 2013", "May 2013", "Jun 2013");
        
    }
}
