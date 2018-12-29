package com.eduardocode.jasonviewer.model;

public class Serie {
    // attributes
    private int id;
    private String title;
    private String genre;
    private String director;
    private int duration;
    private short year;
    private boolean viewed;
    private int timeViewed;
    private int sessionQuantity;
    // chapter array


    public Serie(String title, String genre, int duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }
}
