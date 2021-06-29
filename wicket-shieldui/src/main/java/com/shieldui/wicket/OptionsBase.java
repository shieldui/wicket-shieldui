package com.shieldui.wicket;

import java.util.HashMap;
import com.github.openjson.JSONException;
import com.github.openjson.JSONObject;

public abstract class OptionsBase extends HashMapSerializable
{
    private static final long serialVersionUID = 1L;

    // toJson method to serialize all the settings in json
    public CharSequence toJson() 
    {
        try {
            HashMap<String, Object> dict = toHashMap();
            JSONObject o = new JSONObject(dict);
            return o.toString();
        }
        catch (JSONException e) {
            throw new RuntimeException("Could not convert OptionsBase object to Json", e);
        }
    }
}
