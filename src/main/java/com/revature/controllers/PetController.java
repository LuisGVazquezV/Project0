package com.revature.controllers;

import com.revature.models.Pet;
import com.revature.services.PetService;
import io.javalin.http.Handler;

import java.sql.SQLException;
import java.util.ArrayList;

public class PetController {

    private final PetService ps = new PetService();

    // Handler for GET requests to /pets
    public Handler getPetsHandler = ctx -> {
        ArrayList<Pet> pets = ps.getPets();
        ctx.json(pets);
        ctx.status(200);
    };

    // Handler for GET requests to /pets/{id}
    public Handler getPetByIdHandler = ctx -> {
        int petId = Integer.parseInt(ctx.pathParam("id"));
        Pet pet = ps.getPetById(petId);
        if (pet == null) {
            ctx.status(404).result("Pet not found.");
        } else {
            ctx.status(200).json(pet);
        }
    };

    // Handler for POST requests to /pets
    public Handler insertPetHandler = ctx -> {
        Pet newPet = ctx.bodyAsClass(Pet.class);
        try {
            Pet insertedPet = ps.insertPet(newPet);
            ctx.status(201).json(insertedPet);
            ctx.result("Pet added successfully.");
        } catch (IllegalArgumentException e) {
            ctx.status(400).result(e.getMessage());
            ctx.result("Pet could not be added successfully");

        }
    };

    // Handler for DELETE requests to /pets/{id}
    public Handler deletePetHandler = ctx -> {
        int petId = Integer.parseInt(ctx.pathParam("id"));
        if (ps.deletePet(petId)) {
            ctx.status(200).result("Pet deleted successfully.");
        } else {
            ctx.status(404).result("Pet not found.");
        }
    };

    public Handler updatePetHealthStatusHandler = ctx -> {

        if(AuthController.ses != null){

            int petId = Integer.parseInt(ctx.pathParam("id"));
            String newHealthStatus = ctx.body();

            try {
                ps.updatePetHealthStatus(petId, newHealthStatus);
                ctx.status(202); // Accepted
                ctx.result("Pet health status of per with id " + petId + " has been updated to: " + newHealthStatus);
            } catch (IllegalArgumentException e) {
                ctx.status(400).result("Pet health status could not be updated.");
                ctx.result(e.getMessage());
            }
        }else{
            ctx.status(401).result("Unauthorized");
            ctx.result("You must be logged in to update pet health status.");
        }

    };


}
