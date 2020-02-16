/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pekka
 */
public class Asevelvollinen implements Palvelusvelvollinen{
    private int tj;
    
    public Asevelvollinen(int paivia){
        this.tj=paivia;
    }
    @Override
    public int paiviaJaljella(){
        return this.tj;
    }
    @Override
    public void palvele(){
        if (this.tj>=1){
            this.tj--;
        }
        
    }
}
