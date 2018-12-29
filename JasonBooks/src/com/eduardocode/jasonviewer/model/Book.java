package com.eduardocode.jasonviewer.model;

import java.util.Date;

public class Book {
    // attributes
    int id;
    String title;
    Date editionDate;
    String editorial;
    String[] authors;
    String isbn;
    // if book has been read
    boolean read;
    // how much time do this book was read
    int timeRead;

}
