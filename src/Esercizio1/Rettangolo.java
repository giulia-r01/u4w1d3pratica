package Esercizio1;

public class Rettangolo {

    private int h;
    private int l;

    //Costruttore parametrizzato
    public Rettangolo(int h, int l) {
        this.h = h;
        this.l = l;

    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }


    public int calcolaArea() {
        return h * l;
    }

    public int calcolaPerimetro() {
        return 2 * (h + l);
    }

}
