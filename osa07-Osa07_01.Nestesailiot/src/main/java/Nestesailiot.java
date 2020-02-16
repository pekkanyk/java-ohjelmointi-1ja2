
import java.util.Scanner;

public class Nestesailiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int eka=0;
        int toka=0;

        while (true) {
            System.out.println("Ensimmäinen: "+eka+"/100");
            System.out.println("Toinen: "+toka+"/100");

            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            }
            String []osat = luettu.split(" ");
            if (osat[0].equals("lisaa")){
                int apu = Integer.valueOf(osat[1]);
                if (apu >=0) {
                    eka = eka+apu;
                }
                if (eka >100){
                    eka = 100;
                }
            }
            
            if (osat[0].equals("siirra")){
                int apu= Integer.valueOf(osat[1]);
                if (apu>=0 && apu <= eka){
                    eka = eka-apu;
                    toka = toka+apu;
                    if (toka>100){
                        toka = 100;
                    }
                }
                else if (apu>eka){
                    toka = toka + eka;
                    eka=0;
                }
                    
            }
            if (osat[0].equals("poista")){
                int apu= Integer.valueOf(osat[1]);
                if (apu>0 && toka>=apu){
                    toka=toka-apu;
                }
                else if (apu>=toka){
                    toka=0;
                }
            }
            

        }
    }

}
