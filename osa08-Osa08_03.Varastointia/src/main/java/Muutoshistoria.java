
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
public class Muutoshistoria {
    private ArrayList<Double> muutoshistoria;
    public Muutoshistoria(){
        this.muutoshistoria = new ArrayList<>();
    }
    public void lisaa (double tilanne){
        this.muutoshistoria.add(tilanne);
    }
    public void nollaa(){
        this.muutoshistoria.clear();
    }
    
    @Override
    public String toString(){
        return this.muutoshistoria.toString();
    }
    public double maxArvo(){
        double suurin=this.muutoshistoria.get(0);
        for (Double maara:this.muutoshistoria){
            if (maara>suurin){
                suurin=maara;
            }
        }
        return suurin;
    }
    public double minArvo(){
        double pienin = this.muutoshistoria.get(0);
        for (Double maara:this.muutoshistoria){
            if (maara < pienin){
                pienin = maara;
            }
        }
        return pienin;
    }
    public double keskiarvo(){
        double summa=0.0;
        for (Double maara:this.muutoshistoria){
            summa=summa+maara;
        }
        return summa/this.muutoshistoria.size();
    }
    
}
