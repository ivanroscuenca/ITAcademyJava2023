package Nivell2Ex2;
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
        //es pot cridar a accelerar una vegada has instanciat amb l'objecte
        Cotxe cotxe1 = new Cotxe();
        cotxe1.accelerar();
        //es pot cridar a potencia instanciant primer
        System.out.println(cotxe1.potencia);
        //els altes atributs no poden ser cridats sent instanciats pero si es poden cridant a la classe cotxe
        System.out.println(Cotxe.model);
        System.out.println(Cotxe.marca);
        //es por cridar a frenar directament sense instanciar pero cridant a classe Cotxe
        Cotxe.frenar();
    }
}

