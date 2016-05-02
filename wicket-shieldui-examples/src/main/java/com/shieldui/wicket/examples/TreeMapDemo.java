package com.shieldui.wicket.examples;

import com.shieldui.wicket.datasource.DataSourceOptions;
import com.shieldui.wicket.treemap.ClickEventListener;
import com.shieldui.wicket.treemap.TreeMap;
import com.shieldui.wicket.treemap.TreeMapOptions;
import java.util.HashMap;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.json.JsonFunction;
import org.apache.wicket.markup.html.WebPage;

public class TreeMapDemo extends WebPage
{
    private static final long serialVersionUID = 1L;
    
    public TreeMapDemo()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        final TreeMap treemap = new TreeMap("treemap");
        add(treemap);
        
        treemap.getOptions()
                .setTitle("A sample treemap")
                .setType(TreeMapOptions.Type.SQUARIFIED)
                .setValueTemplate("{frequency}")
                .setTextTemplate(new JsonFunction("function(item) { return item.text; }"))
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
        
        treemap.add(new ClickEventListener() {
            @Override
            protected void handleEvent(AjaxRequestTarget target, Object event) {
                System.err.println("TreeMap clicked item: " + ((HashMap<String, Object>)event).get("item"));
            }
        });
    }
}
