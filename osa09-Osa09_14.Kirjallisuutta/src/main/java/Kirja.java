/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pekka
 */
public class Kirja implements Comparable <Kirja>{
    private String nimi;
    private int kohdeika;

    public Kirja(String nimi, int kohdeika) {
        this.nimi = nimi;
        this.kohdeika = kohdeika;
    }
    public int getIka(){
        return this.kohdeika;
    }
    
    public String getNimi(){
        return this.nimi;
    }
    
    @Override
    public String toString(){
        return this.nimi+" ("+this.kohdeika+" vuotiaille ja vanhemmille)";
    }
    
    @Override
    public int compareTo(Kirja verrattava){
        return this.kohdeika - verrattava.getIka();
    }
    
}
