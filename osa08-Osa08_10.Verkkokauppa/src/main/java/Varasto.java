
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pekka
 */
public class Varasto {
    private Map <String, Integer> hinnat;
    private Map <String, Integer> saldo;

    public Varasto() {
        hinnat = new HashMap<>();
        saldo = new HashMap<>();
    }
    
    public void lisaaTuote(String tuote,int hinta, int saldo){
        this.hinnat.put(tuote, hinta);
        this.saldo.put(tuote, saldo);
    }
    
    public int hinta(String tuote){
        if (this.hinnat.containsKey(tuote)){
            return this.hinnat.get(tuote);
        }
        return -99;
        
    }
    
    public int saldo(String tuote){
        if (this.saldo.containsKey(tuote)){
            return this.saldo.get(tuote);
        }
        return 0;
    }
    
    public boolean ota(String tuote){
        if (this.saldo.containsKey(tuote)){
            if (this.saldo.get(tuote)>=1){
                int uusiSaldo = this.saldo.get(tuote)-1;
                this.saldo.replace(tuote, uusiSaldo);
                return true;
            }
            return false;
        }
        return false;
    }
    
    public Set<String> tuotteet(){
        return this.saldo.keySet();
    }
}
