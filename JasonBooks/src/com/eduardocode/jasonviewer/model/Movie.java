package com.eduardocode.jasonviewer.model;

public class Movie extends Film {
    // Movie is a subclass

    // declaring attributes
    // usually these data is private and they need
    // setters and getters to be accesed
    private int id;
    private int timeViewed;

    // constructor considering Film class inheritated
    public Movie(String title, String genre, String director, int duration, short year) {
        // super takes the values when the class Movie is instanciated
        // and set them to Film class
        super(title, genre, director, duration);
        this.setYear(year);
    }

    // overriding methods from a super class
    @Override
    public String toString()
    {
        // overriding toString from Object
        return "Title: "+getTitle() +
                "\nGenre: " + getGenre() +
                "\nYear: " + getYear() +
                "\nDirector: " + getDirector() +
                "\nDuration: " + getDuration() + " minutes";
    }


    //  SETTERS AND GETTERS
    public int getId() {
        return id;
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

}

