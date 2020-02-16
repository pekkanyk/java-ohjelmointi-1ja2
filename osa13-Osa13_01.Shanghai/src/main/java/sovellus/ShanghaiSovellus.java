package sovellus;

import java.util.HashMap;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiSovellus extends Application{

    @Override
    public void start(Stage ikkuna){
        //luodaan X- ja Y-akselit ja määritellään nimet
        NumberAxis xAkseli = new NumberAxis(2007, 2017, 2);
        NumberAxis yAkseli = new NumberAxis(0, 100, 10);
        xAkseli.setLabel("Vuosi");
        yAkseli.setLabel("Sijoitus");
        
        //luodaan viivakaavio
        LineChart<Number,Number> viivakaavio = new LineChart<>(xAkseli,yAkseli);
        viivakaavio.setTitle("Helsingin yliopisto, Shanghai.ranking");
        
        //data
        HashMap<Integer,Integer> data = new HashMap<>();
        data.put(2007, 73);
        data.put(2008,68);
        data.put(2009,72);
        data.put(2010,72);
        data.put(2011,74);
        data.put(2012,73);
        data.put(2013,76);
        data.put(2014,73);
        data.put(2015,67);
        data.put(2016,56);
        data.put(2017,56);
        
        //lisätään data kaavioon    
        XYChart.Series yliopisto = new XYChart.Series();
        data.keySet().forEach((vuosi) -> {
            yliopisto.getData().add(new XYChart.Data(vuosi,data.get(vuosi)));
        });
        viivakaavio.getData().add(yliopisto);
        
        //näytetään viivakaavio
        Scene nakuma = new Scene(viivakaavio, 640,480);
        ikkuna.setScene(nakuma);
        ikkuna.show();
    }
    public static void main(String[] args) {
        launch(ShanghaiSovellus.class);
    }

}
