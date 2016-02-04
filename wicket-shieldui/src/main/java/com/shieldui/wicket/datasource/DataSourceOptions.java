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
    
    public enum Operation
    {
        AGGREGATE ("aggregate"),
        FILTER ("filter"),
        GROUP ("group"),
        SKIP ("skip"),
        SORT ("sort"),
        TAKE ("take");
        
        private final String value;
        
        private Operation(String val)
        {
            value = val;
        }

        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public enum SchemaType
    {
        JSON ("json"),
        XML ("xml"),
        TABLE ("table"),
        SELECT ("select");
        
        private final String value;
        
        private SchemaType(String val)
        {
            value = val;
        }

        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public enum SchemaFieldType
    {
        NUMBER ("Number"),
        STRING ("String"),
        DATE ("Date"),
        BOOLEAN ("Boolean");
        
        private final String value;
        
        private SchemaFieldType(String val)
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
    
    public static final class Remote extends HashMapSerializable
    {
        public static final class Modify extends HashMapSerializable
        {
            public Object create;
            public Object remove;
            public Object update;

            public Object getCreate() {
                return create;
            }

            public Modify setCreate(String create) {
                this.create = create;
                return this;
            }
            
            public Modify setCreate(HashMap<String, Object> create) {
                this.create = create;
                return this;
            }
            
            public Modify setCreate(JsonFunction create) {
                this.create = create;
                return this;
            }

            public Object getRemove() {
                return remove;
            }

            public Modify setRemove(Object remove) {
                this.remove = remove;
                return this;
            }
            
            public Modify setRemove(HashMap<String, Object> remove) {
                this.remove = remove;
                return this;
            }
            
            public Modify setRemove(JsonFunction remove) {
                this.remove = remove;
                return this;
            }

            public Object getUpdate() {
                return update;
            }

            public Modify setUpdate(Object update) {
                this.update = update;
                return this;
            }
            
            public Modify setUpdate(HashMap<String, Object> update) {
                this.update = update;
                return this;
            }
            
            public Modify setUpdate(JsonFunction update) {
                this.update = update;
                return this;
            }
        }
        
        public Object modify;
        public List<Operation> operations = new ArrayList<Operation>();
        public Object read;
        
        public Object getModify() {
            return modify;
        }

        public Remote setModify(Modify modify) {
            this.modify = modify;
            return this;
        }
        
        public Remote setModify(JsonFunction modify) {
            this.modify = modify;
            return this;
        }
        
        public List<Operation> getOperations() {
            return operations;
        }

        public Remote setOperations(List<Operation> operations) {
            this.operations = operations;
            return this;
        }
        
        public Remote setOperations(Operation ... operations) {
            this.operations = Arrays.asList(operations);
            return this;
        }

        public Object getRead() {
            return read;
        }

        public Remote setRead(String read) {
            this.read = read;
            return this;
        }
        
        public Remote setRead(HashMap<String, Object> read) {
            this.read = read;
            return this;
        }
        
        public Remote setRead(JsonFunction read) {
            this.read = read;
            return this;
        }
    }
    
    public static final class Schema extends HashMapSerializable
    {
        public static final class SchemaField extends HashMapSerializable
        {
            public Object path;
            public JsonFunction type;
            public Boolean nullable;

            public Object getPath() {
                return path;
            }

            public SchemaField setPath(String path) {
                this.path = path;
                return this;
            }
            
            public SchemaField setPath(JsonFunction path) {
                this.path = path;
                return this;
            }

            public JsonFunction getType() {
                return type;
            }

            public SchemaField setType(SchemaFieldType type) {
                this.type = new JsonFunction(type.toString());
                return this;
            }

            public Boolean getNullable() {
                return nullable;
            }

            public SchemaField setNullable(Boolean nullable) {
                this.nullable = nullable;
                return this;
            }
        }
        
        public Object aggregates;
        public Object data;
        public List<SchemaField> fields = new ArrayList<SchemaField>();
        public Object groups;
        public JsonFunction parse;
        public Object total;
        public SchemaType type;

        public Object getAggregates() {
            return aggregates;
        }

        public Schema setAggregates(String aggregates) {
            this.aggregates = aggregates;
            return this;
        }
        
        public Schema setAggregates(JsonFunction aggregates) {
            this.aggregates = aggregates;
            return this;
        }

        public Object getData() {
            return data;
        }

        public Schema setData(String data) {
            this.data = data;
            return this;
        }
        
        public Schema setData(JsonFunction data) {
            this.data = data;
            return this;
        }

        public List<SchemaField> getFields() {
            return fields;
        }

        public Schema setFields(List<SchemaField> fields) {
            this.fields = fields;
            return this;
        }
        
        public Schema setFields(SchemaField fields) {
            this.fields = Arrays.asList(fields);
            return this;
        }

        public Object getGroups() {
            return groups;
        }

        public Schema setGroups(String groups) {
            this.groups = groups;
            return this;
        }
        
        public Schema setGroups(JsonFunction groups) {
            this.groups = groups;
            return this;
        }

        public JsonFunction getParse() {
            return parse;
        }

        public Schema setParse(JsonFunction parse) {
            this.parse = parse;
            return this;
        }

        public Object getTotal() {
            return total;
        }

        public Schema setTotal(String total) {
            this.total = total;
            return this;
        }
        
        public Schema setTotal(JsonFunction total) {
            this.total = total;
            return this;
        }
        
        public SchemaType getType() {
            return type;
        }

        public Schema setType(SchemaType type) {
            this.type = type;
            return this;
        }
    }
    
    public static final class SortOption extends HashMapSerializable
    {
        public String path;
        public Boolean desc;

        public String getPath() {
            return path;
        }

        public SortOption setPath(String path) {
            this.path = path;
            return this;
        }

        public Boolean getDesc() {
            return desc;
        }

        public SortOption setDesc(Boolean desc) {
            this.desc = desc;
            return this;
        }
    }
    
    public List<AggregateOption> aggregate = new ArrayList<AggregateOption>();
    public Object data;
    public HashMap<Event, JsonFunction> events = new HashMap<Event, JsonFunction>();
    public List<FilterGroup> filter = new ArrayList<FilterGroup>();
    public List<GroupOption> group = new ArrayList<GroupOption>();
    public Remote remote;
    public Schema schema;
    public Integer skip;
    public Object sort;
    public Integer take;
    
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
    
    public DataSourceOptions setFilter(FilterGroup... filters) {
        this.filter = Arrays.asList(filters);
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
    
    public Remote getRemote() {
        return remote;
    }

    public DataSourceOptions setRemote(Remote remote) {
        this.remote = remote;
        return this;
    }
    
    public Schema getSchema() {
        return schema;
    }

    public DataSourceOptions setSchema(Schema schema) {
        this.schema = schema;
        return this;
    }

    public Integer getSkip() {
        return skip;
    }

    public DataSourceOptions setSkip(Integer skip) {
        this.skip = skip;
        return this;
    }

    public Object getSort() {
        return sort;
    }

    public DataSourceOptions setSort(List<SortOption> sort) {
        this.sort = sort;
        return this;
    }
    
    public DataSourceOptions setSort(SortOption ... sort) {
        this.sort = Arrays.asList(sort);
        return this;
    }
    
    public DataSourceOptions setSort(JsonFunction sort) {
        this.sort = sort;
        return this;
    }

    public Integer getTake() {
        return take;
    }

    public DataSourceOptions setTake(Integer take) {
        this.take = take;
        return this;
    }
}
