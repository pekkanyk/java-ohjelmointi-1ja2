
import java.util.Scanner;

public class NestesailiotOlioilla {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Sailio eka = new Sailio();
        Sailio toka = new Sailio();


        while (true) {
            System.out.println("Ensimmainen: "+eka.toString());
            System.out.println("Toinen: "+toka.toString());

            String luettu = lukija.nextLine();
            String []osat = luettu.split(" ");
            if (luettu.equals("lopeta")) {
                break;
            }
            
            if (osat[0].equals("lisaa")){
                int apu = Integer.valueOf(osat[1]);
                eka.lisaa(apu);
            }
            
            if (osat[0].equals("siirra")){
                int apu= Integer.valueOf(osat[1]);
                if (apu<=eka.sisalto){
                    eka.poista(apu);
                    toka.lisaa(apu);
                }
                else {
                    toka.lisaa(eka.sisalto);
                    eka.poista(apu);
                }
            }
            if (osat[0].equals("poista")){
                int apu= Integer.valueOf(osat[1]);
                toka.poista(apu);
            }

        }
    }

}
