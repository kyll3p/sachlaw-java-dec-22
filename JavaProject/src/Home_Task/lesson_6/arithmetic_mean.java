package Home_Task.lesson_6;

public class arithmetic_mean {
//    Посчитать среднее арифметическое всех чисел от 0 до 100
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            sum += i;
        }

        int average = sum / 100;
        System.out.println("average = " + average);
    }
}
