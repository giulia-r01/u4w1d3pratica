package Esercizio3;

public class Carrello {
    private Cliente cliente;
    private Articolo[] articoli;
    private double totale;

    public Carrello(Cliente cliente, Articolo[] articoli) {
        this.cliente = cliente;
        this.articoli = articoli;
        calcolaTotale();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Articolo[] getArticoli() {
        return articoli;
    }

    public double getTotale() {
        return totale;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setArticoli(Articolo[] articoli) {
        this.articoli = articoli;
        calcolaTotale();
    }

    private void calcolaTotale(){
        for (int i = 0; i < articoli.length; i++) {
          totale += articoli[i].getPrezzo();

        }
    }
}
