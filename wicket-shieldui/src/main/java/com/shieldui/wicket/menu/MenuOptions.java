package com.shieldui.wicket.menu;

import com.shieldui.wicket.HashMapSerializable;
import com.shieldui.wicket.OptionsBase;
import com.shieldui.wicket.datasource.DataSource;
import com.shieldui.wicket.datasource.DataSourceOptions;
import java.util.HashMap;
import org.apache.wicket.ajax.json.JSONFunction;

public class MenuOptions extends OptionsBase
{
    private static final long serialVersionUID = 1L;
    
    public enum Event
    {
        FOCUS ("focus"),
        BLUR ("blur"),
        EXPAND ("expand"),
        COLLAPSE ("collapse"),
        CLICK ("click"),
        SELECT ("select");
        
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
    
    public enum Orientation
    {
        HORIZONTAL ("horizontal"),
        VERTICAL ("vertical");
        
        private final String value;
        
        private Orientation(String val)
        {
            value = val;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public static final class AnimationOptions extends HashMapSerializable {
        public Boolean enabled;
        public Integer openDelay;
        public Integer closeDelay;

        public Boolean getEnabled() {
            return enabled;
        }

        public AnimationOptions setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Integer getOpenDelay() {
            return openDelay;
        }

        public AnimationOptions setOpenDelay(Integer openDelay) {
            this.openDelay = openDelay;
            return this;
        }

        public Integer getCloseDelay() {
            return closeDelay;
        }

        public AnimationOptions setCloseDelay(Integer closeDelay) {
            this.closeDelay = closeDelay;
            return this;
        }
    }
    
    public String cls;
    public Object width;
    public Object height;
    public Object dataSource;
    public Boolean readDataSource;
    public Orientation orientation;
    public Integer delay;
    public AnimationOptions animation = new AnimationOptions();
    public Object contentTemplate;
    public String overflow;
    public HashMap<Event, JSONFunction> events = new HashMap<Event, JSONFunction>();

    public String getCls() {
        return cls;
    }

    public MenuOptions setCls(String cls) {
        this.cls = cls;
        return this;
    }

    public Object getWidth() {
        return width;
    }

    public MenuOptions setWidth(Integer width) {
        this.width = width;
        return this;
    }
    
    public MenuOptions setWidth(String width) {
        this.width = width;
        return this;
    }

    public Object getHeight() {
        return height;
    }

    public MenuOptions setHeight(Integer height) {
        this.height = height;
        return this;
    }
    
    public MenuOptions setHeight(String height) {
        this.height = height;
        return this;
    }

    public Object getDataSource() {
        return this.dataSource;
    }
    
    public MenuOptions setDataSource(DataSourceOptions dataSource) {
        // NOTE: serialize the DS to a hash explicitly in this case
        this.dataSource = dataSource.toHashMap();
        return this;
    }
    
    public MenuOptions setDataSource(JSONFunction dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    
    public MenuOptions setDataSource(DataSource dataSourceObject) {
        this.dataSource = new JSONFunction("window." + dataSourceObject.getJsVariableName());
        return this;
    }

    public Boolean getReadDataSource() {
        return readDataSource;
    }

    public MenuOptions setReadDataSource(Boolean readDataSource) {
        this.readDataSource = readDataSource;
        return this;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public MenuOptions setOrientation(Orientation orientation) {
        this.orientation = orientation;
        return this;
    }

    public Integer getDelay() {
        return delay;
    }

    public MenuOptions setDelay(Integer delay) {
        this.delay = delay;
        return this;
    }

    public AnimationOptions getAnimation() {
        return animation;
    }

    public MenuOptions setAnimation(AnimationOptions animation) {
        this.animation = animation;
        return this;
    }

    public Object getContentTemplate() {
        return contentTemplate;
    }

    public MenuOptions setContentTemplate(String contentTemplate) {
        this.contentTemplate = contentTemplate;
        return this;
    }
    
    public MenuOptions setContentTemplate(JSONFunction contentTemplate) {
        this.contentTemplate = contentTemplate;
        return this;
    }

    public String getOverflow() {
        return overflow;
    }

    public MenuOptions setOverflow(String overflow) {
        this.overflow = overflow;
        return this;
    }

    public HashMap<Event, JSONFunction> getEvents() {
        return events;
    }

    public MenuOptions setEvents(HashMap<Event, JSONFunction> events) {
        this.events = events;
        return this;
    }
}
