package lesson_4;

import java.util.Scanner;

public class MinMaxAverage {
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        double min;
        double max;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        a = input.nextInt();

        System.out.println("Enter second number: ");
        b = input.nextInt();

        System.out.println("Enter third number: ");
        c = input.nextInt();

        average = (a + b + c) / 3;
        System.out.println("average = " + average);

        max = (a >= b) ? a : b;
        max = (max >= c) ? max : c;

        min = (a <= b) ? a : b;
        min = (min <= c) ? min : c;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
