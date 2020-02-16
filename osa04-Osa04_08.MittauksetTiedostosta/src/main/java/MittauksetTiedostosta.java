
import java.io.File;
//import java.util.ArrayList;
import java.util.Scanner;

public class MittauksetTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Tiedosto? ");
        String tiedosto = lukija.nextLine();
        System.out.print("Alaraja? ");
        int alaraja = Integer.valueOf(lukija.nextLine());
        System.out.print("Yläraja? ");
        int ylaraja = Integer.valueOf(lukija.nextLine());
        int lukumaara = 0;
        
        //ArrayList<String> lista = new ArrayList<>();
        
        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))){
            while (tiedostonLukija.hasNextLine()){
                String rivi = tiedostonLukija.nextLine();
                if (Integer.valueOf(rivi) >=alaraja && Integer.valueOf(rivi)<=ylaraja){
                    lukumaara++;
                }
            }
        } catch (Exception e){
            System.out.println("Virhe: " + e.getMessage());
        }
        System.out.println("Lukuja: "+lukumaara);

    }

}
