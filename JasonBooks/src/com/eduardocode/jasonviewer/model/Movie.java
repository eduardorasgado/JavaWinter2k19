package com.eduardocode.jasonviewer.model;

public class Movie {
    // declaring attributes
    // usually these data is private and they need
    // setters and getters to be accesed
    private int id;
    private String title;
    private String genre;
    private String director;
    private int duration;
    private short year;
    private boolean viewed;
    private int timeViewed;

    public Movie(String title, String genre, String director, int duration, short year) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.duration = duration;
        this.year = year;
    }

    // constructor overloaded
    public Movie(String title, String genre, short year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    //  SETTERS AND GETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public boolean isViewed() {
        return viewed;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    // CUSTOM FUCNTIONS
    public void showData()
    {
        System.out.println("Title: "+ title);
        System.out.println("Genre: "+ genre);
        System.out.println("Year: "+ year);
    }
}

