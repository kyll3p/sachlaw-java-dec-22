package lesson_4;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 6;
        String result;

        /*if(a == b) {
            result = "a and b are equal";
        } else {
            result = "a and b are not equal";
        }
        System.out.println("result = " + result);*/

        result = (a == b) ? "a and b are equal" : "a and b are not equal";
        System.out.println("result = " + result);

        result = (a == c) ? "a and c are equal" : "a and c are not equal";
        System.out.println("result = " + result);

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age... ");
        int age = input.nextInt();
        String whoAreYou;

//        if (age >= 18) {
//            System.out.println("You are adult");
//        }   else {
//            System.out.println("You are young");
//        }

        whoAreYou = (age == 18) ? "You are 18 yers old" : (age > 18) ? "You are adult" : "You are young";
        System.out.println("whoAreYou = " + whoAreYou);
    }
}
