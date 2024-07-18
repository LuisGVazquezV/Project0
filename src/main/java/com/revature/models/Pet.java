package com.revature.models;

public class Pet {

    private int pet_id_pk;
    private String name;
    private String species;
    private String breed;
    private int age;
    private String gender;
    private String adoption_status;
    private String description;
    private int user_id_fk;
    private String adoption_date;

    //Constructors
    public Pet() {
    }

    public Pet(int pet_id_pk, String name, String species, String breed, int age, String gender, String adoption_status, String description, int user_id_fk, String adoption_date) {
        this.pet_id_pk = pet_id_pk;
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.adoption_status = adoption_status;
        this.description = description;
        this.user_id_fk = user_id_fk;
        this.adoption_date = adoption_date;
    }

    //Setters & Getters

    public int getPet_id() {
        return pet_id_pk;
    }

    public void setPet_id(int pet_id) {
        this.pet_id_pk = pet_id;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
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

    public int getUser_id_fk() {
        return user_id_fk;
    }

    public void setUser_id_fk(int user_id_fk) {
        this.user_id_fk = user_id_fk;
    }

    public String getAdoption_date() {
        return adoption_date;
    }

    public void setAdoption_date(String adoption_date) {
        this.adoption_date = adoption_date;
    }

    //toString


    @Override
    public String toString() {
        return "Pet{" +
                "pet_id_pk=" + pet_id_pk +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", adoption_status='" + adoption_status + '\'' +
                ", description='" + description + '\'' +
                ", user_id_fk=" + user_id_fk +
                ", adoption_date='" + adoption_date + '\'' +
                '}';
    }

    public void setAdoptionStatus(String petStatus) {
    }
}


