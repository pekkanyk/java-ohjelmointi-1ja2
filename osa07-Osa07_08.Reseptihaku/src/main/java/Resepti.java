
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pekka
 */
public class Resepti {
    private String reseptinNimi;
    private int valmistusaika;
    private ArrayList<String> ainekset;
    
    public Resepti (String nimi, int aika){
        this.reseptinNimi=nimi;
        this.valmistusaika=aika;
        this.ainekset = new ArrayList<>();
    }
    
    public void lisaaRaakaainse (String aine){
        this.ainekset.add(aine);
    }
    public String toString(){
        return this.reseptinNimi+", keittoaika: "+this.valmistusaika;
    }
    public String getNimi(){
        return this.reseptinNimi;
    }
    public int getAika(){
        return this.valmistusaika;
    }
    public ArrayList<String> getAineet(){
        return this.ainekset;
    }
}