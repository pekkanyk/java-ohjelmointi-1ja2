package kollaasi;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class KollaasiSovellus extends Application {

    @Override
    public void start(Stage stage) {

        // esimerkki avaa kuvan, luo uuden kuvan, ja kopioi avatun kuvan 
        // uuteen kuvaan pikseli kerrallaan
        Image lahdeKuva = new Image("file:monalisa.png");

        PixelReader kuvanLukija = lahdeKuva.getPixelReader();

        int leveys = (int) lahdeKuva.getWidth();
        int korkeus = (int) lahdeKuva.getHeight();

        WritableImage kohdeKuva = new WritableImage(leveys, korkeus);
        PixelWriter kuvanKirjoittaja = kohdeKuva.getPixelWriter();
        
        /*
        int yKoordinaatti = 0;
        while (yKoordinaatti < korkeus) {
            int xKoordinaatti = 0;
            
            while (xKoordinaatti < leveys) {
                          

                Color vari = kuvanLukija.getColor(xKoordinaatti, yKoordinaatti);
                double punainen = vari.getRed();
                double vihrea = vari.getGreen();
                double sininen = vari.getBlue();
                double lapinakyvyys = vari.getOpacity();

                Color uusiVari = new Color(punainen, vihrea, sininen, lapinakyvyys);

                kuvanKirjoittaja.setColor(xKoordinaatti, yKoordinaatti, uusiVari);
                
                xKoordinaatti++;
                
            }
            yKoordinaatti++;
            
        }
        */
        
        // luodaan kuvasta pienempi kopio vasempaan yläkulmaan
        for (int x = 0; x < leveys / 2; x++) {
            for (int y = 0; y < korkeus / 2; y++) {
                Color vari = kuvanLukija.getColor(x * 2, y * 2);
                kuvanKirjoittaja.setColor(x, y, vari);
            }
        }

        // kopioidaan kopio muihin kulmiin
        kuvanLukija = kohdeKuva.getPixelReader();
        for (int x = 0; x < leveys / 2; x++) {
            for (int y = 0; y < korkeus / 2; y++) {
                Color vari = kuvanLukija.getColor(x, y);

                kuvanKirjoittaja.setColor(x + leveys / 2, y, vari);
                kuvanKirjoittaja.setColor(x, y + korkeus / 2, vari);
                kuvanKirjoittaja.setColor(x + leveys / 2, y + korkeus / 2, vari);
            }
        }

        // luodaan negatiivi
        for (int x = 0; x < leveys; x++) {
            for (int y = 0; y < korkeus; y++) {
                Color vari = kuvanLukija.getColor(x, y);

                double r = 1 - vari.getRed();
                double g = 1 - vari.getGreen();
                double b = 1 - vari.getBlue();

                Color negatiivi = new Color(r, g, b, vari.getOpacity());

                kuvanKirjoittaja.setColor(x, y, negatiivi);
            }
        }
        
        ImageView kuva = new ImageView(kohdeKuva);
  
        Pane pane = new Pane();
        pane.getChildren().add(kuva);
  

        stage.setScene(new Scene(pane));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    /*
    private static Image Pienenna(Image lahdekuva){
        PixelReader kuvanLukija = lahdekuva.getPixelReader();
        int leveys = (int) lahdekuva.getWidth();
        int korkeus = (int) lahdekuva.getHeight();
        
        WritableImage kohdeKuva = new WritableImage (leveys,korkeus);
        PixelWriter kuvanKirjoittaja = kohdeKuva.getPixelWriter();
        int pieniX=0;
        int pieniY=0;
        for(int y=0;y<leveys;y++){
            for(int x=0;x<korkeus;x++){
               kuvanKirjoittaja.setColor(pieniX, pieniY, kuvanLukija.getColor(x, y));
               //pieniX++;
            }
            //pieniY++;
        }
        return kohdeKuva;
    }
*/
}
