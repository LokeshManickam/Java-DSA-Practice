package HashMap;

import java.util.*;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 20);
        map.put("Banana", 50);
        map.put("Mango", 30);
        System.out.println(map.get("Apple"));
        System.out.println(map.containsKey("Banana"));
        for (String key : map.keySet()) {
            System.out.println(key + "->" + map.get(key));
        }
    }
}
