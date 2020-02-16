
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
public class Kellari {
    private HashMap<String, ArrayList<String>> komerot;
    
    public Kellari(){
        this.komerot=new HashMap<>();
    }
    public void lisaa(String komero, String tavara){
        ArrayList<String> apu = new ArrayList<>();
        if (this.komerot.containsKey(komero)){
            apu = this.komerot.get(komero);
        }
        apu.add(tavara);
        this.komerot.put(komero, apu);
    }
    public ArrayList<String> sisalto(String komero){
        if (this.komerot.containsKey(komero)){
            return this.komerot.get(komero);
        }
        return new ArrayList<>();
    }
    public void poista (String komero, String tavara){
        ArrayList<String> apu = new ArrayList<>();
        if (this.komerot.containsKey(komero)){
            apu = this.sisalto(komero);
        }
        apu.remove(tavara);
        if (apu.isEmpty()){
            this.komerot.remove(komero);
        }
        else{
            this.komerot.put(komero, apu);
        }
    }
    public ArrayList<String> komerot(){
        ArrayList<String> apu = new ArrayList<>();
        for (String avain: this.komerot.keySet()){
            apu.add(avain);
        }
        return apu;
    }
    
    
}
