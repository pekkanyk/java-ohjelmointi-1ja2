
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class LoytyykoTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();
        boolean lukuvirhe = false;
        ArrayList<String> lista = new ArrayList<>();
        
        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))){
            while (tiedostonLukija.hasNextLine()){
                String rivi = tiedostonLukija.nextLine();
                lista.add(rivi);
            }
        } catch (Exception e){
            //System.out.println("Virhe: " + e.getMessage());
            lukuvirhe = true;
        }

        System.out.println("Mitä etsitään?");
        String etsittava = lukija.nextLine();
        if (lukuvirhe){
            System.out.println("Tiedoston "+tiedosto+" lukeminen epäonnistui.");
        }
        else if (lista.contains(etsittava)){
            System.out.println("Löytyi!");
        }
        else{
            System.out.println("Ei löytynyt.");
        }

    }
}
