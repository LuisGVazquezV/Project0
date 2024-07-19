package com.revature.controllers;

import com.revature.models.User;
import com.revature.services.UserService;
import io.javalin.http.Handler;

import java.sql.SQLException;
import java.util.ArrayList;

public class UserController {

    private final UserService us = new UserService();

    // Handler for GET requests to /users
    public Handler getUsersHandler = ctx -> {
        ArrayList<User> users = us.getUsers();
        ctx.json(users);
        ctx.status(200);
    };

    // Handler for POST requests to /users
    public Handler insertUserHandler = ctx -> {
        User newUser = ctx.bodyAsClass(User.class);
        try {
            User insertedUser = us.insertUser(newUser);
            ctx.status(201).json(insertedUser);
            ctx.result("User created successfully.");
        } catch (IllegalArgumentException e) {
            ctx.status(400).result("Invalid username or email.");
        }
    };

    // Handler for DELETE requests to /users/{id}
    public Handler deleteUserHandler = ctx -> {
        int userId = Integer.parseInt(ctx.pathParam("id"));
        if (us.deleteUser(userId)) {
            ctx.status(200).result("User deleted successfully.");
        } else {
            ctx.status(404).result("User not found.");
        }
    };
}
