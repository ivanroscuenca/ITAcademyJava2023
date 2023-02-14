package Nivell3;

public class NoticiesF1 extends NoticiesEsportives{
String escuderia;
    public NoticiesF1() {

    }
    public int calcularPreuNoticia(String escuderia) {
        int preu = 100;

        if ((escuderia=="Ferrari") || (escuderia=="Mercedes")){
            preu +=50;
        }
        return preu;
    }
    public int CalcularPuntuacio(String escuderia){
        int punts=4;
        if ((escuderia=="Ferrari") || (escuderia=="Mercedes")){
            punts +=2;
        }

        return punts;
    }
}


