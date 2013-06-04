package com.shieldui.wicket.chart;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;

public class HashMapSerializable implements Serializable 
{
    private static final long serialVersionUID = 1L;
    
    public HashMap<String, Object> toHashMap()
    {
        HashMap<String, Object> result = new HashMap();
        addClassFields(this.getClass(), result);
        return result.keySet().size() > 0 ? result : null;
    }
    
    private void addClassFields(Class cls, HashMap<String, Object> result)
    {
        for (Field field : cls.getDeclaredFields()) {
            String name = field.getName();
            
            if (name.equals("serialVersionUID")) {
                continue;
            }
            
            Class type = field.getType();
            
            Object value = null;
            try {
                value = field.get(this);
            }
            catch (Exception e) {
                System.err.println("Error getting value for field " + name + ": " + e.getMessage());
                e.printStackTrace();
                continue;
            }
            
            // override value in certain cases
            if (HashMap.class.isAssignableFrom(type)) {                
                // if empty hashmap, make it null so it does not get serialized
                if (value != null && ((HashMap) value).keySet().size() <= 0) {
                    value = null;
                }
            }
            else if (List.class.isAssignableFrom(type)) {                
                // if empty list, make it null so it does not get serialized
                if (value != null && ((List) value).size() <= 0) {
                    value = null;
                }
            }
            else if (HashMapSerializable.class.isAssignableFrom(type)) {                
                // if type is a successor of HashMapSerializable,
                // make the value the serialized hashmap
                if (value != null) {
                    value = ((HashMapSerializable) value).toHashMap();
                }
            }
            
            if (value != null) {
                result.put(name, value);
            }
        }
        
        // add parent fields if class has superclass and it is not HashMapSerializable
        Class parent = cls.getSuperclass();
        if (parent != null && !parent.equals(HashMapSerializable.class)) {
            addClassFields(parent, result);
        }
    }
}
