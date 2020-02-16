/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author qru19
 */
import java.util.ArrayList;
public class Pakkaus {
    private ArrayList<Lahja> lahjat;
    public Pakkaus(){
        this.lahjat= new ArrayList<>();
    }
    
    public void lisaaLahja(Lahja lahja){
        this.lahjat.add(lahja);
    }
    public int yhteispaino(){
        int yhteispaino=0;
        for (Lahja gift : this.lahjat){
            yhteispaino=yhteispaino+gift.getPaino();
        }
        return yhteispaino;
    }
}
