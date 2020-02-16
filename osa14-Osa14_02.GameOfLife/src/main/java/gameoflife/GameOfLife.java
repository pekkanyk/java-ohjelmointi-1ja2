package gameoflife;

import java.util.Random;

public class GameOfLife {

    private int[][] taulukko;

    public GameOfLife(int leveys, int korkeus) {
        this.taulukko = new int[leveys][korkeus];
    }

    public void alustaSatunnaisesti() {
        Random satunnaistaja = new Random();

        int x = 0;
        while (x < taulukko.length) {

            int y = 0;
            while (y < taulukko[x].length) {
                if (satunnaistaja.nextDouble() < 0.2) {
                    taulukko[x][y] = 1;
                }

                y++;
            }
            x++;
        }
    }

    public void kehity() {
        // säännöt kehittymiselle:

        // 1. jokainen elossa oleva alkio, jolla on alle 2 elossa olevaa naapuria kuolee
        // 2. jokainen elossa oleva alkio, jolla on 2 tai 3 elossa olevaa naapuria pysyy hengissä
        // 3. jokainen elossa oleva alkio, jolla on 4 tai enemmän naapureita kuolee
        // 4. jokainen kuollut alkio, jolla on tasan 3 naapuria muuttuu eläväksi
        // taulukossa arvo 1 kuvaa elävää alkiota, arvo 0 kuollutta alkiota
        int[][] kopio = new int[this.taulukko.length][this.taulukko[0].length];
        for (int x=0;x<kopio.length;x++){
            for (int y=0;y<kopio[0].length;y++){
                if (this.taulukko[x][y]==1 && this.elossaOleviaNaapureita(this.taulukko, x, y) < 2 ) kopio[x][y]=0;
                else if (this.taulukko[x][y]==1 && this.elossaOleviaNaapureita(this.taulukko, x, y) >3) kopio[x][y]=0;
                else if (this.taulukko[x][y]==1 && this.elossaOleviaNaapureita(this.taulukko, x, y) == 2) kopio[x][y]=1;
                else if (this.taulukko[x][y]==1 && this.elossaOleviaNaapureita(this.taulukko, x, y) == 3) kopio[x][y]=1;
                else if (this.taulukko[x][y]==0 && this.elossaOleviaNaapureita(this.taulukko, x, y) == 3) kopio[x][y]=1;
            }
        }
        this.taulukko=kopio;

    }

    public int[][] getTaulukko() {
        return taulukko;
    }

    public void setTaulukko(int[][] taulukko) {
        this.taulukko = taulukko;
    }

    public int elossaOleviaNaapureita(int[][] taulukko, int x, int y) {
        int elaviaNaapureita=0;
        
        if (this.elossa(taulukko, x-1, y-1)) elaviaNaapureita++;
        if (this.elossa(taulukko, x, y-1)) elaviaNaapureita++;
        if (this.elossa(taulukko, x+1, y-1)) elaviaNaapureita++;
        
        if (this.elossa(taulukko, x-1, y)) elaviaNaapureita++;
        if (this.elossa(taulukko, x+1, y)) elaviaNaapureita++;
        
        if (this.elossa(taulukko, x-1, y+1)) elaviaNaapureita++;
        if (this.elossa(taulukko, x, y+1)) elaviaNaapureita++;
        if (this.elossa(taulukko, x+1, y+1)) elaviaNaapureita++;
        
        /* jostain syystä ei toimi
        for (int i=-1;i<=1;i++){
            for (int j=-1;j<=1;i++){
                
                    if (this.elossa(taulukko, x+i, y+j) && !(i!=0 && j!=0)) elaviaNaapureita++;
            }
         
        }
*/
        return elaviaNaapureita;
    }
    
    public boolean elossa(int[][] taulukko, int x, int y){
        if ((x>=0 && x<taulukko.length)&&(y>=0 && y<taulukko[0].length)){
          return taulukko[x][y]==1;
        }
        else return false;
        
    }
}
