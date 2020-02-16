
import java.util.Scanner;

public class NimenPituus {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // kutsu täältä metodiasi
        System.out.print("Anna nimi: ");
        System.out.println("Kirjainmäärä: "+laskeKirjaimet(lukija.nextLine()));
    }
    
    // tee tänne metodi 
    // public static int laskeKirjaimet(String merkkijono)
    public static int laskeKirjaimet (String merkkijono){
        int kirjaimet=merkkijono.length();
        return kirjaimet;
    }
    
}
