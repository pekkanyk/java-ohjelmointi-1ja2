
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Mihin asti? ");
        int asti = Integer.valueOf(lukija.nextLine());
        System.out.print("Mistä lähtien? ");
        int i = Integer.valueOf(lukija.nextLine());
        while (i<=asti){
            System.out.println(i);
            i++;
        }
    }
}
