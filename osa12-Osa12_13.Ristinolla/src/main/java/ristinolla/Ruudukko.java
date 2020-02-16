/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ristinolla;

/**
 *
 * @author Pekka
 */
public class Ruudukko {
    private int[][] ruudukko;
    
    public Ruudukko(){
        this.ruudukko= new int[3][3];
    }
    public int getRuutu(int x, int y){
        return this.ruudukko[x][y];
    }
    public void setRuutu(int x, int y, int xo){
             this.ruudukko[x][y] = xo;
    }
    
    public int loppu(){
        for (int x=0;x<3;x++){
            int summa = 0;
            for (int y=0;y<3;y++){
                summa+=this.ruudukko[x][y];
                if (summa==3) return 1;
                else if(summa==-3) return -1;
            }
        }
        
        for (int y=0;y<3;y++){
            int summa=0;
            for (int x=0;x<3;x++){
                summa+=ruudukko[x][y];
                if (summa==3) return 1;
                if (summa==-3) return -1;
            }
        }
        int summa=0;
        for (int x=0;x<3;x++){
            summa+=ruudukko[x][x];
        }
        if (summa==3) return 1;
        if (summa==-3) return -1;
        
        summa = 0;
        for (int x=0;x<3;x++){
            summa+=ruudukko[x][2-x];
            if (summa==3) return 1;
            if (summa==-3) return -1;
        }
        
        for (int x=0;x<3;x++){
            for (int y=0;y<3;y++){
                if (ruudukko[x][y]==0) return 0;
            }
        }
        
        return 2;
    }
    
}
