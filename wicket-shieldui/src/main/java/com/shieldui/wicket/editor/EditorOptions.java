package com.shieldui.wicket.editor;

import com.shieldui.wicket.HashMapSerializable;
import com.shieldui.wicket.OptionsBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.apache.wicket.ajax.json.JsonFunction;

public class EditorOptions extends OptionsBase
{
    private static final long serialVersionUID = 1L;
    
    public enum Event
    {
        EXECUTE ("execute"),
        KEYUP ("keyup");
        
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
    
    public enum Command
    {
        FORMAT_BLOCK ("formatBlock"),
        REMOVE_FORMAT ("removeFormat"),
        FONT_NAME ("fontName"),
        FONT_SIZE ("fontSize"),
        FORE_COLOR ("foreColor"),
        BACK_COLOR ("backColor"),
        BOLD ("bold"),
        ITALIC ("italic"),
        UNDERLINE ("underline"),
        STRIKE_THROUGH ("strikeThrough"),
        SUBSCRIPT ("subscript"),
        SUPERSCRIPT ("superscript"),
        JUSTIFY_LEFT ("justifyLeft"),
        JUSTIFY_CENTER ("justifyCenter"),
        JUSTIFY_RIGHT ("justifyRight"),
        JUSTIFY_FULL ("justifyFull"),
        INSERT_UNORDERED_LIST ("insertUnorderedList"),
        INSERT_ORDERED_LIST ("insertOrderedList"),
        INDENT ("indent"),
        OUTDENT ("outdent"),
        CREATE_LINK ("createLink"),
        UNLINK ("unlink"),
        INSERT_IMAGE ("insertImage"),
        VIEW_HTML ("viewHtml");
        
        private final String value;
        
        private Command(String val)
        {
            value = val;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public static class Messages extends HashMapSerializable
    {
        public String formatBlock;
        public String removeFormat;
        public String fontName;
        public String fontSize;
        public String foreColor;
        public String backColor;
        public String bold;
        public String italic;
        public String underline;
        public String strikeThrough;
        public String subscript;
        public String superscript;
        public String justifyLeft;
        public String justifyCenter;
        public String justifyRight;
        public String justifyFull;
        public String insertUnorderedList;
        public String insertOrderedList;
        public String indent;
        public String outdent;
        public String createLink;
        public String unlink;
        public String insertImage;
        public String viewHtml;

        public String getFormatBlock() {
            return formatBlock;
        }

        public Messages setFormatBlock(String formatBlock) {
            this.formatBlock = formatBlock;
            return this;
        }

        public String getRemoveFormat() {
            return removeFormat;
        }

        public Messages setRemoveFormat(String removeFormat) {
            this.removeFormat = removeFormat;
            return this;
        }

        public String getFontName() {
            return fontName;
        }

        public Messages setFontName(String fontName) {
            this.fontName = fontName;
            return this;
        }

        public String getFontSize() {
            return fontSize;
        }

        public Messages setFontSize(String fontSize) {
            this.fontSize = fontSize;
            return this;
        }

        public String getForeColor() {
            return foreColor;
        }

        public Messages setForeColor(String foreColor) {
            this.foreColor = foreColor;
            return this;
        }

        public String getBackColor() {
            return backColor;
        }

        public Messages setBackColor(String backColor) {
            this.backColor = backColor;
            return this;
        }

        public String getBold() {
            return bold;
        }

        public Messages setBold(String bold) {
            this.bold = bold;
            return this;
        }

        public String getItalic() {
            return italic;
        }

        public Messages setItalic(String italic) {
            this.italic = italic;
            return this;
        }

        public String getUnderline() {
            return underline;
        }

        public Messages setUnderline(String underline) {
            this.underline = underline;
            return this;
        }

        public String getStrikeThrough() {
            return strikeThrough;
        }

        public Messages setStrikeThrough(String strikeThrough) {
            this.strikeThrough = strikeThrough;
            return this;
        }

        public String getSubscript() {
            return subscript;
        }

        public Messages setSubscript(String subscript) {
            this.subscript = subscript;
            return this;
        }

        public String getSuperscript() {
            return superscript;
        }

        public Messages setSuperscript(String superscript) {
            this.superscript = superscript;
            return this;
        }

        public String getJustifyLeft() {
            return justifyLeft;
        }

        public Messages setJustifyLeft(String justifyLeft) {
            this.justifyLeft = justifyLeft;
            return this;
        }

        public String getJustifyCenter() {
            return justifyCenter;
        }

        public Messages setJustifyCenter(String justifyCenter) {
            this.justifyCenter = justifyCenter;
            return this;
        }

        public String getJustifyRight() {
            return justifyRight;
        }

        public Messages setJustifyRight(String justifyRight) {
            this.justifyRight = justifyRight;
            return this;
        }

        public String getJustifyFull() {
            return justifyFull;
        }

        public Messages setJustifyFull(String justifyFull) {
            this.justifyFull = justifyFull;
            return this;
        }

        public String getInsertUnorderedList() {
            return insertUnorderedList;
        }

        public Messages setInsertUnorderedList(String insertUnorderedList) {
            this.insertUnorderedList = insertUnorderedList;
            return this;
        }

        public String getInsertOrderedList() {
            return insertOrderedList;
        }

        public Messages setInsertOrderedList(String insertOrderedList) {
            this.insertOrderedList = insertOrderedList;
            return this;
        }

        public String getIndent() {
            return indent;
        }

        public Messages setIndent(String indent) {
            this.indent = indent;
            return this;
        }

        public String getOutdent() {
            return outdent;
        }

        public Messages setOutdent(String outdent) {
            this.outdent = outdent;
            return this;
        }

        public String getCreateLink() {
            return createLink;
        }

        public Messages setCreateLink(String createLink) {
            this.createLink = createLink;
            return this;
        }

        public String getUnlink() {
            return unlink;
        }

        public Messages setUnlink(String unlink) {
            this.unlink = unlink;
            return this;
        }

        public String getInsertImage() {
            return insertImage;
        }

        public Messages setInsertImage(String insertImage) {
            this.insertImage = insertImage;
            return this;
        }

        public String getViewHtml() {
            return viewHtml;
        }

        public Messages setViewHtml(String viewHtml) {
            this.viewHtml = viewHtml;
            return this;
        }
    }    
    
    public String cls;
    public Boolean enabled;
    public String domain;
    public Object height;
    public List<Object> commands = new ArrayList<Object>();
    public Messages messages = new Messages();
    public HashMap<Event, JsonFunction> events = new HashMap<Event, JsonFunction>();

    public String getCls() {
        return cls;
    }

    public EditorOptions setCls(String cls) {
        this.cls = cls;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public EditorOptions setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getDomain() {
        return domain;
    }

    public EditorOptions setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public Object getHeight() {
        return height;
    }

    public EditorOptions setHeight(String height) {
        this.height = height;
        return this;
    }
    
    public EditorOptions setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public List<Object> getCommands() {
        return commands;
    }

    public EditorOptions setCommands(ArrayList<Object> commands) {
        this.commands = commands;
        return this;
    }
    
    public EditorOptions setCommands(Object ... commands) {
        this.commands = Arrays.asList(commands);
        return this;
    }

    public Messages getMessages() {
        return messages;
    }

    public EditorOptions setMessages(Messages messages) {
        this.messages = messages;
        return this;
    }

    public HashMap<Event, JsonFunction> getEvents() {
        return events;
    }

    public EditorOptions setEvents(HashMap<Event, JsonFunction> events) {
        this.events = events;
        return this;
    }
}
