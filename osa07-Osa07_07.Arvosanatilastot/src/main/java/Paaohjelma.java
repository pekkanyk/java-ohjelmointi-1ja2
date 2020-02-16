
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Arvosanat arvosanat = new Arvosanat();

        // Tee sovelluksesi tänne -- kannattaa harkita sovelluksen pilkkomista
        // useampaan luokkaan.
        System.out.println("Syötä yhteispisteet, -1 lopettaa:");
        while (true){
            String syote = lukija.nextLine();
            int arvosana = Integer.valueOf(syote);
            if (arvosana== -1){
                break;
            }
            arvosanat.lisaaArvosana(arvosana);
        }
                
        System.out.println("Pisteiden keskiarvo (kaikki): "+arvosanat.keskiarvo("kaikki"));
        System.out.println("Pisteiden keskiarvo (hyväksytyt):"+arvosanat.keskiarvo("hyvaksytyt"));
        System.out.println("Hyväksymisprosentti:"+100.0*arvosanat.hyvaksyttyjaArvosanojaYhteensa()/arvosanat.arvosanojaYhteensa());
        arvosanat.arvosanaJakauma();
    }
}
