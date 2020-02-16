
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int sanoja = 0;
        while (true){
            if (lukija.nextLine().equals("loppu")){
                System.out.println(sanoja);
                break;
            }else {
                sanoja++;
            }
        }

    }
}
