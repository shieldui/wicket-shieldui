/*
 * A Wicket panel for the top menu shared between websites
 */
package com.shieldui.wicket.examples;

import com.shieldui.wicket.datasource.DataSourceOptions;
import com.shieldui.wicket.menu.Menu;
import com.shieldui.wicket.menu.MenuOptions;
import java.util.HashMap;
import org.apache.wicket.ajax.json.JsonFunction;
import org.apache.wicket.markup.html.panel.Panel;

public class MenuPanel extends Panel
{
    private static final long serialVersionUID = 1L;
    
    public MenuPanel(String id)
    {
        super(id);
        
        final Menu menu = new Menu("menu");
        add(menu);
        
        menu.getOptions()
                .setCls("topmenu")
                .setDataSource(new DataSourceOptions()
                    .setData(
                        new HashMap<String, Object>() {{
                            put("content", "Data Visualization");
                            put("items", new Object[] {
                                getUrlItem("Miscellaneous", HomePage.class),
                                getUrlItem("Bar Charts", BarDemos.class),
                                getUrlItem("Bubble Charts", BubbleDemos.class),
                                getUrlItem("Range Charts", RangeDemos.class),
                                getUrlItem("Step Charts", StepDemos.class),
                                getUrlItem("Polar Charts", PolarDemos.class),
                                getSeparatorItem(),
                                getUrlItem("Barcode", Barcode.class),
                                getUrlItem("QR Code", QrCode.class),
                                getSeparatorItem(),
                                getUrlItem("TagCloud", TagCloudDemo.class),
                                getUrlItem("TreeMap", TreeMapDemo.class)
                            });
                        }},
                        new HashMap<String, Object>() {{
                            put("content", "Layout");
                            put("items", new Object[] {
                                getUrlItem("Grid", GridDemos.class),
                                getSeparatorItem(),
                                getUrlItem("Miscellaneous", LayoutDemos.class),
                                getUrlItem("LoadingPanel", LoadingPanelDemo.class),
                                getUrlItem("Pager", PagerDemo.class),
                                getUrlItem("ProgressBar", ProgressBar.class),
                                getUrlItem("Rating", RatingDemo.class),
                                getUrlItem("Splitter", SplitterDemo.class),
                                getUrlItem("Timeline", TimelineDemo.class),
                                getUrlItem("TreeView", TreeViewDemo.class),
                                getUrlItem("Window", WindowDemo.class),
                            });
                        }},
                        new HashMap<String, Object>() {{
                            put("content", "Editors");
                            put("items", new Object[] {
                                getUrlItem("Inputs", InputDemos.class),
                                getUrlItem("Button", Button.class),
                                getUrlItem("CheckBox", CheckBoxDemo.class),
                                getUrlItem("ColorPicker", ColorPickerDemo.class),
                                getUrlItem("ComboBox", ComboBoxDemo.class),
                                getUrlItem("DropDown", DropDownDemo.class),
                                getUrlItem("ListBox", ListBoxDemo.class),
                                getUrlItem("MaskedTextBox", MaskedTextBoxDemo.class),
                                getUrlItem("NumericTextBox", NumericTextBoxDemo.class),
                                getUrlItem("RadioButton", RadioButtonDemo.class),
                                getUrlItem("Slider", SliderDemo.class),
                                getUrlItem("TextBox", TextBoxDemo.class),
                                getSeparatorItem(),
                                getUrlItem("Calendar", Calendar.class),
                                getUrlItem("DatePicker", DatePickerDemo.class),
                                getUrlItem("DateTimePicker", DateTimePickerDemo.class),
                                getUrlItem("MonthYearPicker", MonthYearPickerDemo.class),
                                getUrlItem("TimePicker", TimePickerDemo.class),
                                getSeparatorItem(),
                                getUrlItem("Upload", UploadDemo.class),
                                getUrlItem("Editor", EditorDemo.class)
                            });
                        }},
                        new HashMap<String, Object>() {{
                            put("content", "Framework");
                            put("items", new Object[] {
                                getUrlItem("DataSource", DataSourceDemo.class)
                            });
                        }}
                    )
                );
        
        menu.getOptions().setEvents(new HashMap<MenuOptions.Event, JsonFunction>() {{
            put(MenuOptions.Event.CLICK, new JsonFunction("function(e) { this.expanded(false); }"));
        }});
    }
    
    private HashMap<String, Object> getUrlItem(final String name, final Class cls)
    {
        return new HashMap<String, Object>() {{
            put("content", name);
            put("href", urlFor(cls, null));
        }};
    }
    
    private HashMap<String, Object> getSeparatorItem()
    {
        return new HashMap<String, Object>() {{
            put("separator", true);
        }};
    }
}
