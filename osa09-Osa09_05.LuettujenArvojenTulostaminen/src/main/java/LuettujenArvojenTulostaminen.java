
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LuettujenArvojenTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<String> luvut = new ArrayList<>();
        while (true){
            String rivi = lukija.nextLine();
            if (rivi.isEmpty()){
                break;
            }
            luvut.add(rivi);
        }
        luvut.stream()
                .forEach(luku -> System.out.println(luku));

    }
}
