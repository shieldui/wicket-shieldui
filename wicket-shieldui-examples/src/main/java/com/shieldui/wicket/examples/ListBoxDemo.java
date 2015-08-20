package com.shieldui.wicket.examples;

import com.shieldui.wicket.datasource.DataSourceOptions;
import com.shieldui.wicket.listbox.ListBoxOptions;
import com.shieldui.wicket.listbox.ListBox;
import java.util.HashMap;
import org.apache.wicket.ajax.json.JsonFunction;
import org.apache.wicket.markup.html.WebPage;

public class ListBoxDemo extends WebPage {
    private static final long serialVersionUID = 1L;
    
    public ListBoxDemo()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        final ListBox listbox = new ListBox("listbox");
        add(listbox);
        
        listbox.getOptions()
               .setWidth(400)
               .setHeight(300)
               .setSelected(1)
               .setMultiple(false)
               .setTextTemplate(new JsonFunction("function(item) { return item.name; }"))
               .setDataSource(
                        new DataSourceOptions()
                                .setData(
                                        new HashMap<String, Object>() {{
                                            put("name", "Afghanistan");
                                            put("code", "AF");
                                        }},
                                        new HashMap<String, Object>() {{
                                            put("name", "Albania");
                                            put("code", "AL");
                                        }},
                                        new HashMap<String, Object>() {{
                                            put("name", "Algeria");
                                            put("code", "DZ");
                                        }},
                                        new HashMap<String, Object>() {{
                                            put("name", "American Samoa");
                                            put("code", "AS");
                                        }},
                                        new HashMap<String, Object>() {{
                                            put("name", "Andorra");
                                            put("code", "AD");
                                        }},
                                        new HashMap<String, Object>() {{
                                            put("name", "Angola");
                                            put("code", "AO");
                                        }},
                                        new HashMap<String, Object>() {{
                                            put("name", "Anguilla");
                                            put("code", "AI");
                                        }}
                                )
                );
    }
}
