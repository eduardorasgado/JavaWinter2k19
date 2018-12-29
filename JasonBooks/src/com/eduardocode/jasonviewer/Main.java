package com.eduardocode.jasonviewer;

import com.eduardocode.jasonviewer.model.Movie;

import java.util.Date;

public class Main {

    public static void main(String[] args)
    {
        // instanciate an object
        //Movie rambo = new Movie("Rambo");
        //System.out.println(rambo.getTitle());

        int exit = 0;
        do {
            printMenu();
            takeDecision();

        } while(exit != 0);
    }

    private static void printMenu() {
        System.out.println("[WELCOME TO JASON VIEWER]");
        System.out.println("");
        System.out.println("Selecciona la opcion a la que deseas accesar.");
        System.out.println("1. Movies");
        System.out.println("2. Series");
        System.out.println("3. Books");
        System.out.println("4. Magazines");
        System.out.println("5. Report");
        System.out.println("6. Report Today");
        System.out.println("0. Exit");
    }

    private static void takeDecision()
    {
        // Leer la respuesta del usuario
        int opcion = 1;

        switch (opcion) {
            case 0:
                System.out.println("Elegiste Salir");
                break;
            case 1:
                showMovies();
                break;
            case 2:
                showSeries();
                break;
            case 3:
                showBooks();
                break;
            case 4:
                showMagazines();
                break;
            case 5:
                makeReport();
                break;
            case 6:
                Date today = new Date();
                makeReport(today);
                break;
            default:
                System.out.println("Opcion inválida");
                break;
        }
    }

    private static void showMovies()
    {
        System.out.println("Elegiste movies");
        int exit = 1;
        do {
            System.out.println("::MOVIES::");
            // Creating a movie instance
            Movie cocoMovie = new Movie("Coco", "Animation", (short) 2017);
            //System.out.println(cocoMovie.getTitle());
            cocoMovie.showData();

            break;
        } while (exit == 1);
    }

    private static void showSeries()
    {
        System.out.println("Elegiste Series");
        int exit = 1;
        do {
            System.out.println("::SERIES::");
            break;
        } while (exit == 1);
    }

    private static void showBooks()
    {
        System.out.println("Elegiste Books");
        int exit = 1;
        do {
            System.out.println("::BOOKS::");
            break;
        } while (exit == 1);
    }

    private static void showMagazines()
    {
        System.out.println("Elegiste Magazines");
        int exit = 1;
        do {
            System.out.println("::MAGAZINES::");
            break;
        } while (exit == 1);
    }

    private static void makeReport()
    {

    }

    private static void makeReport(Date date)
    {

    }
}