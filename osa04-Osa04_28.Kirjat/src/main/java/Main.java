
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta tänne toiminnallisuus, jonka avulla käyttäjä voi syöttää
        // kirjoja sekä tarkastella niitä
        Scanner lukija = new Scanner(System.in);
        ArrayList<Kirja> kirjalista = new ArrayList<>();
        
        while(true){
            System.out.print("Nimi: ");
            String nimi=lukija.nextLine();
            if (nimi.equals("")){
                break;
            }
            System.out.print("Sivuja: ");
            int sivuja=Integer.valueOf(lukija.nextLine());
            System.out.print("Kirjoitusvuosi: ");
            int vuosi=Integer.valueOf(lukija.nextLine());
            
            kirjalista.add(new Kirja(nimi,sivuja,vuosi));
        }
        System.out.print("Mitä tulostetaan? ");
        String syote=lukija.nextLine();
        if (syote.equals("kaikki")){
            for (Kirja kirja: kirjalista){
                System.out.println(kirja);
            }
        }
        else if (syote.equals("nimi")){
            for (Kirja kirja: kirjalista){
                System.out.println(kirja.getNimi());
            }
        }

    }
}
