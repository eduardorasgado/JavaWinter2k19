package com.eduardocode.jasonviewer.model;

public class Chapter {
    // attributes
    private int id;
    private String title;
    private int duration;
    private short year;
    private boolean viewed;
    private int timeViewed;
    private int seasonNumber;

    public Chapter(String title, int duration, short year) {
        this.title = title;
        this.duration = duration;
        this.year = year;
    }
}
