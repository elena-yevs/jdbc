package com.example.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
    private static final String DRIVER = "org.h2.Driver";
  //  private static final String DATABASE_URL = "jdbc:h2:C:\\Nix-Jun\\jdbc\\database.mv.db";
    private static final String USERNAME = "elena";
    private static final String PASSWORD = "12345";
   private static Connection connection;

    private static final String DATABASE_URL = "jdbc:h2:C:\\Nix-Jun\\jdbc\\database.mv.db;INIT=RUNSCRIPT from 'classpath:create.sql'\\" +
            ";RUNSCRIPT from 'classpath:roles-init.sql'";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName(DRIVER);
        connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        return connection;

    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        getConnection();
        connection.close();
    }


}
