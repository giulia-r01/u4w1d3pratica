package Esercizio2;

public class Main {
    public static void main(String[] args) {
        SIM sim = new SIM("+39 3498752441");

        sim.setCredito(10);
        Chiamata[] chiamate = new Chiamata[5];

        chiamate[0] = new Chiamata("+39 3331112233", 2.5);
        chiamate[1] = new Chiamata("+39 3491187233", 0.5);
        chiamate[2] = new Chiamata("+39 333452233", 8.5);
        chiamate[3] = new Chiamata("+39 3335472233", 10.5);
        chiamate[4] = new Chiamata("+39 3538652233", 2.9);
        sim.setChiamate(chiamate);
        sim.stampaSim();
    }
}