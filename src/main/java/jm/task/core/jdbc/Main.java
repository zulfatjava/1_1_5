package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("User1", "User1", (byte) 11);
        userService.saveUser("User2", "User2", (byte) 22);
        userService.saveUser("User3", "User3", (byte) 33);
        userService.saveUser("User4", "User4", (byte) 44);

        userService.getAllUsers();
        userService.dropUsersTable();
        userService.cleanUsersTable();


    }

}

