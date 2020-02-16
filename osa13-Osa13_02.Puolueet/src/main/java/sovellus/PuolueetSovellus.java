package sovellus;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PuolueetSovellus extends Application{

    @Override
    public void start(Stage ikkuna){
        //luodaan X- ja Y-akselit ja määritellään nimet
        NumberAxis xAkseli = new NumberAxis(1968, 2008, 4);
        NumberAxis yAkseli = new NumberAxis();
        xAkseli.setLabel("Vuosi");
        yAkseli.setLabel("Kannatus");
        
        //luodaan viivakaavio
        LineChart<Number,Number> viivakaavio = new LineChart<>(xAkseli,yAkseli);
        viivakaavio.setTitle("Puolueiden suhteellinen kannatus");
        
        //datan käsittely
        //luetaan tiedosto taulukkoon rivi riviltä
        ArrayList<String> rivit = new ArrayList<>();
        try{
            Files.lines(Paths.get("puoluedata.tsv")).forEach(rivi ->rivit.add(rivi));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        //pilkotaan rivit paloihin ja liitetään hajautustauluun
        HashMap<String,HashMap<Integer,Double>> data = new HashMap<>();
        for (int i=1;i<rivit.size();i++) { // alkaa 1:stä koska ekalla rivillä vuosiluvut
            String[] palat = rivit.get(i).split("\t");
            //data.put(palat[0], new HashMap<>());
            HashMap<Integer,Double> luvut = new HashMap<>();
            int vuosi = 1964;
            Double kannatus = 0.0;
            for (int j=1;j<palat.length;j++){
                vuosi= vuosi+4;
                if (palat[j].equals("-")){
                    
                }
                else {
                    kannatus = Double.valueOf(palat[j]);
                    luvut.put(vuosi, kannatus);
                }        
            }
            data.put(palat[0], luvut);
            
        }
        
        //lisätään data kaavioon
        for (String puolue : data.keySet()){
            XYChart.Series puolueData = new XYChart.Series<>();
            puolueData.setName(puolue);
            
            
            data.get(puolue).entrySet().stream().forEach(pari -> {
                puolueData.getData().add(new XYChart.Data<>(pari.getKey(), pari.getValue()));
            });
            viivakaavio.getData().add(puolueData);
            
        }
        
        
        
        //näytetään viivakaavio
        Scene nakuma = new Scene(viivakaavio, 640,480);
        ikkuna.setScene(nakuma);
        ikkuna.show();
    }
    public static void main(String[] args) {
        launch(PuolueetSovellus.class);
    }

}
