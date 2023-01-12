package Home_Task.lesson_7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class DuplicateNumbers {
    public static void main(String[] args) {
        /*Используя Intellij IDEA, создайте класс DuplicateNumbers
        Создай ArrayList на 100 чисел типа Integer
        Решить задачу подсчета повторяющихся элементов в массиве с помощью HashMap.
        Используем Random -> nextint 50)*/

        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        HashMap<Integer, Integer> collection = new HashMap<>();

        for (int i = 0; i < 100; i++) {
            numbers.add(random.nextInt(50));
        }
        for (int num : numbers) {
            if (collection.containsKey(num)){
                collection.put(num,(collection.get(num) + 1));
            }
            else {
                collection.put(num,1);
            }
        }

        System.out.print(numbers);
        System.out.println();
        collection.forEach((number, n) -> System.out.println(number + " - " + n));


    }
}
