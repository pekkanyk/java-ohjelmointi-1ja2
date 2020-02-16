
import java.util.Scanner;

public class JokaToinenSana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while (true){
            String luettu = lukija.nextLine();
            if (luettu.equals("")){
                break;
            }
            String[] palat = luettu.split(" ");
            for (int i=1;i<palat.length;i=i+2){
            System.out.println(palat[i]);
            }
        }


    }
}
