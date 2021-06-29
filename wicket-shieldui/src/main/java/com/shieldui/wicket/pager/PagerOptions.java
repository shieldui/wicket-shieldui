package com.shieldui.wicket.pager;

import com.shieldui.wicket.HashMapSerializable;
import com.shieldui.wicket.OptionsBase;
import org.apache.wicket.ajax.json.JSONFunction;
import java.util.HashMap;

public class PagerOptions extends OptionsBase
{
    private static final long serialVersionUID = 1L;
    
    // client events
    public enum Event
    {
        CHANGE ("change");
        
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
    
    public static final class MessagesOptions extends HashMapSerializable
    {
        public String infoBarTemplate;
        public String previousText;
        public String nextText;
        public String firstText;
        public String lastText;
        public String firstTooltip;
        public String previousTooltip;
        public String nextTooltip;
        public String lastTooltip;

        public String getInfoBarTemplate() {
            return infoBarTemplate;
        }

        public MessagesOptions setInfoBarTemplate(String infoBarTemplate) {
            this.infoBarTemplate = infoBarTemplate;
            return this;
        }

        public String getPreviousText() {
            return previousText;
        }

        public MessagesOptions setPreviousText(String previousText) {
            this.previousText = previousText;
            return this;
        }

        public String getNextText() {
            return nextText;
        }

        public MessagesOptions setNextText(String nextText) {
            this.nextText = nextText;
            return this;
        }

        public String getFirstText() {
            return firstText;
        }

        public MessagesOptions setFirstText(String firstText) {
            this.firstText = firstText;
            return this;
        }

        public String getLastText() {
            return lastText;
        }

        public MessagesOptions setLastText(String lastText) {
            this.lastText = lastText;
            return this;
        }

        public String getFirstTooltip() {
            return firstTooltip;
        }

        public MessagesOptions setFirstTooltip(String firstTooltip) {
            this.firstTooltip = firstTooltip;
            return this;
        }

        public String getPreviousTooltip() {
            return previousTooltip;
        }

        public MessagesOptions setPreviousTooltip(String previousTooltip) {
            this.previousTooltip = previousTooltip;
            return this;
        }

        public String getNextTooltip() {
            return nextTooltip;
        }

        public MessagesOptions setNextTooltip(String nextTooltip) {
            this.nextTooltip = nextTooltip;
            return this;
        }

        public String getLastTooltip() {
            return lastTooltip;
        }

        public MessagesOptions setLastTooltip(String lastTooltip) {
            this.lastTooltip = lastTooltip;
            return this;
        }
    }
    
    public Integer currentPage;
    public Integer totalItems;
    public Integer pageSize;
    public Integer pageLinksCount;
    public Boolean directionLinks;
    public Boolean boundaryLinks;
    public Boolean imageLinks;
    public MessagesOptions messages = new MessagesOptions();
    public HashMap<Event, JSONFunction> events = new HashMap<Event, JSONFunction>();

    public Integer getCurrentPage() {
        return currentPage;
    }

    public PagerOptions setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public PagerOptions setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public PagerOptions setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getPageLinksCount() {
        return pageLinksCount;
    }

    public PagerOptions setPageLinksCount(Integer pageLinksCount) {
        this.pageLinksCount = pageLinksCount;
        return this;
    }

    public Boolean getDirectionLinks() {
        return directionLinks;
    }

    public PagerOptions setDirectionLinks(Boolean directionLinks) {
        this.directionLinks = directionLinks;
        return this;
    }

    public Boolean getBoundaryLinks() {
        return boundaryLinks;
    }

    public PagerOptions setBoundaryLinks(Boolean boundaryLinks) {
        this.boundaryLinks = boundaryLinks;
        return this;
    }

    public Boolean getImageLinks() {
        return imageLinks;
    }

    public PagerOptions setImageLinks(Boolean imageLinks) {
        this.imageLinks = imageLinks;
        return this;
    }

    public MessagesOptions getMessages() {
        return messages;
    }

    public PagerOptions setMessages(MessagesOptions messages) {
        this.messages = messages;
        return this;
    }

    public HashMap<Event, JSONFunction> getEvents() {
        return events;
    }

    public PagerOptions setEvents(HashMap<Event, JSONFunction> events) {
        this.events = events;
        return this;
    }
}
