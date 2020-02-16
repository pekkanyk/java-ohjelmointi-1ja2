
import java.util.Scanner;

public class KolmellaJaolliset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

    }
    public static void kolmellaJaollisetValilta(int alku, int loppu){
        int i=alku;
        int kolmellajaolliset=0;
        while (true){
            if (i%3==0){
                System.out.println(i);
            }
            if (i==loppu){
                break;
            }
            i++;
        }
    }
}
