package com.carey.aprivate.apprescollect.codes;

import java.util.*;

/**
 * Created by LiuJie on 2015/10/23.
 */
public class DataAnalysis {
    public static List<Object> getMapKeys(Map param) {
        List<Object> keys = new ArrayList<Object>();
        Set set = param.keySet();
        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            keys.add(iter.next());
        }
        return keys;
    }

    public static List<Object> getMapValues(Map param) {
        List<Object> values = new ArrayList<Object>();
        Set set = param.keySet();
        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            values.add(param.get(iter.next()));
        }
        return values;
    }

    public static void get(Map map) {
        Iterator it = map.entrySet().iterator();
        List<Object> keys = new ArrayList<Object>();
        List<Object> values = new ArrayList<Object>();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            keys.add(entry.getKey());
            values.add(entry.getValue());
        }
        String strKey = "";
        for (Object str : keys) {
            strKey += str + " , ";
        }
        String strValue = "";
        for (Object str : values) {
            strValue += str + " , ";
        }
        System.out.println("KEYS：" + strKey);
        System.out.println("VALUES：" + strValue);
    }

    public static void main(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("KEY1", "VALUE1");
        map.put("KEY2", "VALUE2");
        map.put("KEY3", "VALUE3");
        map.put("KEY4", "VALUE4");
        map.put("KEY5", "VALUE5");

        LinkedHashMap<String, String> mapp = new LinkedHashMap<String, String>(map);
        List<Object> keys = getMapKeys(map);
        List<Object> values = getMapValues(map);
        String strKey = "";
        for (Object str : keys) {
            strKey += str + " , ";
        }
        String strValue = "";
        for (Object str : values) {
            strValue += str + " , ";
        }
        System.out.println("KEYS：" + strKey);
        System.out.println("VALUES：" + strValue);
    }
}
