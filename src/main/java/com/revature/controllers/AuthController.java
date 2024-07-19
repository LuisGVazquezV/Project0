package com.revature.controllers;

import com.revature.models.LoginDTO;
import com.revature.models.User;
import com.revature.services.AuthService;
import io.javalin.http.Handler;
import jakarta.servlet.http.HttpSession;

public class AuthController {

    AuthService as = new AuthService();

    public static HttpSession ses;

    // Handler for login
    public Handler loginHandler = ctx -> {
        LoginDTO loginDTO = ctx.bodyAsClass(LoginDTO.class);

        User loggedInUser = as.login(loginDTO);

        if (loggedInUser != null) {
            ses = ctx.req().getSession();
            ses.setAttribute("username", loggedInUser.getUsername());
            ses.setAttribute("password", loggedInUser.getPassword());

            System.out.println(ses.getAttribute("username"));
            System.out.println(ses.getAttribute("password"));

            ses.invalidate();

            ctx.status(202);
            ctx.json(loggedInUser);

        } else {
            ctx.status(401);
            ctx.result("Invalid Username or Password");
        }
    };
}
