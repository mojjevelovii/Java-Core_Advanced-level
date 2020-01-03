package HW3;

import java.util.*;

public class SetOfWords {
    Set<String> set = new HashSet<>();

    public void setOfWords(String[] words) {
        set.addAll(Arrays.asList(words));
        System.out.println(set);
    }

    public void quantity(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (String st : words) {
            if (map.containsKey(st)) {
                int count = map.get(st);
                count++;
                map.put(st, count);
            } else {
                map.put(st, 1);
            }
        }
        for (Map.Entry<String, Integer> q : map.entrySet()) {
            System.out.println(q.getKey() + " = " + q.getValue());
        }
    }
}
