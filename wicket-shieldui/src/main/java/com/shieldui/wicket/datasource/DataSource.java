package com.shieldui.wicket.datasource;

import com.shieldui.wicket.WidgetBehaviorBase;
import java.util.HashMap;
import java.util.UUID;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.json.JsonFunction;

public class DataSource extends WidgetBehaviorBase 
{
    private static final long serialVersionUID = 1L;
    
    private final DataSourceOptions options = new DataSourceOptions();

    private final String jsVariableName;
    
    public DataSource()
    {
        super("", "DataSource", true);
        jsVariableName = generateJsVariableName();
    }
    
    public DataSource(String jsVariableName)
    {
        super("", "DataSource", true);
        this.jsVariableName = jsVariableName;
    }
    
    private String generateJsVariableName()
    {
        return "sui" + UUID.randomUUID().toString().replace("-", "");
    }
    
    public String getJsVariableName()
    {
        return jsVariableName;
    }
    
    @Override
    public DataSourceOptions getOptions()
    {
        return options;
    }

    @Override
    protected String getInitializationJS()
    {
        String javascript = "window." + getJsVariableName() + " = new shield.DataSource(" + getOptions().toJson() + ");";
        
        // add all server events if any
        HashMap<String, JsonFunction> events = getServerEvents();
        if (events.size() > 0) {
            javascript += "window." + getJsVariableName();
            for (String event : events.keySet()) {
                javascript += ".on('" + event + "', " + events.get(event) + ")";
            }
            javascript += ";";
        }
        
        return javascript;
    }
    
    @Override
    public void setVisible(AjaxRequestTarget target, Boolean visible)
    {
        // not supported for DataSource
    }

    @Override
    public void reInitialize(AjaxRequestTarget target)
    {
        // not supported for DataSource
    }
    
    public void read(AjaxRequestTarget target)
    {
        target.appendJavaScript(jsClosure("window." + getJsVariableName() + ".read();"));
    }
}
