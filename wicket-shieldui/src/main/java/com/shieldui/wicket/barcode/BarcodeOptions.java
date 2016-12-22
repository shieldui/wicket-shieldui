package com.shieldui.wicket.barcode;

import com.shieldui.wicket.HashMapSerializable;
import com.shieldui.wicket.OptionsBase;

public class BarcodeOptions extends OptionsBase
{
    private static final long serialVersionUID = 1L;
    
    public enum Type
    {
        CODABAR ("CODABAR"),
        CODE_11 ("CODE-11"),
        CODE_39 ("CODE-39"),
        CODE_93 ("CODE-93"),
        CODE_128 ("CODE-128"),
        CODE_128_A ("CODE-128-A"),
        CODE_128_B ("CODE-128-B"),
        CODE_128_C ("CODE-128-C"),
        CODE_25_STANDARD ("CODE-25-STANDARD"),
        CODE_25_INTERLEAVED ("CODE-25-INTERLEAVED"),
        EAN_8 ("EAN-8"),
        EAN_13 ("EAN-13"),
        UPC_A ("UPC-A"),
        UPC_E ("UPC-E"),
        MSI_10 ("MSI-10"),
        MSI_10_10 ("MSI-10-10"),
        MSI_11 ("MSI-11"),
        MSI_11_10 ("MSI-11-10"),
        POSTNET ("POSTNET");
        
        private final String value;
        
        private Type(String val)
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
        public Integer paddingTop;
        public Integer paddingLeft;
        public Integer paddingRight;
        public Integer paddingBottom;
        
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

        public Integer getPaddingTop() {
            return paddingTop;
        }

        public Style setPaddingTop(Integer paddingTop) {
            this.paddingTop = paddingTop;
            return this;
        }

        public Integer getPaddingLeft() {
            return paddingLeft;
        }

        public Style setPaddingLeft(Integer paddingLeft) {
            this.paddingLeft = paddingLeft;
            return this;
        }

        public Integer getPaddingRight() {
            return paddingRight;
        }

        public Style setPaddingRight(Integer paddingRight) {
            this.paddingRight = paddingRight;
            return this;
        }

        public Integer getPaddingBottom() {
            return paddingBottom;
        }

        public Style setPaddingBottom(Integer paddingBottom) {
            this.paddingBottom = paddingBottom;
            return this;
        }
    }
    
    public static final class Text extends HashMapSerializable
    {
        public static final class Style extends HashMapSerializable
        {
            public String color;
            public String fontFamily;
            public Integer fontSize;
            public Integer paddingTop;
            public Integer paddingBottom;
            
            public String getColor() {
                return color;
            }

            public Style setColor(String color) {
                this.color = color;
                return this;
            }

            public String getFontFamily() {
                return fontFamily;
            }

            public Style setFontFamily(String fontFamily) {
                this.fontFamily = fontFamily;
                return this;
            }

            public Integer getFontSize() {
                return fontSize;
            }

            public Style setFontSize(Integer fontSize) {
                this.fontSize = fontSize;
                return this;
            }

            public Integer getPaddingTop() {
                return paddingTop;
            }

            public Style setPaddingTop(Integer paddingTop) {
                this.paddingTop = paddingTop;
                return this;
            }

            public Integer getPaddingBottom() {
                return paddingBottom;
            }

            public Style setPaddingBottom(Integer paddingBottom) {
                this.paddingBottom = paddingBottom;
                return this;
            }
        }
        
        public Boolean enabled;
        public Boolean checksum;
        public Style style = new Style();
    }
    
    // top level options/settings
    public String value;
    public Type type;
    public Boolean checksum;
    public Integer width;
    public Integer height;
    public Style style = new Style();
    public Text text = new Text();
    
    public String getValue() {
        return value;
    }

    public BarcodeOptions setValue(String value) {
        this.value = value;
        return this;
    }

    public Type getType() {
        return type;
    }

    public BarcodeOptions setType(Type type) {
        this.type = type;
        return this;
    }

    public Boolean getChecksum() {
        return checksum;
    }

    public BarcodeOptions setChecksum(Boolean checksum) {
        this.checksum = checksum;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public BarcodeOptions setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public BarcodeOptions setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Style getStyle() {
        return style;
    }

    public BarcodeOptions setStyle(Style style) {
        this.style = style;
        return this;
    }

    public Text getText() {
        return text;
    }

    public BarcodeOptions setText(Text text) {
        this.text = text;
        return this;
    }
}
