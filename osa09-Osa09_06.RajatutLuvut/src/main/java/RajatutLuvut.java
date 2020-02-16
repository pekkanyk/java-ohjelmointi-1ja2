
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RajatutLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Integer> luvut = new ArrayList<>();
        while (true){
            String rivi = lukija.nextLine();
            if (rivi.equals("-1")){
                break;
            }
            luvut.add(Integer.valueOf(rivi));
        }
        luvut.stream()
                .filter(luku -> luku >=1 && luku <=5)
                .forEach(luku -> System.out.println(luku));
    }
}
