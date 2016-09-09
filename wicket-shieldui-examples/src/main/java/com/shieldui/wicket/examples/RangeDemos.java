package com.shieldui.wicket.examples;

import com.shieldui.wicket.chart.Chart;
import com.shieldui.wicket.chart.ChartOptions;
import com.shieldui.wicket.chart.ChartOptions.DataSeriesItem;
import com.shieldui.wicket.chart.events.PointSelectEventListener;
import java.util.HashMap;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.WebPage;

public class RangeDemos extends WebPage
{
    private static final long serialVersionUID = 1L;
    
    public RangeDemos()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        // add the two new charts
        final Chart rangeBar = new Chart("rangeBar");
        final Chart rangeSplineArea = new Chart("rangeSplineArea");
        add(rangeBar);
        add(rangeSplineArea);
        
        // setup the rangeBar properties
        rangeBar.getOptions().setTheme(ChartOptions.Theme.DARK);
        rangeBar.getOptions().setSeriesType(ChartOptions.SeriesType.RANGE_BAR);
        rangeBar.getOptions().getTooltipSettings().setCustomPointText("Low Value: <b>{point.low}</b></br>High Value:<b>{point.high}");
        
        ChartOptions.Axis axisY = new ChartOptions.Axis();
        axisY.getTitle().setText("Quarter Overview");
        rangeBar.getOptions().addAxisY(axisY);
        
        ChartOptions.Axis axisX = new ChartOptions.Axis();
        axisX.setCategoricalValues("Q1", "Q2", "Q3", "Q4");
        rangeBar.getOptions().addAxisX(axisX);
        
        rangeBar.getOptions().getPrimaryHeader().setText("Quarterly Performance");
        rangeBar.getOptions().getExportOptions().setImage(false).setPrint(false);
        rangeBar.getOptions().getSeriesSettings().getRangebar().setEnablePointSelection(true);
        
        // add some data to rangeBar
        rangeBar.getOptions().setDataSeries(new ChartOptions.DataSeriesItem() {{
            setData(
                new Object[]{3, 9}, 
                new Object[]{12, 23}, 
                new Object[]{1, 17}, 
                new Object[]{-3, 12}
            );
        }});
        
        // handle the pointSelect event for the rangeBar chart
        rangeBar.add(new PointSelectEventListener() {
            @Override
            protected void handleEvent(AjaxRequestTarget target, Object event) {                
                HashMap<String, Object> point = (HashMap<String, Object>) ((HashMap<String, Object>) event).get("point");
                int pointIndex = (Integer) point.get("x");
                Object[] chart_data = null;
                ChartOptions.Axis axisX = new ChartOptions.Axis();
                
                switch (pointIndex)
                {
                    case 0:
                        chart_data = new Object[]{new Object[]{3, 6}, new Object[]{4, 6}, new Object[]{5, 9}};
                        axisX.setCategoricalValues("Jan", "Feb", "Mar");
                        break;
                    case 1:
                        chart_data = new Object[]{new Object[]{12, 6}, new Object[]{14, 23}, new Object[]{17, 20}};
                        axisX.setCategoricalValues("Apr", "May", "Jun");
                        break;
                    case 2:
                        chart_data = new Object[]{new Object[]{1, 6}, new Object[]{8, 17}, new Object[]{3, 10}};
                        axisX.setCategoricalValues("Jul", "Aug", "Sep");
                        break;
                    case 3:
                        chart_data = new Object[]{new Object[]{4, 8}, new Object[]{0, 12}, new Object[]{-3, 10}};
                        axisX.setCategoricalValues("Oct", "Nov", "Dec");
                        break;
                    default:
                        break;
                }
                
                rangeSplineArea.getOptions().setAxisX(axisX);

                DataSeriesItem dsi = new ChartOptions.DataSeriesItem();
                dsi.setData(chart_data);
                rangeSplineArea.getOptions().setDataSeries(dsi);
                
                rangeSplineArea.getOptions().getPrimaryHeader().setText(point.get("name").toString());
                
                rangeSplineArea.reInitialize(target);
            }
        });
        
        // setup the rangeSplineArea properties;
        // the other data-specific properties will be updated 
        // in the pointSelect event handler above
        rangeSplineArea.getOptions().setTheme(ChartOptions.Theme.DARK);
        rangeSplineArea.getOptions().setSeriesType(ChartOptions.SeriesType.RANGE_SPLINE_AREA);
    }
}
