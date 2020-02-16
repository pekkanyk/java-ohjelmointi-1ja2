/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pekka
 */
public class Keskiarvosensori implements Sensori{
    private List <Sensori> sensorit;
    private List <Integer> mittaukset;

    public Keskiarvosensori() {
        this.sensorit= new ArrayList<>();
        this.mittaukset= new ArrayList<>();
    }
    
    @Override
    public boolean onPaalla() {
        boolean paalla=true;
        for (Sensori sensori: this.sensorit){
            if (!sensori.onPaalla()) paalla=false;
        }
        return paalla;
    }

    @Override
    public void paalle() {
        this.sensorit.forEach((sensori) -> {
            sensori.paalle();
        });
    }

    @Override
    public void poisPaalta() {
        this.sensorit.forEach((sensori) -> {
            sensori.poisPaalta();
        });
    }

    @Override
    public int mittaa() {
        if (this.sensorit.isEmpty()) throw new IllegalStateException("Sensorilista tyhjä");
        if (!this.onPaalla()) throw new IllegalStateException("Sensori pois päältä");
        int summa = 0;
        for (Sensori sensori:this.sensorit){
            summa= summa+sensori.mittaa();
        }
        this.mittaukset.add(summa/this.sensorit.size());
        return summa/this.sensorit.size();
    }
    
    public void lisaaSensori(Sensori lisattava){
        this.sensorit.add(lisattava);
    }
    
    public List<Integer> mittaukset(){
        return this.mittaukset;
    }
}
