package lesson_5;

public class ExcludingOr {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;

        System.out.println(a + " ^ " + b + " = " + (a ^ b));
        System.out.println(a + " ^ " + c + " = " + (a ^ c));
    }
}
