/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;

import javafx.scene.chart.XYChart;

/**
 *
 * @author Pekka
 */
public class Viivakaavio {
    private double korko;
    private double talletus;
    private XYChart.Series viivakaavio;
    
    public Viivakaavio(){
        this.korko = 0.0;
        this.talletus = 0.0;
        this.viivakaavio = new XYChart.Series<>();
    }
    
    public XYChart.Series Piirra(){
        int vuodet = 30;
        double summa = 0.0;
        this.viivakaavio.getData().add(new XYChart.Data<>(0, 0));
        for (int i=1;i<=vuodet;i++){
            summa=summa+this.talletus*12; //talletus
            summa=summa+summa*(this.korko/100);
            this.viivakaavio.getData().add(new XYChart.Data<>(i, summa));
        }
        return this.viivakaavio;
    }
    
    public void paivita(double talletus, double korko){
        this.viivakaavio.getData().clear();
        if (talletus!=-1.0) this.talletus=talletus;
        if (korko!=-1.0) this.korko=korko;
        this.viivakaavio=this.Piirra();
    }
    public void setTalletus(double talletus){
        this.talletus=talletus;
    }
}
