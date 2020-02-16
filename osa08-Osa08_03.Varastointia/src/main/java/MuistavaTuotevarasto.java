/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pekka
 */
public class MuistavaTuotevarasto extends Tuotevarasto{
    //private String tuotenimi;
    private Muutoshistoria muutoshistoria;
    
    public MuistavaTuotevarasto(String tuotenimi,double tilavuus, double alkuSaldo){
        super(tuotenimi,tilavuus);
        //this.tuotenimi=tuotenimi;
        super.lisaaVarastoon(alkuSaldo);
        this.muutoshistoria = new Muutoshistoria();
        muutoshistoria.lisaa(alkuSaldo);
    }
    public String historia(){
        return this.muutoshistoria.toString();
    }
    
    @Override
    public void lisaaVarastoon(double maara){
        super.lisaaVarastoon(maara);
        this.muutoshistoria.lisaa(super.getSaldo());
    }
    @Override
    public double otaVarastosta(double maara){
        double apu=super.otaVarastosta(maara);
        this.muutoshistoria.lisaa(super.getSaldo());
        return apu;
    }
    @Override
    public String toString(){
        return super.getNimi()+": "+super.toString();
    }
    public void tulostaAnalyysi(){
        System.out.println("Tuote: "+ super.getNimi());
        System.out.println("Historia: "+this.historia());
        System.out.println("Suurin tuotemäärä: "+this.muutoshistoria.maxArvo());
        System.out.println("Pienin tuotemäärä: "+this.muutoshistoria.minArvo());
        System.out.println("Keskiarvo: "+this.muutoshistoria.keskiarvo());
        
    }
}
