package com.revature.DAOs;

import com.revature.models.Pet;
import com.revature.utils.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;

public class PetDAO implements PetDAOInterface {

    @Override
    public ArrayList<Pet> getPets() {

            try (Connection conn = ConnectionUtil.getConnection()) {
                String sql = "SELECT * FROM pets";
                Statement s = conn.createStatement();
                ResultSet rs = s.executeQuery(sql);
                ArrayList<Pet> pets = new ArrayList<>();

                while (rs.next()) {
                    Pet p = new Pet(
                            rs.getInt("pet_id_pk"),
                            rs.getString("name"),
                            rs.getString("species"),
                            rs.getString("breed"),
                            rs.getInt("age"),
                            rs.getString("gender"),
                            rs.getString("adoption_status"),
                            rs.getString("description"),
                            rs.getInt("user_id_fk"),
                            rs.getString("adoption_date")
                    );

                    pets.add(p);
                }
                return pets;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        return null;
    }
}
