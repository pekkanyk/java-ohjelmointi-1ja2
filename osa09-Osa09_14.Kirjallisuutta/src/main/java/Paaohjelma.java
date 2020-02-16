
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List <Kirja> kirjat = new ArrayList<>();
        
        while (true){
            System.out.print("Syötä kirjan nimi, tyhjä lopettaa: ");
            String nimi = lukija.nextLine();
            if(nimi.isEmpty())
                break;
            System.out.print("Syötä kirjan pienin kohdeikä: ");
            int ika = Integer.valueOf(lukija.nextLine());
            
            kirjat.add(new Kirja(nimi,ika));
        }
        System.out.println("Yhteensä "+kirjat.size()+" kirjaa.");
        System.out.println("Kirjat:\n");
        
        /*
        kirjat.stream()
                .sorted()
                .forEach(kirja -> System.out.println(kirja.toString()));
        */
        Comparator<Kirja> vertailija = Comparator
                .comparing(Kirja :: getIka)
                .thenComparing(Kirja::getNimi);
        Collections.sort(kirjat, vertailija);
        for (Kirja k: kirjat)
            System.out.println(k);
    }

}
