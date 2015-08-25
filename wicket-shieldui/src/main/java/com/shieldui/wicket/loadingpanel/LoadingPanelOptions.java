package com.shieldui.wicket.loadingpanel;

import com.shieldui.wicket.OptionsBase;
import org.apache.wicket.ajax.json.JsonFunction;

public class LoadingPanelOptions extends OptionsBase {
    private static final long serialVersionUID = 1L;
    
    public Boolean show;
    public Boolean showImage;
    public String text;
    public Object template;
    public Boolean useSmallImage;

    public Boolean getShow() {
        return show;
    }

    public LoadingPanelOptions setShow(Boolean show) {
        this.show = show;
        return this;
    }

    public Boolean getShowImage() {
        return showImage;
    }

    public LoadingPanelOptions setShowImage(Boolean showImage) {
        this.showImage = showImage;
        return this;
    }

    public String getText() {
        return text;
    }

    public LoadingPanelOptions setText(String text) {
        this.text = text;
        return this;
    }

    public Object getTemplate() {
        return template;
    }

    public LoadingPanelOptions setTemplate(String template) {
        this.template = template;
        return this;
    }
    
    public LoadingPanelOptions setTemplate(JsonFunction template) {
        this.template = template;
        return this;
    }

    public Boolean getUseSmallImage() {
        return useSmallImage;
    }

    public LoadingPanelOptions setUseSmallImage(Boolean useSmallImage) {
        this.useSmallImage = useSmallImage;
        return this;
    }
}
