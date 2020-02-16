package tekstitilastointia;

import java.util.Arrays;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TekstitilastointiaSovellus extends Application{
    @Override
    public void start (Stage ikkuna){
        BorderPane asettelu = new BorderPane();
        TextArea tekstiRuutu = new TextArea();
        Label kirjaimia = new Label("Kirjaimia: 0");
        Label sanojaLabel = new Label("Sanoja: 0");
        Label pisinSana = new Label("Pisin sana on: ");
        
        HBox tekstikentat = new HBox();
        tekstikentat.setSpacing(10);
        tekstikentat.getChildren().add(kirjaimia);
        tekstikentat.getChildren().add(sanojaLabel);
        tekstikentat.getChildren().add(pisinSana);
        
        asettelu.setBottom(tekstikentat);
        asettelu.setCenter(tekstiRuutu);
        Scene nakyma = new Scene(asettelu);
        tekstiRuutu.textProperty().addListener((muutos,vanhaArvo,uusiArvo) -> {
            int merkkeja = uusiArvo.length();
            String[] palat = uusiArvo.split(" ");
            int sanoja = palat.length;
            String pisin = Arrays.stream(palat)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            kirjaimia.setText("Kirjaimia: "+merkkeja);
            sanojaLabel.setText("Sanoja: "+sanoja);
            pisinSana.setText("Pisin sana on: "+pisin);
            
            
        });
  
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }


    public static void main(String[] args) {
        launch(TekstitilastointiaSovellus.class);
    }

}
