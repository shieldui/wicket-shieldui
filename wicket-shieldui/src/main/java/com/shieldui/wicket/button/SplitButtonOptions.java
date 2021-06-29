package com.shieldui.wicket.button;

import com.shieldui.wicket.OptionsBase;
import com.shieldui.wicket.datasource.DataSource;
import com.shieldui.wicket.datasource.DataSourceOptions;
import java.util.HashMap;
import org.apache.wicket.ajax.json.JSONFunction;

public class SplitButtonOptions extends OptionsBase
{
    private static final long serialVersionUID = 1L;
    
    // client events
    public enum Event
    {
        CLICK ("click"),
        MENU_CLICK("menuClick");
        
        private final String value;
        
        private Event(String val)
        {
            value = val;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public Boolean checked;
    public Boolean enabled;
    public HashMap<Event, JSONFunction> events = new HashMap<Event, JSONFunction>();
    public String cls;
    public String menu;
    public Object dataSource;
    public Boolean toggle;

    public Boolean getChecked() {
        return checked;
    }

    public SplitButtonOptions setChecked(Boolean checked) {
        this.checked = checked;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public SplitButtonOptions setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public HashMap<Event, JSONFunction> getEvents() {
        return events;
    }

    public SplitButtonOptions setEvents(HashMap<Event, JSONFunction> events) {
        this.events = events;
        return this;
    }

    public String getCls() {
        return cls;
    }

    public SplitButtonOptions setCls(String cls) {
        this.cls = cls;
        return this;
    }

    public Boolean getToggle() {
        return toggle;
    }

    public SplitButtonOptions setToggle(Boolean toggle) {
        this.toggle = toggle;
        return this;
    }
    
    public String getMenu() {
        return menu;
    }

    public SplitButtonOptions setMenu(String menu) {
        this.menu = menu;
        return this;
    }
    
    public SplitButtonOptions setDataSource(DataSourceOptions dataSource) {
        // NOTE: serialize the DS to a hash explicitly in this case
        this.dataSource = dataSource.toHashMap();
        return this;
    }
    
    public SplitButtonOptions setDataSource(JSONFunction dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    
    public SplitButtonOptions setDataSource(DataSource dataSourceObject) {
        this.dataSource = new JSONFunction("window." + dataSourceObject.getJsVariableName());
        return this;
    }
}
