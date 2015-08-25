/*
 * A Wicket panel for the top menu shared between websites
 */
package com.shieldui.wicket.examples;

import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.Panel;

public class MenuPanel extends Panel
{
    private static final long serialVersionUID = 1L;
    
    public MenuPanel(String id)
    {
        super(id);
        
        add(new BookmarkablePageLink("home", HomePage.class));
        add(new BookmarkablePageLink("bar", BarDemos.class));
        add(new BookmarkablePageLink("bubble", BubbleDemos.class));
        add(new BookmarkablePageLink("range", RangeDemos.class));
        add(new BookmarkablePageLink("step", StepDemos.class));
        add(new BookmarkablePageLink("polar", PolarDemos.class));
        
        add(new BookmarkablePageLink("barcode", Barcode.class));
        add(new BookmarkablePageLink("qrcode", QrCode.class));
        add(new BookmarkablePageLink("tagcloud", TagCloudDemo.class));
        add(new BookmarkablePageLink("treemap", TreeMapDemo.class));
        add(new BookmarkablePageLink("slider", SliderDemo.class));
        add(new BookmarkablePageLink("splitter", SplitterDemo.class));
        add(new BookmarkablePageLink("maskedtextbox", MaskedTextBoxDemo.class));
        add(new BookmarkablePageLink("numerictextbox", NumericTextBoxDemo.class));
        add(new BookmarkablePageLink("listbox", ListBoxDemo.class));
        add(new BookmarkablePageLink("radiobutton", RadioButtonDemo.class));
        add(new BookmarkablePageLink("checkbox", CheckBoxDemo.class));
        add(new BookmarkablePageLink("textbox", TextBoxDemo.class));
        add(new BookmarkablePageLink("combobox", ComboBoxDemo.class));
        add(new BookmarkablePageLink("dropdown", DropDownDemo.class));
        add(new BookmarkablePageLink("datepicker", DatePickerDemo.class));
        add(new BookmarkablePageLink("monthyearpicker", MonthYearPickerDemo.class));
        add(new BookmarkablePageLink("timepicker", TimePickerDemo.class));
        add(new BookmarkablePageLink("datetimepicker", DateTimePickerDemo.class));
        add(new BookmarkablePageLink("loadingpanel", LoadingPanelDemo.class));
        add(new BookmarkablePageLink("rating", RatingDemo.class));
        
        add(new BookmarkablePageLink("datasource", DataSourceDemo.class));
        add(new BookmarkablePageLink("input", InputDemos.class));
        add(new BookmarkablePageLink("layout", LayoutDemos.class));
        add(new BookmarkablePageLink("button", Button.class));
        add(new BookmarkablePageLink("progressbar", ProgressBar.class));
        add(new BookmarkablePageLink("calendar", Calendar.class));
        
    }
}
