package ilmoitin;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class IlmoitinSovellus extends Application{
    @Override
    public void start(Stage ikkuna){
        VBox elementit = new VBox();
        TextField tekstikentta = new TextField();
        Button nappi = new Button("Päivitä");
        Label teksti = new Label();
        
        elementit.getChildren().add(tekstikentta);
        elementit.getChildren().add(nappi);
        elementit.getChildren().add(teksti);
        
        nappi.setOnAction((event) ->{
            teksti.setText(tekstikentta.getText());
        });
        
        Scene nakyma = new Scene(elementit);
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }


    public static void main(String[] args) {
        launch(IlmoitinSovellus.class);
    }

}
