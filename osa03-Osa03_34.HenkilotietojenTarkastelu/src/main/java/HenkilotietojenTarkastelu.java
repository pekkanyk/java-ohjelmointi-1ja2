
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int pisin = 0;
        String pisinNimi = new String();
        int lkm = 0;
        int vuodet = 0;
        while (true){
            String luettu = lukija.nextLine();
            if (luettu.equals("")){
                break;
            }
            String[] palat = luettu.split(",");
            if (palat[0].length() > pisin){
                pisin = palat[0].length();
                pisinNimi = palat[0];
            }
            vuodet = vuodet + Integer.valueOf(palat[1]);
            lkm++;            
        }
        System.out.println("Pisin nimi: "+pisinNimi);
        System.out.println("Syntymävuosien keskiarvo: "+(1.0*vuodet)/lkm);

    }
}
