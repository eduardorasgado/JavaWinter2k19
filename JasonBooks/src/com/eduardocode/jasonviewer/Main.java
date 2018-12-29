package com.eduardocode.jasonviewer;

public class Main {

    public static void main(String[] args)
    {
        int exit = 0;
        do {
            System.out.println("[WELCOME TO JASON VIEWER]");
            System.out.println("");
            System.out.println("Selecciona la opcion a la que deseas accesar.");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazines");
            System.out.println("0. Exit");

            // Leer la respuesta del usuario
            int opcion = 0;

            switch (opcion) {
                case 0:
                    System.out.println("Elegiste Salir");
                    break;
                case 1:
                    System.out.println("Elegiste movies");
                    //showMovies();
                    break;
                case 2:
                    System.out.println("Elegiste Series");
                    //showSeries();
                    break;
                case 3:
                    System.out.println("Elegiste Books");
                    //showBooks();
                    break;
                case 4:
                    System.out.println("Elegiste Magazines");
                    //showMagazines();
                    break;
                default:
                    System.out.println("Opcion inválida");
                    break;
            }
        } while(exit != 0);
    }
}