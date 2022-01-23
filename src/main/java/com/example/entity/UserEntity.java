package com.example.entity;

import java.util.Date;

public class UserEntity {

    public UserEntity() {
    }

    private Long id;


    public UserEntity(long l, long l1, String login, String password, String email, String firstname,
                      String lastname, java.sql.Date date) {
        this.id = id;
        this.role_id = role_id;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }


    public Long getRole_id() {
        return role_id;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }

    private Long role_id;
    private static String login;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private Date birthday;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static String getLogin() {
        return login;
    }

    public static void setLogin(String login) {
        UserEntity.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

}
