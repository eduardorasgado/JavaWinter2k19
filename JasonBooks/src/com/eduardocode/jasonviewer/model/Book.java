package com.eduardocode.jasonviewer.model;

import java.util.Date;

public class Book {
    // attributes
    private int id;
    private String title;
    private Date editionDate;
    private String genre;
    private int duration;
    private String editorial;
    private String[] authors;
    private String isbn;
    // if book has been read
    private boolean read;
    // how much time do this book was read
    private int timeRead;

    public Book(String title, Date editionDate, String editorial, String isbn) {
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
        this.isbn = isbn;
    }
}
