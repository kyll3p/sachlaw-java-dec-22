package lesson_6;

public class Arrays_02_ForEach {
    public static void main(String[] args) {
        int arrayOfNumbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        /*for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.print(arrayOfNumbers[i] + " ");
        }*/
        int array[] = new int[10];

        for (int number : array) {
            number = 5;
        }

        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
