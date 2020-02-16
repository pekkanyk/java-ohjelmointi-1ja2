
import java.util.Scanner;

public class HipHipHurraa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while (true){
            if (lukija.nextLine().equals("lopeta")){
                System.out.println("hurraa!");
                break;
            }else {
                System.out.println("hip!");
            }
        }
    }
}
