Wicket-ShieldUI
=====================

An [Apache Wicket](http://wicket.apache.org) component leveraging the use of the [Shield UI](http://www.shieldui.com) JavaScript library.

Introduction
------------
The component uses the demo version of the Shield UI framework - a set of light-weight, powerful and fully customizable tools. 
If you would like to obtain a commercial license for the JavaScript code, or get more information about it, you can visit http://www.shieldui.com

Supported Widgets
-----------------
#### Data Visualization
- [Charts](https://www.shieldui.com/products/chart)
- [Barcode](https://www.shieldui.com/products/barcode)
- [QR Code](https://www.shieldui.com/products/qrcode)

#### Layout
- [ProgressBar](https://www.shieldui.com/products/progressbar)
- [Tooltip](https://www.shieldui.com/products/tooltip)

#### Editors
- [Button](https://www.shieldui.com/products/button)
- [Calendar](https://www.shieldui.com/products/calendar)
- [Switch](https://www.shieldui.com/products/switch)

Setup
-----
You should be able to run the examples project alone, as it includes the component library as dependencies in its POM.

If you cannot run it, you might need to rebuild the parent pom.xml configuration, which will rebuild both the wrappers and the example Wicket application.

Usage
-----
In your Wicket's page HTML, include the resources in the HEAD and add a container DIV element somewhere in your BODY:
```html
<link rel="stylesheet" type="text/css" href="//www.shieldui.com/shared/components/latest/css/light/all.min.css" />
<script type="text/javascript" src="//www.shieldui.com/shared/components/latest/js/jquery-1.10.2.min.js"></script>
<script type="text/javascript" src="//www.shieldui.com/shared/components/latest/js/shieldui-all.min.js"></script>

...

<div wicket:id="chart" style="width:600px; height:400px; margin:auto; margin-top:50px;"></div>
```

In the Java code of your page, initialize the component of your choice with something like:
```java
  final Chart chart = new Chart("chart");
  
  // set the chart type
  chart.getOptions().setSeriesType(ChartOptions.SeriesType.PIE);
  
  // add some data
  ChartOptions.DataSeriesItem dsi = new ChartOptions.DataSeriesItem();
  dsi.setData(20, 15, 45, 10, 5, 5);
  chart.getOptions().setDataSeries(dsi);
  
  add(chart);
```

More examples of using this library can be found in the wicket-shieldui-examples module part of this repository.

Detailed widget functionality and settings can be found in the [Shield UI Documentation](https://www.shieldui.com/documentation) section.

License
-------
Copyright 2013 Shield UI Ltd.

http://www.shieldui.com/eula
