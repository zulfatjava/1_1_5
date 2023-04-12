package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();

        userDaoHibernate.createUsersTable();
        userDaoHibernate.saveUser("User1", "User1", (byte) 11);
        userDaoHibernate.saveUser("User2", "User2", (byte) 22);
        userDaoHibernate.saveUser("User3", "User3", (byte) 33);
        userDaoHibernate.saveUser("User4", "User4", (byte) 44);

        userDaoHibernate.getAllUsers();
        userDaoHibernate.dropUsersTable();
        userDaoHibernate.cleanUsersTable();


    }

}

