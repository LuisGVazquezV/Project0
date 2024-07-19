package com.revature.services;

import com.revature.DAOs.UserDAO;
import com.revature.models.User;

import java.util.ArrayList;

public class UserService {

    private final UserDAO uDAO = new UserDAO();

    public ArrayList<User> getUsers() {
        return uDAO.getUsers();
    }

    public User getUserById(int id) {
        return uDAO.getUserById(id);
    }

    public User insertUser(User user) throws IllegalArgumentException {
        if (user.getUsername() == null || user.getUsername().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty.");
        }
        if (user.getEmail() == null || user.getEmail().isEmpty()) {
            throw new IllegalArgumentException("Email cannot be empty.");
        }
        if (user.getPassword() == null || user.getPassword().isEmpty()) {
            throw new IllegalArgumentException("Password cannot be empty.");
        }
        return uDAO.insertUser(user);
    }

    public boolean deleteUser(int id) {
        return uDAO.deleteUser(id);
    }
}
