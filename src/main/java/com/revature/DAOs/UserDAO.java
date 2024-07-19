package com.revature.DAOs;

import com.revature.models.Pet;
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
                        rs.getString("name"),
                        rs.getString("username"),
                        rs.getString("email"),
                        rs.getString("password"),
                        null


                );

                PetDAO pDAO = new PetDAO();
                Pet pet = pDAO.getPetById(rs.getInt("pet_id_fk"));
                u.setPet(pet);
                users.add(u);
            }
            return users;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to get users");
        }
        return null;
    }


    @Override
    public User insertUser(User user) {
        try (Connection conn = ConnectionUtil.getConnection()) {
            String sql = "INSERT INTO users (name, username, email, password, pet_id_fk ) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, user.getName());
            ps.setString(2, user.getUsername());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getPassword());
            ps.setInt(5, user.getPet_id_fk());

            ps.executeUpdate();

            return user;

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to insert user");
        }
        return null;
    }

    @Override
    public boolean deleteUser(int id) {
        try (Connection conn = ConnectionUtil.getConnection()) {
            String sql = "DELETE FROM users WHERE user_id_pk = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to delete user");
        }
        return false;
    }


}
