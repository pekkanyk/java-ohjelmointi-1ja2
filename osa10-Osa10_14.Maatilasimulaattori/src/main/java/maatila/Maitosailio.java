/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatila;

/**
 *
 * @author Pekka
 */
public class Maitosailio {
    
    private double tilavuus;
    private double saldo;

    public Maitosailio() {
        this.tilavuus = 2000.0;
        this.saldo = 0.0;
    }
    
    public Maitosailio(double tilavuus){
        this.tilavuus=tilavuus;
        this.saldo=0.0;
    }

    public double getTilavuus() {
        return tilavuus;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public double paljonkoTilaaJaljella(){
        return this.tilavuus - this.saldo;
    }
    
    public void lisaaSailioon(double maara){
        this.saldo+=maara;
        if (this.saldo>this.tilavuus) this.saldo=this.tilavuus;
    }
    
    public double otaSailiosta(double maara){ //oli tyyppiä double??
        this.saldo-=maara;
        if (this.saldo<0) this.saldo=0.0;
        return this.saldo;
    }
    
    @Override
    public String toString(){
        //double temp = saldo*10;
        //return Math.ceil(saldo*10)/10+"/"+Math.ceil(tilavuus);
        return Math.ceil(saldo)+"/"+Math.ceil(tilavuus);
    }
    
}
