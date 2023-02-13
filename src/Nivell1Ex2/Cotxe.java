package Nivell1Ex2;

public class Cotxe {
    static final String marca="Sense Marca";
    static String model;
    final int potencia ;

    //constructor
    public Cotxe(String marca,String model,int potencia) {
        //this.marca=marca; Non es pot inicialitzar
        this.model=model; // es pot inicialitzar
        this.potencia=potencia; // Es pot inicilitzar

    }

    //metode static es crida sense crear objecte
    public static void frenar() {
        System.out.println("El vehicle està frenant");
    }

    //metode no static, instanciant i cridant al objecte
    public void accelerar() {
        System.out.println("El vehicle està accelerant");
    }
}
