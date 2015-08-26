package com.shieldui.wicket.window;

import com.shieldui.wicket.HashMapSerializable;
import com.shieldui.wicket.OptionsBase;
import org.apache.wicket.ajax.json.JsonFunction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WindowOptions extends OptionsBase {
    private static final long serialVersionUID = 1L;
    
    // client events
    public enum Event
    {
        MINIMIZE ("minimize"),
        MAXIMIZE ("maximize"),
        CLOSE ("close"),
        PIN ("pin");
        
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
    
    public static final class ContentOptions extends HashMapSerializable {
        public static final class TemplateOptions extends HashMapSerializable {
            public String body;
            public Object data;
            public String dataUrl;

            public String getBody() {
                return body;
            }

            public TemplateOptions setBody(String body) {
                this.body = body;
                return this;
            }

            public Object getData() {
                return data;
            }

            public TemplateOptions setData(Object data) {
                this.data = data;
                return this;
            }

            public String getDataUrl() {
                return dataUrl;
            }

            public TemplateOptions setDataUrl(String dataUrl) {
                this.dataUrl = dataUrl;
                return this;
            }
        }
        public static final class RemoteOptions extends HashMapSerializable {
            public String url;
            public Boolean iframe;

            public String getUrl() {
                return url;
            }

            public RemoteOptions setUrl(String url) {
                this.url = url;
                return this;
            }

            public Boolean getIframe() {
                return iframe;
            }

            public RemoteOptions setIframe(Boolean iframe) {
                this.iframe = iframe;
                return this;
            }
        }
        
        public TemplateOptions template;
        public RemoteOptions remote;

        public TemplateOptions getTemplate() {
            return template;
        }

        public ContentOptions setTemplate(TemplateOptions template) {
            this.template = template;
            return this;
        }

        public RemoteOptions getRemote() {
            return remote;
        }

        public ContentOptions setRemote(RemoteOptions remote) {
            this.remote = remote;
            return this;
        }
    }
    
    public static final class ResizableOptions extends HashMapSerializable {
        public Integer minWidth;
        public Integer minHeight;
        public Integer maxWidth;
        public Integer maxHeight;

        public Integer getMinWidth() {
            return minWidth;
        }

        public ResizableOptions setMinWidth(Integer minWidth) {
            this.minWidth = minWidth;
            return this;
        }

        public Integer getMinHeight() {
            return minHeight;
        }

        public ResizableOptions setMinHeight(Integer minHeight) {
            this.minHeight = minHeight;
            return this;
        }

        public Integer getMaxWidth() {
            return maxWidth;
        }

        public ResizableOptions setMaxWidth(Integer maxWidth) {
            this.maxWidth = maxWidth;
            return this;
        }

        public Integer getMaxHeight() {
            return maxHeight;
        }

        public ResizableOptions setMaxHeight(Integer maxHeight) {
            this.maxHeight = maxHeight;
            return this;
        }
    }
    
    public static final class PositionOptions extends HashMapSerializable {
        public Integer left;
        public Integer top;

        public Integer getLeft() {
            return left;
        }

        public PositionOptions setLeft(Integer left) {
            this.left = left;
            return this;
        }

        public Integer getTop() {
            return top;
        }

        public PositionOptions setTop(Integer top) {
            this.top = top;
            return this;
        }
    }
    
    public String cls;
    public String title;
    public List<String> titleBarButtons = new ArrayList<String>();
    public Boolean visible;
    public Boolean pinned;
    public Boolean modal;
    public Integer width;
    public Integer height;
    public Boolean draggable;
    public Boolean appendToBody;
    public ContentOptions content;
    public ResizableOptions resizable;
    public PositionOptions position;
    public HashMap<Event, JsonFunction> events = new HashMap<Event, JsonFunction>();

    public String getCls() {
        return cls;
    }

    public WindowOptions setCls(String cls) {
        this.cls = cls;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public WindowOptions setTitle(String title) {
        this.title = title;
        return this;
    }

    public List<String> getTitleBarButtons() {
        return titleBarButtons;
    }

    public WindowOptions setTitleBarButtons(List<String> titleBarButtons) {
        this.titleBarButtons = titleBarButtons;
        return this;
    }

    public Boolean getVisible() {
        return visible;
    }

    public WindowOptions setVisible(Boolean visible) {
        this.visible = visible;
        return this;
    }

    public Boolean getPinned() {
        return pinned;
    }

    public WindowOptions setPinned(Boolean pinned) {
        this.pinned = pinned;
        return this;
    }

    public Boolean getModal() {
        return modal;
    }

    public WindowOptions setModal(Boolean modal) {
        this.modal = modal;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public WindowOptions setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public WindowOptions setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Boolean getDraggable() {
        return draggable;
    }

    public WindowOptions setDraggable(Boolean draggable) {
        this.draggable = draggable;
        return this;
    }

    public Boolean getAppendToBody() {
        return appendToBody;
    }

    public WindowOptions setAppendToBody(Boolean appendToBody) {
        this.appendToBody = appendToBody;
        return this;
    }

    public ContentOptions getContent() {
        return content;
    }

    public WindowOptions setContent(ContentOptions content) {
        this.content = content;
        return this;
    }

    public ResizableOptions getResizable() {
        return resizable;
    }

    public WindowOptions setResizable(ResizableOptions resizable) {
        this.resizable = resizable;
        return this;
    }

    public PositionOptions getPosition() {
        return position;
    }

    public WindowOptions setPosition(PositionOptions position) {
        this.position = position;
        return this;
    }

    public HashMap<Event, JsonFunction> getEvents() {
        return events;
    }

    public WindowOptions setEvents(HashMap<Event, JsonFunction> events) {
        this.events = events;
        return this;
    }
}
