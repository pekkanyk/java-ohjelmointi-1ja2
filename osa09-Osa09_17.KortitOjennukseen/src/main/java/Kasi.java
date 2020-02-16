
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pekka
 */
public class Kasi implements Comparable<Kasi>{
    private List<Kortti> kasi;
    
    public Kasi(){
        this.kasi = new ArrayList<>();
    }
    
    public void lisaa(Kortti kortti){
        this.kasi.add(kortti);
    }
    
    public void jarjesta(){
        Collections.sort(kasi);
    }
    
    public int summa(){
        int summa = 0;
        for (int i=0;i<this.kasi.size();i++){
            summa=summa+this.kasi.get(i).getArvo();
        }
        return summa;
    }
    
    public void tulosta(){
        this.kasi.stream().forEach(kortti -> System.out.println(kortti));
    }
    @Override
    public int compareTo(Kasi kasi){
        return this.summa() - kasi.summa();
    }
    
    public void jarjestaMaittain(){
        Collections.sort(kasi, new SamatMaatVierekkainArvojarjestykseen());
    }
}
