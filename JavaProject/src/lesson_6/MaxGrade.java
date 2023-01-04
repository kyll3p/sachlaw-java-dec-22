package lesson_6;

import java.util.Random;

public class MaxGrade {
    /*Создать массив размера 5 элементов, заполнить его произвольными целыми значениями.
    Создать массив размера 5 элементов, заполнить его произвольными именами.
    Вывести на экран: Имя и оценку отличника.*/
    public static void main(String[] args) {
        Random random = new Random();
        int grades[] = new int[5];
        String names[] = {"Irina", "Roman", "Gleb", "Sergei", "Olga"};

        int maxGrade = grades[0];
        int index = 0;

        for (int i = 0; i < grades.length; i++) {
            grades[i] = random.nextInt(100);
        }

        for (int i = 0; i < grades.length; i++) {
            System.out.println(names[i] + " - " + grades[i]);
        }

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > maxGrade) {
                maxGrade = grades[i];
                index = i;
            }
        }

        System.out.println("The best student is " + names[index] + " with grade " + grades[index]);
    }
}
