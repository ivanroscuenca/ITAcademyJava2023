package Nivell3;

public class NoticiesBasquet extends NoticiesEsportives {
    String competicio,club;
    public NoticiesBasquet(){

    }
    public int calcularPreuNoticia(String competicio,String club,String jugador) {
        int preu = 250;
        if (competicio=="Eurolliga"){
            preu+=75;
        }
        if ((club=="Barça") || (club=="Madrid")){
            preu +=75;
        }
        return preu;
    }

    public int CalcularPuntuacio(String competicio,String club,String jugador){
        int punts=4;
        if (competicio=="Eurolliga"){
            punts+=3;
        }
        if (competicio=="ACB"){
            punts+=2;
        }
        if ((club=="Barça") || (club=="Madrid")){
            punts +=1;
        }
        return punts;
    }

}



