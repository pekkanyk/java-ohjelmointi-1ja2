/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author qru19
 */
public class Laskuri {
    private int arvo;
    
    public Laskuri(int alkuarvo){
        this.arvo=alkuarvo;
    }
    public Laskuri(){
        this(0);
    }
    
    public int arvo(){
        return this.arvo;
    }
    public void lisaa(){
        lisaa(1);
    }
    public void lisaa(int luku){
        if (luku>0){
            this.arvo=this.arvo+luku;
        }
    }
    public void vahenna(){
        vahenna(1);
    }
    public void vahenna(int luku){
        if (luku>0){
            this.arvo=this.arvo-luku;
        }
    }
    
}
