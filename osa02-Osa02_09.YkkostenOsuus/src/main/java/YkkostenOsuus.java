
import java.util.Scanner;

public class YkkostenOsuus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int ykkoset = 0;
        int luvut = 0;
        while (true){
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku==0){
                if (luvut==0){
                    System.out.println("ykkösten osuutta ei voida laskea");
                    break;
                }else {
                    System.out.println((1.0*ykkoset)/luvut);
                    break;
                }
            }else if (luku ==1){
                ykkoset++;
            }
            luvut++;
        }
    }
}
