
import java.util.HashMap;

public class Arvosanarekisteri {

    private HashMap<Integer, Integer> arvosanat;
    private int lista;

    public Arvosanarekisteri() {
        this.arvosanat = new HashMap<>();
        this.lista=0;
    }

    public void lisaaArvosanaPisteidenPerusteella(int pisteet) {
        int arvosana = pisteetArvosanaksi(pisteet);

        int lkm = this.arvosanat.getOrDefault(arvosana, 0);
        this.arvosanat.put(arvosana, lkm + 1);
        this.lista=this.lista+pisteet;
    }

    public int montakoSaanutArvosanan(int arvosana) {
        return this.arvosanat.getOrDefault(arvosana, 0);
    }


    public static int pisteetArvosanaksi(int pisteet) {

        int arvosana = 0;
        if (pisteet < 50) {
            arvosana = 0;
        } else if (pisteet < 60) {
            arvosana = 1;
        } else if (pisteet < 70) {
            arvosana = 2;
        } else if (pisteet < 80) {
            arvosana = 3;
        } else if (pisteet < 90) {
            arvosana = 4;
        } else {
            arvosana = 5;
        }

        return arvosana;
    }
    public double koepisteidenKeskiarvo(){
        int apu = this.montakoSaanutArvosanan(0);
        apu = apu+this.montakoSaanutArvosanan(1);
        apu = apu+this.montakoSaanutArvosanan(2);
        apu = apu+this.montakoSaanutArvosanan(3);
        apu = apu+this.montakoSaanutArvosanan(4);
        apu = apu+this.montakoSaanutArvosanan(5);
        return this.lista/(1.0*apu);
    }
    public double arvosanojenKeskiarvo(){
        int arvot = 0;
        int montako=0;
        for (int i=0;i<=5;i++){
            arvot = arvot+i*this.arvosanat.getOrDefault(i, 0);
            montako = montako+this.arvosanat.getOrDefault(i, 0);
        }
        return arvot/(1.0*montako);
    }
}
