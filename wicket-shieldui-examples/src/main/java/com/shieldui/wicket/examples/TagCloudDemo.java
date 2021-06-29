package com.shieldui.wicket.examples;

import com.shieldui.wicket.datasource.ChangeEventListener;
import com.shieldui.wicket.datasource.DataSource;
import com.shieldui.wicket.datasource.DataSourceOptions;
import com.shieldui.wicket.tagcloud.ClickEventListener;
import com.shieldui.wicket.tagcloud.TagCloud;
import java.util.HashMap;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.json.JSONFunction;
import org.apache.wicket.markup.html.WebPage;

public class TagCloudDemo extends WebPage
{
    private static final long serialVersionUID = 1L;
    
    public TagCloudDemo()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        final TagCloud tags = new TagCloud("tags");
        add(tags);
        
        tags.getOptions()
                .setTitle("My Tags")
                .setTextTemplate("{text} ({frequency})")
                .setFrequencyTemplate("{frequency}")
                .setHrefTemplate("{href}")
                .setTargetTemplate("{target}")
                .setDataSource(
                        new DataSourceOptions()
                                .setData(
                                        new HashMap<String, Object>() {{
                                            put("text", "Item1");
                                            put("frequency", 45);
                                        }},
                                        new HashMap<String, Object>() {{
                                            put("text", "Item2");
                                            put("frequency", 45);
                                        }},
                                        new HashMap<String, Object>() {{
                                            put("text", "Item3");
                                            put("frequency", 60);
                                        }},
                                        new HashMap<String, Object>() {{
                                            put("text", "Item4");
                                            put("frequency", 90);
                                        }},
                                        new HashMap<String, Object>() {{
                                            put("text", "Item5");
                                            put("frequency", 45);
                                        }},
                                        new HashMap<String, Object>() {{
                                            put("text", "Item6");
                                            put("frequency", 30);
                                        }},
                                        new HashMap<String, Object>() {{
                                            put("text", "Item12");
                                            put("frequency", 33);
                                            put("href", "http://www.shieldui.com");
                                            put("target", "_blank");
                                        }}
                                )
                );
        
        // add a separate DataSource
        final DataSource ds = new DataSource();
        add(ds);
        
        ds.getOptions().getEvents().put(DataSourceOptions.Event.COMPLETE, new JSONFunction("function() { console.log('ds complete'); }"));
        ds.getOptions().setData(
                new HashMap<String, Object>() {
                    {
                        put("text", "Item1");
                        put("frequency", 45);
                    }
                },
                new HashMap<String, Object>() {
                    {
                        put("text", "Item2");
                        put("frequency", 45);
                    }
                },
                new HashMap<String, Object>() {
                    {
                        put("text", "Item3");
                        put("frequency", 60);
                    }
                },
                new HashMap<String, Object>() {
                    {
                        put("text", "Item4");
                        put("frequency", 90);
                    }
                },
                new HashMap<String, Object>() {
                    {
                        put("text", "Item5");
                        put("frequency", 45);
                    }
                },
                new HashMap<String, Object>() {
                    {
                        put("text", "Item6");
                        put("frequency", 30);
                    }
                },
                new HashMap<String, Object>() {
                    {
                        put("text", "Item12");
                        put("frequency", 33);
                        put("href", "http://www.shieldui.com");
                        put("target", "_blank");
                    }
                }
        );
        ds.getOptions().getFilter().add(
                new DataSourceOptions.FilterGroup().addFilter(
                        new DataSourceOptions.FilterOption()
                                .setPath("frequency")
                                .setFilter(DataSourceOptions.Filter.GREATER_THAN_OR_EQUAL)
                                .setValue(50)
                )
        );
        
        // add a data source server event
        ds.add(new ChangeEventListener() {
            @Override
            protected void handleEvent(AjaxRequestTarget target, Object event) {
                System.err.println("DS CHANGE");
            }
        });
        
        // add a click handler for the tag cloud
        tags.add(new ClickEventListener() {
            @Override
            protected void handleEvent(AjaxRequestTarget target, Object event) {
                System.err.println("TagCloud clicked item: " + ((HashMap<String, Object>)event).get("item"));
                
                // read the separate data source
                ds.read(target);
            }
        });
        
        final TagCloud tags2 = new TagCloud("tags2");
        add(tags2);
        
        tags2.getOptions()
                .setDataSource(ds)
                .setTitle("Second Tag Cloud");
        
        
    }
}
