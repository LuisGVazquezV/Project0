package com.revature.models;

public class User {

    private int user_id_pk;
    private String username;
    private String password;
    private String email;
    private String phone_number;
    private String address;

    //Constructors
    public User() {
    }

    public User(int user_id_pk, String username, String password, String email, String phone_number, String address) {
        this.user_id_pk = user_id_pk;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone_number = phone_number;
        this.address = address;
    }

    //Getters & Setters
    public int getUser_id() {
        return user_id_pk;
    }

    public void setUser_id(int user_id) {
        this.user_id_pk = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //toString
    @Override
    public String toString() {
        return "User{" +
                "user_id_pk=" + user_id_pk +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
