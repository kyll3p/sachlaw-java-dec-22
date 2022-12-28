package lesson_4;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        String name = "Sergei";
        String anotherName = "Sergei";
        boolean areEqual = name.equals(anotherName);

        System.out.println("areEqual = " + areEqual);

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age... ");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("You are adult");
        }   else {
            System.out.println("You are young");
        }
    }
}
