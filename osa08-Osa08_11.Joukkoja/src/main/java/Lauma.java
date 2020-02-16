
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
public class Lauma implements Siirrettava{
    private ArrayList<Siirrettava> lauma;
    public Lauma(){
        lauma = new ArrayList<>();
    }
    @Override
    public String toString(){
        String palautettava="";
        for (Siirrettava siirrettava:this.lauma){
            palautettava+=siirrettava.toString()+"\n";
        }
        return palautettava;
    }
    public void lisaaLaumaan(Siirrettava siirrettava){
        this.lauma.add(siirrettava);
    }
    @Override
    public void siirra(int dx, int dy){
        for (Siirrettava siirrettava:this.lauma){
            siirrettava.siirra(dx, dy);
        }
    }
}
