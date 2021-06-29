package com.shieldui.wicket.examples;

import com.shieldui.wicket.accordion.Accordion;
import com.shieldui.wicket.accordion.AccordionOptions;
import com.shieldui.wicket.datasource.DataSourceOptions;
import com.shieldui.wicket.tabs.Tabs;
import com.shieldui.wicket.tabs.TabsOptions;
import java.util.HashMap;
import org.apache.wicket.ajax.json.JSONFunction;
import org.apache.wicket.markup.html.WebPage;

public class LayoutDemos extends WebPage
{
    private static final long serialVersionUID = 1L;
    
    public LayoutDemos()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        final Accordion accordion = new Accordion("accordion");
        add(accordion);
        
        accordion.getOptions()
                .setMode(AccordionOptions.Mode.MULTIPLE)
                .setEvents(new HashMap<AccordionOptions.Event, JSONFunction>() {{
                    put(AccordionOptions.Event.EXPAND, new JSONFunction("function() { console.log('expand'); }"));
                    put(AccordionOptions.Event.COLLAPSE, new JSONFunction("function() { console.log('collapse'); }"));
                }})
                .setDataSource(new DataSourceOptions()
                        .setData(
                                new HashMap() {{
                                    put("title", "Perl");
                                    put("content", "A very good programming language");
                                }},
                                new HashMap() {{
                                    put("title", "C++");
                                    put("content", "Fast and strong");
                                }},
                                new HashMap() {{
                                    put("title", "JAVA");
                                    put("content", "Good stuff");
                                }},
                                new HashMap() {{
                                    put("title", "PHP");
                                    put("content", "Rapid development");
                                }}
                        ));
        
        
        final Tabs tabs = new Tabs("tabs");
        add(tabs);
        
        tabs.getOptions()
                .setEvents(new HashMap<TabsOptions.Event, JSONFunction>() {{
                    put(TabsOptions.Event.ACTIVATE, new JSONFunction("function(e) { console.log('activated tab ' + e.index); }"));
                }});
        
    }
}
