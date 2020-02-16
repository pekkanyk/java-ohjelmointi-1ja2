
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pekka
 */
public class Tyontekijat {
    private List <Henkilo> henkilokunta;
    
    public Tyontekijat(){
        this.henkilokunta = new ArrayList<>();
    }
    public void lisaa(Henkilo lisattava){
        this.henkilokunta.add(lisattava);
    }
    
    public void lisaa(List<Henkilo> lisattavat){
        this.henkilokunta.addAll(lisattavat);
    }
    
    public void tulosta(){
        Iterator<Henkilo> iteraattori = this.henkilokunta.iterator();
        while (iteraattori.hasNext()){
            System.out.println(iteraattori.next());
        }
    }
    
    public void tulosta(Koulutus koulutus){
        Iterator<Henkilo> iteraattori = this.henkilokunta.iterator();
        while (iteraattori.hasNext()){
            Henkilo henkilo = iteraattori.next();
            if (henkilo.Koulutus() == koulutus){
                System.out.println(henkilo);
            }
        }
    }
    
    public void irtisano(Koulutus koulutus){
        Iterator<Henkilo> iteraattori = this.henkilokunta.iterator();
        while (iteraattori.hasNext()){
            Henkilo henkilo = iteraattori.next();
            if (henkilo.Koulutus() == koulutus){
                iteraattori.remove();
            }
        }
    }
}
