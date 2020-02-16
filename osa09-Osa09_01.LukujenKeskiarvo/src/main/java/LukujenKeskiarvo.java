
import java.util.ArrayList;
import java.util.Scanner;

public class LukujenKeskiarvo {

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
        double keskiarvo = luvut.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
        System.out.println("Lukujen keskiarvo: "+keskiarvo);

    }
    
}
