
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author qru19
 */
public class Tekstikayttoliittyma {
    private Scanner lukija;
    private Sanakirja sanakirja;
    
    public Tekstikayttoliittyma(Scanner lukija, Sanakirja sanakirja){
        this.lukija=lukija;
        this.sanakirja=sanakirja;
    }
    public void kaynnista(){
        System.out.println("Komennot: ");
        System.out.println("lisaa - lisaa sanaparin sanakirjaan");
        System.out.println("kaanna - kysyy sanan ja tulostaa sen käännöksen");
        System.out.println("lopeta - poistuu käyttöliittymästä");
        while (true){
            System.out.println("");
            System.out.print("Komento: ");
            String komento=this.lukija.nextLine();
            
            if (komento.equals("lopeta")){
                System.out.println("Hei hei!");
                break;
            }
            else if (komento.equals("lisaa")){
                System.out.print("Suomeksi: ");
                String apu = this.lukija.nextLine();
                System.out.print("Käännös: ");
                this.sanakirja.lisaa(apu, this.lukija.nextLine());
                
            }
            else if (komento.equals("kaanna")){
                System.out.print("Anna sana: ");
                String apu = this.lukija.nextLine();
                System.out.println("Käännös: "+this.sanakirja.kaanna(apu));
                
            }
            else {
                System.out.println("Tuntematon komento");
            }
                
            
        
        }
    }
    
}
