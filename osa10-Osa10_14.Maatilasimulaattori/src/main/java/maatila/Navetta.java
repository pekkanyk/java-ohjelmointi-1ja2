/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatila;

import java.util.List;

/**
 *
 * @author Pekka
 */
public class Navetta {
    private Maitosailio maitosailio;
    private Lypsyrobotti lypsyrobotti;
    
    public Navetta (Maitosailio maitosailio){
        this.maitosailio = maitosailio;
    }
    
    public Maitosailio getMaitosailio(){
        return maitosailio;
    }
    
    public void asennaLypsyrobotti(Lypsyrobotti lypsyrobotti){
        this.lypsyrobotti = lypsyrobotti;
        this.lypsyrobotti.setMaitosailio(this.maitosailio);
    }
    
    public void hoida(List<Lehma> lehmat) throws IllegalStateException{
        //lehmat.forEach((lehma) -> maitosailio.lisaaSailioon(lehma.lypsa()));
        lehmat.forEach((lehma) -> lypsyrobotti.lypsa(lehma));
    }
    public void hoida(Lehma lehma) throws IllegalStateException{
        //maitosailio.lisaaSailioon(lehma.lypsa());
        lypsyrobotti.lypsa(lehma);
    }
    
    @Override
    public String toString (){
        return maitosailio.toString();
    }
}
