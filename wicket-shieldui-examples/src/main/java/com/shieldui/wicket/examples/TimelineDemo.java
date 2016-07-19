package com.shieldui.wicket.examples;

import com.shieldui.wicket.datasource.DataSourceOptions;
import com.shieldui.wicket.timeline.Timeline;
import com.shieldui.wicket.timeline.TimelineOptions;
import java.util.HashMap;
import org.apache.wicket.markup.html.WebPage;

public class TimelineDemo extends WebPage
{
    private static final long serialVersionUID = 1L;
    
    public TimelineDemo()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        final Timeline timeline = new Timeline("timeline");
        add(timeline);
        
        timeline.getOptions()
                .setLayout(TimelineOptions.Layout.CENTERED)
                .setCollapsible(true)
                .setDataSource(new DataSourceOptions()
                        .setData(
                                new HashMap<String, Object>() {{
                                    put("title", "Event 1");
                                    put("text", "Body for event 1.<br />Line two...");
                                }},
                                new HashMap<String, Object>() {{
                                    put("title", "Event 2");
                                    put("text", "Body for event 2");
                                    put("collapsed", true);
                                }},
                                new HashMap<String, Object>() {{
                                    put("title", "Event 3");
                                }},
                                new HashMap<String, Object>() {{
                                    put("title", "Event 4");
                                    put("text", "Body for event 4");
                                }}
                        )
                );
    }
}
