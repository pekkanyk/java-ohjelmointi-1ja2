
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author qru19
 */
public class UseanKaannoksenSanakirja {
    private HashMap<String, ArrayList<String>> sanakirja;
    public UseanKaannoksenSanakirja(){
        this.sanakirja=new HashMap<>();
    }
    public void lisaa(String sana, String kaannos){
        ArrayList<String> apu = new ArrayList<>();
        if (this.sanakirja.containsKey(sana)){
            apu = this.sanakirja.get(sana);
        }
        apu.add(kaannos);
        this.sanakirja.put(sana, apu);
    }
    public ArrayList<String> kaanna(String sana){
        if (this.sanakirja.containsKey(sana)){
            return this.sanakirja.get(sana);
        }
        return new ArrayList<>();
    }
    public void poista(String sana){
        this.sanakirja.remove(sana);
    }
    
}
