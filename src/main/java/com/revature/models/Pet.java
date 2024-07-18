package com.revature.models;

public class Pet {

    private int pet_id;
    private String name;
    private String species;
    private String breed;
    private int age;
    private char gender;
    private String adoption_status;
    private String description;

    //Constructors
    public Pet() {
    }

    public Pet(int pet_id, String name, String species, String breed, int age, char gender, String adoption_status, String description) {
        this.pet_id = pet_id;
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.adoption_status = adoption_status;
        this.description = description;
    }

    //Setters & Getters

    public int getPet_id() {
        return pet_id;
    }

    public void setPet_id(int pet_id) {
        this.pet_id = pet_id;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getAdoption_status() {
        return adoption_status;
    }

    public void setAdoption_status(String adoption_status) {
        this.adoption_status = adoption_status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //toString

    @Override
    public String toString() {
        return "Pet{" +
                "pet_id=" + pet_id +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", adoption_status='" + adoption_status + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}


