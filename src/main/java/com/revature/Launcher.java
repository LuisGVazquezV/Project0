package com.revature;

import com.revature.controllers.PetController;
import com.revature.controllers.UserController;
import com.revature.utils.ConnectionUtil;
import io.javalin.Javalin;

import java.sql.*;

public class Launcher {

    public static void main(String[] args) {

        //Instantiate Connection
        try(Connection conn = ConnectionUtil.getConnection()){
            System.out.println("Connection Successful!");
        }catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connection Failed!");
        }

        //Instantiate Server
        var app = Javalin.create().start(3000).get("/", ctx -> ctx.result("Hello Postman!"));

        //Instantiate Controllers
        UserController uc = new UserController();
        PetController pc = new PetController();

        app.get("/users", uc.getUserHandler);

        app.get("/pets", pc.getPetHandler);


    }//end of main
}
