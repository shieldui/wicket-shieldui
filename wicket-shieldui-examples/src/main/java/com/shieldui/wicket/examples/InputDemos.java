package com.shieldui.wicket.examples;

import com.shieldui.wicket.autocomplete.AutoComplete;
import com.shieldui.wicket.autocomplete.ChangeEventListener;
import com.shieldui.wicket.datasource.DataSourceOptions;
import java.util.HashMap;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.WebPage;

public class InputDemos extends WebPage
{
    private static final long serialVersionUID = 1L;
    
    public InputDemos()
    {
        // add the menu
        add(new MenuPanel("menu"));
        
        final AutoComplete autoComplete = new AutoComplete("autocomplete");
        add(autoComplete);
        
        autoComplete.getOptions()
                .setMinLength(2)
                .setTextTemplate("[{code}] {name}")
                .setValueTemplate("{code}")
                .setDataSource(new DataSourceOptions()
                    .setData(
                        new HashMap<String, Object>() {{
                            put("code", "AR");
                            put("name", "Argentina");
                        }},
                        new HashMap<String, Object>() {{
                            put("code", "US");
                            put("name", "United States");
                        }},
                        new HashMap<String, Object>() {{
                            put("code", "GB");
                            put("name", "England");
                        }},
                        new HashMap<String, Object>() {{
                            put("code", "CA");
                            put("name", "Canada");
                        }}
                    )
                    .setSort(new DataSourceOptions.SortOption().setPath("code"))
                    .setFilter(new DataSourceOptions.FilterGroup()
                        .setCondition(DataSourceOptions.Condition.AND)
                        .addFilter(new DataSourceOptions.FilterOption().setPath("name").setFilter(DataSourceOptions.Filter.CONTAINS).setValue("")
                    )
                ));
        
        autoComplete.add(new ChangeEventListener() {
            @Override
            protected void handleEvent(AjaxRequestTarget target, Object event) {
                System.out.println("New value: " + ((HashMap<String, Object>) event).get("value"));
            }
        });
    }
}
