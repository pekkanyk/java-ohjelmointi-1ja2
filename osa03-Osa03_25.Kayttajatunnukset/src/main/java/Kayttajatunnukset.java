
import java.util.Scanner;

public class Kayttajatunnukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String[] tunnukset = {"aleksi", "elina"};
        String[] salasanat = {"tappara", "kissa"};
        
        System.out.print("Anna tunnus: ");
        String tunnus = lukija.nextLine();
        System.out.print("Anna salasana: ");
        String salasana = lukija.nextLine();
        if (etsiNimi(tunnus, tunnukset)!=-1){
            if (salasana.equals(salasanat[etsiNimi(tunnus,tunnukset)])){
                System.out.println("Olet kirjautunut järjestelmään");
            }
            else{
                System.out.println("Virheellinen tunnus tai salasana!");
            }
        }
        else {
            System.out.println("Virheellinen tunnus tai salasana!");
        }

    }
    public static int etsiNimi(String nimi, String[] lista){
        int indeksi= -1;
        for (int i=0;i<lista.length;i++){
            if (lista[i].equals(nimi)){
                indeksi=i;
            }
        }
        return indeksi;
    }
}
