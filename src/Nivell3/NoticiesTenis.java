package Nivell3;

public class NoticiesTenis extends NoticiesEsportives {
    String competicio,tenista;
    public NoticiesTenis() {

    }
    public int calcularPreuNoticia(String tenista) {
        int preu = 150;

        if ((tenista=="Federer") || (tenista=="Nadal") || (tenista=="Djokovic")){
            preu +=100;
        }
        return preu;
    }
    public int CalcularPuntuacio(String tenista){
        int punts=4;

        if ((tenista=="Federer") || (tenista=="Nadal") || (tenista=="Djokovic")){
            punts +=3;
        }
        return punts;
    }
}
