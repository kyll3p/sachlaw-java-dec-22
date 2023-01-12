package lesson_9.methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static java.util.Collections.list;

public class MaxMinArray {

    /*Создайте новый класс MaxMinArray. Создайте точку входа (static main method)
    Созпайте 3 метола. Каждый метод получит массив из 10 значений и возвратит:
    - первый метод - самое маленькое значение
    - второй метод  - самос большос значение
    - Третий метол - среднее арифметическое*/

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(100));

            System.out.println(arrayList);
        }

        getMin(arrayList);
        getMax(arrayList);
        getAverage(arrayList);
    }

    public static void getMin (ArrayList<Integer> list) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        System.out.println("min = " + min);
    }

//    public static void getMax (ArrayList<Integer> list) {
//        int max = Integer.MIN_VALUE;
//
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) > max) {
//                max = list.get(i);
//            }
//        }
//        System.out.println("max = " + max);
//    }

    public static void getMax (ArrayList<Integer> list) {
        Collections.sort(list);

        System.out.println("max = " + list.get(list.size() - 1));
    }

    public static void  getAverage (ArrayList<Integer> list) {
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        System.out.println("sum = " + sum);
    }
}
