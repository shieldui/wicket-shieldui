package com.shieldui.wicket.upload;

import com.shieldui.wicket.WidgetComponentBase;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class Upload extends WidgetComponentBase
{
    private static final long serialVersionUID = 1L;
    
    private final UploadOptions options = new UploadOptions();
    
    public Upload(String id)
    {
        super(id, "Upload");
    }
    
    @Override
    public UploadOptions getOptions()
    {
        return options;
    }
    
    public void setEnabled(AjaxRequestTarget target, Boolean enabled)
    {
        target.appendJavaScript(
            jsClosure(
                "var sw = $('#" + getMarkupId() + "').swidget('" + getWidgetType() + "'); if (sw) { " + 
                    "sw.enabled(" + (enabled ? "true" : "false") + "); }"
            )
        );
    }
}
