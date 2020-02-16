
import java.util.Scanner;

public class SanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while (true){
            String luettu = lukija.nextLine();
            if (luettu.equals("")){
                break;
            }
            String[] palat = luettu.split(" ");
            for (int i=0;i<palat.length;i++){
            System.out.println(palat[i]);
            }
        }


    }
}
