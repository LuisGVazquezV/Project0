package com.revature.models;

import com.revature.DAOs.UserDAO;
import com.revature.DAOs.UserDAOInterface;

public class Pet {


    private int pet_id_pk;
    private String name;
    private String species;
    private String breed;
    private int age;
    private String health_status;
    private int user_id_fk;

    public Pet() {
    }

    public Pet(int pet_id_pk, String name, String species, String breed, int age, String health_status, int user_id_fk) {
        this.pet_id_pk = pet_id_pk;
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.age = age;
        this.health_status = health_status;
        this.user_id_fk = user_id_fk;
    }

    public int getPet_id_pk() {
        return pet_id_pk;
    }

    public void setPet_id_pk(int pet_id_pk) {
        this.pet_id_pk = pet_id_pk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getUser_id_fk() {
        return user_id_fk;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "pet_id_pk=" + pet_id_pk +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", health_status='" + health_status + '\'' +
                ", user_id_fk=" + user_id_fk +
                '}';
    }

    public void setUser_id_fk(int user_id_fk) {
        this.user_id_fk = user_id_fk;
    }

}
