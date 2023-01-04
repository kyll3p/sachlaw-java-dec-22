package Home_Task.lesson_7;

import java.util.Random;

public class CustomerArray {
    /*Создайте массив на 10 чисел double.
    Требуется:
    Вывести на экран: наибольшее значение массива, наименьшее значение массива, общую сумму всех элементов,
    среднее арифметическое всех элементов, вывести все нечетные значения.
    Используем forEach
    *Double.MIN_VALUE, Double.MAX_VALUE;*/
    public static void main(String[] args) {
        Random random = new Random();

        double array[] = new double[10];

        double max = array[0];
        double min = array[0];
        int sum = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[i] " + "№" + i + " " + array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }

        for (int i = 0; i < array.length; i++) {
            sum += i;
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("sum = " + sum);
    }
}
