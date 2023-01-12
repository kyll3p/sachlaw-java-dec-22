package Home_Task.lesson_7;

import java.util.*;

public class HW_Collections {
    public static void main(String[] args) {
        /*Созлать 3 коппекции
        В первой 10 чисел
        Во второй 10 имен (заполните их произвольными значениями)
        Третья коллекция должна автоматически заполняться строками. которые содержат число из первой,
        коллекции, потом знак тире и строку из второй коллекции
        вывести все значения третьеи коллекции в цикле for-each*/

        ArrayList<String> names = new ArrayList<String>(Arrays.asList("Sergei", "Nastya", "Elena", "Dmitry", "Oleg", "Sveta", "Pavel", "Denis", "Katya", "Sasha"));
        ArrayList<Integer> numbers = new ArrayList<>();
        HashMap<Integer, String> hashMap = new HashMap<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        for (int i = 0; i < names.size(); i++) {
            hashMap.put(numbers.get(i), names.get(i));
        }

        numbers.forEach(number -> System.out.print(number + " "));
        System.out.println(" ");
        names.forEach(name -> System.out.print(name + " "));
        System.out.println(" ");
        hashMap.forEach((id, name) -> System.out.println(id + " - " + name));
    }
}
