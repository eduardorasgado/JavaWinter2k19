package com.eduardocode.jasonviewer.model;

public class Movie {
    // declaring attributes
    // usually these data is private and they need
    // setters and getters to be accesed
    int id;
    String title;
    String director;
    short year;
    boolean viewed;
    int timeViewed;

    public Movie(String title)
    {
        // constructor
        this.title = title;
    }

    // Getters and setters
    public String getTitle(){
        return title;
    }

}

