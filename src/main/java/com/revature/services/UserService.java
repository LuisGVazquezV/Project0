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

        if (user.getPassword() == null || user.getPassword().equals("")) {
            throw new IllegalArgumentException("Password cannot be null or empty");
        }

        if (user.getEmail() == null || user.getEmail().equals("")) {
            throw new IllegalArgumentException("Email cannot be null or empty");
        }

        uDAO.insertUser(user);

        return user;
    }


    public boolean deleteUser(int userId) {

        return uDAO.deleteUser(userId);
    }
}