package com.shieldui.wicket.rating;

import com.shieldui.wicket.WidgetComponentBase;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class Rating extends WidgetComponentBase {
    private static final long serialVersionUID = 1L;
    
    private final RatingOptions options = new RatingOptions();
    
    public Rating(String id)
    {
        super(id, "Rating");
    }
    
    @Override
    public RatingOptions getOptions()
    {
        return options;
    }
    
    public void setEnabled(AjaxRequestTarget target, Boolean enabled)
    {
        target.appendJavaScript(
                jsClosure(
                        "var sw = $('#" + getMarkupId() + "').swidget(\"" + getWidgetType() + "\"); if (sw) { sw.enabled(" + (enabled ? "true" : "false") + "); }"
                )
        );
    }
}
