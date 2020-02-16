/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author qru19
 */
public class Kirja {
    private String kirjailija;
    private String nimi;
    private int sivumaara;
    
    public Kirja (String kirjailija, String nimi, int sivuja){
        this.kirjailija=kirjailija;
        this.nimi=nimi;
        this.sivumaara=sivuja;
    }
    
    public String getKirjailija(){
        return this.kirjailija;
    }
    
    public String getNimi(){
        return this.nimi;
    }
    
    public int getSivuja(){
        return this.sivumaara;
    }
    
    public String toString(){
        return this.kirjailija+", "+this.nimi+", "+this.sivumaara+" sivua";
    }
}
