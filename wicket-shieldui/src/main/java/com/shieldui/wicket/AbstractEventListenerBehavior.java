package com.shieldui.wicket;

import com.shieldui.wicket.chart.ChartOptions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.wicket.Component;
import org.apache.wicket.ajax.AbstractDefaultAjaxBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.attributes.AjaxRequestAttributes;
import org.apache.wicket.ajax.attributes.CallbackParameter;
import org.apache.wicket.ajax.json.JSONArray;
import org.apache.wicket.ajax.json.JSONException;
import org.apache.wicket.ajax.json.JSONObject;
import org.apache.wicket.ajax.json.JsonFunction;
import org.apache.wicket.request.cycle.RequestCycle;

public abstract class AbstractEventListenerBehavior extends AbstractDefaultAjaxBehavior
{
    private static final long serialVersionUID = 1L;
    
    protected String eventName;
    protected String eventVarName = "ev";
    
    protected abstract void handleEvent(AjaxRequestTarget target, Object event);
    
    public AbstractEventListenerBehavior(String eventName)
    {
        super();
        this.eventName = eventName;
    }
    
    @Override
    protected void updateAjaxAttributes(AjaxRequestAttributes attributes)
    {
        super.updateAjaxAttributes(attributes);
        attributes.setMethod(AjaxRequestAttributes.Method.POST);
    }

    @Override
    public void onConfigure(Component component)
    {
        super.onConfigure(component);
        String callback = getCallbackFunction(CallbackParameter.converted(eventVarName, "JSON.stringify(" + toJson(eventVarName) + ")")).toString();
        ((WidgetBase) component).getOptions().getEvents().put(eventName, new JsonFunction(callback));
    }
    
    @Override
    protected void respond(AjaxRequestTarget target)
    {
        String eventJson = RequestCycle.get().getRequest().getRequestParameters().getParameterValue(eventVarName).toString();
        handleEvent(target, fromJson(eventJson));
    }
    
    /**
     * Serialize the event object in varName to JSON
     */
    protected String toJson(String varName)
    {
        return "null";
    }
    
    /**
     * Parses the JSON string and fills the event info
     */
    protected Object fromJson(String json)
    {
        // the object serialized can be null or an object
        if (json.equals("null")) {
            return null;
        }
        
        try {
            JSONObject obj = new JSONObject(json);
            return parseObject(obj);
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private HashMap<String, Object> parseObject(JSONObject obj)
    {
        HashMap<String, Object> result = new HashMap<String, Object>();
        
        Iterator iter = obj.keys();
        while(iter.hasNext()) {
            String key = (String) iter.next();
            Object value = null;
            
            if (!obj.isNull(key)) {
                if (value == null) {
                    try { value = obj.getBoolean(key); } catch (JSONException ex) {}
                }
                if (value == null) {
                    try { value = obj.getString(key); } catch (JSONException ex) {}
                }
                if (value == null) {
                    try { value = obj.getInt(key); } catch (JSONException ex) {}
                }
                if (value == null) {
                    try { value = obj.getDouble(key); } catch (JSONException ex) {}
                }
                if (value == null) {
                    try { value = obj.getLong(key); } catch (JSONException ex) {}
                }
                if (value == null) {
                    try { value = parseObject(obj.getJSONObject(key)); } catch (JSONException ex) {}
                }
                if (value == null) {
                    try { value = parseList(obj.getJSONArray(key)); } catch (JSONException ex) {}
                }
                if (value == null) {
                    try { value = obj.get(key); } catch (JSONException ex) {}
                }
            }
            
            result.put(key, value);
        }
        
        return result;
    }
    
    private List parseList(JSONArray list) throws JSONException
    {
        ArrayList<Object> result = new ArrayList<Object>();

        for (int i=0; i<list.length(); i++) {
            Object value = null;
            
            if (!list.isNull(i)) {
                if (value == null) {
                    try { value = list.getBoolean(i); } catch (JSONException ex) {}
                }
                if (value == null) {
                    try { value = list.getString(i); } catch (JSONException ex) {}
                }
                if (value == null) {
                    try { value = list.getInt(i); } catch (JSONException ex) {}
                }
                if (value == null) {
                    try { value = list.getDouble(i); } catch (JSONException ex) {}
                }
                if (value == null) {
                    try { value = list.getLong(i); } catch (JSONException ex) {}
                }
                if (value == null) {
                    try { value = parseObject(list.getJSONObject(i)); } catch (JSONException ex) {}
                }
                if (value == null) {
                    try { value = parseList(list.getJSONArray(i)); } catch (JSONException ex) {}
                }
                if (value == null) {
                    try { value = list.get(i); } catch (JSONException ex) {}
                }
            }
            
            result.add(value);
        }
        
        return result;
    }
}
