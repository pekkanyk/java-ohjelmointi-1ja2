
import java.util.Scanner;

public class Nuorin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String tieto = new String();
        int nuorinIka = 1000;
        String nuorin = "";
        while (true){
            tieto = lukija.nextLine();
            if (tieto.equals("loppu")){
                break;
            }
            else {
                String[] osat = tieto.split(",");
                if (Integer.valueOf(osat[1])<nuorinIka){
                    nuorinIka=Integer.valueOf(osat[1]);
                    nuorin=osat[0];
                }
            }
        }
        System.out.println("Nuorin oli: "+nuorin);

    }
}
