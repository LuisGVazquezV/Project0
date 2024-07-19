package com.revature.services;

import com.revature.DAOs.PetDAO;
import com.revature.models.Pet;

import java.util.ArrayList;

public class PetService {

    private final PetDAO pDAO = new PetDAO();

    public ArrayList<Pet> getPets() {
        return pDAO.getPets();
    }

    public Pet getPetById(int user_id_pk) {
        return pDAO.getPetById(user_id_pk);
    }

    public Pet insertPet(Pet pet) throws IllegalArgumentException {
        if (pet.getName() == null || pet.getName().isEmpty()) {
            throw new IllegalArgumentException("Pet name cannot be empty.");
        }
        if (pet.getSpecies() == null || pet.getSpecies().isEmpty()) {
            throw new IllegalArgumentException("Species cannot be empty.");
        }
        if (pet.getAge() <= 0) {
            throw new IllegalArgumentException("Age must be a positive number.");
        }
        return pDAO.insertPet(pet);
    }

    public boolean deletePet(int id) {
        return pDAO.deletePet(id);
    }

    public String updatePetHealthStatus(int petId, String newHealthStatus) {
        if (petId <= 0) {
            throw new IllegalArgumentException("Pet ID must be a positive number!");
        }
        if (newHealthStatus == null || newHealthStatus.trim().isEmpty()) {
            throw new IllegalArgumentException("Health status must not be empty!");
        }

        return pDAO.updatePetHealthStatus(petId, newHealthStatus);
    }
}
