
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int lukuja = 0;
        int summa = 0;
        while (true){
            System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0){
                System.out.println("Lukujen keskiarvo "+(1.0*summa/lukuja));
                break;
            }
            lukuja++;
            summa = summa+luku;
        }
    }
}
