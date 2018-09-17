package com.example.asifkhan.customgridviewgallery.models;

public class Users {
    private String name,profession;
    private int photo;

    public Users(String name, String profession, int photo) {
        this.name = name;
        this.profession = profession;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public int getPhoto() {
        return photo;
    }
}
