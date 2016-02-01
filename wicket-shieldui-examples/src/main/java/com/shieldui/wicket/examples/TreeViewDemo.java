package com.shieldui.wicket.examples;

import com.shieldui.wicket.datasource.DataSourceOptions;
import com.shieldui.wicket.datasource.RecursiveDataSource;
import com.shieldui.wicket.treeview.ChangeEventListener;
import com.shieldui.wicket.treeview.TreeView;
import java.util.HashMap;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.WebPage;

public class TreeViewDemo extends WebPage
{
    private static final long serialVersionUID = 1L;
    
    public TreeViewDemo()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        final TreeView treeview = new TreeView("treeview");
        add(treeview);
        
        treeview.getOptions()
                .setDataSource(new DataSourceOptions()
                                .setData(
                                        new HashMap<String, Object>() {{
                                            put("text", "Item1");
                                            put("expanded", true);
                                            put("items", new Object[] {
                                                new HashMap<String, Object>() {{
                                                    put("text", "Item 1 - 1");
                                                }},
                                                new HashMap<String, Object>() {{
                                                    put("text", "Item 1 - 2");
                                                }}
                                            });
                                        }},
                                        new HashMap<String, Object>() {{
                                            put("text", "Item2");
                                            put("items", new Object[] {
                                                new HashMap<String, Object>() {{
                                                    put("text", "Item 2 1");
                                                }},
                                                new HashMap<String, Object>() {{
                                                    put("text", "Item 2 2");
                                                }}
                                            });
                                        }},
                                        new HashMap<String, Object>() {{
                                            put("text", "Item3");
                                        }},
                                        new HashMap<String, Object>() {{
                                            put("text", "Item4");
                                        }}
                                )
                );
        
        treeview.add(new ChangeEventListener() {
            @Override
            protected void handleEvent(AjaxRequestTarget target, Object event) {
                System.out.println("TreeView selection changed - " + event);
            }
        });
    }
}
