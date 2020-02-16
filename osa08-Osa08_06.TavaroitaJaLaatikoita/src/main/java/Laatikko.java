
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
public class Laatikko implements Talletettava{
    private ArrayList <Talletettava> laatikonSisalto;
    private double maksimiPaino;

    public Laatikko(double maksimiPaino) {
        this.laatikonSisalto = new ArrayList<>();
        this.maksimiPaino = maksimiPaino;
    }
    public void lisaa(Talletettava talletettava){
        if (this.paino()+talletettava.paino() <= this.maksimiPaino){
            this.laatikonSisalto.add(talletettava);
        }
    }
    public double paino(){
        double yhteispaino=0.0;
        for (Talletettava talletettu:laatikonSisalto){
            yhteispaino+=talletettu.paino();
        }
        return yhteispaino;
    }
    @Override
    public String toString(){
        return "Laatikko: "+this.laatikonSisalto.size()+" esinettä, paino yhteensä "+this.paino()+" kiloa";
    }
}
