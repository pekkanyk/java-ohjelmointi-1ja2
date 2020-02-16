
import java.util.Arrays;


public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        int[] luvut = {8, 3, 7, 9, 1, 2, 4};
Paaohjelma.jarjesta(luvut);
    }
    
    public static int pienin(int[] taulukko){
        int pienin=taulukko[0];
        for (int i=1;i<taulukko.length;i++){
            if (pienin>taulukko[i]){
                pienin=taulukko[i];
            }
        }
        return pienin;
    }
    public static int pienimmanIndeksi(int[] taulukko){
        return Paaohjelma.pienimmanIndeksiAlkaen(taulukko, 0);
    }
    
    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi){
        int pienin=taulukko[taulukko.length-1];
        int indeksi=taulukko.length-1;
        for (int i=aloitusIndeksi;i<taulukko.length;i++){
            if (pienin>taulukko[i]){
                pienin=taulukko[i];
                indeksi=i;
            }
        }
        return indeksi;
    }
    public static void vaihda(int[] taulukko, int indeksi1, int indeksi2){
        int apu = taulukko[indeksi1];
        taulukko[indeksi1]=taulukko[indeksi2];
        taulukko[indeksi2]=apu;
    }
    public static void jarjesta(int[] taulukko){ 
        System.out.println(Arrays.toString(taulukko));
        for (int i=0;i<taulukko.length;i++){
            Paaohjelma.vaihda(taulukko, i, Paaohjelma.pienimmanIndeksiAlkaen(taulukko, i));
            System.out.println(Arrays.toString(taulukko));
        }
    }

}
