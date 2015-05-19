package com.shieldui.wicket.tooltip;

import org.apache.wicket.Component;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.behavior.Behavior;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;
import org.apache.wicket.request.http.WebRequest;

public class Tooltip extends Behavior
{
    private static final long serialVersionUID = 1L;

    private final TooltipOptions options = new TooltipOptions();
    private String selector = "";
    
    public Tooltip(String selector)
    {
        this.selector = selector;
    }
    
    public TooltipOptions getOptions()
    {
        return options;
    }
    
    private String getInitializationJS()
    {
        String javascript = "$('" + selector + "').shieldTooltip(" + getOptions().toJson() + ")";
        
        // TODO: add any server events
        
        return javascript + ";";
    }
    
    protected String jsClosure(String code)
    {
        return "(function($){" + code + "})(jQuery);";
    }
    
    @Override
    public void renderHead(Component component, IHeaderResponse response)
    {
        super.renderHead(component, response);
        
        // insert the initialization javascript in the head only if not ajax request (i.e. when page reloads)       
        if (!((WebRequest)component.getRequest()).isAjax()) {
            response.render(OnDomReadyHeaderItem.forScript("jQuery(function($){" + getInitializationJS() + "});"));
        }
    }
    
    public void reInitialize(AjaxRequestTarget target)
    {
        target.prependJavaScript(jsClosure("var sw = $('" + selector + "').swidget(\"Tooltip\"); if (sw) { sw.destroy(); }"));
        target.appendJavaScript(jsClosure(getInitializationJS()));
    }
    
    public void setVisible(AjaxRequestTarget target, Boolean visible)
    {
        target.appendJavaScript(
            jsClosure(
                "var sw = $('" + selector + "').swidget(\"Tooltip\"); if (sw) { sw.visible(" + (visible ? "true" : "false") + "); }"
            )
        );
    }
    
    public void setEnabled(AjaxRequestTarget target, Boolean enabled)
    {
        target.appendJavaScript(
            jsClosure(
                "var sw = $('" + selector + "').swidget(\"Tooltip\"); if (sw) { sw.enabled(" + (enabled ? "true" : "false") + "); }"
            )
        );
    }
}
