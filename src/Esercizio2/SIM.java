package Esercizio2;

public class SIM {
    private String numero;
    private double credito;
    private Chiamata[] chiamate;


    public SIM(String numero) {
        this.numero = numero;
        //credito = 0 è di default
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Chiamata[] getChiamate() {
        return chiamate;
    }

    public void setChiamate(Chiamata[] chiamate) {
        this.chiamate = chiamate;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public void stampaSim(){
        System.out.println("Il numero è: " + numero);
        System.out.println("Il credito disponibile è: " + credito);

        for (int i = 0; i < chiamate.length; i++) {
            chiamate[i].stampa();
        }
    }
}