package com.shieldui.wicket.datasource;

import com.shieldui.wicket.HashMapSerializable;
import com.shieldui.wicket.OptionsBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.apache.wicket.ajax.json.JsonFunction;

public class DataSourceOptions extends OptionsBase
{
    private static final long serialVersionUID = 1L;
    
    // client events
    public enum Event
    {
        CHANGE ("change"),
        COMPLETE ("complete"),
        ERROR ("error"),
        START ("start");
        
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
    
    public enum Filter
    {
        EQUAL ("eq"),
        NOT_EQUAL ("ne"),
        CONTAINS ("contains"),
        NOT_CONTAINS ("notcontains"),
        STARTS_WITH ("startswith"),
        ENDS_WITH ("endswith"),
        GREATER_THAN ("gt"),
        GREATER_THAN_OR_EQUAL ("ge"),
        LESS_THAN ("lt"),
        LESS_THAN_OR_EQUAL ("le"),
        IS_NULL ("isnull"),
        NOT_NULL ("notnull");
        
        private final String value;
        
        private Filter(String val)
        {
            value = val;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public enum Aggregate
    {
        COUNT ("count"),
        MIN ("min"),
        MAX ("max"),
        AVERAGE ("average"),
        SUM ("sum");
        
        private final String value;
        
        private Aggregate(String val)
        {
            value = val;
        }

        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public enum Condition
    {
        AND ("and"),
        OR ("or");
        
        private final String value;
        
        private Condition(String val)
        {
            value = val;
        }

        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public enum Order
    {
        ASC ("asc"),
        DESC ("desc");
        
        private final String value;
        
        private Order(String val)
        {
            value = val;
        }

        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public static final class AggregateOption extends HashMapSerializable
    {        
        public String field;
        public Object aggregate;
        
        public String getField() {
            return field;
        }

        public AggregateOption setField(String field) {
            this.field = field;
            return this;
        }

        public Object getAggregate() {
            return aggregate;
        }

        public AggregateOption setAggregate(Aggregate aggregate) {
            this.aggregate = aggregate;
            return this;
        }
        
        public AggregateOption setAggregate(JsonFunction aggregate) {
            this.aggregate = aggregate;
            return this;
        }
    }
    
    public static final class FilterOption extends HashMapSerializable
    {
        public String path;
        public Filter filter;
        public Object value;

        public String getPath() {
            return path;
        }

        public FilterOption setPath(String path) {
            this.path = path;
            return this;
        }

        public Filter getFilter() {
            return filter;
        }

        public FilterOption setFilter(Filter filter) {
            this.filter = filter;
            return this;
        }

        public Object getValue() {
            return value;
        }

        public FilterOption setValue(Object value) {
            this.value = value;
            return this;
        }
    }
    
    public static final class FilterGroup extends HashMapSerializable
    {
        public Condition condition = Condition.AND;
        public List<Object> filters = new ArrayList<Object>();

        public Condition getCondition() {
            return condition;
        }

        public FilterGroup setCondition(Condition condition) {
            this.condition = condition;
            return this;
        }

        public List<Object> getFilters() {
            return filters;
        }
        
        public FilterGroup addFilter(FilterOption filter) {
            this.filters.add(filter);
            return this;
        }
        
        public FilterGroup addFilterGroup(FilterGroup filterGroup) {
            this.filters.add(filterGroup);
            return this;
        }
        
        @Override
        public HashMap<String, Object> toHashMap()
        {
            HashMap<String, Object> result = new HashMap();
            
            if (filters.size() > 0) {                
                result.put(condition.toString(), filters);
                return result;
            }
            else {
                return null;
            }
        }
    }
    
    public static final class GroupOption extends HashMapSerializable
    {
        public String field;
        public Order order;
        public List<AggregateOption> aggregate = new ArrayList<AggregateOption>();

        public String getField() {
            return field;
        }

        public GroupOption setField(String field) {
            this.field = field;
            return this;
        }

        public Order getOrder() {
            return order;
        }

        public GroupOption setOrder(Order order) {
            this.order = order;
            return this;
        }

        public List<AggregateOption> getAggregate() {
            return aggregate;
        }

        public GroupOption setAggregate(List<AggregateOption> aggregate) {
            this.aggregate = aggregate;
            return this;
        }
        
        public GroupOption setAggregate(AggregateOption ... aggregate) {
            this.aggregate = Arrays.asList(aggregate);
            return this;
        }
    }
    
    public List<AggregateOption> aggregate = new ArrayList<AggregateOption>();
    public Object data;
    public HashMap<Event, JsonFunction> events = new HashMap<Event, JsonFunction>();
    public List<FilterGroup> filter = new ArrayList<FilterGroup>();
    public List<GroupOption> group = new ArrayList<GroupOption>();
    // remote
    // schema
    // skip
    // sort
    // take
    
    public Object getData() {
        return data;
    }

    public DataSourceOptions setData(Object data) {
        this.data = data;
        return this;
    }
    
    public DataSourceOptions setData(List<Object> data) {
        this.data = data;
        return this;
    }
    
    public DataSourceOptions setData(Object ... data) {
        this.data = Arrays.asList(data);
        return this;
    }
    
    public DataSourceOptions setData(JsonFunction data) {
        this.data = data;
        return this;
    }
    
    public List<AggregateOption> getAggregate() {
        return aggregate;
    }

    public DataSourceOptions setAggregate(List<AggregateOption> aggregate) {
        this.aggregate = aggregate;
        return this;
    }
    
    public DataSourceOptions setAggregate(AggregateOption ... aggregate) {
        this.aggregate = Arrays.asList(aggregate);
        return this;
    }
    
    public HashMap<Event, JsonFunction> getEvents() {
        return events;
    }

    public DataSourceOptions setEvents(HashMap<Event, JsonFunction> events) {
        this.events = events;
        return this;
    }

    public List<FilterGroup> getFilter() {
        return filter;
    }

    public DataSourceOptions setFilter(List<FilterGroup> filters) {
        this.filter = filters;
        return this;
    }
    
    public List<GroupOption> getGroup() {
        return group;
    }

    public DataSourceOptions setGroup(List<GroupOption> groups) {
        this.group = groups;
        return this;
    }
    
    public DataSourceOptions setGroup(GroupOption ... groups) {
        this.group = Arrays.asList(groups);
        return this;
    }
}
