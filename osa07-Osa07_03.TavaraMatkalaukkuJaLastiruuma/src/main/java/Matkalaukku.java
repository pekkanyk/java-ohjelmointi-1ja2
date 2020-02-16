
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author qru19
 */
public class Matkalaukku {
    private final int maksimipaino;
    private ArrayList<Tavara> sisalto;
    
    public Matkalaukku (int maksimipaino){
        this.maksimipaino=maksimipaino;
        this.sisalto = new ArrayList<>();
    }
    public void lisaaTavara(Tavara tavara){
        if (this.yhteispaino()+tavara.getPaino()<=this.maksimipaino){
            this.sisalto.add(tavara);
        }
        
    }
    public String toString(){
        
        return this.kappalemaara()+" ("+this.yhteispaino()+" kg)";
    }
    public int yhteispaino(){
        int yhteispaino=0;
        for (Tavara tavara:this.sisalto){
            yhteispaino=yhteispaino+tavara.getPaino();
        }
        return yhteispaino;
    }
    public String kappalemaara(){
        int kappalemaara=0;
        String teksti="";
        for (Tavara tavara:this.sisalto){
            kappalemaara++;
        }
        if (kappalemaara == 0){
            teksti = "ei tavaroita";
        }
        else if (kappalemaara==1){
            teksti = "1 tavara";
        }
        else {
            teksti= kappalemaara+" tavaraa";
        }
        return teksti;
    }
    public void tulostaTavarat(){
        for (Tavara tavara:this.sisalto){
            System.out.println(tavara.getNimi()+" ("+tavara.getPaino()+" kg)");
        }
    }
    public Tavara raskainTavara(){
        int raskain=0;
        int indeksi=0;
        int raskainIndeksi=0;
        for (Tavara tavara:this.sisalto){
         if (tavara.getPaino()>raskain){
             raskain=tavara.getPaino();
             raskainIndeksi=indeksi;
         }
         indeksi++;
        }
        if (this.sisalto.isEmpty()){
            return null;
        }
        else {
            return this.sisalto.get(raskainIndeksi);
        }
        
    }
}
