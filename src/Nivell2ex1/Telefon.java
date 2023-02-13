package Nivell2ex1;

public class Telefon {
private String marca;
private String model;
private String num;

//Constructor
    public Telefon(String num){
    this.num=num;
    System.out.println(getNum());
    }
    //metode getter - Return
    public String getNum() {
        return "S’està trucant al número: " + num;
    }
}



