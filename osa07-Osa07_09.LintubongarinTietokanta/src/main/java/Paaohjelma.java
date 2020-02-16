
import java.util.ArrayList;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        // HUOM! Älä luo ohjelmassa muita Scanner-olioita. Jos ja toivottavasti
        // kun teet muita luokkia, anna allaoleva Scanner-olio niille
        // tarvittaessa parametrina.

        Scanner lukija = new Scanner(System.in);
        ArrayList<Lintu> lintulista = new ArrayList<>();
        
        while (true){
            System.out.println("?");
            String syote = lukija.nextLine();
            if (syote.equals("Lopeta")){
                break;
            }
            if (syote.equals("Lisaa")){
                System.out.print("Nimi: ");
                String syotettyNimi = lukija.nextLine();
                System.out.print("Latinankielinen nimi: ");
                String syotettyLatinaNimi = lukija.nextLine();
                lintulista.add(new Lintu(syotettyNimi, syotettyLatinaNimi));
            }
            if (syote.equals("Havainto")){
                System.out.print("Mikä havaittu? ");
                String havainto = lukija.nextLine();
                for (Lintu lintu:lintulista){
                    if (lintu.getNimi().equals(havainto)){
                        lintu.havainto();
                    }
                    else {
                        System.out.println("Ei ole lintu!");
                    }
                }
            }
            if (syote.equals("Tilasto")){
                for (Lintu lintu:lintulista){
                    System.out.println(lintu);
                }
            }
            if (syote.equals("Nayta")){
                System.out.print("Mikä?");
                String linnunNimi = lukija.nextLine();
                for (Lintu lintu:lintulista){
                    if (lintu.getNimi().equals(linnunNimi)){
                        System.out.println(lintu);
                    }
                    else {
                        System.out.println("Ei ole lintu!");
                    }
                }
            }
        }
        
        

    }

}
