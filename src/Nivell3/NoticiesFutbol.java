package Nivell3;

public class NoticiesFutbol extends NoticiesEsportives {
    String competicio,club,jugador;
    public NoticiesFutbol(String competicio,String club,String jugador) {
    this.competicio=competicio;
    this.club=club;
    this.jugador=jugador;
    }

    public int calcularPreuNoticia(String competicio,String club,String jugador) {
        int preu = 300;
        if (competicio=="LLiga de Campions"){
            preu+=100;
        }
        if ((club=="Barça") || (club=="Madrid")){
            preu +=100;
        }
        if ((jugador=="Ferran Torres") || (jugador=="Benzema")){
            preu +=100;
        }

        return preu;
    }

    public int CalcularPuntuacio(String competicio,String club,String jugador){
        int punts=5;
        if (competicio=="LLiga de Campions"){
            punts+=3;
        }
        if (competicio=="LLiga"){
            punts+=2;
        }
        if ((club=="Barça") || (club=="Madrid")){
            punts +=1;
        }
        if ((jugador=="Ferran Torres") || (jugador=="Benzema")){
            punts +=1;
        }
        return punts;
    }

}
