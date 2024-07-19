package com.revature.models;

public class User {

    private int user_id_pk;
    private String username;
    private String email;
    private String password;

    // Constructors, getters, setters, and toString method

    public User() {}

    public User(int user_id_pk, String username, String email, String password) {
        this.user_id_pk = user_id_pk;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public int getUser_id() {
        return user_id_pk;
    }

    public void setUser_id(int user_id_pk) {
        this.user_id_pk = user_id_pk;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id_pk=" + user_id_pk +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
