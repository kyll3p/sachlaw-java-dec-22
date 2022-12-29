package lesson_4;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your money: ");
        int budget = input.nextInt();
        int drinkCost = 0;

        if (budget > 0) {
            System.out.println("1 - Espresso (40p)");
            System.out.println("2 - Cappuccino (80p)");
            System.out.println("3 - Americano (60p)");
            System.out.println("4 - Tea (10p)");

            System.out.println("Chose your drink: ");
            int userChoise = input.nextInt();

            switch (userChoise) {
                case 1:
                    drinkCost += 40;
                    break;
                case 2:
                    drinkCost += 80;
                    break;
                case 3:
                    drinkCost += 60;
                    break;
                case 4:
                    drinkCost += 10;
                    break;
                default:
                    System.out.println("Wrong number. . .");
                    break;
            }

            if (budget >= drinkCost) {
                System.out.println("Drink number " + userChoise + " was chosen.");
                System.out.println("Take your drink!");
                System.out.println("Your change is " + (budget - drinkCost));

                budget -= drinkCost;
                System.out.println("budget = " + budget);
            } else {
                System.out.println("Your budget " + budget + " is not enough to buy drink  with a cost  " + drinkCost);
            }

        } else if (budget == 0) {
            System.out.println("Your budget is 0");
        } else {
            System.out.println("You have not a budget at all! Go to work!");
        }
    }
}
