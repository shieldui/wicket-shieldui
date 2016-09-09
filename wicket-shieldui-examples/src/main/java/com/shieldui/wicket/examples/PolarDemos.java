package com.shieldui.wicket.examples;

import com.shieldui.wicket.chart.Chart;
import com.shieldui.wicket.chart.ChartOptions;
import com.shieldui.wicket.chart.ChartOptions.Axis;
import java.util.Arrays;
import java.util.HashMap;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.form.AjaxFormComponentUpdatingBehavior;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.model.Model;

public class PolarDemos extends WebPage
{
    private static final long serialVersionUID = 1L;
    
    public PolarDemos()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        // add a polarchart
        final Chart polarbar = new Chart("polarbar");
        add(polarbar);
        
        polarbar.getOptions().setSeriesType(ChartOptions.SeriesType.POLAR_BAR);
        polarbar.getOptions().getPrimaryHeader().setText("Polar Bar");
        
        ChartOptions.Axis axisX = new ChartOptions.Axis();
        axisX.setCategoricalValues("Jan", "Feb", "Mar", "Apr", "May", "Jun");
        polarbar.getOptions().addAxisX(axisX);
        
        ChartOptions.DataSeriesItem dataSeriesItem1 = new ChartOptions.DataSeriesItem();
        dataSeriesItem1.setCollectionAlias("Total Visits");
        dataSeriesItem1.setData(565000, 630400, 1170200, 910200, 1170200, 1383000);
        
        ChartOptions.DataSeriesItem dataSeriesItem2 = new ChartOptions.DataSeriesItem();
        dataSeriesItem2.setCollectionAlias("Unique Visits");
        dataSeriesItem2.setData(152000, 234000, 123000, 348000, 167000, 283000);
        
        polarbar.getOptions().setDataSeries(dataSeriesItem1, dataSeriesItem2);
        
        // add a dropdown menu to update the polarchart stack mode
        final DropDownChoice<String> polarbar_select = 
            new DropDownChoice("polarbar_select", new Model("none"), Arrays.asList("none", "normal", "percent"));
        add(polarbar_select);
        
        polarbar_select.add(new AjaxFormComponentUpdatingBehavior("onchange") {
            @Override
            protected void onUpdate(AjaxRequestTarget target) {
                String choice = polarbar_select.getModelObject().toString();
                
                if (choice != null) {                   
                    if (choice.equals("normal")) {
                        polarbar.getOptions().seriesSettings.polarbar.stackMode = ChartOptions.StackMode.NORMAL;
                    }
                    else if (choice.equals("percent")) {
                        polarbar.getOptions().seriesSettings.polarbar.stackMode = ChartOptions.StackMode.PERCENT;
                    }
                    else {
                        polarbar.getOptions().seriesSettings.polarbar.stackMode = null;
                    }
                    
                    polarbar.reInitialize(target);
                }
            }
        });
        
        // add a polarline
        add(new Chart("polarline"){{
            getOptions()
                .setSeriesType(ChartOptions.SeriesType.POLAR_LINE)
                .setDataSeries(
                    new ChartOptions.DataSeriesItem().setData(
                        1, 3, 4, 5, 2, 5, 8, 7, 4, 3, 4, 5
                    )
                )
                .getPrimaryHeader().setText("Polar Line");
        }});
        
        // add a polarsplinearea
        add(new Chart("polarsplinearea"){{
            getOptions()
                .setSeriesType(ChartOptions.SeriesType.POLAR_SPLINE_AREA)
                .setDataSeries(
                    new ChartOptions.DataSeriesItem().setData(
                        2, 3, 4, 5, 1, 5
                    )
                )
                .getPrimaryHeader().setText("Polar Spline Area");
        }});
        
        // add a polarscatter
        add(new Chart("polarscatter"){{
            getOptions()
                .setSeriesType(ChartOptions.SeriesType.POLAR_SCATTER)
                .setAxisX(new Axis()
                    .setMin(0f)
                    .setMax(360f)
                    .setMinorTicksRepeat(90f)
                    .setPlotStripWidth(0)
                    .setTicksHeight(0)
                    .setAxisTickText(new Axis.AxisTickText().setEnabled(false))
                )
                .setAxisY(new Axis()
                    .setTicksHeight(0)
                    .setPlotStripWidth(0)
                    .setAxisTickText(new Axis.AxisTickText().setEnabled(false))
                )
                .setDataSeries(
                    new ChartOptions.DataSeriesItem().setData(
                        new HashMap() {{
                            put("x", 70);
                            put("y", 100);
                        }},
                        new HashMap() {{
                            put("x", 150);
                            put("y", 50);
                        }},
                        new HashMap() {{
                            put("x", 240);
                            put("y", 70);
                        }},
                        new HashMap() {{
                            put("x", 330);
                            put("y", 110);
                        }}
                    )
                )
                .getPrimaryHeader().setText("Polar Scatter");
        }});
    }
}
