/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pekka
 */
public class Lintu {
    private int bongaukset;
    private String nimi;
    private String latinaNimi;

    public Lintu(String nimi, String latinaNimi) {
        this.bongaukset = 0;
        this.nimi = nimi;
        this.latinaNimi = latinaNimi;
    }

    public int getBongaukset() {
        return bongaukset;
    }

    public String getNimi() {
        return nimi;
    }

    public String getLatinaNimi() {
        return latinaNimi;
    }
    public String toString(){
        return this.nimi+"("+this.latinaNimi+"): "+this.bongaukset+" havaintoa";
    }
    public void havainto(){
        this.bongaukset++;
    }
    
}
