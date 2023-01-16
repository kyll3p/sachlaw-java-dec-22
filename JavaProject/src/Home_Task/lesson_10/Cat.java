package Home_Task.lesson_10;

import java.util.Scanner;

public class Cat {
    /*Создайте класс Cat.
    У класса будут 3 поля: name, color, age.
    • Создайте конструктор.
    • Создайте getters, setters.
    • Создайте toString()
    • Создайте класс MyCats и создайте метод main.
    • Создайте список из 5 котов.
    • Создайте цикл который пройдется по списку и напечатает информацию о каждом котенке.*/
    private String name;
    private String color;
    private int age;

    Scanner input = new Scanner(System.in);

    public Cat(String name, String color, int age) {
        while (age < 0 || age > 20) {
            System.out.println("Your age " + age + " is not valid. Try Again...");
            age = input.nextInt();
        }
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        while (age < 0 || age > 20) {
            System.out.println("Your age " + age + " is not valid. Try Again...");
            age = input.nextInt();
        }

        this.age = age;
    }

    public void printCat () {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
