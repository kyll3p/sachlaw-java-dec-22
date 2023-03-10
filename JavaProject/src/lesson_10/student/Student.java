package lesson_10.student;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;

    public Scanner input = new Scanner(System.in);;

    public Student(String name, int age) {
        while (age < 18 || age > 100) {
            System.out.println("Your age " + age + " is not valid. Try Again...");

            age = input.nextInt();
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        while (age < 18 || age > 100) {
            System.out.println("Your age " + age + " is not valid. Try Again...");

            age = input.nextInt();
        }

        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
