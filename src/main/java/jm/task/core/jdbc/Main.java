package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Мария", "Петрова", (byte) 25);
        System.out.println("User с именем — Мария добавлен в базу данных");

        userService.saveUser("Иван", "Иванов", (byte) 32);
        System.out.println("User с именем — Иван добавлен в базу данных");

        userService.saveUser("Екатерина", "Сергеева", (byte) 40);
        System.out.println("User с именем — Екатерина добавлен в базу данных");

        userService.saveUser("Михаил", "Васильев", (byte) 55);
        System.out.println("User с именем — Михаил добавлен в базу данных");


        userService.getAllUsers().forEach(System.out::println);

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
