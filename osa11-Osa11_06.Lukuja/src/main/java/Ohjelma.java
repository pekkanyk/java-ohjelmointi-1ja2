
import java.util.Random;
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Montako satunnaislukua tulostetaan?");
        int syote = Integer.valueOf(lukija.nextLine());
        Random arpa = new Random();
        
        for (int i=0;i<syote;i++){
            System.out.println(arpa.nextInt(11));
        }
        
    }

}
