package S101N3ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;


//En una redacció de notícies esportives tenen les notícies classificades per esports: futbol, bàsquet,
// tenis, F1 i motociclisme.
//
//        La redacció pot tenir més d’un redactor, i de cadascun d’ells volem saber el seu nom, el DNI i
//        el sou. Un cop assignat un DNI, aquest no podrà canviar mai. Tots els redactors tenen el mateix
//        sou, i si en un futur l’empresa pot incrementar-lo, ho farà a tothom per igual. De moment el sou
//        actual és de 1500 €.
//
//        Cada redactor pot treballar en més d’una notícia. Les notícies han de tenir un titular,
//        un text, una puntuació i un preu. En el moment de crear-se, el text ha d’estar buit.
//
//        A més, de les notícies de futbol s’ha de saber a quina competició fa referència(String),
//        a quin club(String) i a quin jugador(String).
//
//        De les notícies de bàsquet s’ha d’indicar a quina competició fa referència(String) i a quin
//        club(String).
//
//        De les notícies de tenis s’ha de saber de quina competició(String) parlen i de quins
//        tenistes(String).
//
//        De les notícies d'F1 hem de saber a quina escuderia(String) fan referència.
//
//        De les notícies de motociclisme s’ha d’indicar de quin equip(String) són.
//
//        Les notícies es venen a diferents mitjans. Per saber el preu de cada notícia hem d'implementar
//        un mètode que es diu calcularPreuNoticia().
//
//        A continuació s’explica com calcular el preu de cada notícia:
//
//        Notícies de futbol:
//
//        Preu inicial: 300 €
//
//        Lliga de Campions: 100 €
//
//        Barça o Madrid: 100 €
//
//        Ferran Torres o Benzema: 50 €
//
//
//        Exemple: Una notícia que parla d’un gol de Ferran Torres del Barça a la Lliga de Campions, té un preu de 550 €.
//
//        Notícies de bàsquet:
//
//        Preu inicial: 250 €
//
//        Eurolliga: 75 €
//
//        Barça o Madrid: 75 €
//
//
//        Notícies de tenis:
//
//        Preu inicial: 150 €
//
//        Federer, Nadal o Djokovic: 100 €
//
//
//        Notícies d'F1:
//
//        Preu inicial: 100 €
//
//        Ferrari o Mercedes: 50 €
//
//
//        Notícies de motociclisme:
//
//        Preu inicial: 100 €
//
//        Honda o Yamaha: 50 €
//
//
//        Per calcular les puntuacions de les notícies se segueixen els següents criteris:
//
//        Notícies de futbol:
//
//        5 Punts.
//
//        Lliga de Campions: 3 punts
//
//        Lliga: 2 punts
//
//        Barça o Madrid: 1 punt
//
//        Ferran Torres o Benzema: 1 punt
//
//        Exemple: Una notícia que parla d’un gol de Ferran Torres del Barça a la Lliga de Campions, té una puntuació de 10 punts.
//
//
//        Notícies de bàsquet:
//
//        4 punts
//
//        Eurolliga: 3 punts
//
//        ACB: 2 punts
//
//        Barça o Madrid: 1 punt
//
//
//        Notícies de Tenis:
//
//        4 punts
//
//        Federer, Nadal o Djokovic: 3 punts
//
//
//        Notícies F1:
//
//        4 punts
//
//        Ferrari o Mercedes: 2 punts
//
//
//        Notícies de Motociclisme:
//
//        3 punts
//
//        Honda o Yamaha: 3 punts
//
//
//        A la classe principal s’ha de fer un menú amb les següents opcions:
//
//        1.- Introduir redactor.
//
//        2.- Eliminar redactor.
//
//        3.- Introduir notícia a un redactor.
//
//        4.- Eliminar notícia (ha de demanar redactor i titular de la notícia).
//
//        5.- Mostrar totes les notícies per redactor.
//
//        6.- Calcular puntuació de la notícia.
//
//        7.- Calcular preu-notícia.
//

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
                addRedactor();
                }
                case 2 -> {
                deleteRedactor();
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
    //Creacio arraylist Redacció on posar tots els redactors
    static ArrayList<Redactor> redaccio = new ArrayList<Redactor>();

    //cas 1
    private static void addRedactor() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introdueix nom");
        String nom = entrada.nextLine();
        System.out.println("Introdueix DNI");
        String DNI = entrada.nextLine();
        redaccio.addAll((Collection<? extends Redactor>) new Redactor(nom,DNI));

    }

    //cas 2
    private static void deleteRedactor() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introdueix nom");
        String nom = entrada.nextLine();
        System.out.println("Introdueix DNI");
        String DNI = entrada.nextLine();
        redaccio.clear();
        System.out.println("S'ha borrat");
    }

    //cas 3



    }


