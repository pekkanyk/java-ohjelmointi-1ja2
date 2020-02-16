/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatila;

/**
 *
 * @author Pekka
 */
public class Lypsyrobotti {
    private Maitosailio maitosailio;
    
    public Lypsyrobotti(){
        this.maitosailio=null;
    }
    public Maitosailio getMaitosailio(){
        return maitosailio;
    }
    public void setMaitosailio(Maitosailio maitosailio){
        this.maitosailio=maitosailio;
    }
    public void lypsa(Lypsava lypsava){
        if (maitosailio==null) {
            lypsava.lypsa();
            System.out.println("Maidot menevät hukkaan!");
        }
        else{
            maitosailio.lisaaSailioon(lypsava.lypsa());
        }
            
    }
}
