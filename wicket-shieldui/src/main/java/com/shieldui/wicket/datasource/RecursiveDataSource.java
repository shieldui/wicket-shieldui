package com.shieldui.wicket.datasource;

import java.util.HashMap;
import org.apache.wicket.ajax.json.JSONFunction;

public class RecursiveDataSource extends DataSource 
{
    private static final long serialVersionUID = 1L;
    
    @Override
    protected String getInitializationJS()
    {
        String javascript = "window." + getJsVariableName() + " = new shield.RecursiveDataSource(" + getOptions().toJson() + ");";
        
        // add all server events if any
        HashMap<String, JSONFunction> events = getServerEvents();
        if (events.size() > 0) {
            javascript += "window." + getJsVariableName();
            for (String event : events.keySet()) {
                javascript += ".on('" + event + "', " + events.get(event) + ")";
            }
            javascript += ";";
        }
        
        return javascript;
    }
}
