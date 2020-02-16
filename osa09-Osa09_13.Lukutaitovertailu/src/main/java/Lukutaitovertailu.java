
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Lukutaitovertailu {
    
    public static void main(String[] args) {
        
    try {
    // luetaan tiedosto "presidentit.txt" riveittäin
    List <Lukutaito> lukutaitoLista = new ArrayList<>();
    Files.lines(Paths.get("lukutaito.csv"))
        .map(rivi -> rivi.split(","))
        .filter(palat -> palat.length >= 6)
        .map(palat -> new Lukutaito(palat[3],palat[2],Integer.valueOf(palat[4]),Double.valueOf(palat[5])))
        .forEach(lukutaito -> lukutaitoLista.add(lukutaito));
        lukutaitoLista.stream()
        .sorted().forEach(k -> System.out.println(k));
} catch (Exception e) {
    System.out.println("Virhe: " + e.getMessage());
}

    }
}
