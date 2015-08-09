package com.shieldui.wicket;

import java.util.HashMap;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.json.JsonFunction;

public interface IWidget
{
     public OptionsBase getOptions();
     
     public void setServerEvent(String eventName, JsonFunction jsonFunc);
     public HashMap<String, JsonFunction> getServerEvents();
     
     public void reInitialize(AjaxRequestTarget target);
     public void setVisible(AjaxRequestTarget target, Boolean visible);
}
