
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta luokkaa TelevisioOhjelma käyttävä ohjelmasi tänne

        ArrayList<TelevisioOhjelma> ohjelmat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        String nimi=new String();
        int pituus=0;
        
        while (true){
            System.out.print("Nimi: ");
            nimi=lukija.nextLine();
            if (nimi.equals("")){
                break;
            }
            
            System.out.print("Pituus: ");
            pituus=Integer.valueOf(lukija.nextLine());
            ohjelmat.add(new TelevisioOhjelma(nimi,pituus));
            
            
        }
        System.out.print("Ohjelman maksimipituus? ");
        int maksimi = Integer.valueOf(lukija.nextLine());
        for(TelevisioOhjelma ohjelma : ohjelmat){
            if (ohjelma.getPituus()<=maksimi){
                System.out.println(ohjelma);
            }
        }

    }
}
