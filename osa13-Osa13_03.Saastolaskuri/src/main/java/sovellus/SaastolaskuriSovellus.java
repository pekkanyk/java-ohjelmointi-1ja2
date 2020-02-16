package sovellus;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SaastolaskuriSovellus extends Application{
    @Override
    public void start (Stage ikkuna){
        //luodaan kehykset 
        BorderPane pohja = new BorderPane();
        //pohja.setPadding(new Insets(10,10,10,10));
        VBox ylaosa = new VBox();
        ylaosa.setPadding(new Insets(20,20,20,20));
        BorderPane talletusPohja = new BorderPane();
        BorderPane korkoPohja = new BorderPane();
        
        //liukujen elementit
        Slider talletus = new Slider();
        talletus.setMin(25);
        talletus.setMax(250);
        talletus.setShowTickLabels(true);
        talletus.setShowTickMarks(true);
        talletus.setMajorTickUnit(25);
        talletus.setMinorTickCount(5);
        talletus.setBlockIncrement(5);
        Label talletusArvo = new Label(String.valueOf(talletus.getValue()));
        Slider korko = new Slider();
        korko.setMin(0);
        korko.setMax(10);
        korko.setShowTickLabels(true);
        korko.setShowTickMarks(false);
        Label korkoArvo = new Label(String.valueOf(korko.getValue()));
        
        
        //kaavion elementit
        NumberAxis xAkseli = new NumberAxis(0,30,1);
        NumberAxis yAkseli = new NumberAxis();
        LineChart<Number,Number> kaavio = new LineChart<>(xAkseli,yAkseli);
        kaavio.setTitle("Säästölaskuri");
        kaavio.setLegendVisible(false);
        
        //asetetaan elementit kehyksiin yms
        talletusPohja.setLeft(new Label("Kuukausittainen tallennus"));
        talletusPohja.setCenter(talletus);
        talletusPohja.setRight(talletusArvo);
        korkoPohja.setLeft(new Label("Vuosittainen korko"));
        korkoPohja.setCenter(korko);
        korkoPohja.setRight(korkoArvo);
        ylaosa.getChildren().add(talletusPohja);
        ylaosa.getChildren().add(korkoPohja);
        pohja.setTop(ylaosa);
        pohja.setCenter(kaavio);
        
        Scene nakuma = new Scene(pohja,800,600);
        //toiminnallisuus
        Viivakaavio talletusIlmanKorkoa = new Viivakaavio();
        Viivakaavio talletusKorolla = new Viivakaavio();
        talletusKorolla.setTalletus(25);
        talletusIlmanKorkoa.setTalletus(25);

        talletus.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> ov,
                Number old_val, Number new_val) {
                    talletusArvo.setText(String.format("%.2f", new_val));
                    talletusIlmanKorkoa.paivita(new_val.doubleValue(), -1.0);
                    talletusKorolla.paivita(new_val.doubleValue(), -1.0);
            }
        });
        korko.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> ov,
                Number old_val, Number new_val) {
                    korkoArvo.setText(String.format("%.2f", new_val));
                    talletusKorolla.paivita(-1.0, new_val.doubleValue());
                    
            }
        });

        //lisätään data kaavioon
        kaavio.getData().add(talletusIlmanKorkoa.Piirra());
        kaavio.getData().add(talletusKorolla.Piirra());
         
        //näytetään elementit
        
        ikkuna.setScene(nakuma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        launch(SaastolaskuriSovellus.class);
    }

}
