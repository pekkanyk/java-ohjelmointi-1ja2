
import java.util.Scanner;

public class MuuttujatYhdessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä merkkijono!");
        String jono = String.valueOf(lukija.nextLine());
        System.out.println("Syötä kokonaisluku!");
        int luku = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä liukuluku!");
        Double lluku = Double.valueOf(lukija.nextLine());
        System.out.println("Syötä totuusarvo!");
        Boolean totuus = Boolean.valueOf(lukija.nextLine());
        System.out.println("Syötit merkkijonon " + jono);
        System.out.println("Syötit kokonaisluvun " + luku);
        System.out.println("Syötit liukuluvun " + lluku);
        System.out.println("Syötit totuusarvon " + totuus);

    }
}
