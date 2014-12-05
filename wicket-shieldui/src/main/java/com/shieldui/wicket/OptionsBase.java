package com.shieldui.wicket;

import java.util.HashMap;
import org.apache.wicket.ajax.json.JSONException;
import org.apache.wicket.ajax.json.JSONStringer;

public abstract class OptionsBase extends HashMapSerializable
{
    private static final long serialVersionUID = 1L;

    // toJson method to serialize all the settings in json
    public CharSequence toJson() 
    {
        try {
            JSONStringer writer = new JSONStringer();
            writer.object();
            
            HashMap<String, Object> dict = toHashMap();
            if (dict != null) {
                for (String key : dict.keySet()) {
                    Object value = dict.get(key);
                    if (value != null) {
                        writer.key(key);
                        writer.value(value);
                    }
                }
            }
            
            writer.endObject();
            return writer.toString();
        }
        catch (JSONException e) {
            throw new RuntimeException("Could not convert OptionsBase object to Json", e);
        }
    }
}
