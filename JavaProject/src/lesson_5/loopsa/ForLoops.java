package lesson_5.loopsa;

public class ForLoops {
    public static void main(String[] args) {
        for (int i = 1000; i >= 0; i--) {
            if (i % 2 == 0 && i != 0) {
                System.out.println(i);
            }
        }
    }
}
