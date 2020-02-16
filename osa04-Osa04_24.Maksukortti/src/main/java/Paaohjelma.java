
public class Paaohjelma {

    public static void main(String[] args) {
        // Scanner lukija = new Scanner(System.in);
        
        // Tee tänne koodia jolla testaat että Maksukortti toimii halutulla tavalla
        // muista kuitenkin pyyhkiä ylimääräinen koodi pois tehtävän viimeisessä osassa!
        Maksukortti pekankortti = new Maksukortti (20);
        Maksukortti matinkortti = new Maksukortti (30);
        
        pekankortti.syoMaukkaasti();
        matinkortti.syoEdullisesti();
        
        System.out.println("Pekka "+pekankortti);
        System.out.println("Matti "+matinkortti);
        
        pekankortti.lataaRahaa(20);
        matinkortti.syoMaukkaasti();
        
        System.out.println("Pekka "+pekankortti);
        System.out.println("Matti "+matinkortti);

        pekankortti.syoEdullisesti();
        pekankortti.syoEdullisesti();
        matinkortti.lataaRahaa(50);
        
        System.out.println("Pekka "+pekankortti);
        System.out.println("Matti "+matinkortti);
    }
}
