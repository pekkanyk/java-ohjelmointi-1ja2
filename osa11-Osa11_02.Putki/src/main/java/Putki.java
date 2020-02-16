
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
public class Putki<T> {
    private ArrayList<T> putki;
    
    public Putki(){
        putki = new ArrayList<>();
    }
    public void lisaaPutkeen(T arvo){
        putki.add(arvo);
    }
    
    public T otaPutkesta(){
        T putkenVika = null;
        if (!putki.isEmpty()) {
            putkenVika = putki.get(0);
            putki.remove(0);
        }
        return putkenVika;
    }
    public boolean onkoPutkessa(){
        return !this.putki.isEmpty();
    }
}
