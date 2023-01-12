package lesson_9.methods;

import java.util.ArrayList;

public class VoidWithParams {
    public static void main(String[] args) {
        sayHello("Sergei", 28);
        String studentName = "Nastya Kadirova";
        sayHello(studentName, 24);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);

        printArrayList(arrayList);
    }

    public static void sayHello (String name, int age) {
        System.out.println("Hello, " + name + "!");
        System.out.println("You're  " + age + " years old");
    }

    public static void printArrayList (ArrayList<Integer> list) {
        System.out.println("list.size() = " + list.size());
        System.out.println();
        list.forEach((number) -> System.out.println(number + " "));
        System.out.println();
    }
}
