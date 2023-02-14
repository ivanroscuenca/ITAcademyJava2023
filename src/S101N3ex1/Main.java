package S101N3ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Benvingut al nostre programes de notícies");
        System.out.println("**********************************************");

        boolean exit = false;
        do {
            System.out.println("1.- Introduir redactor.");
            System.out.println("2.- Eliminar redactor.");
            System.out.println("3.- Introduir notícia a un redactor.");
            System.out.println("4.- Eliminar notícia (ha de demanar redactor i titular de la notícia)");
            System.out.println("5.- Mostrar totes les notícies per redactor.");
            System.out.println("6.- Calcular puntuació de la notícia.");
            System.out.println("7.- Calcular preu-notícia.");
            System.out.println("8.- Sortir del programa.");
            Scanner entrada = new Scanner(System.in);
            System.out.println("Seleccioneu alguna d'aquestes opcions : ");
            int numero = entrada.nextInt();
            switch (numero) {
                case 1 -> {

                }
                case 2 -> {

                }
                case 3 -> {

                }
                case 4 -> {

                }
                case 5 -> {

                }
                case 6 -> {

                }
                case 7 -> {

                }
                case 8 -> {
                    exit = true;
                    System.out.println("Heu sortit del programa");
                }

            }

        } while (!exit);

    }

}

