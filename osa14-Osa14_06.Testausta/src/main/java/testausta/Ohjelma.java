package testausta;

import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println(suorita(lukija));
        
    }

    public static String suorita(Scanner lukija) {
        int pulloja = 0;
        int oppilaita = 0;
        while (true){
            String syote = lukija.nextLine();
            if (syote.equals("-1")) {
                if (oppilaita==0) {
                    return "Pulloja: "+pulloja+"\n"+
                        "Oppilaita: "+oppilaita+"\n"+
                        "Keskiarvoa ei voida laskea";
                }
                return "Pulloja: "+pulloja+"\n"+
                        "Oppilaita: "+oppilaita+"\n"+
                        "Keskiarvo: "+(pulloja/(1.0*oppilaita));
            }
            if (Integer.valueOf(syote)>=0){
                pulloja+=Integer.valueOf(syote);
                oppilaita++;
            }
        }
        
    }
}
