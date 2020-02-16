
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Ensimmäinen ");
        int mista = Integer.valueOf(lukija.nextLine());
        System.out.print("Viimeinen: ");
        int mihin = Integer.valueOf(lukija.nextLine());
        int summa=0;
        while (mista<=mihin){
            summa += mista;
            mista++;
        }
        System.out.println("Summa on "+summa);
    }
}
