package com.example.app;

import com.example.connection.ConnectionClass;
import com.example.creation.TableCreation;
import com.example.drop.DropTables;
import com.example.entity.RoleEntity;
import com.example.entity.UserEntity;

import java.sql.SQLException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, ParseException {
        DropTables.dropTableUsers();
        DropTables.dropTableRoles();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        RoleEntity role = new RoleEntity(2L, "guest");
        UserEntity user = new UserEntity(1L, 1L, "login", "password", "email",
                "firstName", "lastName", (Date) dateFormat.parse("1980/11/12"));

//        TableCreation.createTableRoles();
//        TableCreation.createTableUsers();


    }
}
