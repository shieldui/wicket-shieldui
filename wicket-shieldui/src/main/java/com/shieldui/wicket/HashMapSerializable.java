package com.shieldui.wicket;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
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
            
            serializeVariable(type, name, value, result);
        }
        
        // add parent fields if class has superclass and it is not HashMapSerializable
        Class parent = cls.getSuperclass();
        if (parent != null && !parent.equals(HashMapSerializable.class)) {
            addClassFields(parent, result);
        }
    }
    
    protected void serializeVariable(Class type, String name, Object value, HashMap<String, Object> result)
    {
        if (value != null) {
            // override value in certain cases
            if (HashMap.class.isAssignableFrom(type)) {
                HashMap cast = ((HashMap) value);

                if (cast.keySet().size() <= 0) {
                    // if empty hashmap, make it null so it does not get serialized
                    value = null;
                }
                else {
                    // convert any HashMapSerializable items in the HashMap to HashMaps
                    HashMap newValue = new HashMap();
                    for (Object key : cast.keySet()) {
                        Object val = cast.get(key);
                        if (HashMapSerializable.class.isAssignableFrom(val.getClass())) {
                            newValue.put(key, ((HashMapSerializable) val).toHashMap());
                        }
                        else {
                            newValue.put(key, val);
                        }
                    }
                    value = newValue;
                }
            }
            else if (List.class.isAssignableFrom(type)) {
                List cast = ((List) value);

                // if empty list, make it null so it does not get serialized
                if (cast.size() <= 0) {
                    value = null;
                }
                else {
                    // convert any HashMapSerializable items in the List to HashMaps
                    List newValue = new ArrayList();
                    for (int i=0; i<cast.size(); i++) {
                        Object val = cast.get(i);
                        if (HashMapSerializable.class.isAssignableFrom(val.getClass())) {
                            newValue.add(((HashMapSerializable) val).toHashMap());
                        }
                        else {
                            newValue.add(val);
                        }
                    }
                    value = newValue;
                }
            }
            else if (HashMapSerializable.class.isAssignableFrom(type)) {
                // if type is a successor of HashMapSerializable,
                // make the value the serialized hashmap
                value = ((HashMapSerializable) value).toHashMap();
            }

            if (value != null) {
                result.put(name, value);
            }
        }
    }
}
