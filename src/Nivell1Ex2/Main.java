package Nivell1Ex2;
//Crea una classe "Cotxe" amb els atributs: marca, model i potència. La marca ha de ser estàtic final,
// el model estàtic i la potència final. Demostra la diferència entre els tres. N’hi ha algun que es pugui
// inicialitzar al constructor de la classe?
//
//        Afegeix dos mètodes a la classe "Cotxe". Un mètode estàtic anomenat frenar() i un altre no estàtic
//        anomenat accelerar(). El mètode accelerar ha de mostrar per consola: “El vehicle està accelerant” i el
//        mètode frenar() ha de mostrar: “El vehicle està frenant”.
//
//        Demostra com invocar el mètode estàtic i el no estàtic des del main() de la classe principal.


public class Main {
    public static void main(String[] args) {
        //es pot cridar a accelerar una vegada has instanciat l'objecte
        Cotxe cotxe1 = new Cotxe("Audi","A3",3000);
        cotxe1.accelerar();
        //es por cridar a frenar directament sense instanciar pero cridant a classe Cotxe
        Cotxe.frenar();
        //es pot cridar a potencia instanciant primer.
        System.out.println(cotxe1.potencia);
        //Atribut model pot ser cridat per la classe cotxe, sense instanciar
        System.out.println(Cotxe.model);
        //La marca resta el nom del principi i no pot variar
        System.out.println(Cotxe.marca);

    }
}

