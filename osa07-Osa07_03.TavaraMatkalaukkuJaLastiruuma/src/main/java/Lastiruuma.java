
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author qru19
 */
public class Lastiruuma {
    private final int maksimipaino;
    private ArrayList<Matkalaukku> laukut;
    
    public Lastiruuma (int maksimipaino){
        this.maksimipaino=maksimipaino;
        this.laukut = new ArrayList<>();
    }
    public void lisaaMatkalaukku(Matkalaukku laukku){
        if ((this.paino()+laukku.yhteispaino())<=this.maksimipaino){
            this.laukut.add(laukku);
        }
        
    }
    public String toString(){
        return this.laukut.size()+" matkalaukkua ("+this.paino()+" kg)";
    }
    public int paino(){
        int yhteispaino=0;
        for (Matkalaukku laukku:this.laukut){
            yhteispaino=yhteispaino+laukku.yhteispaino();
        }
        return yhteispaino;
    }
    public void tulostaTavarat(){
        for (Matkalaukku laukku:this.laukut){
            laukku.tulostaTavarat();
        }
    }
}
