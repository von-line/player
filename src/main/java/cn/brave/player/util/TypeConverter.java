package cn.brave.player.util;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author Brave
 * @create 2021-08-24 14:23
 * @description
 **/
public class TypeConverter {

    /**
     * 将Properties转换为Map
     * @param prop
     * @return
     */
    public static Map<String, String> propertiesToMap(Properties prop) {
        int size = prop.size();
        Map<String, String> map = new HashMap<>(size);
        Enumeration<?> propertyNames = prop.propertyNames();
        while (propertyNames.hasMoreElements()) {
            Object name = propertyNames.nextElement();
            String name1 = (String) name;
            map.put(name1, prop.getProperty(name1));
        }
        return map;
    }
}
