package com.example.drop;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static com.example.connection.ConnectionClass.getConnection;

public class DropTables {
    private static final String DROP_ROLES = "DROP TABLE IF EXISTS roles";
    private static final String DROP_USERS = "DROP TABLE IF EXISTS users";
    private static Connection connection;

    public static void dropTableUsers() throws SQLException, ClassNotFoundException {
        connection = getConnection();
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(DROP_USERS);
        }
    }

    public static void dropTableRoles() throws SQLException, ClassNotFoundException {
        connection = getConnection();
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(DROP_ROLES);
        }
    }
}
