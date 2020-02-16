package tekstitilastointia;

import javafx.application.Application;
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
        
        HBox tekstikentat = new HBox();
        tekstikentat.setSpacing(10);
        tekstikentat.getChildren().add(new Label("Kirjaimia: 0"));
        tekstikentat.getChildren().add(new Label("Sanoja: 0"));
        tekstikentat.getChildren().add(new Label("Pisin sana on: "));
        
        asettelu.setBottom(tekstikentat);
        asettelu.setCenter(new TextArea());
        Scene nakyma = new Scene(asettelu);
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }


    public static void main(String[] args) {
        launch(TekstitilastointiaSovellus.class);
    }

}
