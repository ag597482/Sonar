package com.example.android.sonar;


public class Jewelry {
    private int id;
    private String title;
    private int image;

    public Jewelry(int id, String title, int image) {
        this.id = id;
        this.title = title;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }
}
