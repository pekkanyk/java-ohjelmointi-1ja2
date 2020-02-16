/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatila;

import java.util.Random;

/**
 *
 * @author Pekka
 */
public class Lehma implements Lypsava, Eleleva{
    private String nimi;
    private double tilavuus;
    private double maara;
    private static final String[] NIMIA = new String[]{
    "Anu", "Arpa", "Essi", "Heluna", "Hely",
    "Hento", "Hilke", "Hilsu", "Hymy", "Matti", "Ilme", "Ilo",
    "Jaana", "Jami", "Jatta", "Laku", "Liekki",
    "Mainikki", "Mella", "Mimmi", "Naatti",
    "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
    "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    public Lehma(String nimi){
        this.nimi=nimi;
        //int til = 150 + new Random().nextInt(251);
        //this.tilavuus= (1.0*til)/10;
        this.tilavuus = new Random().nextDouble() * (40.0 - 15.0) + 15.0;
    }
    
    public Lehma(){
        this(NIMIA[new Random().nextInt(NIMIA.length)]);
    }

    public String getNimi() {
        return nimi;
    }

    public double getTilavuus() {
        return tilavuus;
    }
    
    public double getMaara(){
        return maara;
    }
    
    @Override
    public String toString(){
        //double temp=maara*10;
        return nimi+" "+Math.ceil(maara)+"/"+Math.ceil(tilavuus);
        //return nimi+" "+Math.ceil(maara*10)/10+"/"+Math.ceil(tilavuus);
    }
    
    @Override
    public double lypsa(){
        double temp = maara;
        maara=0.0;
        return temp;
    }
    
    @Override
    public void eleleTunti(){
        double tuotettu = new Random().nextDouble() * (2.0-0.7) + 0.7;
        maara+=tuotettu;
        if (maara>tilavuus) maara=tilavuus;
    }
    
}
