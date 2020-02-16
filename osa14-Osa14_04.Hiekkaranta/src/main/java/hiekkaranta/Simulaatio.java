package hiekkaranta;

import java.util.ArrayList;
import java.util.Random;


public class Simulaatio {
    private Tyyppi[][] ruudukko;

    public Simulaatio(int leveys, int korkeus) {
        this.ruudukko=new Tyyppi[leveys][korkeus];
        for (int x=0;x<this.ruudukko.length;x++){
            for (int y=0;y<this.ruudukko[0].length;y++){
                this.ruudukko[x][y]=Tyyppi.TYHJA;
            }
        }
    }

    public void lisaa(int x, int y, Tyyppi tyyppi) {
        if (!(x<0 || x>=this.ruudukko.length || y<0 || y>=this.ruudukko[0].length)){
            this.ruudukko[x][y]=tyyppi;
        }
        
    }

    public Tyyppi sisalto(int x, int y) {
        if (x<0 || x>=this.ruudukko.length || y<0 || y>=this.ruudukko[0].length) return Tyyppi.METALLI;
        if (this.ruudukko[x][y]==null) return Tyyppi.TYHJA;
        return this.ruudukko[x][y];
    }
    
    public Tyyppi[][] siirraAlas(Tyyppi[][] table, int x, int y, int arpa){
        Tyyppi[][] uusi=table;
        if (table[x+arpa][y+1]==Tyyppi.VESI){
            uusi[x+arpa][y+1]=table[x][y];
            uusi[x][y]=Tyyppi.VESI;
            return uusi;
        }
        else{
            uusi[x+arpa][y+1]=table[x][y];
            uusi[x][y]=Tyyppi.TYHJA;
            return uusi;
        }
        
    }
    
    public int onkoVapaaAlhaalla(int x, int y){
        ArrayList<Integer> tyhjat = new ArrayList<>();
        ArrayList<Integer> sivullaTyhjaa = new ArrayList<>();
        Tyyppi piste = this.sisalto(x, y);
        if (piste==Tyyppi.HIEKKA){
            for (int i=-1;i<=1;i++){
                if (this.sisalto(x+i, y+1)==Tyyppi.TYHJA || this.sisalto(x+i, y+1)==Tyyppi.VESI) tyhjat.add(i);
            }
            if (tyhjat.isEmpty()) return -2;   
            return tyhjat.get(new Random().nextInt(tyhjat.size()));
            
        }
        else if (piste==Tyyppi.VESI){
            for (int i=-1;i<=1;i++){
                if (this.sisalto(x+i, y+1)==Tyyppi.TYHJA) tyhjat.add(i);
                if (this.sisalto(x+i, y)==Tyyppi.TYHJA) sivullaTyhjaa.add(i);
                
            }
            if (tyhjat.isEmpty()) {
                if (sivullaTyhjaa.isEmpty()) return -2;
                return -4+sivullaTyhjaa.get(new Random().nextInt(sivullaTyhjaa.size()));
                
            }   
            return tyhjat.get(new Random().nextInt(tyhjat.size()));
        }
        else return -2;
    }
    
    public Tyyppi[][] siirrySivulle(int x, int y, int arpa){
        Tyyppi[][] uusi=this.ruudukko;
        arpa=arpa+4;
        
        uusi[x+arpa][y]=this.sisalto(x, y);
        uusi[x][y]=Tyyppi.TYHJA;
        return uusi;
        
    }

    public void paivita() {
        Tyyppi[][] uusi = this.ruudukko;
        for (int x=0;x<uusi.length;x++){
            for (int y=0;y<uusi[0].length;y++){
                
                //if (this.sisalto(x, y)==Tyyppi.HIEKKA){
                    if (this.onkoVapaaAlhaalla(x, y)== -2){
                        
                    }
                    else if (this.onkoVapaaAlhaalla(x, y)< -2){
                        uusi = this.siirrySivulle(x, y, this.onkoVapaaAlhaalla(x, y));
                    }
                    else{
                        uusi = this.siirraAlas(this.ruudukko, x, y, this.onkoVapaaAlhaalla(x, y));
                    }
                //}
            }
        }
        this.ruudukko=uusi;
    }

}
