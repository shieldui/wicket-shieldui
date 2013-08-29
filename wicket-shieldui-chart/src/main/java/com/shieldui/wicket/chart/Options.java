package com.shieldui.wicket.chart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.wicket.ajax.json.JSONException;
import org.apache.wicket.ajax.json.JSONStringer;
import org.apache.wicket.ajax.json.JsonFunction;

public final class Options extends HashMapSerializable
{
    private static final long serialVersionUID = 1L;
    
    public enum Align
    {
        CENTER ("center"),
        LEFT ("left"),
        RIGHT ("right"),
        MIDDLE ("middle"),
        LOW ("low"),
        HIGH ("high");
        
        private final String value;
        
        private Align(String val)
        {
            value = val;
        }

        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public enum HorizontalAlign
    {
        CENTER ("center"),
        LEFT ("left"),
        RIGHT ("right");
        
        private final String value;
        
        private HorizontalAlign(String val)
        {
            value = val;
        }

        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public enum VerticalAlign
    {
        TOP ("top"),
        BOTTOM ("bottom"),
        MIDDLE ("middle");
        
        private final String value;
        
        private VerticalAlign(String val)
        {
            value = val;
        }

        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public enum AxisType
    {
        LINEAR ("linear"),
        LOGARITHMIC ("logarithmic"),
        DATETIME ("datetime");
        
        private final String value;
        
        private AxisType(String val)
        {
            value = val;
        }

        @Override
        public String toString()
        {
            return value;
        }
    }    
    
    public enum RenderDirection
    {
        HORIZONTAL ("horizontal"),
        VERTICAL ("vertical");
        
        private final String value;
        
        private RenderDirection(String val)
        {
            value = val;
        }

        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public enum StackMode
    {
        NORMAL ("normal"),
        PERCENT ("percent");
        
        private final String value;
        
        private StackMode(String val)
        {
            value = val;
        }

        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public enum TicksPlacement
    {
        OUTSIDE ("outside"),
        INSIDE ("inside"),
        THROUGH ("through");
        
        private final String value;
        
        private TicksPlacement(String val)
        {
            value = val;
        }

        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public enum DashStyle
    {
        SOLID ("Solid"),
        SHORT_DASH ("ShortDash"),
        SHORT_DOT ("ShortDot"),
        SHORT_DASH_DOT ("ShortDashDot"),
        SHORT_DASH_DOT_DOT ("ShortDashDotDot"),
        DOT ("Dot"),
        DASH ("Dash"),
        LONG_DASH ("LongDash"),
        DASH_DOT ("DashDot"),
        LONG_DASH_DOT ("LongDashDot"),
        LONG_DASH_DOT_DOT ("LongDashDotDot");
        
        private final String value;
        
        private DashStyle(String val)
        {
            value = val;
        }

        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public enum XYMode
    {
        X ("x"),
        Y ("y"),
        XY ("xy");
        
        private final String value;
        
        private XYMode(String val)
        {
            value = val;
        }

        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public enum Theme
    {
        DEFAULT ("default"),
        BOOTSTRAP ("bootstrap"),
        DARK ("dark");
        
        private final String value;
        
        private Theme(String val)
        {
            value = val;
        }

        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public enum SeriesType
    {
        AREA ("area"),
        BAR ("bar"),
        DONUT ("donut"),
        LINE ("line"),
        PIE ("pie"),
        RANGE_AREA ("rangearea"),
        RANGE_BAR ("rangebar"),
        RANGE_SPLINE_AREA ("rangesplinearea"),
        SCATTER ("scatter"),
        SPLINE ("spline"),
        SPLINE_AREA ("splinearea"),
        STEP_LINE ("stepline"),
        STEP_AREA ("steparea"),
        POLAR_LINE ("polarline"),
        POLAR_AREA ("polararea"),
        POLAR_BAR ("polarbar"),
        POLAR_SPLINE ("polarspline"),
        POLAR_SPLINE_AREA ("polarsplinearea"),
        POLAR_SCATTER ("polarscatter");
        
        private final String value;
        
        private SeriesType(String val)
        {
            value = val;
        }

        @Override
        public String toString()
        {
            return value;
        }
    }
    
    // client events
    public enum Event
    {
        LOAD ("load"),
        CLICK ("click"),
        ZOOM ("zoom"),
        SERIES_CLICK ("seriesClick"),
        SERIES_MOUSE_OVER ("seriesMouseOver"),
        SERIES_MOUSE_OUT ("seriesMouseOut"),
        SERIES_VISIBILITY_CHANGE ("seriesVisibilityChange"),
        POINT_SELECT ("pointSelect"),
        POINT_DESELECT ("pointDeselect");
        
        private final String value;
        
        private Event(String val)
        {
            value = val;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public static final class Axis extends HashMapSerializable
    {
        public static final class AxisTickText extends HashMapSerializable
        {
            public Boolean enabled;
            public Integer step;
            public Style style = new Style();
            public Integer textAngle;
            public Integer x;
            public Integer y;
            
            public Boolean getEnabled() {
                return enabled;
            }

            public AxisTickText setEnabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public Integer getStep() {
                return step;
            }

            public AxisTickText setStep(Integer step) {
                this.step = step;
                return this;
            }

            public Style getStyle() {
                return style;
            }

            public AxisTickText setStyle(Style style) {
                this.style = style;
                return this;
            }

            public Integer getTextAngle() {
                return textAngle;
            }

            public AxisTickText setTextAngle(Integer textAngle) {
                this.textAngle = textAngle;
                return this;
            }

            public Integer getX() {
                return x;
            }

            public AxisTickText setX(Integer x) {
                this.x = x;
                return this;
            }

            public Integer getY() {
                return y;
            }

            public AxisTickText setY(Integer y) {
                this.y = y;
                return this;
            }
        }
        
        public static final class Title extends HashMapSerializable
        {
            public Align align;
            public Integer offset;
            public Style style;
            public String text;
            public Integer textAngle;
            
            public Align getAlign() {
                return align;
            }

            public Title setAlign(Align align) {
                this.align = align;
                return this;
            }

            public Integer getOffset() {
                return offset;
            }

            public Title setOffset(Integer offset) {
                this.offset = offset;
                return this;
            }

            public Style getStyle() {
                return style;
            }

            public Title setStyle(Style style) {
                this.style = style;
                return this;
            }

            public String getText() {
                return text;
            }

            public Title setText(String text) {
                this.text = text;
                return this;
            }

            public Integer getTextAngle() {
                return textAngle;
            }

            public Title setTextAngle(Integer textAngle) {
                this.textAngle = textAngle;
                return this;
            }
        }
        
        public AxisTickText axisTickText = new AxisTickText();
        public AxisType axisType;
        public List<String> categoricalValues = new ArrayList<String>();
        public Boolean decimalTicks;
        public String drawColor;
        public Integer drawWidth;
        public Float endOffset;
        public Boolean fixedEnd;
        public Boolean inverseOrder;
        public Float max;
        public Float min;
        public String minorPlotStripColor;
        public DashStyle minorPlotStripDashStyle;
        public Integer minorPlotStripWidth;
        public String minorTicksColor;
        public Integer minorTicksHeight;
        public Float minorTicksRepeat;
        public Integer minorTicksWidth;
        public Integer offset;
        public String plotStripColor;
        public DashStyle plotStripDashStyle;
        public Integer plotStripWidth;
        public Float startOffset;
        public Boolean swapLocation;
        public String ticksColor;
        public Integer ticksHeight;
        public TicksPlacement ticksPlacement;
        public Integer ticksRepeat;
        public Integer ticksWidth;
        public Title title = new Title();
        
        public AxisTickText getAxisTickText() {
            return axisTickText;
        }

        public Axis setAxisTickText(AxisTickText axisTickText) {
            this.axisTickText = axisTickText;
            return this;
        }

        public AxisType getAxisType() {
            return axisType;
        }

        public Axis setAxisType(AxisType axisType) {
            this.axisType = axisType;
            return this;
        }

        public List<String> getCategoricalValues() {
            return categoricalValues;
        }

        public Axis setCategoricalValues(List<String> categoricalValues) {
            this.categoricalValues = categoricalValues;
            return this;
        }

        public Boolean getDecimalTicks() {
            return decimalTicks;
        }

        public Axis setDecimalTicks(Boolean decimalTicks) {
            this.decimalTicks = decimalTicks;
            return this;
        }

        public String getDrawColor() {
            return drawColor;
        }

        public Axis setDrawColor(String drawColor) {
            this.drawColor = drawColor;
            return this;
        }

        public Integer getDrawWidth() {
            return drawWidth;
        }

        public Axis setDrawWidth(Integer drawWidth) {
            this.drawWidth = drawWidth;
            return this;
        }

        public Float getEndOffset() {
            return endOffset;
        }

        public Axis setEndOffset(Float endOffset) {
            this.endOffset = endOffset;
            return this;
        }

        public Boolean getFixedEnd() {
            return fixedEnd;
        }

        public Axis setFixedEnd(Boolean fixedEnd) {
            this.fixedEnd = fixedEnd;
            return this;
        }

        public Boolean getInverseOrder() {
            return inverseOrder;
        }

        public Axis setInverseOrder(Boolean inverseOrder) {
            this.inverseOrder = inverseOrder;
            return this;
        }

        public Float getMax() {
            return max;
        }

        public Axis setMax(Float max) {
            this.max = max;
            return this;
        }

        public Float getMin() {
            return min;
        }

        public Axis setMin(Float min) {
            this.min = min;
            return this;
        }

        public String getMinorPlotStripColor() {
            return minorPlotStripColor;
        }

        public Axis setMinorPlotStripColor(String minorPlotStripColor) {
            this.minorPlotStripColor = minorPlotStripColor;
            return this;
        }

        public DashStyle getMinorPlotStripDashStyle() {
            return minorPlotStripDashStyle;
        }

        public Axis setMinorPlotStripDashStyle(DashStyle minorPlotStripDashStyle) {
            this.minorPlotStripDashStyle = minorPlotStripDashStyle;
            return this;
        }

        public Integer getMinorPlotStripWidth() {
            return minorPlotStripWidth;
        }

        public Axis setMinorPlotStripWidth(Integer minorPlotStripWidth) {
            this.minorPlotStripWidth = minorPlotStripWidth;
            return this;
        }

        public String getMinorTicksColor() {
            return minorTicksColor;
        }

        public Axis setMinorTicksColor(String minorTicksColor) {
            this.minorTicksColor = minorTicksColor;
            return this;
        }

        public Integer getMinorTicksHeight() {
            return minorTicksHeight;
        }

        public Axis setMinorTicksHeight(Integer minorTicksHeight) {
            this.minorTicksHeight = minorTicksHeight;
            return this;
        }

        public Float getMinorTicksRepeat() {
            return minorTicksRepeat;
        }

        public Axis setMinorTicksRepeat(Float minorTicksRepeat) {
            this.minorTicksRepeat = minorTicksRepeat;
            return this;
        }

        public Integer getMinorTicksWidth() {
            return minorTicksWidth;
        }

        public Axis setMinorTicksWidth(Integer minorTicksWidth) {
            this.minorTicksWidth = minorTicksWidth;
            return this;
        }

        public Integer getOffset() {
            return offset;
        }

        public Axis setOffset(Integer offset) {
            this.offset = offset;
            return this;
        }

        public String getPlotStripColor() {
            return plotStripColor;
        }

        public Axis setPlotStripColor(String plotStripColor) {
            this.plotStripColor = plotStripColor;
            return this;
        }

        public DashStyle getPlotStripDashStyle() {
            return plotStripDashStyle;
        }

        public Axis setPlotStripDashStyle(DashStyle plotStripDashStyle) {
            this.plotStripDashStyle = plotStripDashStyle;
            return this;
        }

        public Integer getPlotStripWidth() {
            return plotStripWidth;
        }

        public Axis setPlotStripWidth(Integer plotStripWidth) {
            this.plotStripWidth = plotStripWidth;
            return this;
        }

        public Float getStartOffset() {
            return startOffset;
        }

        public Axis setStartOffset(Float startOffset) {
            this.startOffset = startOffset;
            return this;
        }

        public Boolean getSwapLocation() {
            return swapLocation;
        }

        public Axis setSwapLocation(Boolean swapLocation) {
            this.swapLocation = swapLocation;
            return this;
        }

        public String getTicksColor() {
            return ticksColor;
        }

        public Axis setTicksColor(String ticksColor) {
            this.ticksColor = ticksColor;
            return this;
        }

        public Integer getTicksHeight() {
            return ticksHeight;
        }

        public Axis setTicksHeight(Integer ticksHeight) {
            this.ticksHeight = ticksHeight;
            return this;
        }

        public TicksPlacement getTicksPlacement() {
            return ticksPlacement;
        }

        public Axis setTicksPlacement(TicksPlacement ticksPlacement) {
            this.ticksPlacement = ticksPlacement;
            return this;
        }

        public Integer getTicksRepeat() {
            return ticksRepeat;
        }

        public Axis setTicksRepeat(Integer ticksRepeat) {
            this.ticksRepeat = ticksRepeat;
            return this;
        }

        public Integer getTicksWidth() {
            return ticksWidth;
        }

        public Axis setTicksWidth(Integer ticksWidth) {
            this.ticksWidth = ticksWidth;
            return this;
        }

        public Title getTitle() {
            return title;
        }

        public Axis setTitle(Title title) {
            this.title = title;
            return this;
        }
    }
    
    public static final class ChartLegend extends HashMapSerializable
    {
        public static final class LegendItemSettings extends HashMapSerializable
        {
            public Integer bottomSpacing;
            public Style disabledStyle;
            public Style elementStyle;
            public Integer elementWidth;
            public Style mouseOverStyle;
            public Integer topSpacing;
            
            public Integer getBottomSpacing() {
                return bottomSpacing;
            }

            public LegendItemSettings setBottomSpacing(Integer bottomSpacing) {
                this.bottomSpacing = bottomSpacing;
                return this;
            }

            public Style getDisabledStyle() {
                return disabledStyle;
            }

            public LegendItemSettings setDisabledStyle(Style disabledStyle) {
                this.disabledStyle = disabledStyle;
                return this;
            }

            public Style getElementStyle() {
                return elementStyle;
            }

            public LegendItemSettings setElementStyle(Style elementStyle) {
                this.elementStyle = elementStyle;
                return this;
            }

            public Integer getElementWidth() {
                return elementWidth;
            }

            public LegendItemSettings setElementWidth(Integer elementWidth) {
                this.elementWidth = elementWidth;
                return this;
            }

            public Style getMouseOverStyle() {
                return mouseOverStyle;
            }

            public LegendItemSettings setMouseOverStyle(Style mouseOverStyle) {
                this.mouseOverStyle = mouseOverStyle;
                return this;
            }

            public Integer getTopSpacing() {
                return topSpacing;
            }

            public LegendItemSettings setTopSpacing(Integer topSpacing) {
                this.topSpacing = topSpacing;
                return this;
            }
        }
        
        public HorizontalAlign align;
        public String backgroundColor;
        public String borderColor;
        public Integer borderRadius;
        public Integer borderWidth;
        public Integer chartDistance;
        public Boolean enabled;
        public Boolean inverseOrder;
        public LegendItemSettings legendItemSettings = new LegendItemSettings();
        public RenderDirection renderDirection;
        public Boolean rtlLayout;
        public VerticalAlign verticalAlign;
        public Integer width;
        public Integer x;
        public Integer y;
        
        public HorizontalAlign getAlign() {
            return align;
        }

        public ChartLegend setAlign(HorizontalAlign align) {
            this.align = align;
            return this;
        }

        public String getBackgroundColor() {
            return backgroundColor;
        }

        public ChartLegend setBackgroundColor(String backgroundColor) {
            this.backgroundColor = backgroundColor;
            return this;
        }

        public String getBorderColor() {
            return borderColor;
        }

        public ChartLegend setBorderColor(String borderColor) {
            this.borderColor = borderColor;
            return this;
        }

        public Integer getBorderRadius() {
            return borderRadius;
        }

        public ChartLegend setBorderRadius(Integer borderRadius) {
            this.borderRadius = borderRadius;
            return this;
        }

        public Integer getBorderWidth() {
            return borderWidth;
        }

        public ChartLegend setBorderWidth(Integer borderWidth) {
            this.borderWidth = borderWidth;
            return this;
        }

        public Integer getChartDistance() {
            return chartDistance;
        }

        public ChartLegend setChartDistance(Integer chartDistance) {
            this.chartDistance = chartDistance;
            return this;
        }

        public Boolean getEnabled() {
            return enabled;
        }

        public ChartLegend setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Boolean getInverseOrder() {
            return inverseOrder;
        }

        public ChartLegend setInverseOrder(Boolean inverseOrder) {
            this.inverseOrder = inverseOrder;
            return this;
        }

        public LegendItemSettings getLegendItemSettings() {
            return legendItemSettings;
        }

        public ChartLegend setLegendItemSettings(LegendItemSettings legendItemSettings) {
            this.legendItemSettings = legendItemSettings;
            return this;
        }

        public RenderDirection getRenderDirection() {
            return renderDirection;
        }

        public ChartLegend setRenderDirection(RenderDirection renderDirection) {
            this.renderDirection = renderDirection;
            return this;
        }

        public Boolean getRtlLayout() {
            return rtlLayout;
        }

        public ChartLegend setRtlLayout(Boolean rtlLayout) {
            this.rtlLayout = rtlLayout;
            return this;
        }

        public VerticalAlign getVerticalAlign() {
            return verticalAlign;
        }

        public ChartLegend setVerticalAlign(VerticalAlign verticalAlign) {
            this.verticalAlign = verticalAlign;
            return this;
        }

        public Integer getWidth() {
            return width;
        }

        public ChartLegend setWidth(Integer width) {
            this.width = width;
            return this;
        }

        public Integer getX() {
            return x;
        }

        public ChartLegend setX(Integer x) {
            this.x = x;
            return this;
        }

        public Integer getY() {
            return y;
        }

        public ChartLegend setY(Integer y) {
            this.y = y;
            return this;
        }
    }
    
    public static final class DataSeriesItem extends HashMapSerializable
    {
        public String collectionAlias;
        public List data;
        public Float dataStart;
        public Float dataStep;
        public Integer index;
        public Integer orderIndex;
        public SeriesType seriesType;
        public Integer stackIndex;
        
        public Float getDataStart() {
            return dataStart;
        }

        public DataSeriesItem setDataStart(Float dataStart) {
            this.dataStart = dataStart;
            return this;
        }

        public Float getDataStep() {
            return dataStep;
        }

        public DataSeriesItem setDataStep(Float dataStep) {
            this.dataStep = dataStep;
            return this;
        }

        public Integer getIndex() {
            return index;
        }

        public DataSeriesItem setIndex(Integer index) {
            this.index = index;
            return this;
        }

        public Integer getOrderIndex() {
            return orderIndex;
        }

        public DataSeriesItem setOrderIndex(Integer orderIndex) {
            this.orderIndex = orderIndex;
            return this;
        }

        public Integer getStackIndex() {
            return stackIndex;
        }

        public DataSeriesItem setStackIndex(Integer stackIndex) {
            this.stackIndex = stackIndex;
            return this;
        }
        
        public String getCollectionAlias() {
            return collectionAlias;
        }

        public DataSeriesItem setCollectionAlias(String collectionAlias) {
            this.collectionAlias = collectionAlias;
            return this;
        }

        public SeriesType getSeriesType() {
            return seriesType;
        }

        public DataSeriesItem setSeriesType(SeriesType seriesType) {
            this.seriesType = seriesType;
            return this;
        }
        
        public List getData() {
            return data;
        }

        public DataSeriesItem setData(List data) {
            this.data = data;
            return this;
        }
    }
    
    public static final class ExportOptions extends HashMapSerializable
    {
        public Boolean print;
        public Boolean image;
        public String printTooltip;
        public String imageTooltip;
        
        public Boolean getPrint() {
            return print;
        }

        public ExportOptions setPrint(Boolean print) {
            this.print = print;
            return this;
        }

        public Boolean getImage() {
            return image;
        }

        public ExportOptions setImage(Boolean image) {
            this.image = image;
            return this;
        }

        public String getPrintTooltip() {
            return printTooltip;
        }

        public ExportOptions setPrintTooltip(String printTooltip) {
            this.printTooltip = printTooltip;
            return this;
        }

        public String getImageTooltip() {
            return imageTooltip;
        }

        public ExportOptions setImageTooltip(String imageTooltip) {
            this.imageTooltip = imageTooltip;
            return this;
        }
    }
    
    public static final class Localization extends HashMapSerializable
    {
        public List<String> metricPrefixes = new ArrayList<String>();

        public List<String> getMetricPrefixes() {
            return metricPrefixes;
        }

        public Localization setMetricPrefixes(List<String> metricPrefixes) {
            this.metricPrefixes = metricPrefixes;
            return this;
        }
    }
    
    public static final class Style extends HashMapSerializable
    {
        public String font;
        public String fontSize;
        public String fontFamily;
        public String fontWeight;
        public String color;
        
        public String getFont() {
            return font;
        }

        public Style setFont(String font) {
            this.font = font;
            return this;
        }
        
        public String getFontSize() {
            return fontSize;
        }

        public Style setFontSize(String fontSize) {
            this.fontSize = fontSize;
            return this;
        }

        public String getFontFamily() {
            return fontFamily;
        }

        public Style setFontFamily(String fontFamily) {
            this.fontFamily = fontFamily;
            return this;
        }
        
        public String getFontWeight() {
            return fontWeight;
        }

        public Style setFontWeight(String fontWeight) {
            this.fontWeight = fontWeight;
            return this;
        }

        public String getColor() {
            return color;
        }

        public Style setColor(String color) {
            this.color = color;
            return this;
        }
    }
    
    public static final class Header extends HashMapSerializable
    {
        public String align;
        public Style style = new Style();
        public String text;
        public Integer x;
        public Integer y;
        
        public String getAlign() {
            return align;
        }

        public Header setAlign(String align) {
            this.align = align;
            return this;
        }

        public Style getStyle() {
            return style;
        }

        public Header setStyle(Style style) {
            this.style = style;
            return this;
        }

        public String getText() {
            return text;
        }

        public Header setText(String text) {
            this.text = text;
            return this;
        }

        public Integer getX() {
            return x;
        }

        public Header setX(Integer x) {
            this.x = x;
            return this;
        }

        public Integer getY() {
            return y;
        }

        public Header setY(Integer y) {
            this.y = y;
            return this;
        }
    }
    
    public static final class TooltipSettings extends HashMapSerializable
    {
        public static final class AxisMarkers extends HashMapSerializable
        {
            public String color;
            public Boolean enabled;
            public XYMode mode;
            public Integer width;
            public Integer zIndex;
            
            public String getColor() {
                return color;
            }

            public AxisMarkers setColor(String color) {
                this.color = color;
                return this;
            }

            public Boolean getEnabled() {
                return enabled;
            }

            public AxisMarkers setEnabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public XYMode getMode() {
                return mode;
            }

            public AxisMarkers setMode(XYMode mode) {
                this.mode = mode;
                return this;
            }

            public Integer getWidth() {
                return width;
            }

            public AxisMarkers setWidth(Integer width) {
                this.width = width;
                return this;
            }

            public Integer getzIndex() {
                return zIndex;
            }

            public AxisMarkers setzIndex(Integer zIndex) {
                this.zIndex = zIndex;
                return this;
            }
        }
        
        public AxisMarkers axisMarkers = new AxisMarkers();
        public String customHeaderText;
        public String customPointText;
        public Boolean enabled;
        public JsonFunction position;
        
        public AxisMarkers getAxisMarkers() {
            return axisMarkers;
        }

        public TooltipSettings setAxisMarkers(AxisMarkers axisMarkers) {
            this.axisMarkers = axisMarkers;
            return this;
        }

        public String getCustomHeaderText() {
            return customHeaderText;
        }

        public TooltipSettings setCustomHeaderText(String customHeaderText) {
            this.customHeaderText = customHeaderText;
            return this;
        }

        public String getCustomPointText() {
            return customPointText;
        }

        public TooltipSettings setCustomPointText(String customPointText) {
            this.customPointText = customPointText;
            return this;
        }

        public Boolean getEnabled() {
            return enabled;
        }

        public TooltipSettings setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public JsonFunction getPosition() {
            return position;
        }

        public TooltipSettings setPosition(JsonFunction position) {
            this.position = position;
            return this;
        }
    }
    
    public static final class DataPointText extends HashMapSerializable
    {
        public String backgroundColor;
        public String borderColor;
        public Integer borderRadius;
        public Integer borderWidth;
        public String color;
        public Integer distance;
        public Boolean enabled;
        public Integer padding;
        public String style;
        public Integer x;
        public Integer y;
        
        public String getBackgroundColor() {
            return backgroundColor;
        }

        public DataPointText setBackgroundColor(String backgroundColor) {
            this.backgroundColor = backgroundColor;
            return this;
        }

        public String getBorderColor() {
            return borderColor;
        }

        public DataPointText setBorderColor(String borderColor) {
            this.borderColor = borderColor;
            return this;
        }

        public Integer getBorderRadius() {
            return borderRadius;
        }

        public DataPointText setBorderRadius(Integer borderRadius) {
            this.borderRadius = borderRadius;
            return this;
        }

        public Integer getBorderWidth() {
            return borderWidth;
        }

        public DataPointText setBorderWidth(Integer borderWidth) {
            this.borderWidth = borderWidth;
            return this;
        }

        public String getColor() {
            return color;
        }

        public DataPointText setColor(String color) {
            this.color = color;
            return this;
        }

        public Integer getDistance() {
            return distance;
        }

        public DataPointText setDistance(Integer distance) {
            this.distance = distance;
            return this;
        }

        public Boolean getEnabled() {
            return enabled;
        }

        public DataPointText setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Integer getPadding() {
            return padding;
        }

        public DataPointText setPadding(Integer padding) {
            this.padding = padding;
            return this;
        }

        public String getStyle() {
            return style;
        }

        public DataPointText setStyle(String style) {
            this.style = style;
            return this;
        }

        public Integer getX() {
            return x;
        }

        public DataPointText setX(Integer x) {
            this.x = x;
            return this;
        }

        public Integer getY() {
            return y;
        }

        public void setY(Integer y) {
            this.y = y;
        }
    }
    
    public static final class SeriesSettings extends HashMapSerializable
    {        
        private static abstract class Base extends HashMapSerializable
        {
            public Boolean addToLegend;
            public Boolean applyAnimation;
            public String cursor;
            public DataPointText dataPointText = new DataPointText();
            public Boolean enablePointSelection;

            public Boolean getAddToLegend() {
                return addToLegend;
            }

            public Base setAddToLegend(Boolean addToLegend) {
                this.addToLegend = addToLegend;
                return this;
            }

            public Boolean getApplyAnimation() {
                return applyAnimation;
            }

            public Base setApplyAnimation(Boolean applyAnimation) {
                this.applyAnimation = applyAnimation;
                return this;
            }

            public String getCursor() {
                return cursor;
            }

            public Base setCursor(String cursor) {
                this.cursor = cursor;
                return this;
            }

            public DataPointText getDataPointText() {
                return dataPointText;
            }

            public Base setDataPointText(DataPointText dataPointText) {
                this.dataPointText = dataPointText;
                return this;
            }

            public Boolean getEnablePointSelection() {
                return enablePointSelection;
            }

            public Base setEnablePointSelection(Boolean enablePointSelection) {
                this.enablePointSelection = enablePointSelection;
                return this;
            }
        }
        
        public static final class PointState extends HashMapSerializable
        {
            public String drawColor;
            public Integer drawRadius;
            public Integer drawWidth;
            public Boolean enabled;
            public String innerColor;
            
            public String getDrawColor() {
                return drawColor;
            }

            public PointState setDrawColor(String drawColor) {
                this.drawColor = drawColor;
                return this;
            }

            public Integer getDrawRadius() {
                return drawRadius;
            }

            public PointState setDrawRadius(Integer drawRadius) {
                this.drawRadius = drawRadius;
                return this;
            }

            public String getInnerColor() {
                return innerColor;
            }

            public PointState setInnerColor(String innerColor) {
                this.innerColor = innerColor;
                return this;
            }
            
            public Integer getDrawWidth() {
                return drawWidth;
            }

            public PointState setDrawWidth(Integer drawWidth) {
                this.drawWidth = drawWidth;
                return this;
            }
            
            public Boolean getEnabled() {
                return enabled;
            }
            
            public PointState setEnabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }
        }
        
        public static final class ActiveSettings extends HashMapSerializable
        {
            public PointState pointHoveredState = new PointState();
            public PointState pointSelectedState = new PointState();
            
            public PointState getPointHoveredState() {
                return pointHoveredState;
            }

            public ActiveSettings setPointHoveredState(PointState pointHoveredState) {
                this.pointHoveredState = pointHoveredState;
                return this;
            }
            
            public PointState getPointSelectedState() {
                return pointSelectedState;
            }

            public ActiveSettings setPointSelectedState(PointState pointSelectedState) {
                this.pointSelectedState = pointSelectedState;
                return this;
            }
        }
        
        public static final class PointMark extends HashMapSerializable
        {
            public ActiveSettings activeSettings = new ActiveSettings();
            public String drawColor;
            public Integer drawRadius;
            public Integer drawWidth;
            public Boolean enabled;
            public String innerColor;
            
            public ActiveSettings getActiveSettings() {
                return activeSettings;
            }

            public PointMark setActiveSettings(ActiveSettings activeSettings) {
                this.activeSettings = activeSettings;
                return this;
            }

            public String getDrawColor() {
                return drawColor;
            }

            public PointMark setDrawColor(String drawColor) {
                this.drawColor = drawColor;
                return this;
            }

            public Integer getDrawRadius() {
                return drawRadius;
            }

            public PointMark setDrawRadius(Integer drawRadius) {
                this.drawRadius = drawRadius;
                return this;
            }

            public Integer getDrawWidth() {
                return drawWidth;
            }

            public PointMark setDrawWidth(Integer drawWidth) {
                this.drawWidth = drawWidth;
                return this;
            }

            public Boolean getEnabled() {
                return enabled;
            }

            public PointMark setEnabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public String getInnerColor() {
                return innerColor;
            }

            public PointMark setInnerColor(String innerColor) {
                this.innerColor = innerColor;
                return this;
            }
        }
        
        public static class Area extends Base
        {
            public ActiveSettings activeSettings = new ActiveSettings();
            public Float baseValue;
            public String color;
            public String drawColor;
            public Boolean drawNullValues;
            public Integer drawWidth;
            public String innerColor;
            public PointMark pointMark = new PointMark();
            public DashStyle seriesDashStyle;
            public StackMode stackMode;
            
            public ActiveSettings getActiveSettings() {
                return activeSettings;
            }

            public Area setActiveSettings(ActiveSettings activeSettings) {
                this.activeSettings = activeSettings;
                return this;
            }

            public Float getBaseValue() {
                return baseValue;
            }

            public Area setBaseValue(Float baseValue) {
                this.baseValue = baseValue;
                return this;
            }

            public String getColor() {
                return color;
            }

            public Area setColor(String color) {
                this.color = color;
                return this;
            }

            public String getDrawColor() {
                return drawColor;
            }

            public Area setDrawColor(String drawColor) {
                this.drawColor = drawColor;
                return this;
            }

            public Boolean getDrawNullValues() {
                return drawNullValues;
            }

            public Area setDrawNullValues(Boolean drawNullValues) {
                this.drawNullValues = drawNullValues;
                return this;
            }

            public Integer getDrawWidth() {
                return drawWidth;
            }

            public Area setDrawWidth(Integer drawWidth) {
                this.drawWidth = drawWidth;
                return this;
            }

            public String getInnerColor() {
                return innerColor;
            }

            public Area setInnerColor(String innerColor) {
                this.innerColor = innerColor;
                return this;
            }

            public PointMark getPointMark() {
                return pointMark;
            }

            public Area setPointMark(PointMark pointMark) {
                this.pointMark = pointMark;
                return this;
            }

            public DashStyle getSeriesDashStyle() {
                return seriesDashStyle;
            }

            public Area setSeriesDashStyle(DashStyle seriesDashStyle) {
                this.seriesDashStyle = seriesDashStyle;
                return this;
            }

            public StackMode getStackMode() {
                return stackMode;
            }

            public Area setStackMode(StackMode stackMode) {
                this.stackMode = stackMode;
                return this;
            }
        }
        
        public static class Bar extends Base
        {
            public ActiveSettings activeSettings = new ActiveSettings();
            public Float barOffset;
            public String borderColor;
            public Integer borderRadius;
            public Integer borderWidth;
            public StackMode stackMode;
            
            public ActiveSettings getActiveSettings() {
                return activeSettings;
            }

            public Bar setActiveSettings(ActiveSettings activeSettings) {
                this.activeSettings = activeSettings;
                return this;
            }

            public Float getBarOffset() {
                return barOffset;
            }

            public Bar setBarOffset(Float barOffset) {
                this.barOffset = barOffset;
                return this;
            }

            public String getBorderColor() {
                return borderColor;
            }

            public Bar setBorderColor(String borderColor) {
                this.borderColor = borderColor;
                return this;
            }

            public Integer getBorderRadius() {
                return borderRadius;
            }

            public Bar setBorderRadius(Integer borderRadius) {
                this.borderRadius = borderRadius;
                return this;
            }

            public Integer getBorderWidth() {
                return borderWidth;
            }

            public Bar setBorderWidth(Integer borderWidth) {
                this.borderWidth = borderWidth;
                return this;
            }

            public StackMode getStackMode() {
                return stackMode;
            }

            public Bar setStackMode(StackMode stackMode) {
                this.stackMode = stackMode;
                return this;
            }
        }
        
        public static class Donut extends Base
        {
            public ActiveSettings activeSettings = new ActiveSettings();
            public String borderColor;
            public Integer borderWidth;
            public List<Integer> center = new ArrayList<Integer>();
            public String innerSize;
            public String size;
            public Integer slicedOffset;
            
            public ActiveSettings getActiveSettings() {
                return activeSettings;
            }

            public Donut setActiveSettings(ActiveSettings activeSettings) {
                this.activeSettings = activeSettings;
                return this;
            }

            public String getBorderColor() {
                return borderColor;
            }

            public Donut setBorderColor(String borderColor) {
                this.borderColor = borderColor;
                return this;
            }

            public Integer getBorderWidth() {
                return borderWidth;
            }

            public Donut setBorderWidth(Integer borderWidth) {
                this.borderWidth = borderWidth;
                return this;
            }

            public List<Integer> getCenter() {
                return center;
            }

            public Donut setCenter(List<Integer> center) {
                this.center = center;
                return this;
            }

            public String getInnerSize() {
                return innerSize;
            }

            public Donut setInnerSize(String innerSize) {
                this.innerSize = innerSize;
                return this;
            }

            public String getSize() {
                return size;
            }

            public Donut setSize(String size) {
                this.size = size;
                return this;
            }

            public Integer getSlicedOffset() {
                return slicedOffset;
            }

            public Donut setSlicedOffset(Integer slicedOffset) {
                this.slicedOffset = slicedOffset;
                return this;
            }      
        }
        
        public static class Line extends Base
        {
            public ActiveSettings activeSettings = new ActiveSettings();
            public Float baseValue;
            public String color;
            public Boolean drawNullValues;
            public Integer drawWidth;
            public PointMark pointMark = new PointMark();
            public DashStyle seriesDashStyle;
            public StackMode stackMode;
            
            public ActiveSettings getActiveSettings() {
                return activeSettings;
            }

            public Line setActiveSettings(ActiveSettings activeSettings) {
                this.activeSettings = activeSettings;
                return this;
            }

            public Float getBaseValue() {
                return baseValue;
            }

            public Line setBaseValue(Float baseValue) {
                this.baseValue = baseValue;
                return this;
            }

            public String getColor() {
                return color;
            }

            public Line setColor(String color) {
                this.color = color;
                return this;
            }

            public Boolean getDrawNullValues() {
                return drawNullValues;
            }

            public Line setDrawNullValues(Boolean drawNullValues) {
                this.drawNullValues = drawNullValues;
                return this;
            }

            public Integer getDrawWidth() {
                return drawWidth;
            }

            public Line setDrawWidth(Integer drawWidth) {
                this.drawWidth = drawWidth;
                return this;
            }

            public PointMark getPointMark() {
                return pointMark;
            }

            public Line setPointMark(PointMark pointMark) {
                this.pointMark = pointMark;
                return this;
            }

            public DashStyle getSeriesDashStyle() {
                return seriesDashStyle;
            }

            public Line setSeriesDashStyle(DashStyle seriesDashStyle) {
                this.seriesDashStyle = seriesDashStyle;
                return this;
            }

            public StackMode getStackMode() {
                return stackMode;
            }

            public Line setStackMode(StackMode stackMode) {
                this.stackMode = stackMode;
                return this;
            }
        }
        
        public static class Pie extends Base
        {
            public ActiveSettings activeSettings = new ActiveSettings();
            public String borderColor;
            public Integer borderWidth;
            public List<Integer> center = new ArrayList<Integer>();
            public String size;
            public Integer slicedOffset;
            
            public ActiveSettings getActiveSettings() {
                return activeSettings;
            }

            public Pie setActiveSettings(ActiveSettings activeSettings) {
                this.activeSettings = activeSettings;
                return this;
            }

            public String getBorderColor() {
                return borderColor;
            }

            public Pie setBorderColor(String borderColor) {
                this.borderColor = borderColor;
                return this;
            }

            public Integer getBorderWidth() {
                return borderWidth;
            }

            public Pie setBorderWidth(Integer borderWidth) {
                this.borderWidth = borderWidth;
                return this;
            }

            public List<Integer> getCenter() {
                return center;
            }

            public Pie setCenter(List<Integer> center) {
                this.center = center;
                return this;
            }

            public String getSize() {
                return size;
            }

            public Pie setSize(String size) {
                this.size = size;
                return this;
            }

            public Integer getSlicedOffset() {
                return slicedOffset;
            }

            public Pie setSlicedOffset(Integer slicedOffset) {
                this.slicedOffset = slicedOffset;
                return this;
            }
        }
        
        public static class Scatter extends Base
        {
            public Float baseValue;
            public String color;
            public PointMark pointMark = new PointMark();
            
            public Float getBaseValue() {
                return baseValue;
            }

            public Scatter setBaseValue(Float baseValue) {
                this.baseValue = baseValue;
                return this;
            }

            public String getColor() {
                return color;
            }

            public Scatter setColor(String color) {
                this.color = color;
                return this;
            }

            public PointMark getPointMark() {
                return pointMark;
            }

            public Scatter setPointMark(PointMark pointMark) {
                this.pointMark = pointMark;
                return this;
            }
        }
        
        public static class RangeArea extends Base
        {
            public ActiveSettings activeSettings = new ActiveSettings();
            public String color;
            public String drawColor;
            public Integer drawWidth;
            public String innerColor;
            public DashStyle seriesDashStyle;
            
            public ActiveSettings getActiveSettings() {
                return activeSettings;
            }

            public RangeArea setActiveSettings(ActiveSettings activeSettings) {
                this.activeSettings = activeSettings;
                return this;
            }

            public String getColor() {
                return color;
            }

            public RangeArea setColor(String color) {
                this.color = color;
                return this;
            }

            public String getDrawColor() {
                return drawColor;
            }

            public RangeArea setDrawColor(String drawColor) {
                this.drawColor = drawColor;
                return this;
            }

            public Integer getDrawWidth() {
                return drawWidth;
            }

            public RangeArea setDrawWidth(Integer drawWidth) {
                this.drawWidth = drawWidth;
                return this;
            }

            public String getInnerColor() {
                return innerColor;
            }

            public RangeArea setInnerColor(String innerColor) {
                this.innerColor = innerColor;
                return this;
            }

            public DashStyle getSeriesDashStyle() {
                return seriesDashStyle;
            }

            public RangeArea setSeriesDashStyle(DashStyle seriesDashStyle) {
                this.seriesDashStyle = seriesDashStyle;
                return this;
            }
        }
        
        public static class RangeBar extends Base
        {
            public ActiveSettings activeSettings = new ActiveSettings();
            public Float barOffset;
            public String borderColor;
            public Integer borderRadius;
            public Integer borderWidth;
            public String color;
            
            public ActiveSettings getActiveSettings() {
                return activeSettings;
            }

            public RangeBar setActiveSettings(ActiveSettings activeSettings) {
                this.activeSettings = activeSettings;
                return this;
            }

            public Float getBarOffset() {
                return barOffset;
            }

            public RangeBar setBarOffset(Float barOffset) {
                this.barOffset = barOffset;
                return this;
            }

            public String getBorderColor() {
                return borderColor;
            }

            public RangeBar setBorderColor(String borderColor) {
                this.borderColor = borderColor;
                return this;
            }

            public Integer getBorderRadius() {
                return borderRadius;
            }

            public RangeBar setBorderRadius(Integer borderRadius) {
                this.borderRadius = borderRadius;
                return this;
            }

            public Integer getBorderWidth() {
                return borderWidth;
            }

            public RangeBar setBorderWidth(Integer borderWidth) {
                this.borderWidth = borderWidth;
                return this;
            }

            public String getColor() {
                return color;
            }

            public RangeBar setColor(String color) {
                this.color = color;
                return this;
            }
        }
        
        public static class RangeSplineArea extends Base
        {
            public String color;
            public String drawColor;
            public String innerColor;
            public DashStyle seriesDashStyle;
            
            public String getColor() {
                return color;
            }

            public RangeSplineArea setColor(String color) {
                this.color = color;
                return this;
            }

            public String getDrawColor() {
                return drawColor;
            }

            public RangeSplineArea setDrawColor(String drawColor) {
                this.drawColor = drawColor;
                return this;
            }

            public String getInnerColor() {
                return innerColor;
            }

            public RangeSplineArea setInnerColor(String innerColor) {
                this.innerColor = innerColor;
                return this;
            }

            public DashStyle getSeriesDashStyle() {
                return seriesDashStyle;
            }

            public RangeSplineArea setSeriesDashStyle(DashStyle seriesDashStyle) {
                this.seriesDashStyle = seriesDashStyle;
                return this;
            }
        }
        
        public static class Spline extends Base
        {
            public ActiveSettings activeSettings = new ActiveSettings();
            public Float baseValue;
            public String color;
            public Boolean drawNullValues;
            public Integer drawWidth;
            public PointMark pointMark = new PointMark();
            public DashStyle seriesDashStyle;
            public StackMode stackMode;
            
            public ActiveSettings getActiveSettings() {
                return activeSettings;
            }

            public Spline setActiveSettings(ActiveSettings activeSettings) {
                this.activeSettings = activeSettings;
                return this;
            }

            public Float getBaseValue() {
                return baseValue;
            }

            public Spline setBaseValue(Float baseValue) {
                this.baseValue = baseValue;
                return this;
            }

            public String getColor() {
                return color;
            }

            public Spline setColor(String color) {
                this.color = color;
                return this;
            }

            public Boolean getDrawNullValues() {
                return drawNullValues;
            }

            public Spline setDrawNullValues(Boolean drawNullValues) {
                this.drawNullValues = drawNullValues;
                return this;
            }

            public Integer getDrawWidth() {
                return drawWidth;
            }

            public Spline setDrawWidth(Integer drawWidth) {
                this.drawWidth = drawWidth;
                return this;
            }

            public PointMark getPointMark() {
                return pointMark;
            }

            public Spline setPointMark(PointMark pointMark) {
                this.pointMark = pointMark;
                return this;
            }

            public DashStyle getSeriesDashStyle() {
                return seriesDashStyle;
            }

            public Spline setSeriesDashStyle(DashStyle seriesDashStyle) {
                this.seriesDashStyle = seriesDashStyle;
                return this;
            }

            public StackMode getStackMode() {
                return stackMode;
            }

            public Spline setStackMode(StackMode stackMode) {
                this.stackMode = stackMode;
                return this;
            }
        }
        
        public static class SplineArea extends Base
        {
            public String color;
            public String drawColor;
            public Boolean drawNullValues;
            public Integer drawWidth;
            public String innerColor;
            public PointMark pointMark;
            public DashStyle seriesDashStyle;
            public StackMode stackMode;
            
            public String getColor() {
                return color;
            }

            public SplineArea setColor(String color) {
                this.color = color;
                return this;
            }

            public String getDrawColor() {
                return drawColor;
            }

            public SplineArea setDrawColor(String drawColor) {
                this.drawColor = drawColor;
                return this;
            }

            public Boolean getDrawNullValues() {
                return drawNullValues;
            }

            public SplineArea setDrawNullValues(Boolean drawNullValues) {
                this.drawNullValues = drawNullValues;
                return this;
            }

            public Integer getDrawWidth() {
                return drawWidth;
            }

            public SplineArea setDrawWidth(Integer drawWidth) {
                this.drawWidth = drawWidth;
                return this;
            }

            public String getInnerColor() {
                return innerColor;
            }

            public SplineArea setInnerColor(String innerColor) {
                this.innerColor = innerColor;
                return this;
            }

            public PointMark getPointMark() {
                return pointMark;
            }

            public SplineArea setPointMark(PointMark pointMark) {
                this.pointMark = pointMark;
                return this;
            }

            public DashStyle getSeriesDashStyle() {
                return seriesDashStyle;
            }

            public SplineArea setSeriesDashStyle(DashStyle seriesDashStyle) {
                this.seriesDashStyle = seriesDashStyle;
                return this;
            }

            public StackMode getStackMode() {
                return stackMode;
            }

            public SplineArea setStackMode(StackMode stackMode) {
                this.stackMode = stackMode;
                return this;
            }
        }
        
        public static class StepLine extends Line
        {
        }
        
        public static class StepArea extends Area
        {
        }
        
        public static class PolarLine extends Line
        {
        }
        
        public static class PolarArea extends Area
        {
        }
        
        public static class PolarBar extends Bar
        {
        }
        
        public static class PolarSpline extends Spline
        {
        }
        
        public static class PolarSplineArea extends SplineArea
        {
        }
        
        public static class PolarScatter extends Scatter
        {
        }
        
        public Area area = new Area();
        public Bar bar = new Bar();
        public Donut donut = new Donut();
        public Line line = new Line();
        public Pie pie = new Pie();
        public Scatter scatter = new Scatter();
        public Spline spline = new Spline();
        public SplineArea splinearea = new SplineArea();
        public RangeArea rangearea = new RangeArea();
        public RangeBar rangebar = new RangeBar();
        public RangeSplineArea rangesplinearea = new RangeSplineArea();
        public StepLine stepline = new StepLine();
        public StepArea steparea = new StepArea();
        public PolarLine polarline = new PolarLine();
        public PolarArea polararea = new PolarArea();
        public PolarBar polarbar = new PolarBar();
        public PolarSpline polarspline = new PolarSpline();
        public PolarSplineArea polarsplinearea = new PolarSplineArea();
        public PolarScatter polarscatter = new PolarScatter();
        
        public Area getArea() {
            return area;
        }

        public SeriesSettings setArea(Area area) {
            this.area = area;
            return this;
        }
        
        public Bar getBar() {
            return bar;
        }

        public SeriesSettings setBar(Bar bar) {
            this.bar = bar;
            return this;
        }

        public Donut getDonut() {
            return donut;
        }

        public SeriesSettings setDonut(Donut donut) {
            this.donut = donut;
            return this;
        }

        public Line getLine() {
            return line;
        }

        public SeriesSettings setLine(Line line) {
            this.line = line;
            return this;
        }

        public Pie getPie() {
            return pie;
        }

        public SeriesSettings setPie(Pie pie) {
            this.pie = pie;
            return this;
        }

        public Scatter getScatter() {
            return scatter;
        }

        public SeriesSettings setScatter(Scatter scatter) {
            this.scatter = scatter;
            return this;
        }

        public Spline getSpline() {
            return spline;
        }

        public SeriesSettings setSpline(Spline spline) {
            this.spline = spline;
            return this;
        }

        public SplineArea getSplinearea() {
            return splinearea;
        }

        public SeriesSettings setSplinearea(SplineArea splinearea) {
            this.splinearea = splinearea;
            return this;
        }
        
        public RangeArea getRangearea() {
            return rangearea;
        }

        public SeriesSettings setRangearea(RangeArea rangearea) {
            this.rangearea = rangearea;
            return this;
        }

        public RangeBar getRangebar() {
            return rangebar;
        }

        public SeriesSettings setRangebar(RangeBar rangebar) {
            this.rangebar = rangebar;
            return this;
        }

        public RangeSplineArea getRangesplinearea() {
            return rangesplinearea;
        }

        public SeriesSettings setRangesplinearea(RangeSplineArea rangesplinearea) {
            this.rangesplinearea = rangesplinearea;
            return this;
        }
        
        public StepLine getStepline() {
            return stepline;
        }

        public SeriesSettings setStepline(StepLine stepline) {
            this.stepline = stepline;
            return this;
        }

        public StepArea getSteparea() {
            return steparea;
        }

        public SeriesSettings setSteparea(StepArea steparea) {
            this.steparea = steparea;
            return this;
        }
        
        public PolarLine getPolarline() {
            return polarline;
        }

        public SeriesSettings setPolarline(PolarLine polarline) {
            this.polarline = polarline;
            return this;
        }

        public PolarArea getPolararea() {
            return polararea;
        }

        public SeriesSettings setPolararea(PolarArea polararea) {
            this.polararea = polararea;
            return this;
        }

        public PolarBar getPolarbar() {
            return polarbar;
        }

        public SeriesSettings setPolarbar(PolarBar polarbar) {
            this.polarbar = polarbar;
            return this;
        }

        public PolarSpline getPolarspline() {
            return polarspline;
        }

        public SeriesSettings setPolarspline(PolarSpline polarspline) {
            this.polarspline = polarspline;
            return this;
        }

        public PolarSplineArea getPolarsplinearea() {
            return polarsplinearea;
        }

        public SeriesSettings setPolarsplinearea(PolarSplineArea polarsplinearea) {
            this.polarsplinearea = polarsplinearea;
            return this;
        }

        public PolarScatter getPolarscatter() {
            return polarscatter;
        }

        public SeriesSettings setPolarscatter(PolarScatter polarscatter) {
            this.polarscatter = polarscatter;
            return this;
        }
    }

    // top level options/settings
    public Boolean allowUTCFormatting;
    public Boolean applyAnimation;
    public Axis axisX = new Axis();
    public Axis axisY = new Axis();
    public String backgroundColor;
    public String borderColor;
    public Integer borderRadius;
    public Integer borderWidth;
    public String chartAreaBackgroundColor;
    public String chartAreaBackgroundImage;
    public String chartAreaBorderColor;
    public Integer chartAreaBorderWidth;
    public Integer chartAreaPaddingBottom;
    public Integer chartAreaPaddingLeft;
    public Integer chartAreaPaddingRight;
    public Integer chartAreaPaddingTop;
    public ChartLegend chartLegend = new ChartLegend();
    public List<DataSeriesItem> dataSeries = new ArrayList<DataSeriesItem>();
    public Boolean enableAutoFit;
    public HashMap<Event, JsonFunction> events = new HashMap<Event, JsonFunction>();
    public ExportOptions exportOptions = new ExportOptions();
    public Integer height;
    public Boolean isInverted;
    public Localization localization = new Localization();
    public List<Integer> margin = new ArrayList<Integer>();
    public Header primaryHeader = new Header();
    public Header secondaryHeader = new Header();
    public List<String> seriesPalette = new ArrayList<String>();
    public SeriesSettings seriesSettings = new SeriesSettings();
    public SeriesType seriesType;
    public Theme theme;
    public TooltipSettings tooltipSettings = new TooltipSettings();
    public Integer width;
    public XYMode zoomMode;
    
    public Boolean getAllowUTCFormatting() {
        return allowUTCFormatting;
    }

    public Options setAllowUTCFormatting(Boolean allowUTCFormatting) {
        this.allowUTCFormatting = allowUTCFormatting;
        return this;
    }

    public Boolean getApplyAnimation() {
        return applyAnimation;
    }

    public Options setApplyAnimation(Boolean applyAnimation) {
        this.applyAnimation = applyAnimation;
        return this;
    }

    public Axis getAxisX() {
        return axisX;
    }

    public Options setAxisX(Axis axisX) {
        this.axisX = axisX;
        return this;
    }

    public Axis getAxisY() {
        return axisY;
    }

    public Options setAxisY(Axis axisY) {
        this.axisY = axisY;
        return this;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public Options setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public Options setBorderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public Integer getBorderRadius() {
        return borderRadius;
    }

    public Options setBorderRadius(Integer borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public Integer getBorderWidth() {
        return borderWidth;
    }

    public Options setBorderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public String getChartAreaBackgroundColor() {
        return chartAreaBackgroundColor;
    }

    public Options setChartAreaBackgroundColor(String chartAreaBackgroundColor) {
        this.chartAreaBackgroundColor = chartAreaBackgroundColor;
        return this;
    }

    public String getChartAreaBackgroundImage() {
        return chartAreaBackgroundImage;
    }

    public Options setChartAreaBackgroundImage(String chartAreaBackgroundImage) {
        this.chartAreaBackgroundImage = chartAreaBackgroundImage;
        return this;
    }

    public String getChartAreaBorderColor() {
        return chartAreaBorderColor;
    }

    public Options setChartAreaBorderColor(String chartAreaBorderColor) {
        this.chartAreaBorderColor = chartAreaBorderColor;
        return this;
    }

    public Integer getChartAreaBorderWidth() {
        return chartAreaBorderWidth;
    }

    public Options setChartAreaBorderWidth(Integer chartAreaBorderWidth) {
        this.chartAreaBorderWidth = chartAreaBorderWidth;
        return this;
    }

    public Integer getChartAreaPaddingBottom() {
        return chartAreaPaddingBottom;
    }

    public Options setChartAreaPaddingBottom(Integer chartAreaPaddingBottom) {
        this.chartAreaPaddingBottom = chartAreaPaddingBottom;
        return this;
    }

    public Integer getChartAreaPaddingLeft() {
        return chartAreaPaddingLeft;
    }

    public Options setChartAreaPaddingLeft(Integer chartAreaPaddingLeft) {
        this.chartAreaPaddingLeft = chartAreaPaddingLeft;
        return this;
    }

    public Integer getChartAreaPaddingRight() {
        return chartAreaPaddingRight;
    }

    public Options setChartAreaPaddingRight(Integer chartAreaPaddingRight) {
        this.chartAreaPaddingRight = chartAreaPaddingRight;
        return this;
    }

    public Integer getChartAreaPaddingTop() {
        return chartAreaPaddingTop;
    }

    public Options setChartAreaPaddingTop(Integer chartAreaPaddingTop) {
        this.chartAreaPaddingTop = chartAreaPaddingTop;
        return this;
    }

    public ChartLegend getChartLegend() {
        return chartLegend;
    }

    public Options setChartLegend(ChartLegend chartLegend) {
        this.chartLegend = chartLegend;
        return this;
    }

    public List<DataSeriesItem> getDataSeries() {
        return dataSeries;
    }

    public Options setDataSeries(List<DataSeriesItem> dataSeries) {
        this.dataSeries = dataSeries;
        return this;
    }

    public Boolean getEnableAutoFit() {
        return enableAutoFit;
    }

    public Options setEnableAutoFit(Boolean enableAutoFit) {
        this.enableAutoFit = enableAutoFit;
        return this;
    }

    public HashMap<Event, JsonFunction> getEvents() {
        return events;
    }

    public Options setEvents(HashMap<Event, JsonFunction> events) {
        this.events = events;
        return this;
    }

    public ExportOptions getExportOptions() {
        return exportOptions;
    }

    public Options setExportOptions(ExportOptions exportOptions) {
        this.exportOptions = exportOptions;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public Options setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Boolean getIsInverted() {
        return isInverted;
    }

    public Options setIsInverted(Boolean isInverted) {
        this.isInverted = isInverted;
        return this;
    }

    public Localization getLocalization() {
        return localization;
    }

    public Options setLocalization(Localization localization) {
        this.localization = localization;
        return this;
    }

    public List<Integer> getMargin() {
        return margin;
    }

    public Options setMargin(List<Integer> margin) {
        this.margin = margin;
        return this;
    }

    public Header getPrimaryHeader() {
        return primaryHeader;
    }

    public Options setPrimaryHeader(Header primaryHeader) {
        this.primaryHeader = primaryHeader;
        return this;
    }

    public Header getSecondaryHeader() {
        return secondaryHeader;
    }

    public Options setSecondaryHeader(Header secondaryHeader) {
        this.secondaryHeader = secondaryHeader;
        return this;
    }

    public List<String> getSeriesPalette() {
        return seriesPalette;
    }

    public Options setSeriesPalette(List<String> seriesPalette) {
        this.seriesPalette = seriesPalette;
        return this;
    }

    public SeriesSettings getSeriesSettings() {
        return seriesSettings;
    }

    public Options setSeriesSettings(SeriesSettings seriesSettings) {
        this.seriesSettings = seriesSettings;
        return this;
    }

    public SeriesType getSeriesType() {
        return seriesType;
    }

    public Options setSeriesType(SeriesType seriesType) {
        this.seriesType = seriesType;
        return this;
    }

    public Theme getTheme() {
        return theme;
    }

    public Options setTheme(Theme theme) {
        this.theme = theme;
        return this;
    }

    public TooltipSettings getTooltipSettings() {
        return tooltipSettings;
    }

    public Options setTooltipSettings(TooltipSettings tooltipSettings) {
        this.tooltipSettings = tooltipSettings;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public Options setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public XYMode getZoomMode() {
        return zoomMode;
    }

    public Options setZoomMode(XYMode zoomMode) {
        this.zoomMode = zoomMode;
        return this;
    }
    
    // toJson method to serialize all the settings in json
    public CharSequence toJson() 
    {
        try {
            JSONStringer writer = new JSONStringer();
            writer.object();
            
            HashMap<String, Object> dict = this.toHashMap();
            if (dict != null) {
                for (String key : dict.keySet()) {
                    Object value = dict.get(key);
                    if (value != null) {
                        writer.key(key);
                        writer.value(value);
                    }
                }
            }
            
            writer.endObject();
            return writer.toString();
        }
        catch (JSONException e) {
            throw new RuntimeException("Could not convert ChartOptions object to Json", e);
        }
    }
}
