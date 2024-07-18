package com.revature;

import com.revature.utils.ConnectionUtil;

import java.sql.*;

public class Launcher {

    public static void main(String[] args) {

        try(Connection conn = ConnectionUtil.getConnection()){
            System.out.println("Conection Successful!");
        }catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connection Failed!");
        }


    }//end of main
}
