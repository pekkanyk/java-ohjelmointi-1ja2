
import java.util.ArrayList;
import java.util.Scanner;

public class PienimmanLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        ArrayList<Integer> lukulista = new ArrayList<>();
        while (true){
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 9999){
                break;
            }
            lukulista.add(luku);
        }
        int pienin = lukulista.get(0);
        for (int i=0;i<lukulista.size();i++){
            if (pienin > lukulista.get(i)){
                pienin = lukulista.get(i);
            }
        }
        System.out.println("Pienin luku on "+pienin);
        for (int i=0;i<lukulista.size();i++){
            if (lukulista.get(i)==pienin){
                System.out.println("Pienin luku löytyy indeksistä "+i);
            }
        }

        // toteuta tänne ohjelma, joka lukee käyttäjältä lukuja
        // kunnes käyttäjä syöttää luvun 9999
        
        // tämän jälkeen ohjelma tulostaa pienimmän luvun
        // sekä sen indeksin -- pienin luku voi esiintyä
        // useammassa indeksissä
        
    }
}
