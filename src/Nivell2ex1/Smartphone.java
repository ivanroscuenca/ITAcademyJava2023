package Nivell2ex1;

public class Smartphone extends Telefon implements Camera,Rellotge {

    public Smartphone(String num) {
        super(num);
        System.out.println(fotografiar());
        System.out.println(alarma());
    }
    @Override
    public String fotografiar() {
       return "S’està fent una foto";

    }
    @Override
    public String alarma() {
    return "està sonant l’alarma";
    }
}
