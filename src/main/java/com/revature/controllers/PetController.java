package com.revature.controllers;

import com.revature.models.Pet;
import com.revature.services.PetService;
import io.javalin.http.Handler;

import java.util.ArrayList;

public class PetController {

    PetService ps = new PetService();

    public Handler getPetHandler = ctx -> {
        ArrayList<Pet> pets = ps.getPets();
        ctx.json(pets);
        ctx.status(200);
    };

}
