package Home_Task;

public class Home_Task_lesson_3 {
    public static void main(String[] args) {
        // task 1
        int i1 = 5, i2 = 11;
        double d1 = 5.5, d2 = 1.3, result = 0;
        long l = 20l;

        result = i2 / d1 + d2 % i1 - l;

        System.out.println("result = " + result);

        int a = 5, b = 8;

        System.out.println("a = " + (a-- - --a + ++a + a++ + a));
        System.out.println("b = " + (++b - b++ + ++b - --b));

        //task 2
        int x = 10, y = 12, z = 3;

        System.out.println("result = " + (x += y - x++ * z));
        System.out.println("result = " + (z = --x - y * 5));
        System.out.println("result = " + (y /= x + 5 % z));
        System.out.println("result = " + (z = x++ + y * 5));
        System.out.println("result = " + (x = y - x++ * z));
    }
}