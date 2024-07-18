package com.revature.DAOs;

import com.revature.models.User;

import java.util.ArrayList;

public interface UserDAOInterface {

    public ArrayList<User> getUsers();

    User insertUser(User user);

}
