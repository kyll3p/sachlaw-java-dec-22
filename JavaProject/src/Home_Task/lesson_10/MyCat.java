package Home_Task.lesson_10;

import java.util.ArrayList;
import java.util.HashMap;

public class MyCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Luka", "red-brown", -1);
        Cat cat2 = new Cat("Pluha", "ginger", 3);
        Cat cat3 = new Cat("Vasya", "ginger", 12);
        Cat cat4 = new Cat("Grey", "Grey", 2);
        Cat cat5 = new Cat("Lui", "white-brown", 10);

        ArrayList<Cat> catArrayList = new ArrayList<>();

        catArrayList.add(cat1);
        catArrayList.add(cat2);
        catArrayList.add(cat3);
        catArrayList.add(cat4);
        catArrayList.add(cat5);

        System.out.println(catArrayList + " ");

        catArrayList.forEach(cat -> System.out.println(cat.getName()));
        catArrayList.forEach(cat -> System.out.println(cat.getAge()));
        catArrayList.forEach(cat -> System.out.println(cat.getColor()));
        catArrayList.forEach(cat -> System.out.println(cat));
    }
}
