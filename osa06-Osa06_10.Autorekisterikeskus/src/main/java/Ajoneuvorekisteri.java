
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
public class Ajoneuvorekisteri {
    private HashMap<Rekisterinumero,String>omistajat;
    
    public Ajoneuvorekisteri(){
        this.omistajat=new HashMap<>();
    }
    
    public boolean lisaa(Rekisterinumero rekkari, String omistaja){
        if (!this.omistajat.containsKey(rekkari)){
            this.omistajat.put(rekkari, omistaja);
            return true;
        }
        return false;
    }
    public String hae(Rekisterinumero rekkari){
        if (this.omistajat.containsKey(rekkari)){
            return this.omistajat.get(rekkari);
        }
        return null;
    }
    public boolean poista(Rekisterinumero rekkari){
        if (this.omistajat.containsKey(rekkari)){
            this.omistajat.remove(rekkari);
            return true;
        }
        return false;
    }
    public void tulostaRekisterinumerot(){
        for (Rekisterinumero tieto:this.omistajat.keySet()){
            System.out.println(tieto.toString());
        }
    }
    public void tulostaOmistajat(){
        ArrayList<String> nimet = new ArrayList<>();
        
        for (Rekisterinumero tieto:this.omistajat.keySet()){
            if (!nimet.contains(this.omistajat.get(tieto))){
                nimet.add(this.omistajat.get(tieto));
            }
        }
        for (int i=0;i<nimet.size();i++){
            System.out.println(nimet.get(i));
        }
        
    }
}
