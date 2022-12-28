package lesson_4;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age... ");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("You are adult");
        }   else {
            System.out.println("You are young");
        }*/

        int number;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number: ");
        number = input.nextInt();
        String whoAreYou;


        if(number % 2 == 0) {
            System.out.println("Number " + number + " is even");
        } else {
            System.out.println("Number " + number + " is odd");
        }
    }
}
