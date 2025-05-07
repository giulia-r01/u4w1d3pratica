package Esercizio2;

public class Main {
    public static void main(String[] args) {
        SIM sim = new SIM("+39 3498752441");

        sim.aggiungiChiamata(new Chiamata("+39 3331112233", 2.5));
        sim.aggiungiChiamata(new Chiamata("+39 3478889988", 1.0));
        sim.aggiungiChiamata(new Chiamata("+39 3405566778", 3.2));
        sim.aggiungiChiamata(new Chiamata("+39 3669988776", 0.7));
        sim.aggiungiChiamata(new Chiamata("+39 3894433221", 4.1));
        sim.aggiungiChiamata(new Chiamata("+39 3201122334", 1.9));
        sim.stampa();
    }
}