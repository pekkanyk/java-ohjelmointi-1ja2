
import java.util.ArrayList;
import java.util.Scanner;

public class TiettyjenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String>luvut = new ArrayList<>();
        System.out.println("Kirjoita syötteitä, \"loppu\" lopettaa.");
        while (true){
            String rivi = lukija.nextLine();
            if (rivi.equals("loppu")){
                break;
            }
            luvut.add(rivi);
        }
        /*
        ArrayList<String>positiiviset = new ArrayList<>();
        
        positiiviset.add(luvut.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(luku -> luku>0));
        */
        System.out.println("Tulostetaanko negatiivisten vai positiivisten lukujen keskiarvo? (n/p)");
        String rivi=lukija.nextLine();
        if (rivi.equals("n")){
            System.out.println("Negatiivisten lukujen keskiarvo: "+luvut.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(luku -> luku < 0)
                .average()
                .getAsDouble());
        }
        if (rivi.equals("p")){
            System.out.println("Positiivisten lukujen keskiarvo: "+luvut.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(luku -> luku >= 0)
                .average()
                .getAsDouble());
        }

    }
    private static double keskiarvo(ArrayList<String> lista){
        return lista.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
    }
}
