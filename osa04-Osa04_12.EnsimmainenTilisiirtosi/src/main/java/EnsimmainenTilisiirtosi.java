
public class EnsimmainenTilisiirtosi {

    public static void main(String[] args) {
        // Tili.Java:ssa olevaan koodiin ei tule koskea
        // tee ohjelmasi tänne
        Tili masanMassit = new Tili("Matin tili",1000.0);
        Tili omatMassit = new Tili("Oma tili",0.0);
        masanMassit.otto(100.0);
        omatMassit.pano(100.0);
        System.out.println(masanMassit);
        System.out.println(omatMassit);
        
        
    }
}
