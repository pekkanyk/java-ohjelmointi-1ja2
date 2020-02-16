
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Reseptihaku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Resepti> reseptilista = new ArrayList<>();
        System.out.println("Mistä luetaan?");
        String tiedosto = lukija.nextLine();
        
        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))){
            
            while (tiedostonLukija.hasNextLine()){
             String reseptinNimi = tiedostonLukija.nextLine();
             int aika = Integer.valueOf(tiedostonLukija.nextLine());
             Resepti resepti = new Resepti(reseptinNimi,aika);
             reseptilista.add(resepti);
             
             while (tiedostonLukija.hasNextLine()){
                 String raakaAine = tiedostonLukija.nextLine();
                 if (raakaAine.isEmpty()){
                     break;
                 }
                 resepti.lisaaRaakaainse(raakaAine);
             }
             
            }
        } catch (Exception e){
            System.out.println("Virhe: "+e.getMessage());
        }
        
        System.out.println("Komennot:");
        System.out.println("listaa - listaa reseptit");
        System.out.println("hae nimi - hakee reseptiä nimen perusteella");
        System.out.println("hae keittoaika - hakee reseptiä keittoajan perusteella");
        System.out.println("hae aine - hakee reseptejä raaka-aineen perusteella");
        System.out.println("lopeta - lopettaa ohjelman");
        
        
        while (true){
            System.out.print("Syötä komento: ");
            String komento = lukija.nextLine();
            if (komento.equals("lopeta")){
                break;
            }
            if (komento.equals("listaa")){
                System.out.println("Reseptit:");
                for (Resepti resepti:reseptilista){
                    System.out.println(resepti);
                }
            }
            if (komento.equals("hae nimi")){
                System.out.print("Mitä haetaan: ");
                String haettava = lukija.nextLine();
                System.out.println("Reseptit:");
                for (Resepti resepti:reseptilista){
                    if (resepti.getNimi().contains(haettava)){
                        System.out.println(resepti);
                    }
                }
            }
            if (komento.equals("hae keittoaika")){
                System.out.print("Keittoaika korkeintaan: ");
                String keittoaika = lukija.nextLine();
                int aika=Integer.valueOf(keittoaika);
                System.out.println("Reseptit:");
                for (Resepti resepti:reseptilista){
                    if (resepti.getAika()<=aika){
                        System.out.println(resepti);
                    }
                }
            }
            if (komento.equals("hae aine")){
                System.out.print("Mitä raaka-ainetta haetaan: ");
                String aine = lukija.nextLine();
                System.out.println("Reseptit:");
                for (Resepti resepti:reseptilista){
                    for (String raakaAine:resepti.getAineet()){
                        if (raakaAine.equals(aine)){
                            System.out.println(resepti);
                        }
                    }
                }
            }
        }

    }

}
