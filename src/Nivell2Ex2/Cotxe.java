package Nivell2Ex2;

public class Cotxe {
    static final String marca = "Seat";
    static String model = "Ibiza";
    final int potencia = 2000;

    //constructor
    public Cotxe() {
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
