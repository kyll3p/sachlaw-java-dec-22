package lesson_6;

import java.util.ArrayList;

public class Collection_ArrayList {
    public static void main(String[] args) {
        int array[] = new int[3];

        ArrayList<Integer> myArrayList = new ArrayList<>();


        System.out.println("myArrayList.size() = " + myArrayList.size());
        myArrayList.add(5);
        myArrayList.add(7);
        System.out.println("myArrayList.size() = " + myArrayList.size());
        
//        iter
        for (Integer number : myArrayList) {
            System.out.println(number);
        }
//    расширение коллекции
        for (int i = 0; i < 15; i++) {
            myArrayList.add(i);
        }

        myArrayList.add(9, 4);
        System.out.println("myArrayList.size() = " + myArrayList.size());

        System.out.println("myArrayList.get(3) = " + myArrayList.get(3));
        myArrayList.add(3, 7);
        myArrayList.add(0, 24);
        System.out.println("myArrayList.get(3) = " + myArrayList.get(3));

        myArrayList.forEach(number -> System.out.print(number + " "));
//        System.out.println("myArrayList.indexOf(5) = " + myArrayList.indexOf(5));
//        System.out.println("myArrayList.indexOf(7) = " + myArrayList.indexOf(7));
//        System.out.println("myArrayList.indexOf(8) = " + myArrayList.indexOf(8));
    }
}
