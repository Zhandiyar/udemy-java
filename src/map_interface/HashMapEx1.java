package map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Zaur tregulov");
        map1.put(3568, "Ivan Ivanov");
        map1.put(6578, "Mariya Sidorova");
        map1.putIfAbsent(1000, "Nikolay Petrov");
        System.out.println(map1);
        System.out.println(map1.get(1000));
        map1.remove(1000);
        System.out.println(map1);
        System.out.println(map1.containsValue("Ivan"));

        System.out.println(map1.keySet());
        System.out.println(map1.values());


        Map<String,String> map2 = new HashMap<>();
         map2.put("Sasha", "Dobriy");
         map2.put("Misha", "Umniy");
        System.out.println(map2);

    }
}
