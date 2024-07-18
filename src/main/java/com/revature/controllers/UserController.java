package com.revature.controllers;
import com.revature.models.User;
import com.revature.services.UserService;
import io.javalin.http.Handler;

import java.util.ArrayList;

public class UserController {

    UserService us = new UserService();

    public Handler getUserHandler = ctx -> {
        ArrayList<User> users = us.getUsers();
        ctx.json(users);
        ctx.status(200);
    };

}
