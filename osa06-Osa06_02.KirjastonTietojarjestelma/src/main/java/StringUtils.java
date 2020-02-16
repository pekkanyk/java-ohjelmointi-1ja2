/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author qru19
 */
public class StringUtils {
    public static boolean sisaltaa (String sana, String haettava){
        sana=sana.toUpperCase();
        haettava=haettava.toUpperCase();
        haettava=haettava.trim();
        return sana.contains(haettava);
    }
    
}
