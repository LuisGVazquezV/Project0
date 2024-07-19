package com.revature.utils;

import java.sql.*;


public class ConnectionUtil {

    public static Connection getConnection() throws SQLException{

        try{
            Class.forName("org.postgresql.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
            System.out.println("Problem Occurred Locating Driver");
        }

        String url = "jdbc:postgresql://localhost:5432/postgres?currentSchema=petmanagement";
        String username = "postgres";
        String password = "password";

        /* TODO:Could not get the env variables to work. Will look into it later.
        String url = System.getenv("P0_DB_URL");
        String username = System.getenv("P0_DB_USERNAME");
        String password = System.getenv("P0_DB_PASSWORD");*/

        return DriverManager.getConnection(url, username, password);
    }
}
