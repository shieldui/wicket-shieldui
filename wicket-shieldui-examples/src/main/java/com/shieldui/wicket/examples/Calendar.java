package com.shieldui.wicket.examples;

import com.shieldui.wicket.calendar.ChangeEventListener;
import java.util.Date;
import java.util.HashMap;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.WebPage;

public class Calendar extends WebPage
{
    private static final long serialVersionUID = 1L;
    
    public Calendar()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        final com.shieldui.wicket.calendar.Calendar calendar = new com.shieldui.wicket.calendar.Calendar("calendar");
        add(calendar);
        
        java.util.Calendar min = java.util.Calendar.getInstance();
        min.set(2000, 1, 1);
        
        java.util.Calendar max = java.util.Calendar.getInstance();
        max.set(2039, 3, 1);
        
        calendar.getOptions()
                .setMin(min)
                .setMax(max)
                .setValue(new Date())
                .getFooter()
                    .setEnabled(true)
                    .setFooterTemplate("{0:dd.MM.yy}");        
        calendar.add(new ChangeEventListener() {
            @Override
            protected void handleEvent(AjaxRequestTarget target, Object event) {
                target.prependJavaScript("alert(\"Value is: " + ((HashMap<String, Boolean>)event).get("value") + "\");");
            }
        });
    }
}
