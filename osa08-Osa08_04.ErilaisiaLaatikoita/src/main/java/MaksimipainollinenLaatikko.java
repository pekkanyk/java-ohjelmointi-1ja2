
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pekka
 */
public class MaksimipainollinenLaatikko extends Laatikko{
    private int maksimipaino;
    private ArrayList<Tavara> tavarat;
    
    public MaksimipainollinenLaatikko(int maksimipaino){
        this.maksimipaino=maksimipaino;
        this.tavarat = new ArrayList<>();
    }
    
    @Override
    public void lisaa(Tavara tavara){
        if ((this.yhteisPaino()+tavara.getPaino())<=this.maksimipaino){
            this.tavarat.add(tavara);
        }
        
    }
    public int yhteisPaino(){
        int yhteispaino=0;
        if (!this.tavarat.isEmpty()){
            for (Tavara tavara:this.tavarat){
                yhteispaino=yhteispaino+tavara.getPaino();
            }
        }
        
        return yhteispaino;
    }
    @Override
    public boolean onkoLaatikossa(Tavara tavara){
        return this.tavarat.contains(tavara);
    }
    
}
