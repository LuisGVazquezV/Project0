package com.revature.models;

import com.revature.DAOs.UserDAO;
import com.revature.DAOs.UserDAOInterface;

public class Pet {


    private int pet_id_pk;
    private String species;
    private String breed;
    private String name;
    private int age;
    private String health_status;

    public Pet() {
    }

    public Pet(int pet_id_pk, String species, String breed, String name, int age, String health_status) {
        this.pet_id_pk = pet_id_pk;
        this.species = species;
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.health_status = health_status;
    }

    public int getPet_id_pk() {
        return pet_id_pk;
    }

    public void setPet_id_pk(int pet_id_pk) {
        this.pet_id_pk = pet_id_pk;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHealth_status() {
        return health_status;
    }

    public void setHealth_status(String health_status) {
        this.health_status = health_status;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "pet_id_pk=" + pet_id_pk +
                ", species='" + species + '\'' +
                ", breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", health_status='" + health_status + '\'' +
                '}';
    }
}
