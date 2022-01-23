package com.example.creation;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static com.example.connection.ConnectionClass.getConnection;

public class TableCreation {
    private static Connection connection;
    private static final String DROP_ROLES = "DROP TABLE IF EXISTS roles";
    private static final String DROP_USERS = "DROP TABLE IF EXISTS users";
    private static final String CREATE_TABLE_ROLE = "CREATE TABLE  roles " +
            "(role_id INT NOT NULL PRIMARY KEY," +
            "roleName VARCHAR(256) NOT NULL)";

    private static final String CREATE_TABLE_USER = "CREATE TABLE users " +
            "(id INT NOT NULL PRIMARY KEY, " +
            "role_id INT NOT NULL, " +
            "login VARCHAR(256) NOT NULL, " +
            "password VARCHAR(256) NOT NULL," +
            "email VARCHAR(256) NOT NULL," +
            "firstName VARCHAR(256) NOT NULL," +
            "lastName VARCHAR(256) NOT NULL," +
            "birthday DATE NOT NULL," +
            "FOREIGN KEY (role_id) REFERENCES roles(role_id))";

    public static void createTableUsers() throws SQLException, ClassNotFoundException {
        connection = getConnection();
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(DROP_USERS);
            statement.executeUpdate(CREATE_TABLE_USER);
        }
    }

    public static void createTableRoles() throws SQLException, ClassNotFoundException {
        connection = getConnection();

        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(DROP_ROLES);
            statement.executeUpdate(CREATE_TABLE_ROLE);
        }
    }
}
