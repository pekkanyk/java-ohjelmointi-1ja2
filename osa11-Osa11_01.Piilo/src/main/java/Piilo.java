/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pekka
 */
public class Piilo<T>{
    T t;
    public Piilo(){
        this.t=null;
    }
    public void laitaPiiloon(T piilotettava){
        this.t=piilotettava;
    }
    public T otaPiilosta(){
        T temp=this.t;
        this.t=null;
        return temp;
    }
    public boolean onkoPiilossa(){
        return this.t != null;
    }
}
