package lesson_7;

import java.util.HashMap;
import java.util.Map;

public class CustomerHasMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1111, "Alex");
        hashMap.put(2222, "Sergei");
        hashMap.put(3333, "Nastya");
        hashMap.put(4444, "Elena");

//        System.out.println(hashMap.get(1111));
//        System.out.println(hashMap.get(0000));
//        System.out.println(hashMap.containsKey(1111));
//        System.out.println(hashMap.containsKey(0000));
//        System.out.println(hashMap.containsValue("Nastya"));
//        System.out.println(hashMap.containsValue("Hey"));

//        for (Map.Entry<Integer, String> pairOfValues : hashMap.entrySet()) {
//            System.out.println(pairOfValues.getKey() + " - " + pairOfValues.getValue());
//        }

        hashMap.forEach((id, name) -> System.out.println(id + " - " + name));

        hashMap.put(5555, "Dmitry");

        System.out.println(" ");

        hashMap.forEach((id, name) -> System.out.println(id + " - " + name));

    }
}
