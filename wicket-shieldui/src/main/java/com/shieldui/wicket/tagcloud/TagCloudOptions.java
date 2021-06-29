package com.shieldui.wicket.tagcloud;

import com.shieldui.wicket.OptionsBase;
import com.shieldui.wicket.datasource.DataSource;
import com.shieldui.wicket.datasource.DataSourceOptions;
import java.util.HashMap;
import org.apache.wicket.ajax.json.JSONFunction;


public class TagCloudOptions extends OptionsBase
{
    private static final long serialVersionUID = 1L;
    
    // client events
    public enum Event
    {
        CLICK ("click");
        
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

    public String cls;
    public Object dataSource;
    public HashMap<Event, JSONFunction> events = new HashMap<Event, JSONFunction>();
    public Object frequencyTemplate;
    public Integer height;
    public Object hrefTemplate;
    public Boolean readDataSource;
    public Object targetTemplate;
    public Object textTemplate;
    public String title;
    public Integer width;

    public String getCls() {
        return cls;
    }

    public TagCloudOptions setCls(String cls) {
        this.cls = cls;
        return this;
    }
    
    public Object getDataSource() {
        return dataSource;
    }

    public TagCloudOptions setDataSource(DataSourceOptions dataSource) {
        // NOTE: serialize the DS to a hash explicitly in this case
        this.dataSource = dataSource.toHashMap();
        return this;
    }
    
    public TagCloudOptions setDataSource(JSONFunction dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    
    public TagCloudOptions setDataSource(DataSource dataSourceObject) {
        this.dataSource = new JSONFunction("window." + dataSourceObject.getJsVariableName());
        return this;
    }

    public HashMap<Event, JSONFunction> getEvents() {
        return events;
    }

    public TagCloudOptions setEvents(HashMap<Event, JSONFunction> events) {
        this.events = events;
        return this;
    }

    public Object getFrequencyTemplate() {
        return frequencyTemplate;
    }

    public TagCloudOptions setFrequencyTemplate(String frequencyTemplate) {
        this.frequencyTemplate = frequencyTemplate;
        return this;
    }
    
    public TagCloudOptions setFrequencyTemplate(JSONFunction frequencyTemplate) {
        this.frequencyTemplate = frequencyTemplate;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public TagCloudOptions setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Object getHrefTemplate() {
        return hrefTemplate;
    }

    public TagCloudOptions setHrefTemplate(String hrefTemplate) {
        this.hrefTemplate = hrefTemplate;
        return this;
    }
    
    public TagCloudOptions setHrefTemplate(JSONFunction hrefTemplate) {
        this.hrefTemplate = hrefTemplate;
        return this;
    }

    public Boolean getReadDataSource() {
        return readDataSource;
    }

    public TagCloudOptions setReadDataSource(Boolean readDataSource) {
        this.readDataSource = readDataSource;
        return this;
    }

    public Object getTargetTemplate() {
        return targetTemplate;
    }

    public TagCloudOptions setTargetTemplate(String targetTemplate) {
        this.targetTemplate = targetTemplate;
        return this;
    }
    
    public TagCloudOptions setTargetTemplate(JSONFunction targetTemplate) {
        this.targetTemplate = targetTemplate;
        return this;
    }

    public Object getTextTemplate() {
        return textTemplate;
    }

    public TagCloudOptions setTextTemplate(String textTemplate) {
        this.textTemplate = textTemplate;
        return this;
    }
    
    public TagCloudOptions setTextTemplate(JSONFunction textTemplate) {
        this.textTemplate = textTemplate;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public TagCloudOptions setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public TagCloudOptions setWidth(Integer width) {
        this.width = width;
        return this;
    }
}
