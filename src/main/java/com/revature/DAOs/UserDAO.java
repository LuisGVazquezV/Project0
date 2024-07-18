package com.revature.DAOs;

import com.revature.models.User;
import com.revature.utils.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;

public class UserDAO implements UserDAOInterface {

    @Override
    public ArrayList<User> getUsers() {

        try (Connection conn = ConnectionUtil.getConnection()) {

            String sql = "SELECT * FROM users";
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(sql);

            ArrayList<User> users = new ArrayList<>();

            while (rs.next()) {
                User u = new User(
                        rs.getInt("user_id_pk"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("email"),
                        rs.getString("phone_number"),
                        rs.getString("address")
                );

                users.add(u);
                System.out.println("users: " + users);
            }
            return users;


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User insertUser(User user) {

        try (Connection conn = ConnectionUtil.getConnection()) {

            String sql = "INSERT INTO users (username, password, email, phone_number, address) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getPhone_number());
            ps.setString(5, user.getAddress());
            ps.execute();
            return user;


        }catch (SQLException e) {
            e.printStackTrace();
        }


        return null;
    }
}
