/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pekka
 */
public class CDLevy implements Talletettava{
    private String artisti;
    private String levynNimi;
    private int julkaisuvuosi;

    public CDLevy(String artisti, String levynNimi, int julkaisuvuosi) {
        this.artisti=artisti;
        this.levynNimi = levynNimi;
        this.julkaisuvuosi = julkaisuvuosi;
    }
    
    
    @Override
    public double paino(){
        return 0.1;
    }
    @Override
    public String toString(){
        return this.artisti+": "+this.levynNimi+" ("+this.julkaisuvuosi+")";
    }
    
}
