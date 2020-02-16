/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author qru19
 */
import java.util.ArrayList;

public class Kirjasto {
    private ArrayList<Kirja> kirjat;
    
    public Kirjasto(){
        this.kirjat = new ArrayList<>();
    }
    
    public void lisaaKirja(Kirja uusiKirja){
        this.kirjat.add(uusiKirja);
    }
    public void tulostaKirjat(){
        for (Kirja kirja:this.kirjat){
            System.out.println(kirja);
        }
    }
    public ArrayList<Kirja> haeKirjaNimekkeella(String nimeke){
        ArrayList<Kirja> listaLoydetyista = new ArrayList<>();
        for (Kirja osuma:this.kirjat){
            if (StringUtils.sisaltaa(osuma.nimeke(), nimeke)){
                listaLoydetyista.add(osuma);
            }
        }
        return listaLoydetyista;
    }
    public ArrayList<Kirja> haeKirjaJulkaisijalla(String julkaisija){
        ArrayList<Kirja> listaLoydetyista = new ArrayList<>();
        for (Kirja osuma:this.kirjat){
            if (StringUtils.sisaltaa(osuma.julkaisija(), julkaisija)){
                listaLoydetyista.add(osuma);
            }
        }
        return listaLoydetyista;
    }
    public ArrayList<Kirja> haeKirjaJulkaisuvuodella(int julkaisuvuosi){
        ArrayList<Kirja> listaLoydetyista = new ArrayList<>();
        for (Kirja osuma:this.kirjat){
            if (osuma.julkaisuvuosi()==julkaisuvuosi){
                listaLoydetyista.add(osuma);
            }
        }
        return listaLoydetyista;
    }
    /*
    public static ArrayList<Kirja> haku(String nimeke, String tyyppi){
        ArrayList<Kirja> loydetyt = new ArrayList<>();
        if (tyyppi.equals("nimeke")){
            
        }
        else if (tyyppi.equals("julkaisija")){
            
        }
        else if (tyyppi.equals("vuosi")){
            
        }
        
        return loydetyt;
    }
    */
    
}
