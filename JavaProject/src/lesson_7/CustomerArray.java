package lesson_7;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CustomerArray {
    public static void main(String[] args) {
        /*Создайте массив на 10 чисел double.
                Требуется:
        Вывести на экран: наибольшее значение массива, наименьшее значение массива,
        общую сумму всех элементов, среднее арифметическое всех элементов, вывести все нечетные значения.
        Используем forEach *Double.MIN_VALUE, Double.MAX_VALUE;*/
        Random random = new Random();
        double myArray[] = new double[10];

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double sum = 0;

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (100 * random.nextDouble());

            if (myArray[i] > max) {
                max = myArray[i];
            }
            if (myArray[i] < min) {
                min = myArray[i];
            }
            sum += myArray[i];
        }
        for (double v : myArray) {
            if (v % 2 != 0) {
                System.out.println("v = " + v);
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("sum = " + sum);
        System.out.println("Average = " + (sum / myArray.length));

        /*double myArray2[] = ThreadLocalRandom.current().doubles(10, 0, 100).toArray();
        for (double number : myArray2) {
            System.out.println(number);
        }*/
    }
}
