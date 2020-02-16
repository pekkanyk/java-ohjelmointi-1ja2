
import java.io.File;
import java.util.Scanner;

public class VanhinTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Mikä tiedosto luetaan?");
        String tiedosto = lukija.nextLine();
        int vanhinIka=-1;
        String vanhin="";
        
        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))){
            while (tiedostonLukija.hasNextLine()){
                String rivi = tiedostonLukija.nextLine();
                String[] osat = rivi.split(",");
                if (Integer.valueOf(osat[1])>vanhinIka){
                    vanhinIka=Integer.valueOf(osat[1]);
                    vanhin=osat[0];
                }
            }
        } catch (Exception e){
            System.out.println("Virhe: " + e.getMessage());
        }
        System.out.println("Vanhin oli: "+vanhin);

    }
}
