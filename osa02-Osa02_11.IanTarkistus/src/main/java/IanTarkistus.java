
import java.util.Scanner;

public class IanTarkistus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int ika = Integer.valueOf(lukija.nextLine());
        if (ika >=0 && ika <=120){
            System.out.println("OK");
        }else {
            System.out.println("Mahdotonta!");
        }

    }
}
