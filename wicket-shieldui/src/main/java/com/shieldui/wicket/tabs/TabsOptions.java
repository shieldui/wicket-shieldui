package com.shieldui.wicket.tabs;

import com.shieldui.wicket.HashMapSerializable;
import com.shieldui.wicket.OptionsBase;
import com.shieldui.wicket.datasource.DataSource;
import com.shieldui.wicket.datasource.DataSourceOptions;
import java.util.HashMap;
import org.apache.wicket.ajax.json.JSONFunction;

public class TabsOptions extends OptionsBase
{
    private static final long serialVersionUID = 1L;
    
    // client events
    public enum Event
    {
        SELECT ("select"),
        ACTIVATE ("activate"),
        LOAD ("load");    
        
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
    
    public enum Position
    {
        TOP ("top"),
        LEFT ("left"),
        RIGHT ("right"),
        BOTTOM ("bottom");    
        
        private final String value;
        
        private Position(String val)
        {
            value = val;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public enum Trigger
    {
        CLICK ("click"),
        MOUSEENTER ("mouseenter");
        
        private final String value;
        
        private Trigger(String val)
        {
            value = val;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public static final class Animation extends HashMapSerializable
    {
        public Boolean enabled;
        public Integer activateDuration;
        public Integer deactivateDuration;

        public Boolean getEnabled() {
            return enabled;
        }

        public Animation setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Integer getActivateDuration() {
            return activateDuration;
        }

        public Animation setActivateDuration(Integer activateDuration) {
            this.activateDuration = activateDuration;
            return this;
        }

        public Integer getDeactivateDuration() {
            return deactivateDuration;
        }

        public Animation setDeactivateDuration(Integer deactivateDuration) {
            this.deactivateDuration = deactivateDuration;
            return this;
        }
    }
    
    public String cls;
    public Object active;
    public Boolean collapsible;
    public Animation animation = new Animation();
    public Object titleTemplate;
    public Object titleClsTemplate;
    public Object itemClsTemplate;
    public Object hrefTemplate;
    public Object contentTemplate;
    public Object disabledTemplate;
    public Object iconUrlTemplate;
    public Object iconClsTemplate;
    public Position position;
    public Object dataSource;
    public Boolean readDataSource;
    public Trigger trigger;
    public HashMap<Event, JSONFunction> events = new HashMap<Event, JSONFunction>();

    public String getCls() {
        return cls;
    }

    public TabsOptions setCls(String cls) {
        this.cls = cls;
        return this;
    }

    public Object getActive() {
        return active;
    }

    public TabsOptions setActive(Object active) {
        this.active = active;
        return this;
    }

    public Boolean getCollapsible() {
        return collapsible;
    }

    public TabsOptions setCollapsible(Boolean collapsible) {
        this.collapsible = collapsible;
        return this;
    }

    public Animation getAnimation() {
        return animation;
    }

    public TabsOptions setAnimation(Animation animation) {
        this.animation = animation;
        return this;
    }

    public Object getTitleTemplate() {
        return titleTemplate;
    }

    public TabsOptions setTitleTemplate(String titleTemplate) {
        this.titleTemplate = titleTemplate;
        return this;
    }
    
    public TabsOptions setTitleTemplate(JSONFunction titleTemplate) {
        this.titleTemplate = titleTemplate;
        return this;
    }

    public Object getTitleClsTemplate() {
        return titleClsTemplate;
    }

    public TabsOptions setTitleClsTemplate(String titleClsTemplate) {
        this.titleClsTemplate = titleClsTemplate;
        return this;
    }
    
    public TabsOptions setTitleClsTemplate(JSONFunction titleClsTemplate) {
        this.titleClsTemplate = titleClsTemplate;
        return this;
    }

    public Object getItemClsTemplate() {
        return itemClsTemplate;
    }

    public TabsOptions setItemClsTemplate(String itemClsTemplate) {
        this.itemClsTemplate = itemClsTemplate;
        return this;
    }
    
    public TabsOptions setItemClsTemplate(JSONFunction itemClsTemplate) {
        this.itemClsTemplate = itemClsTemplate;
        return this;
    }

    public Object getHrefTemplate() {
        return hrefTemplate;
    }

    public TabsOptions setHrefTemplate(String hrefTemplate) {
        this.hrefTemplate = hrefTemplate;
        return this;
    }
    
    public TabsOptions setHrefTemplate(JSONFunction hrefTemplate) {
        this.hrefTemplate = hrefTemplate;
        return this;
    }

    public Object getContentTemplate() {
        return contentTemplate;
    }

    public TabsOptions setContentTemplate(String contentTemplate) {
        this.contentTemplate = contentTemplate;
        return this;
    }
    
    public TabsOptions setContentTemplate(JSONFunction contentTemplate) {
        this.contentTemplate = contentTemplate;
        return this;
    }

    public Object getDisabledTemplate() {
        return disabledTemplate;
    }

    public TabsOptions setDisabledTemplate(String disabledTemplate) {
        this.disabledTemplate = disabledTemplate;
        return this;
    }
    
    public TabsOptions setDisabledTemplate(JSONFunction disabledTemplate) {
        this.disabledTemplate = disabledTemplate;
        return this;
    }

    public Object getIconUrlTemplate() {
        return iconUrlTemplate;
    }

    public TabsOptions setIconUrlTemplate(String iconUrlTemplate) {
        this.iconUrlTemplate = iconUrlTemplate;
        return this;
    }
    
    public TabsOptions setIconUrlTemplate(JSONFunction iconUrlTemplate) {
        this.iconUrlTemplate = iconUrlTemplate;
        return this;
    }

    public Object getIconClsTemplate() {
        return iconClsTemplate;
    }

    public TabsOptions setIconClsTemplate(String iconClsTemplate) {
        this.iconClsTemplate = iconClsTemplate;
        return this;
    }
    
    public TabsOptions setIconClsTemplate(JSONFunction iconClsTemplate) {
        this.iconClsTemplate = iconClsTemplate;
        return this;
    }

    public Position getPosition() {
        return position;
    }

    public TabsOptions setPosition(Position position) {
        this.position = position;
        return this;
    }

    public Object getDataSource() {
        return dataSource;
    }

    public TabsOptions setDataSource(DataSourceOptions dataSource) {
        // NOTE: serialize the DS to a hash explicitly in this case
        this.dataSource = dataSource.toHashMap();
        return this;
    }
    
    public TabsOptions setDataSource(JSONFunction dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    
    public TabsOptions setDataSource(DataSource dataSourceObject) {
        this.dataSource = new JSONFunction("window." + dataSourceObject.getJsVariableName());
        return this;
    }

    public Boolean getReadDataSource() {
        return readDataSource;
    }

    public TabsOptions setReadDataSource(Boolean readDataSource) {
        this.readDataSource = readDataSource;
        return this;
    }

    public Trigger getTrigger() {
        return trigger;
    }

    public TabsOptions setTrigger(Trigger trigger) {
        this.trigger = trigger;
        return this;
    }

    public HashMap<Event, JSONFunction> getEvents() {
        return events;
    }

    public TabsOptions setEvents(HashMap<Event, JSONFunction> events) {
        this.events = events;
        return this;
    }
}
