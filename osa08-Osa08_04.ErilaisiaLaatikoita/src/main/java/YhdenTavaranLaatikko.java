
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
public class YhdenTavaranLaatikko extends Laatikko{
    private ArrayList<Tavara> tavarat;
    
    public YhdenTavaranLaatikko(){
        this.tavarat = new ArrayList<>();
    }
    
    @Override
    public void lisaa(Tavara tavara){
        if (this.tavarat.isEmpty()){
            this.tavarat.add(tavara);
        }
    }
    @Override
    public boolean onkoLaatikossa(Tavara tavara){
        if (!this.tavarat.isEmpty()){
            return this.tavarat.get(0).equals(tavara);
        }
        return false;
    }
}
