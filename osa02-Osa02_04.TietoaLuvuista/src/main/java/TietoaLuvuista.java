
import java.util.Scanner;

public class TietoaLuvuista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int ekaluku = Integer.valueOf(lukija.nextLine());
        int tokaluku = Integer.valueOf(lukija.nextLine());
        String teksti = "null";
        if (ekaluku>tokaluku){
            teksti = "suurempi";
        }else if (ekaluku<tokaluku){
            teksti = "pienempi";
        }else {
            teksti = "yhtä suuri";
        }
        System.out.println("Luku "+ekaluku+" on "+teksti+" kuin luku "+tokaluku+".");
    }
}
