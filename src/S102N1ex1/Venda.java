package S102N1ex1;

import java.util.ArrayList;

public class Venda {
    //Atributs
    private int preuTotal = 0;
    private ArrayList<Producte> productes =new ArrayList<Producte>();

    Venda(){}

    public ArrayList<Producte> getProductes() {
        return productes;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "preuTotal=" + preuTotal +
                ", productes=" + productes +
                '}';
    }

    public void escollirProducte(Producte producte){
        productes.add(producte);
    }

    public int calcularTotal() throws VendaBuidaException {
       if(productes == null || productes.size() == 0){
            throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");
        }else {
           for (int i =0; i< productes.size();i++){
               preuTotal += productes.get(i).preu ;
           }
       }
       return preuTotal;
    }
}
