package ristinolla;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class RistinollaSovellus extends Application{
    
    @Override
    public void start(Stage ikkuna){
        Ruudukko peli = new Ruudukko();
        //kehyskomponentit
        BorderPane pohja = new BorderPane();
        GridPane ruudukko = new GridPane();
        Label ylateksti = new Label("Vuoro: X");
        ruudukko.setAlignment(Pos.CENTER);
        ruudukko.setHgap(10);
        ruudukko.setVgap(10);
        ruudukko.setPadding(new Insets(10, 10, 10, 10));
        Scene nakyma = new Scene(pohja);
        //komponentit
        //String seuraava = "X";
        //Label vuoro = new Label("Vuoro: X");
        //Label seuraava = new Label("X");
        ylateksti.setFont(Font.font("Monospaced", 40));
        //seuraava.setFont(Font.font("Monospaced", 40));
        //ylateksti.getChildren().add(vuoro);
        //ylateksti.getChildren().add(seuraava);
        
        Button[][] napit= new Button[3][3];
        
        for (int x=0;x<3;x++){
            for (int y=0;y<3;y++){
                napit[x][y]=new Button(" ");
                napit[x][y].setFont(Font.font("Monospaced", 40));
                ruudukko.add(napit[x][y], x, y);
                Button nappi = napit[x][y];
                int pelattavaX=x;
                int pelattavaY=y;
                nappi.setOnAction((event) -> {
                        if (peli.getRuutu(pelattavaX, pelattavaY) == 0){
                            String[] palat = ylateksti.getText().split(" ");
                            nappi.setText(palat[1]);
                            if (ylateksti.getText().equals("Vuoro: X")) { //X pelaa
                                peli.setRuutu(pelattavaX, pelattavaY, 1);
                                ylateksti.setText("Vuoro: O");
                            }
                            else {
                                peli.setRuutu(pelattavaX, pelattavaY, -1);
                                ylateksti.setText("Vuoro: X");
                            }
                            
                            if (peli.loppu()!=0){
                                ylateksti.setText("Loppu!");
                            }
                            
                        } 

                });
                
                //napit[x][y] = nappi;
                
            }
        }
                
        pohja.setTop(ylateksti);
        pohja.setCenter(ruudukko);
        //ikkuna näkyville
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }


    public static void main(String[] args) {
        launch(RistinollaSovellus.class);
    }
    /*
    public static boolean vapaaNappi(Button nappi){
        return nappi.getText().equals(" ");
    }
    */
}
