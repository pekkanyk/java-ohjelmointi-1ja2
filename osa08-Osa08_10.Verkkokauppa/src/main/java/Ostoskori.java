
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pekka
 */
public class Ostoskori {
    private Map<String, Ostos> ostoskori;
    
    public Ostoskori (){
        this.ostoskori = new HashMap<>();
    }
    
    public void lisaa (String tuote, int hinta){
        if (this.ostoskori.containsKey(tuote)){
            this.ostoskori.get(tuote).kasvataMaaraa();
        }
        else {
            this.ostoskori.put(tuote,new Ostos(tuote,1,hinta));
        }
    }
    
    public int hinta(){
        int yhteisHinta=0;
        for (Ostos ostos:this.ostoskori.values()){
            yhteisHinta += ostos.hinta();
        }
        return yhteisHinta;
    }
    
    public void tulosta(){
        for (Ostos ostos:this.ostoskori.values()){
            System.out.println(ostos);
        }
    }
}
