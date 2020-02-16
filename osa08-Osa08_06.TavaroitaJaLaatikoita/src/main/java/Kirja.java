/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pekka
 */
public class Kirja implements Talletettava{
    private String kirjailija;
    private String kirjanNimi;
    private double paino;

    public Kirja(String kirjailija, String kirjanNimi, double paino) {
        this.kirjailija = kirjailija;
        this.kirjanNimi = kirjanNimi;
        this.paino = paino;
    }
    
    @Override
    public double paino(){
        return this.paino;
    }
    @Override
    public String toString(){
        return this.kirjailija+": "+this.kirjanNimi;
    }
}
