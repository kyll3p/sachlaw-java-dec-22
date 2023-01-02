package lesson_5.loopsa;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter number:  ");
        int a = input.nextInt();

        while (a < 10) {
            a++;
            System.out.println("a = " + a);
        }*/

        int a = 0;

        while (a < 1000) {
            if (a % 5 == 0 && a != 0) {
                System.out.println("a = " + a);
            }

            a++;
        }
    }
}
