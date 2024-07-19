package com.revature.DAOs;

import com.revature.models.Pet;

import java.util.ArrayList;

public interface PetDAOInterface {

    ArrayList<Pet> getPets();
    Pet insertPet(Pet pet);
    Pet getPetById(int id);

    boolean deletePet(int id);

    String updatePetHealthStatus(int petId, String newHealthStatus); // New method
}
