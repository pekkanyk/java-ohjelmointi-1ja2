package lentokentta;
import java.util.Scanner;
import lentokentta.ui.Tekstikayttoliittyma;
import lentokentta.logiikka.Lentohallinta;


public class Main {

    public static void main(String[] args) {
        // Kirjoita pääohjelma tänne. Omien luokkien tekeminen on hyödyllistä.
        Tekstikayttoliittyma ui = new Tekstikayttoliittyma(new Lentohallinta(), new Scanner(System.in));
        ui.kaynnista();
    }
}
