package Esercizio3;

public class Articolo {
    private String codice;
    private String descrizione;
    private double prezzo;
    private double numPezzi;

    public Articolo(String codice, String descrizione, double prezzo, double numPezzi) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.numPezzi = numPezzi;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getNumPezzi() {
        return numPezzi;
    }

    public void setNumPezzi(double numPezzi) {
        this.numPezzi = numPezzi;
    }

    @Override
    public String toString() {
        return "Articolo{" +
                "codice='" + codice + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                ", numPezzi=" + numPezzi +
                '}';
    }
}
