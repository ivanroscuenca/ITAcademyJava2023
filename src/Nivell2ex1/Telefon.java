package Nivell2ex1;

public class Telefon {
String marca;
String model;
String num;

//Constructor
    public Telefon(String num){
    this.num=num;

    }
    //metode getter - Return
    public String getNum() {
        return "S’està trucant al número: " + num;
    }
}



