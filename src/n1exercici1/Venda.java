package n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    private List<Producte> productes;
    private double preuTotal;

    public Venda() {
        this.productes = new ArrayList<Producte>();
        this.preuTotal = 0;
    }

    public void calcularTotal() throws VendaBuidaException {
        if (productes.isEmpty()) {
            // Llança l'excepción VendaBuidaException
            throw new VendaBuidaException();
        } else {
            // Recorre la colecció de productes i calcula el preu total
            for (Producte producte : this.productes) {
                this.preuTotal += producte.preu;
            }
        }
    }
}



