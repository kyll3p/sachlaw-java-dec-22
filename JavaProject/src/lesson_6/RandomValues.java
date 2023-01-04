package lesson_6;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ThreadPoolExecutor;

public class RandomValues {
    public static void main(String[] args) {
        Random random = new Random();
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();

        int randomInt = random.nextInt();
        int randomIntWithBound = random.nextInt(10);
        double randomDouble = random.nextDouble();

        System.out.println("randomInt = " + randomInt);
        System.out.println("randomDouble = " + randomDouble);
        System.out.println("randomIntWithBound = " + randomIntWithBound);

        int randomIntWithBounds = threadLocalRandom.nextInt(10, 20);
        System.out.println("randomIntWithBounds = " + randomIntWithBounds);
    }
}
