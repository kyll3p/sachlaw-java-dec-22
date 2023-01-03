package Home_Task.lesson_6;

import java.util.Scanner;

public class authorization {
    /*Напишите программу которая принимает от пользователя username и password.
    Программа сравнит с данными в системе (заранее напишите правильные данные для сравнения).
       • Если данные верны - мы получим приветствие.
       • Если данные не верны - получаем сообщение и вводим данные ещё раз.
       • После 5 неверных попыток программа сообщит об этом и завершит работу.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = "Sergei";
        String password = "123pas";

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your username: ");
            String newName = input.nextLine();

            if (name.equalsIgnoreCase(newName)) {
                for (int j = 0; j < 5; j++) {
                    System.out.println("Enter your password: ");
                    String newPassword = input.nextLine();

                    if (password.equals(newPassword)) {
                        System.out.println("Welcome " + newName);
                        i = 5;
                        break;
                    } else if (j > 3) {
                        System.out.println("Try to login after 30 minutes.");
                        i = 5;
                        break;
                    } else {
                        int t = 1;
                        t += j;
                        System.out.println(t + " try " + "Wrong, try again" );
                    }
                }
            } else if (i > 3){
                System.out.println("Try to login after 30 minutes.");
                break;
            } else {
                int t = 1;
                t += i;
                System.out.println(t + " try " + "Wrong, try again" );
            }
        }
        input.close();
    }
}
