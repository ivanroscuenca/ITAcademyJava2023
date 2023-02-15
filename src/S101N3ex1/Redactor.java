package S101N3ex1;

import java.util.ArrayList;

public class Redactor {
    protected String nom;
    private final String DNI;
    protected int salari;
    protected ArrayList <NoticiesEsportives> noticies;
    public Redactor(String nom, String DNI){
        this.nom=nom;
        this.DNI=DNI;
        salari=1500;
        ArrayList<NoticiesEsportives> noticies;
    }
    public String getDNI() {
        return DNI;
    }
}




