package com.revature.DAOs;

import com.revature.models.Pet;
import com.revature.models.User;
import com.revature.utils.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;

public class PetDAO implements PetDAOInterface {

    @Override
    public ArrayList<Pet> getPets() {
        try (Connection conn = ConnectionUtil.getConnection()) {
            String sql = "SELECT * FROM pets";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            ArrayList<Pet> pets = new ArrayList<>();
            while (rs.next()) {
                Pet pet = new Pet(
                        rs.getInt("pet_id_pk"),
                        rs.getString("species"),
                        rs.getString("breed"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("health_status")
                                                );

                pets.add(pet);
            }
            return pets;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to get pets");
        }
        return null;
    }

    @Override
    public Pet getPetById(int id) {
        try (Connection conn = ConnectionUtil.getConnection()) {
            String sql = "SELECT * FROM pets WHERE pet_id_pk = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Pet pet = new Pet(
                        rs.getInt("pet_id_pk"),
                        rs.getString("species"),
                        rs.getString("breed"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("health_status")

                                                );
                return pet;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to get pet by ID");
        }
        return null;
    }


    @Override
    public Pet insertPet(Pet pet) {
        try (Connection conn = ConnectionUtil.getConnection()) {
            String sql = "INSERT INTO pets ( species, breed, name,  age, health_status) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pet.getName());
            ps.setString(2, pet.getSpecies());
            ps.setString(3, pet.getBreed());
            ps.setInt(4, pet.getAge());
            ps.setString(5, pet.getHealth_status());
            ps.executeUpdate();

            return pet;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Couldn't insert pet!");
        }
        return null;
    }

    @Override
    public boolean deletePet(int id) {
        try (Connection conn = ConnectionUtil.getConnection()) {
            String sql = "DELETE FROM pets WHERE pet_id_pk = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(" Couldn't delete pet!");
        }
        return false;
    }

    @Override
    public String updatePetHealthStatus(int petId, String newHealthStatus) {
        try (Connection conn = ConnectionUtil.getConnection()) {
            String sql = "UPDATE pets SET health_status = ? WHERE pet_id_pk = ?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, newHealthStatus);
            ps.setInt(2, petId);

            ps.executeUpdate();

            return newHealthStatus;

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Couldn't update pet health status!");
        }
        return null;
    }
}

