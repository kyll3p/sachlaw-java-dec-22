package Home_Task.lesson_7;

import java.util.HashMap;

public class Country {

    /*Используя IntelliJ IDEA, создайте класс Countries
    Создать HashMap заполнить <String, String> (<City, Country>)
    Вывести на экран: Каждую страну.
    Вывести на экран: Город - Страна.
    Попробывать метод как ContainsKey, ContainsValue*/
    public static void main(String[] args) {
        HashMap <String, String> hashMap = new HashMap<>();
        hashMap.put("Moscow", "Russia");
        hashMap.put("Jerusalem", "Israel");
        hashMap.put("Washington", "USA");
        hashMap.put("Athens", "Greece");
        hashMap.put("Berne", "Switzerland");

        hashMap.forEach((City, Country) -> System.out.println(Country));
        System.out.println("");
        hashMap.forEach((City, Country) -> System.out.println(City + " - " + Country));
        System.out.println("");
        System.out.println(hashMap.containsKey("Moscow"));
        System.out.println(hashMap.containsKey("Berlin"));
        System.out.println(hashMap.containsValue("Israel"));
        System.out.println(hashMap.containsValue("Finland"));
    }
}
