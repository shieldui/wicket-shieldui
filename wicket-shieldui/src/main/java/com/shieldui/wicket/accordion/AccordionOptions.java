package com.shieldui.wicket.accordion;

import com.shieldui.wicket.HashMapSerializable;
import com.shieldui.wicket.OptionsBase;
import com.shieldui.wicket.datasource.DataSource;
import com.shieldui.wicket.datasource.DataSourceOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.apache.wicket.ajax.json.JsonFunction;

public class AccordionOptions extends OptionsBase
{
    private static final long serialVersionUID = 1L;
    
    // client events
    public enum Event
    {
        FOCUS ("focus"),
        BLUR ("blur"),
        COLLAPSE ("collapse"),
        EXPAND ("expand");        
        
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
    
    public enum Mode
    {
        SINGLE ("single"),
        MULTIPLE ("multiple");        
        
        private final String value;
        
        private Mode(String val)
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
        public Integer duration;
        public Boolean enabled;

        public Integer getDuration() {
            return duration;
        }

        public Animation setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }

        public Boolean getEnabled() {
            return enabled;
        }

        public Animation setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
    }
    
    public Animation animatino = new Animation();
    public String cls;
    public Object contentTemplate;
    public Object dataSource;
    public Boolean enabled;
    public HashMap<Event, JsonFunction> events = new HashMap<Event, JsonFunction>();
    public List<Integer> expanded = new ArrayList<Integer>();
    public Integer height;
    public Integer maxHeight;
    public Mode mode;
    public Object titleTemplate;
    public Integer width;

    public Animation getAnimatino() {
        return animatino;
    }

    public AccordionOptions setAnimatino(Animation animatino) {
        this.animatino = animatino;
        return this;
    }

    public String getCls() {
        return cls;
    }

    public AccordionOptions setCls(String cls) {
        this.cls = cls;
        return this;
    }

    public Object getContentTemplate() {
        return contentTemplate;
    }

    public AccordionOptions setContentTemplate(String contentTemplate) {
        this.contentTemplate = contentTemplate;
        return this;
    }
    
    public AccordionOptions setContentTemplate(JsonFunction contentTemplate) {
        this.contentTemplate = contentTemplate;
        return this;
    }

    public Object getDataSource() {
        return dataSource;
    }

    public AccordionOptions setDataSource(DataSourceOptions dataSource) {
        // NOTE: serialize the DS to a hash explicitly in this case
        this.dataSource = dataSource.toHashMap();
        return this;
    }
    
    public AccordionOptions setDataSource(JsonFunction dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    
    public AccordionOptions setDataSource(DataSource dataSourceObject) {
        this.dataSource = new JsonFunction("window." + dataSourceObject.getJsVariableName());
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public AccordionOptions setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public HashMap<Event, JsonFunction> getEvents() {
        return events;
    }

    public AccordionOptions setEvents(HashMap<Event, JsonFunction> events) {
        this.events = events;
        return this;
    }

    public List<Integer> getExpanded() {
        return expanded;
    }

    public AccordionOptions setExpanded(List<Integer> expanded) {
        this.expanded = expanded;
        return this;
    }
    
    public AccordionOptions setExpanded(Integer... expanded) {
        this.expanded = Arrays.asList(expanded);
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public AccordionOptions setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Integer getMaxHeight() {
        return maxHeight;
    }

    public AccordionOptions setMaxHeight(Integer maxHeight) {
        this.maxHeight = maxHeight;
        return this;
    }

    public Mode getMode() {
        return mode;
    }

    public AccordionOptions setMode(Mode mode) {
        this.mode = mode;
        return this;
    }

    public Object getTitleTemplate() {
        return titleTemplate;
    }

    public AccordionOptions setTitleTemplate(String titleTemplate) {
        this.titleTemplate = titleTemplate;
        return this;
    }
    
    public AccordionOptions setTitleTemplate(JsonFunction titleTemplate) {
        this.titleTemplate = titleTemplate;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public AccordionOptions setWidth(Integer width) {
        this.width = width;
        return this;
    }
}
