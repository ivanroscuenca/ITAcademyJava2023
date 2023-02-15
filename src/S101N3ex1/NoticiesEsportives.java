package S101N3ex1;

public abstract class NoticiesEsportives {
    protected String titol;
    protected String text;

    protected int preu;
    protected int puntuacio;


    public NoticiesEsportives(String titol) {
    this.titol = titol;
    text="";
    preu=0;
    puntuacio=0;
    }

    public int calcularPreuNoticia(){
        return preu;
    }
    public int CalcularPuntuacio(){
        return puntuacio;
    }

    @Override
    public String toString() {
        return "titol='" + titol + '\'' + ", text='" + text + '\'' + ", preu=" + preu + ", puntuacio=" + '\'' + puntuacio;
    }
}





