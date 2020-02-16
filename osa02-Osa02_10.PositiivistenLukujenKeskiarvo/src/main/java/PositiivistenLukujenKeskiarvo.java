
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int positiivisia = 0;
        int summa = 0;
        while (true){
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0){
                if (positiivisia == 0){
                    System.out.println("keskiarvon laskeminen ei ole mahdollista");
                    break;
                }else{
                    System.out.println((1.0*summa)/positiivisia);
                    break;
                }
                
            }else if (luku<0){
                continue;
            }
            positiivisia++;
            summa=summa+luku;
        }

    }
}
