package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UseampiNakyma extends Application{
    @Override
    public void start (Stage ikkuna){
        BorderPane ekaSisalto = new BorderPane();
        Scene ensimmainenSivu = new Scene(ekaSisalto);
        ekaSisalto.setTop(new Label("Eka näkymä!"));
        Button ekaNappi = new Button("Tokaan näkymään!");
        ekaSisalto.setCenter(ekaNappi);
        
        VBox tokaSisalto = new VBox();
        Scene toinenSivu = new Scene(tokaSisalto);
        Button tokaNappi = new Button("Kolmanteen näkymään!");
        tokaSisalto.getChildren().add(tokaNappi);
        tokaSisalto.getChildren().add(new Label("Toka näkymä!"));
        
        GridPane kolmasSisalto = new GridPane();
        Scene kolmasSivu = new Scene(kolmasSisalto);
        kolmasSisalto.add(new Label("Kolmas näkymä!"), 0, 0);
        Button kolmasNappi = new Button("Ekaan näkymään!");
        kolmasSisalto.add(kolmasNappi, 1, 1);
        
        ekaNappi.setOnAction((event) -> {
            ikkuna.setScene(toinenSivu);
        });
        tokaNappi.setOnAction((event) -> {
            ikkuna.setScene(kolmasSivu);
        });
        kolmasNappi.setOnAction((event) -> {
            ikkuna.setScene(ensimmainenSivu);
        });
        
        ikkuna.setScene(ensimmainenSivu);
        ikkuna.show();
    }
    

    public static void main(String[] args) {
        launch(UseampiNakyma.class);
    }

}
