package com.revature.services;

import com.revature.DAOs.UserDAO;
import com.revature.models.User;

import java.util.ArrayList;

public class UserService {
    UserDAO uDAO = new UserDAO();

    public ArrayList<User> getUsers() {
        return uDAO.getUsers();
    }

    public User insertUser(User user) throws IllegalArgumentException {

        if (user.getUsername() == null || user.getUsername().equals("")) {
            throw new IllegalArgumentException("Username cannot be null or empty");
        }
        return user;
    }
}