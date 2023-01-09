package lesson_7;

import java.util.ArrayList;
import java.util.Random;

public class CustomerArrayList {

    /*Используя IntelliJ IDEA, создайте класс CustomerArrayList.
    Создайте ArrayList на 10 чисел.
            Требуется:
    Вывести на экран: наибольшее значение массива, наименьшее значение массива,
    общую сумму всех элементов, среднее арифметическое всех элементов, вывести все нечетные значения.
    Используем forEach
    *Double. MIN_VALUE, Double.MAX_VALUE;*/
    public static void main(String[] args) {

        ArrayList<Double> arrayList = new ArrayList<>();
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double sum = 0;

        for (int i = 0; i < 10; i++) {
            arrayList.add(Math.random() * 100);
        }

        System.out.println("\narrayList.size() = " + arrayList.size());

        for (Double number : arrayList) {
            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }

            sum += number;
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("sum = " + sum);
        System.out.println("Average = " + (sum / arrayList.size()));

        arrayList.forEach(System.out::println);

        /*for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
            System.out.println("myArray[i] = " + myArray[i]);

            if (myArray[i] > max) {
                max = myArray[i];
            }

            if (myArray[i] < min) {
                min = myArray[i];
            }

            sum += myArray[i];

            if (myArray[i] % 2 != 2) {
                System.out.println("Odd numbers = " + i);
            }
        }


        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("sum = " + sum);
        System.out.println("Average = " + (sum/ myArray.length));*/

    }
}
