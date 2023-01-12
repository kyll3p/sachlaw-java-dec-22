package lesson_9.methods;

import java.util.Date;

public class ReturnWithoutParams {
    public static void main(String[] args) {
        long randomNumber = getRandomNumber();
        System.out.println("randomNumber = " + randomNumber);
        System.out.println(getRandomNumber());
    }

    public static long getRandomNumber() {
        Date date = new Date();

        return date.getTime();
    }
}
