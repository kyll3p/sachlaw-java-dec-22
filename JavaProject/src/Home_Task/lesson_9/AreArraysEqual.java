package Home_Task.lesson_9;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AreArraysEqual {

    /*Создате метод которыи получит два параметра: два массива int
    Метод проверит массивы. Если они равны (длина и значения) вернет true. Если нет то false
    Делаем через два способа:
    - Своя реализация
    - Arrays*/
    public static void main(String[] args) {
        int arrayFirst[] = {1, 2, 3, 4, 5};
        int arraySecond[] = {1, 2, 3, 4, 5};

        System.out.println(getArraysEquals(arrayFirst, arraySecond));

        System.out.println(getArray(arrayFirst, arraySecond));
    }

    public static boolean getArray (int[] a1, int[] a2) {
        if (a1 == a2) {
            return true;
        }

        if (a1 == null || a2 == null || a1.length != a2.length) {
            return false;
        }

        for (int i = 0; i < a1.length; i++)
        {
            if (a1[i] != (a2[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean getArraysEquals (int[] a1, int[] a2) {
        Boolean result = Arrays.equals(a1, a2);
        return result;
    }
}
