
import java.util.ArrayList;

public class Ohjelma {

    public static void main(String[] args) {
        // Kokeile luokkaan MaPu toteuttamaasi metodia keskiarvon
        // laskemiseen täällä

        ArrayList<Integer> luvut = new ArrayList<>();
        luvut.add(14);
        luvut.add(12);

        double keskiarvo = MaPu.keskiarvo(luvut);
        // Kun olet saanut MaPu-luokan keskiarvo-toteutuksen valmiiksi, kokeile:
        // keskiarvo = MaPu.keskiarvo(luvut);
        System.out.println(keskiarvo);
    }

}
