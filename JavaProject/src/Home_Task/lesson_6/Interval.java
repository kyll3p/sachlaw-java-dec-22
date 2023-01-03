package Home_Task.lesson_6;

import java.util.Scanner;

public class Interval {
    /*Напишите программу определения, попадает ли указанное пользователем число от 0 до 100 в числовой
    промежуток [O - 14] [15 - 35] [36 - 50][50 - 100]. Если да, то укажите, в какой именно промежуток. Если
    пользователь указывает число, не входящее ни в один из имеющихся числовых промежутков, то
    выводится соответствующее сообщение.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = input.nextInt();

        if (n >= 0 && n <= 14) {
            System.out.println("You are between 0 and 14");
        } else if (n >= 15 && n <= 35) {
            System.out.println("You are between 15 and 35");
        } else if (n >= 36 && n <= 50) {
            System.out.println("You are between 36 and 50");
        } else if (n >= 50 && n <= 100) {
            System.out.println("You are between 50 and 100");
        } else {
            System.out.println("You entered an invalid number");
        }
        input.close();
    }
}
