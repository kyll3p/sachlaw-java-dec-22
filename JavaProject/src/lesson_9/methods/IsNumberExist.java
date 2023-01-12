package lesson_9.methods;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class IsNumberExist {
    /*Создайте метод которыи получит лва параметоа :
     - int myValue
     - int[] array
    Метод должен проверить массив на наличие числа и вернуть true или false.
    Массив можете прописать сами - числа получаем через scanner*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int arrayList[] = new int[10];
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = random.nextInt(20);
            System.out.print(arrayList[i] + " ");
        }

        System.out.println();
        System.out.println("Enter number: ");
        int number = input.nextInt();

        System.out.println(getBooleanWithStream(number, arrayList));

    }

    /*public static void getBoolean (int myValue, int[] array) {
        boolean value;
        for (int i = 0; i < array.length; i++) {
            if (myValue == array[i]) {
                myValue = array[i];
                System.out.println("There are matches");
                value = true;
                break;
            } else {
                System.out.println("Try again");
                value = false;
                break;
            }
        }
    }*/

    /*public static boolean getBoolean (int myValue, int[] array) {
        for (int number : array) {
            if(myValue == number) {
                return true;
            }
        }
        return false;
    }*/

    public static boolean getBooleanWithStream (int myValue, int[] array) {
        int founddValue = IntStream.range(0, array.length).filter(i -> myValue == array[i]).findFirst().orElse(-1);
        return founddValue != -1 ? true : false;
    }
}
