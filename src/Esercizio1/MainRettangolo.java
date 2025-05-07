package Esercizio1;

public class MainRettangolo {
    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(20, 35);
        Rettangolo r2 = new Rettangolo(10, 30);
        stampaRettangolo(r1);
        stampaDueRettangoli(r1, r2);

    }

    //Metodi
    //Metodo stampa rettangolo
    public static void stampaRettangolo(Rettangolo r) {
        System.out.println("L'area del rettangolo è: " + r.calcolaArea());
        System.out.println("Il perimetro del rettangolo è: " + r.calcolaPerimetro());
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2){

        //oppure
//        stampaRettangolo(r1);
//        stampaRettangolo(r2);
        //e poi la somma

        System.out.println("L'area del rettangolo r1 è: " + r1.calcolaArea() + ", il perimetro del rettangolo r1 è: " + r1.calcolaPerimetro());



        System.out.println("L'area del rettangolo r2 è: " + r2.calcolaArea() + ", il perimetro del rettangolo r2 è: " + r2.calcolaPerimetro());


        int sommaArea = r1.calcolaArea()+r2.calcolaArea();
        int sommaPerimetro = r1.calcolaPerimetro()+ r2.calcolaPerimetro();
        System.out.println("La somma dell'area dei rettangoli è: " + sommaArea + ", la somma del perimetro dei rettangoli è: " + sommaPerimetro);
    }

}
