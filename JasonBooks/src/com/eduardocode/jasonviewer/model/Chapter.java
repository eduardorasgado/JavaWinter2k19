package com.eduardocode.jasonviewer.model;

public class Chapter extends Movie {
    // attributes
    private int id;
    private int seasonNumber;

    public Chapter(String title, String genre, String director,
                   int duration, short year, int seasonNumber) {
        super(title, genre, director, duration, year);
        this.seasonNumber = seasonNumber;
    }

    // GETTERS AND SETTERS
    public int getId() {
        return id;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }
}
