package lesson_6;

import java.util.HashSet;

public class Collection_HashSet {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        System.out.println("names.isEmpty() = " + names.isEmpty());

        names.add("Alex");
        names.add("Marina");
        names.add("Sergei");
        names.add("Nastya");
        names.add("Alex");

        System.out.println("names.isEmpty() = " + names.isEmpty());

        names.forEach(name -> System.out.println(name));
    }
}
