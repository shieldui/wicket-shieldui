package com.shieldui.wicket;

import java.util.HashMap;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.json.JSONFunction;

public interface IWidget
{
     public OptionsBase getOptions();
     
     public void setServerEvent(String eventName, JSONFunction jsonFunc);
     public HashMap<String, JSONFunction> getServerEvents();
     
     public void reInitialize(AjaxRequestTarget target);
     public void setVisible(AjaxRequestTarget target, Boolean visible);
}
