package Home_Task;

import java.util.Scanner;

public class UserSystem {
    /*Создайте класс UserSystem.
    Создайте две переменные:
    String username = "Admin";
    String password = "P@ssword";I
    Получите данные и сравните с username. Если данные не верны то выведите:
            "Нет пользователя с таким именем!"
    Если верно то попросите ввести пароль. Сравните с password. Если данные не верны то выведите:
            "Вы ввели неверный пароль!"
    Если ланные верны то вывелите:
            "Здравствуйте " + username + ", Вы вошли в систему."*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName = "Admin";
        String password = "P@ssword";

        System.out.println("Enter your username: ");
        String newUserName = input.nextLine();

        if (userName.equals(newUserName)) {
            System.out.println("Enter your password: ");
            String newPassword = input.nextLine();
            if (password.equals(newPassword)) {
                System.out.println("Welcome " + userName + " you are logged in");
            } else {
                System.out.println("Wrong password...");
            }
        } else {
            System.out.println("No user with this name " + newUserName);
        }
        input.close();
    }
}
