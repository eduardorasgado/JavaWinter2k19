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


    // CUSTOM FUNCTIONS
    public void showData()
    {
        //System.out.println("Title: "+ title);
        //System.out.println("Genre: "+ genre);
        //System.out.println("Year: "+ year);
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

