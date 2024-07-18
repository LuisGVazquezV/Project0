package com.revature.services;

import com.revature.DAOs.PetDAO;
import com.revature.models.Pet;

import java.util.ArrayList;

public class PetService {

    PetDAO pDAO = new PetDAO();

    public ArrayList<Pet> getPets(){return pDAO.getPets();}
}
