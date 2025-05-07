package Esercizio3;

import java.time.LocalDate;

public class MainShop {
    public static void main(String[] args) {
        Cliente c = new Cliente("1", "Mario Rossi", "gdhr@gmail.com", LocalDate.of(2025, 7, 31));

        Articolo[] articoli = new Articolo[3];
        articoli[0]= new Articolo("1", "matita", 1, 10);
        articoli[1]= new Articolo("2", "quaderno", 1.4, 6);
        articoli[2]= new Articolo("3", "borsa", 50, 1);

        Carrello carrello = new Carrello(c, articoli);

        System.out.println("Totale del carrello: " + carrello.getTotale());
    }
}
