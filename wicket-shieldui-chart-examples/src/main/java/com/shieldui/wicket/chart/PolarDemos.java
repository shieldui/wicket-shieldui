package com.shieldui.wicket.chart;

import com.shieldui.wicket.chart.Options.Axis;
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
        
        polarbar.getOptions().setSeriesType(Options.SeriesType.POLAR_BAR);
        polarbar.getOptions().getPrimaryHeader().setText("Polar Bar");
        polarbar.getOptions().getAxisX().setCategoricalValues(Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun"));
        
        Options.DataSeriesItem dataSeriesItem1 = new Options.DataSeriesItem();
        dataSeriesItem1.setCollectionAlias("Total Visits");
        dataSeriesItem1.setData(Arrays.asList(565000, 630400, 1170200, 910200, 1170200, 1383000));
        
        Options.DataSeriesItem dataSeriesItem2 = new Options.DataSeriesItem();
        dataSeriesItem2.setCollectionAlias("Unique Visits");
        dataSeriesItem2.setData(Arrays.asList(152000, 234000, 123000, 348000, 167000, 283000));
        
        polarbar.getOptions().setDataSeries(Arrays.asList(dataSeriesItem1, dataSeriesItem2));
        
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
                        polarbar.getOptions().seriesSettings.polarbar.stackMode = Options.StackMode.NORMAL;
                    }
                    else if (choice.equals("percent")) {
                        polarbar.getOptions().seriesSettings.polarbar.stackMode = Options.StackMode.PERCENT;
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
                .setSeriesType(Options.SeriesType.POLAR_LINE)
                .setDataSeries(
                    Arrays.asList(
                        new Options.DataSeriesItem().setData(
                            Arrays.asList(1, 3, 4, 5, 2, 5, 8, 7, 4, 3, 4, 5)
                        )
                    )
                )
                .getPrimaryHeader().setText("Polar Line");
        }});
        
        // add a polarsplinearea
        add(new Chart("polarsplinearea"){{
            getOptions()
                .setSeriesType(Options.SeriesType.POLAR_SPLINE_AREA)
                .setDataSeries(
                    Arrays.asList(
                        new Options.DataSeriesItem().setData(
                            Arrays.asList(2, 3, 4, 5, 1, 5)
                        )
                    )
                )
                .getPrimaryHeader().setText("Polar Spline Area");
        }});
        
        // add a polarscatter
        add(new Chart("polarscatter"){{
            getOptions()
                .setSeriesType(Options.SeriesType.POLAR_SCATTER)
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
                    Arrays.asList(
                        new Options.DataSeriesItem().setData(
                            Arrays.asList(
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
                    )
                )
                .getPrimaryHeader().setText("Polar Scatter");
        }});
    }
}
