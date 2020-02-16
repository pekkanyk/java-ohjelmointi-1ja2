package hymio;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;


public class HymioSovellus extends Application{
    @Override
    public void start (Stage ikkuna){
        Canvas piirtoalusta = new Canvas(640,480);
        BorderPane pohjaruutu = new BorderPane();
        pohjaruutu.setCenter(piirtoalusta);
        GraphicsContext piirturi = piirtoalusta.getGraphicsContext2D();
        
        piirturi.setFill(Paint.valueOf("black"));
        piirturi.fillRect(200, 100, 50, 50);
        piirturi.fillRect(350, 100, 50, 50);
        piirturi.fillRect(150, 250, 50, 50);
        piirturi.fillRect(400, 250, 50, 50);
        piirturi.fillRect(200, 300, 200, 50);
        Scene nakuma = new Scene(pohjaruutu);
        ikkuna.setScene(nakuma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        launch(HymioSovellus.class);
    }

}
