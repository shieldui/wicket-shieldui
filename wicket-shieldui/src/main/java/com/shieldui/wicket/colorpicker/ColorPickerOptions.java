package com.shieldui.wicket.colorpicker;

import com.shieldui.wicket.HashMapSerializable;
import com.shieldui.wicket.OptionsBase;
import org.apache.wicket.ajax.json.JSONFunction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ColorPickerOptions extends OptionsBase {
    private static final long serialVersionUID = 1L;
    
    // client events
    public enum Event
    {
        CHANGE ("change"),
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
    
    public enum PaletteType
    {
        BASIC ("basic"),
        ADVANCED ("advanced");
        
        private final String value;
        
        private PaletteType(String val)
        {
            value = val;
        }

        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public enum AdvancedPaletteType
    {
        HEX ("hex"),
        RGB ("rgb"),
        HSL ("hsl");
        
        private final String value;
        
        private AdvancedPaletteType(String val)
        {
            value = val;
        }

        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public static final class BasicPaletteOptions extends HashMapSerializable {
        public static final class TitleSizeOptions extends HashMapSerializable {
            public Integer width;
            public Integer height;

            public Integer getWidth() {
                return width;
            }

            public TitleSizeOptions setWidth(Integer width) {
                this.width = width;
                return this;
            }

            public Integer getHeight() {
                return height;
            }

            public TitleSizeOptions setHeight(Integer height) {
                this.height = height;
                return this;
            }
        }
        
        public Integer columns;
        public Integer tileBorderWidth;
        public List<String> palette = new ArrayList<String>();
        public TitleSizeOptions titleSize = new TitleSizeOptions();

        public Integer getColumns() {
            return columns;
        }

        public BasicPaletteOptions setColumns(Integer columns) {
            this.columns = columns;
            return this;
        }

        public Integer getTileBorderWidth() {
            return tileBorderWidth;
        }

        public BasicPaletteOptions setTileBorderWidth(Integer tileBorderWidth) {
            this.tileBorderWidth = tileBorderWidth;
            return this;
        }

        public List<String> getPalette() {
            return palette;
        }

        public BasicPaletteOptions setPalette(List<String> palette) {
            this.palette = palette;
            return this;
        }

        public TitleSizeOptions getTitleSize() {
            return titleSize;
        }

        public BasicPaletteOptions setTitleSize(TitleSizeOptions titleSize) {
            this.titleSize = titleSize;
            return this;
        }
    }
    
    public static final class AdvancedPaletteOptions extends HashMapSerializable {
        public static final class MessagesOptions extends HashMapSerializable {
            public String apply;
            public String cancel;

            public String getApply() {
                return apply;
            }

            public MessagesOptions setApply(String apply) {
                this.apply = apply;
                return this;
            }

            public String getCancel() {
                return cancel;
            }

            public MessagesOptions setCancel(String cancel) {
                this.cancel = cancel;
                return this;
            }
        }
        public AdvancedPaletteType type;
        public Boolean buttons;
        public MessagesOptions messages;

        public AdvancedPaletteType getType() {
            return type;
        }

        public AdvancedPaletteOptions setType(AdvancedPaletteType type) {
            this.type = type;
            return this;
        }

        public Boolean getButtons() {
            return buttons;
        }

        public AdvancedPaletteOptions setButtons(Boolean buttons) {
            this.buttons = buttons;
            return this;
        }

        public MessagesOptions getMessages() {
            return messages;
        }

        public AdvancedPaletteOptions setMessages(MessagesOptions messages) {
            this.messages = messages;
            return this;
        }
    }
    
    public PaletteType palette;
    public Boolean displayInline;
    public Boolean showLetter;
    public String value;
    public BasicPaletteOptions basicPalette = new BasicPaletteOptions();
    public AdvancedPaletteOptions advancedPalette = new AdvancedPaletteOptions();
    public HashMap<Event, JSONFunction> events = new HashMap<Event, JSONFunction>();

    public PaletteType getPalette() {
        return palette;
    }

    public ColorPickerOptions setPalette(PaletteType palette) {
        this.palette = palette;
        return this;
    }

    public Boolean getDisplayInline() {
        return displayInline;
    }

    public ColorPickerOptions setDisplayInline(Boolean displayInline) {
        this.displayInline = displayInline;
        return this;
    }

    public Boolean getShowLetter() {
        return showLetter;
    }

    public ColorPickerOptions setShowLetter(Boolean showLetter) {
        this.showLetter = showLetter;
        return this;
    }

    public String getValue() {
        return value;
    }

    public ColorPickerOptions setValue(String value) {
        this.value = value;
        return this;
    }

    public BasicPaletteOptions getBasicPalette() {
        return basicPalette;
    }

    public ColorPickerOptions setBasicPalette(BasicPaletteOptions basicPalette) {
        this.basicPalette = basicPalette;
        return this;
    }

    public AdvancedPaletteOptions getAdvancedPalette() {
        return advancedPalette;
    }

    public ColorPickerOptions setAdvancedPalette(AdvancedPaletteOptions advancedPalette) {
        this.advancedPalette = advancedPalette;
        return this;
    }

    public HashMap<Event, JSONFunction> getEvents() {
        return events;
    }

    public ColorPickerOptions setEvents(HashMap<Event, JSONFunction> events) {
        this.events = events;
        return this;
    }
}
