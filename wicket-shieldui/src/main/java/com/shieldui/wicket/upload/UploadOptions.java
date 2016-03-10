package com.shieldui.wicket.upload;

import com.shieldui.wicket.HashMapSerializable;
import com.shieldui.wicket.OptionsBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.apache.wicket.ajax.json.JsonFunction;

public class UploadOptions extends OptionsBase
{
    private static final long serialVersionUID = 1L;
    
    public enum Event
    {
        SELECT ("select"),
        REMOVE ("remove"),
        ERROR ("error"),
        UPLOAD ("upload"),
        PROGRESS ("progress"),
        COMPLETE ("complete"),
        ABORT ("abort");
        
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
    
    public enum RequestMethod
    {
        GET ("GET"),
        POST ("POST"),
        PUT ("POST"),
        DELETE ("DELETE");
        
        private final String value;
        
        private RequestMethod(String val)
        {
            value = val;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public static final class SaveOptions extends HashMapSerializable
    {
        public String url;
        public String field;

        public String getUrl() {
            return url;
        }

        public SaveOptions setUrl(String url) {
            this.url = url;
            return this;
        }

        public String getField() {
            return field;
        }

        public SaveOptions setField(String field) {
            this.field = field;
            return this;
        }
    }
    
    public static final class RemoveOptions extends HashMapSerializable
    {
        public String url;
        public String field;
        public RequestMethod method;

        public String getUrl() {
            return url;
        }

        public RemoveOptions setUrl(String url) {
            this.url = url;
            return this;
        }

        public String getField() {
            return field;
        }

        public RemoveOptions setField(String field) {
            this.field = field;
            return this;
        }

        public RequestMethod getMethod() {
            return method;
        }

        public RemoveOptions setMethod(RequestMethod method) {
            this.method = method;
            return this;
        }
    }
    
    public static final class AsyncOptions extends HashMapSerializable
    {
        public Boolean enabled;
        public Boolean autoUpload;
        public Boolean batch;
        public SaveOptions save = new SaveOptions();
        public RemoveOptions remove = new RemoveOptions();

        public Boolean getEnabled() {
            return enabled;
        }

        public AsyncOptions setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Boolean getAutoUpload() {
            return autoUpload;
        }

        public AsyncOptions setAutoUpload(Boolean autoUpload) {
            this.autoUpload = autoUpload;
            return this;
        }

        public Boolean getBatch() {
            return batch;
        }

        public AsyncOptions setBatch(Boolean batch) {
            this.batch = batch;
            return this;
        }

        public SaveOptions getSave() {
            return save;
        }

        public AsyncOptions setSave(SaveOptions save) {
            this.save = save;
            return this;
        }

        public RemoveOptions getRemove() {
            return remove;
        }

        public AsyncOptions setRemove(RemoveOptions remove) {
            this.remove = remove;
            return this;
        }
    }
    
    public static final class Files extends HashMapSerializable
    {
        public Boolean enabled;
        public List<HashMap<String, Object>> initial = new ArrayList<HashMap<String, Object>>();
        public Object template;

        public Boolean getEnabled() {
            return enabled;
        }

        public Files setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public List<HashMap<String, Object>> getInitial() {
            return initial;
        }

        public Files setInitial(List<HashMap<String, Object>> initial) {
            this.initial = initial;
            return this;
        }
        
        public Files setInitial(HashMap<String, Object> ... initial) {
            this.initial = Arrays.asList(initial);
            return this;
        }
        
        public Files addInitial(HashMap<String, Object> initial) {
            this.initial.add(initial);
            return this;
        }

        public Object getTemplate() {
            return template;
        }

        public Files setTemplate(String template) {
            this.template = template;
            return this;
        }
        
        public Files setTemplate(JsonFunction template) {
            this.template = template;
            return this;
        }
    }
    
    public static final class Messages extends HashMapSerializable
    {
        public String drop;
        public String select;
        public String upload;

        public String getDrop() {
            return drop;
        }

        public Messages setDrop(String drop) {
            this.drop = drop;
            return this;
        }

        public String getSelect() {
            return select;
        }

        public Messages setSelect(String select) {
            this.select = select;
            return this;
        }

        public String getUpload() {
            return upload;
        }

        public Messages setUpload(String upload) {
            this.upload = upload;
            return this;
        }
    }
    
    public String cls;
    public Boolean enabled;
    public AsyncOptions async = new AsyncOptions();
    public Boolean multiple;
    public Files files = new Files();
    public Messages messages = new Messages();
    public HashMap<Event, JsonFunction> events = new HashMap<Event, JsonFunction>();

    public String getCls() {
        return cls;
    }

    public UploadOptions setCls(String cls) {
        this.cls = cls;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public UploadOptions setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public AsyncOptions getAsync() {
        return async;
    }

    public UploadOptions setAsync(AsyncOptions async) {
        this.async = async;
        return this;
    }

    public Boolean getMultiple() {
        return multiple;
    }

    public UploadOptions setMultiple(Boolean multiple) {
        this.multiple = multiple;
        return this;
    }

    public Files getFiles() {
        return files;
    }

    public UploadOptions setFiles(Files files) {
        this.files = files;
        return this;
    }

    public Messages getMessages() {
        return messages;
    }

    public UploadOptions setMessages(Messages messages) {
        this.messages = messages;
        return this;
    }

    public HashMap<Event, JsonFunction> getEvents() {
        return events;
    }

    public UploadOptions setEvents(HashMap<Event, JsonFunction> events) {
        this.events = events;
        return this;
    }
}
