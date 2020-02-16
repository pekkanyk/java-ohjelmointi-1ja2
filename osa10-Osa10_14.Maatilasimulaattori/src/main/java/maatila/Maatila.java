/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatila;

import java.util.ArrayList;

/**
 *
 * @author Pekka
 */
public class Maatila implements Eleleva{
    private String omistaja;
    private ArrayList<Lehma> lehmat;
    private Navetta navetta;
    
    public Maatila (String omistaja, Navetta navetta){
        this.lehmat = new ArrayList<>();
        this.omistaja = omistaja;
        this.navetta = navetta;
    }
    
    public void lisaaLehma(Lehma lehma){
        lehmat.add(lehma);
    }
    public String listaaLehmat(){
        String teksti="";
        if (lehmat.isEmpty()) teksti = "Ei lehmiä.\n";
        else {
            for (Lehma lehma:lehmat){
                teksti+=lehma.toString()+"\n";
            }
        }
        return teksti;
    }

    public String getOmistaja() {
        return omistaja;
    }
    public void asennaNavettaanLypsyrobotti(Lypsyrobotti lypsyrobotti){
        navetta.asennaLypsyrobotti(lypsyrobotti);
    }
    public void hoidaLehmat(){
        navetta.hoida(lehmat);
    }
    
    @Override
    public void eleleTunti(){
        lehmat.forEach((lehma) -> lehma.eleleTunti());
    }
    
    @Override
    public String toString(){
        return "Maatilan omistaja: "+omistaja+"\n"+
                "Navetan maitosailio: "+navetta.toString()+"\n"+
                listaaLehmat();
    }
}
