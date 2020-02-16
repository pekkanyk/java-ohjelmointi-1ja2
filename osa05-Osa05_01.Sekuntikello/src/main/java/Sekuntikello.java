/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author qru19
 */
public class Sekuntikello {
    private Viisari sekunnit;
    private Viisari sadasosat;
    
    public Sekuntikello(){
        this.sekunnit=new Viisari(60);
        this.sadasosat=new Viisari(100);
    }
    public void etene(){
        this.sadasosat.etene();
        if (this.sadasosat.arvo()==0){
            this.sekunnit.etene();
        }
    }
    public String toString(){
        return sekunnit+":"+sadasosat;
    }
    
}
