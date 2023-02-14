package Nivell3;

public class NoticiesMotociclisme extends NoticiesEsportives {
    String equip;
    public NoticiesMotociclisme() {

    }
    public int calcularPreuNoticia(String equip) {
        int preu = 100;

        if ((equip=="Honda") || (equip=="Yamaha")){
            preu +=50;
        }
        return preu;
    }

    public int CalcularPuntuacio(String equip){
        int punts=3;
        if ((equip=="Honda") || (equip=="Yamaha")){
            punts +=3;
        }

        return punts;
    }
}
