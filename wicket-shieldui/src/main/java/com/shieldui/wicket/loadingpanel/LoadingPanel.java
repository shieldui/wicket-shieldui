package com.shieldui.wicket.loadingpanel;

import com.shieldui.wicket.WidgetComponentBase;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class LoadingPanel extends WidgetComponentBase {
    private static final long serialVersionUID = 1L;
    
    private final LoadingPanelOptions options = new LoadingPanelOptions();
    
    public LoadingPanel(String id)
    {
        super(id, "LoadingPanel");
    }
    
    @Override
    public LoadingPanelOptions getOptions()
    {
        return options;
    }
    
    public void show(AjaxRequestTarget target)
    {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.show(); }"
                )
        );
    }
    
    public void hide(AjaxRequestTarget target)
    {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.hide(); }"
                )
        );
    }
}
