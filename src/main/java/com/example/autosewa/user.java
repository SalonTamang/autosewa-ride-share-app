package com.example.autosewa;

public class user {
    private int id;
    private String username, phoneNumber, image;
    private int latitude, longitude;


    public user(int id, String username, String phoneNumber, String image, int latitude, int longitude) {
        this.id = id;
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.image = image;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getImage() {
        return image;
    }

    public int getLatitude() {
        return latitude;
    }
}
