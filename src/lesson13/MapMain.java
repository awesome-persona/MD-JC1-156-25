package lesson13;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapMain {

    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<>();
//        Map<String, String> map = new LinkedHashMap<>();
        Map<String, String> map = new TreeMap<>();
        //key1 -> value1    - entry1
        //key2 -> value2
        //key3 -> value3
        //key4 -> value4
        //key5 -> value5

        // add
        // read
        // remove
        // edit
        map.putIfAbsent("Alex", "444");
        System.out.println(map);
        map.put("Alex", "333");
        map.put("Ivan", "222");
        map.put("Denis", "333");
        map.put("Jack", "333");
        map.put("Janny", "222");
        System.out.println(map);
        String value = map.get("Alex");
        String value2 = map.getOrDefault("Mary", "0");
        String value3 = map.get("Mary");
        System.out.println(value);
        System.out.println(value2);
        System.out.println(value3);
        String jack = map.remove("Jack");
        map.replace("Jack", "666");

        Set<String> keys = map.keySet();
        Collection<String> values = map.values();
        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }

        for (String val : map.values()) {
            System.out.println(val);
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


    }

    public BigDecimal getHashCode() {
        return null;
    }
}
