/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanakirja;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pekka
 */
public class MuistavaSanakirja {
    private HashMap <String,String> sanat;
    private HashMap <String,String> toisinpain;
    private String tiedosto;
    
    public MuistavaSanakirja(){
        this.sanat = new HashMap<>();
        this.toisinpain = new HashMap<>();
        this.tiedosto = "sanat.txt";
    }
    public MuistavaSanakirja(String tiedosto){
        this.sanat = new HashMap<>();
        this.toisinpain = new HashMap<>();
        this.tiedosto = tiedosto;
    }
    
    public void lisaa (String sana, String kaannos){
        this.sanat.putIfAbsent(sana, kaannos);
        this.toisinpain.putIfAbsent(kaannos, sana);
    }
    public String kaanna(String sana){
        if (this.sanat.containsKey(sana)) return this.sanat.get(sana);
        else return this.toisinpain.get(sana);       
    }
    public void poista(String sana){
        if (this.sanat.containsKey(sana)){
            this.toisinpain.remove(this.sanat.get(sana));
            this.sanat.remove(sana);
        }
        else {
            this.sanat.remove(this.toisinpain.get(sana));
            this.toisinpain.remove(sana);
        }
    }
    public boolean lataa(){
        List<String> rivit = new ArrayList<>();
        File file = new File(this.tiedosto);
        try {
        Scanner tiedostonlukija = new Scanner(file);
        while (tiedostonlukija.hasNextLine()){
            String rivi = tiedostonlukija.nextLine();
            String [] osat = rivi.split(":");
            this.lisaa(osat[0],osat[1]);
        }
        return true;
        } catch (Exception e){
            return false;
        }
        /*
        try {
            //Files.lines(Paths.get(this.tiedosto)).forEach(rivi -> rivit.add(rivi));
            
            for (String rivi:rivit){
                String[] osat = rivi.split(":");
                this.lisaa(osat[0], osat[1]);
            }
            return true;
        } catch (Exception e){
            System.out.println("Virhe "+e.getMessage());
            return false;
        }
        */        
    }
    
    public boolean tallenna(){
        try {
            PrintWriter kirjoittaja = new PrintWriter(this.tiedosto);
            for (String sana:this.sanat.keySet()){
                kirjoittaja.println(sana+":"+this.sanat.get(sana));
                //kirjoittaja.write(sana+":"+this.sanat.get(sana)+"\n");
            }
            kirjoittaja.flush();
            kirjoittaja.close();    
            
            return true;
        
        } catch (IOException ex) {
            Logger.getLogger(MuistavaSanakirja.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
