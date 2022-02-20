package com.busyqa.collections;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("name","harsha");
        m.put("age",20);
        m.put(50,false);
        m.put(50,true);
        m.put(true,"harsha");
        m.put(null,"busyqa");
        m.put(null,"java");
        m.put("key",null);
        m.put("abc",null);

        System.out.println(m.get("abc"));
        Set keys = m.keySet();
        System.out.println(keys);
        Collection values = m.values();
        System.out.println(values);

        Set<Map.Entry<Object,Object>> entries = m.entrySet();


        System.out.println(entries);
        for(Map.Entry<Object,Object> entry : entries){
            System.out.println(entry.getKey() + " :: " + entry.getValue());
        }

    }
}
