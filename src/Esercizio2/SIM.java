package Esercizio2;

public class SIM {
    private String numero;
    private int credito;
    private Chiamata[] chiamate;
    private int chiamateEffettuate; // contatore interno

    public SIM(String numero) {
        this.numero = numero;
        this.credito = 0;
        this.chiamate = new Chiamata[5];
        this.chiamateEffettuate = 0;
    }

    public void aggiungiChiamata(Chiamata c) {
        // scorrevole: rimuove la più vecchia se superiamo le 5
        if (chiamateEffettuate < 5) {
            chiamate[chiamateEffettuate] = c;
            chiamateEffettuate++;
        } else {
            // shift a sinistra
            for (int i = 0; i < 4; i++) {
                chiamate[i] = chiamate[i + 1];
            }
            chiamate[4] = c;
        }
    }

    public void stampa() {
        System.out.println("Numero SIM: " + numero);
        System.out.println("Credito disponibile: " + credito + "€");
        System.out.println("Ultime chiamate:");
        for (int i = 0; i < chiamateEffettuate; i++) {
            chiamate[i].stampa();
        }
    }
}