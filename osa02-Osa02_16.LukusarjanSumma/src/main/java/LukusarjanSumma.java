
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Mihin asti? ");
        int asti = Integer.valueOf(lukija.nextLine());
        int i=1;
        int summa=0;
        while (i<=asti){
            summa += i;
            i++;
        }
        System.out.println("Summa on "+summa);
    }
}
