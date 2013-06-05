Wicket-ShieldUI-Chart
=====================

An [Apache Wicket](http://wicket.apache.org) component leveraging the use of the Shield UI [JavaScript Chart](http://www.shieldui.com) library.

Introduction
------------
The component uses the demo version of the ShieldUI charting offering - a light-weight, powerful and fully customizable data visualization tool. 
If you would like to obtain a commercial license for the JavaScript code, or get more information about it, you can visit http://www.shieldui.com

Setup
-----
You should be able to run the examples project alone, as it includes the component library as dependencies in its POM.

If you cannot run it, you might need to rebuild the parent pom.xml configuration, which will rebuild both the chart wrappers and the example Wicket application.

Usage
-----
In your Wicket's page HTML, include the chart resources in the HEAD and add the chart container DIV element somewhere in your BODY:
```html
<link rel="stylesheet" type="text/css" href="http://www.shieldui.com/shared/components/latest/chart/css/shield-chart.min.css" />
<script type="text/javascript" src="http://www.shieldui.com/shared/components/latest/chart/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="http://www.shieldui.com/shared/components/latest/chart/js/shield-chart.all.min.js"></script>

...

<div wicket:id="chart" style="width:600px; height:400px; margin:auto; margin-top:50px;"></div>
```

In the Java code of your page, initialize the chart with something like:
```java
  final Chart chart = new Chart("chart");
  
  // set the chart type
  chart.getOptions().setSeriesType(Options.SeriesType.PIE);
  
  // add some data
  Options.DataSeriesItem dsi = new Options.DataSeriesItem();
  dsi.setData(Arrays.asList(new Object[]{20, 15, 45, 10, 5, 5}));
  chart.getOptions().setDataSeries(Arrays.asList(dsi));
  
  add(chart);
```

More examples of using this library can be found in the wicket-shieldui-chart-examples module part of this repository.

Detailed Chart functionality and settings can be found in the [Shield UI Documentation](https://www.shieldui.com/documentation) section.

License
-------
Copyright 2013 Shield UI Ltd.

http://www.shieldui.com/eula
