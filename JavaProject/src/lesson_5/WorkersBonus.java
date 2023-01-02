package lesson_5;

import java.util.Scanner;

public class WorkersBonus {

    /*Напишите программу расчета начисления премий сотрудникам.
    Премии рассчитываются согласно выслуге лет.
    Если выслуга до 5 лет, премия составляет 10% от заработной платы.
    Если выслуга от 5 лет (включительно) до 10 лет, премия составляет 15% от заработной платы.
    Если выслуга от 10 лет (включительно) до 15 лет, премия составляет 25% от заработной платы.
    Если выслуга от 15 лет (включительно) до 20 лет, премия составляет 35% от заработной платы.
    Если выслуга от 20 лет (включительно) до 25 лет, премия составляет 45% от заработной платы.
    Если выслуга от 25 лет (включительно) и более, премия составляет 50% от заработной платы.
    Результаты расчета, выведите на экран:
            - Размер бонуса
            - Новая зарплата*/
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        System.out.println("Enter your salary: ");
        double salary = input.nextInt();
        System.out.println("Enter your experience: ");
        double experience = input.nextInt();
        double premium;

        if (experience > 0 && experience < 5) {
            premium = salary * 0.1;
        } else if (experience >= 5 && experience < 10) {
            premium = salary * 0.15;
        } else if (experience >= 10 && experience < 15) {
            premium = salary * 0.25;
        } else if (experience >= 15 && experience < 20) {
            premium = salary * 0.35;
        } else if (experience >= 20 && experience < 25) {
            premium = salary * 0.45;
        } else if (experience >= 25) {
            premium = salary * 0.50;
        } else {
            System.out.println("Wrong");
            return;
        }

        System.out.println("Premium = " + premium);
        System.out.println("New salary = " + (premium + salary));

        input.close();
    }
}
