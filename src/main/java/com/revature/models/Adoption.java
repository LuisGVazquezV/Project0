package com.revature.models;

public class Adoption {
    private int adoption_id;
    private int user_id;
    private int pet_id;
    private String adoption_status;

    //Constructors
    public Adoption() {
    }

    public Adoption(int adoption_id, int user_id, int pet_id, String adoption_status) {
        this.adoption_id = adoption_id;
        this.user_id = user_id;
        this.pet_id = pet_id;
        this.adoption_status = adoption_status;
    }

    //Getters & Setters
    public int getAdoption_id() {
        return adoption_id;
    }

    public void setAdoption_id(int adoption_id) {
        this.adoption_id = adoption_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getPet_id() {
        return pet_id;
    }

    public void setPet_id(int pet_id) {
        this.pet_id = pet_id;
    }

    public String getAdoption_status() {
        return adoption_status;
    }

    public void setAdoption_status(String adoption_status) {
        this.adoption_status = adoption_status;
    }

    //toString
    @Override
    public String toString() {
        return "Adoption{" +
                "adoption_id=" + adoption_id +
                ", user_id=" + user_id +
                ", pet_id=" + pet_id +
                ", adoption_status='" + adoption_status + '\'' +
                '}';
    }
}
