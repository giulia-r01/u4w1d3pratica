package Esercizio2;

public class Chiamata {
    private String numeroChiamato;
    private double durata;

    public Chiamata(String numeroChiamato, double durata) {
        this.numeroChiamato = numeroChiamato;
        this.durata = durata;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }

    public void setNumeroChiamato(String numeroChiamato) {
        this.numeroChiamato = numeroChiamato;
    }

    public double getDurata() {
        return durata;
    }

    public void setDurata(double durata) {
        this.durata = durata;
    }

    public void stampa() {
        System.out.println("Numero chiamato: " + numeroChiamato + " | Durata: " + durata + " min");
    }
}