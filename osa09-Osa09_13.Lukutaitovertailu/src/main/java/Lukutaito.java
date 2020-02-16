/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pekka
 */
public class Lukutaito implements Comparable<Lukutaito>{
    private String maa;
    private String sukupuoli;
    private int vuosi;
    private double prosentit;

    public Lukutaito(String maa, String sukupuoli, int vuosi, double prosentit) {
        this.maa = maa;
        this.sukupuoli = sukupuoli;
        this.sukupuoli = this.sukupuoli.trim().split(" ")[0];
        //this.sukupuoli = palat[0];
        this.vuosi = vuosi;
        this.prosentit = prosentit;
    }
    
    @Override
    public int compareTo(Lukutaito lukutaito){
        if (this.prosentit > lukutaito.prosentit)
            return 1;
        else if (this.prosentit < lukutaito.prosentit)
            return -1;
        else
            return 0;
    }
    
    @Override
    public String toString(){
        return this.maa+" ("+this.vuosi+"), "+this.sukupuoli+", "+Double.toString(this.prosentit);
    }
    
}
