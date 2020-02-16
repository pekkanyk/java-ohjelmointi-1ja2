
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
public class Arvosanat {
    private ArrayList<Integer> arvosanat;
    
    public Arvosanat(){
        this.arvosanat = new ArrayList<>();
    }
    
    public void lisaaArvosana(int arvosana){
        if (arvosana>=0 && arvosana<=100){
            this.arvosanat.add(arvosana);
        }
        
    }
    
    public boolean onkoHyvaksytty(int indeksi){
        return this.arvosanat.get(indeksi)>=50;
    }
    
    public int getArvosana(int indeksi){
        return this.arvosanat.get(indeksi);
    }
    public int arvosanatYhteensa(){
        int apu=0;
        for (int arvosana:this.arvosanat){
            apu=apu+arvosana;
        }
        return apu;
    }
   
    public int arvosanojaYhteensa(){
        return this.arvosanat.size();
    }
    
    
    public int hyvaksytytArvosanatYhteensa(){
        int apu=0;
        for (int arvosana:this.arvosanat){
            if (arvosana>=50){
                apu=apu+arvosana;
            }
        }
        return apu;
    }
    
    public int hyvaksyttyjaArvosanojaYhteensa(){
        int apu=0;
        for (int arvosana:this.arvosanat){
            if (arvosana>=50){
                apu++;
            }
        }
        return apu;
    }
    
    public String keskiarvo(String syote){
        if (syote.equals("kaikki")){
            if (this.arvosanatYhteensa()==0){
                return "-";
            }
            Double keskiarvo = this.arvosanatYhteensa()/(1.0*this.arvosanat.size());
            return keskiarvo.toString();
                
        }
        else if (syote.equals("hyvaksytyt")){
            if (this.hyvaksyttyjaArvosanojaYhteensa()==0){
                return "-";
            }
            Double keskiarvo = this.hyvaksytytArvosanatYhteensa()/(1.0*this.hyvaksyttyjaArvosanojaYhteensa());
            return keskiarvo.toString();
        }
        return "-";
    }
    public void arvosanaJakauma(){
        int[] numerot={0,0,0,0,0,0};
        for (int arvosana:this.arvosanat){
            if (arvosana>=90){ numerot[5]++; }
            else if (arvosana>=80){ numerot[4]++; }
            else if (arvosana>=70){ numerot[3]++; }
            else if (arvosana>=60){ numerot[2]++; }
            else if (arvosana>=50){ numerot[1]++; }
            else { numerot[0]++; }
        }
        for (int i=5;i>=0;i--){
            System.out.print(i+": ");
            this.tulostaTahtia(numerot[i]);
        }
    }
    public void tulostaTahtia(int maara){
        for (int i=0;i<maara;i++){
            System.out.print("*");
        }
        System.out.println("");
    }
}
