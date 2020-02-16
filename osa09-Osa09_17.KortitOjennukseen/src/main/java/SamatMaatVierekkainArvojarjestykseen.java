
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pekka
 */
public class SamatMaatVierekkainArvojarjestykseen implements Comparator<Kortti> {
    @Override
    public int compare(Kortti k1, Kortti k2) {
        //return k1.getMaa().ordinal() - k2.getMaa().ordinal();
        
        Comparator <Kortti> vertailija = Comparator
                .comparing(Kortti::getMaa)
                .thenComparing(Kortti::getArvo);
        return vertailija.compare(k1, k2);
    }
}
