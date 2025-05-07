package Esercizio2;

public class Chiamata {
    private String numeroChiamato;
    private double durata;

    public Chiamata(String numeroChiamato, double durata) {
        this.numeroChiamato = numeroChiamato;
        this.durata = durata;
    }

    public void stampa() {
        System.out.println("Numero chiamato: " + numeroChiamato + " | Durata: " + durata + " min");
    }
}