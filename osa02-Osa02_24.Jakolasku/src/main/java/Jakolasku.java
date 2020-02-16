
import java.util.Scanner;

public class Jakolasku {

    public static void main(String[] args) {
        // Kun olet toteuttanut metodin jakolasku, voit testata
        // sen toimintaa täällä. Esimerkiksi kutsun jakolasku(3,5);
        // pitäisi tulostaa "0.6"

        // jakolasku(3, 5);
    }
    public static void jakolasku(int osoittaja, int nimittaja){
        double osamaara;
        if (nimittaja==0){
            System.out.println("Nimittäjä ei voi olla 0.");
        }
        else {
            osamaara = (1.0*osoittaja)/nimittaja;
            System.out.println(osamaara);
        }
    }
    // luo metodi tänne
}
