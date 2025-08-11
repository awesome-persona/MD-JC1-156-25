package lesson14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

    String s =
            """
            Вася: при вет
            Петя: хай! f
            Вася: как жизнь
            Анна: о как
            ...
            Вася: пока
            Анна: пока 
            """;

    //["Вася", "Антон", "Анна"]
    public List<String> getTopChatters(String text) {
        return null;
    }



    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();
        System.out.println(m.get(null));
        m.put(null, "test");
        System.out.println(m);
        System.out.println(m.get(null));

        final String msg = "Hello aeafs sdaaf44sda dga_sggsg, fsdRER. dsfkjdslf sowprwe-qggvgui wFUASFIfogh AFFPODSGS";
        System.out.println(msg);
        String msgUpdated = msg.toLowerCase().replaceAll("[^a-z\\d]", "");
        System.out.println(msgUpdated);

        char[] chars = msgUpdated.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        int value = 0;
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
//            map.compute(c, (k,v) -> v == null ? 1 : v + 1);
        }
        System.out.println(map);
        int maxValue = 0;
        var entriesList = new ArrayList<>(map.entrySet());
//        entriesList.sort();
        Collections.sort(entriesList, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return Integer.compare(o2.getValue(), o1.getValue());
            }
        });
        System.out.println(entriesList);
        var result = entriesList.subList(0, Math.min(3, entriesList.size()));
        System.out.println(result);


        Iterator<Map.Entry<Character, Integer>> iterator = entriesList.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> next = iterator.next();
            System.out.println(next);
        }

        for ( Map.Entry<Character, Integer> next : entriesList) {
            System.out.println(next);
        }

        ListIterator<Map.Entry<Character, Integer>> entryListIterator = entriesList.listIterator();
        while (entryListIterator.hasNext()) {
            Map.Entry<Character, Integer> next = entryListIterator.next();
            System.out.println(next);
        }
    }
}
