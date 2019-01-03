package com.eduardocode.jasonviewer.model;

import java.util.Date;

public class Magazine extends Readable{
    private int id;

    public Magazine(String title, Date editionDate, String genre, String editorial) {
        super(title,editionDate, genre, editorial);
    }

    // GETTERS AND SETTERS
}
