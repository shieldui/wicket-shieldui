package com.shieldui.wicket.qrcode;

import com.shieldui.wicket.HashMapSerializable;
import com.shieldui.wicket.OptionsBase;

public class QRCodeOptions extends OptionsBase 
{
    private static final long serialVersionUID = 1L;
    
    public enum Mode
    {
        BYTE ("byte"),
        NUMERIC ("numeric"),
        ALPHA_NUMERIC ("alphanumeric");
        
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
    
    public enum ErrorLevel
    {
        L ("L"),
        M ("M"),
        Q ("Q"),
        H ("H");
        
        private final String value;
        
        private ErrorLevel(String val)
        {
            value = val;
        }

        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public static final class Style extends HashMapSerializable
    {
        public String background;
        public String borderColor;
        public String borderStyle;
        public Integer borderWidth;
        public String color;
        public Integer padding;
        
        public String getBackground() {
            return background;
        }

        public Style setBackground(String background) {
            this.background = background;
            return this;
        }

        public String getBorderColor() {
            return borderColor;
        }

        public Style setBorderColor(String borderColor) {
            this.borderColor = borderColor;
            return this;
        }

        public String getBorderStyle() {
            return borderStyle;
        }

        public Style setBorderStyle(String borderStyle) {
            this.borderStyle = borderStyle;
            return this;
        }

        public Integer getBorderWidth() {
            return borderWidth;
        }

        public Style setBorderWidth(Integer borderWidth) {
            this.borderWidth = borderWidth;
            return this;
        }

        public String getColor() {
            return color;
        }

        public Style setColor(String color) {
            this.color = color;
            return this;
        }
        
        public Integer getPadding() {
            return padding;
        }

        public Style setPadding(Integer padding) {
            this.padding = padding;
            return this;
        }
    }
    
    public String value;
    public Mode mode;
    public ErrorLevel errorLevel;
    public Integer size;
    public Style style = new Style();
    
    public String getValue() {
        return value;
    }

    public QRCodeOptions setValue(String value) {
        this.value = value;
        return this;
    }

    public Mode getMode() {
        return mode;
    }

    public QRCodeOptions setMode(Mode mode) {
        this.mode = mode;
        return this;
    }

    public ErrorLevel getErrorLevel() {
        return errorLevel;
    }

    public QRCodeOptions setErrorLevel(ErrorLevel errorLevel) {
        this.errorLevel = errorLevel;
        return this;
    }

    public Integer getSize() {
        return size;
    }

    public QRCodeOptions setSize(Integer size) {
        this.size = size;
        return this;
    }

    public Style getStyle() {
        return style;
    }

    public QRCodeOptions setStyle(Style style) {
        this.style = style;
        return this;
    }
}
