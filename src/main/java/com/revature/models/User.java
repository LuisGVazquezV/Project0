package com.revature.models;

public class User {

    private int user_id_pk;
    private String name;
    private String username;
    private String email;
    private String password;

    private Pet pet;

    private int pet_id_fk;

    public User() {
    }

    public User(int user_id_pk, String name, String username, String email, String password, Pet pet) {
        this.user_id_pk = user_id_pk;
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.pet = pet;
    }

    public User(String name, String username, String email, int pet_id_fk) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.pet_id_fk = pet_id_fk;
    }

    public int getUser_id_pk() {
        return user_id_pk;
    }

    public void setUser_id_pk(int user_id_pk) {
        this.user_id_pk = user_id_pk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public int getPet_id_fk() {
        return pet_id_fk;
    }

    public void setPet_id_fk(int pet_id_fk) {
        this.pet_id_fk = pet_id_fk;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id_pk=" + user_id_pk +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", pet=" + pet +
                '}';
    }
}
