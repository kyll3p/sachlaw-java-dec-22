package Home_Task;

public class Home_Task_lesson_3 {
    public static void main(String[] args) {
        // task 1
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20l;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;

        System.out.println("result = " + result);

        int a = 5;
        int b = 8;

        System.out.println("a = " + (a-- - --a + ++a + a++ + a));
        System.out.println("b = " + (++b - b++ + ++b - --b));

        //task 2
        int x = 10, y = 12, z = 3;
        System.out.println("x = " + (x += y - x++ * z));
        System.out.println("x = " + (z = --x - y * 5));
        System.out.println("x = " + (y /= x + 5 % z));
        System.out.println("x = " + (z = x++ + y * 5));
        System.out.println("x = " + (x = y - x++ * z));
    }
}
