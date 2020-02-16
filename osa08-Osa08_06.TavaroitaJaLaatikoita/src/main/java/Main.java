
public class Main {

    public static void main(String[] args) {
        // testaa täällä luokkiesi toimintaa
        Laatikko laatikko = new Laatikko(10);

    laatikko.lisaa(new Kirja("Fedor Dostojevski", "Rikos ja Rangaistus", 2)) ;
    laatikko.lisaa(new Kirja("Robert Martin", "Clean Code", 1));
    laatikko.lisaa(new Kirja("Kent Beck", "Test Driven Development", 0.7));

    laatikko.lisaa(new CDLevy("Pink Floyd", "Dark Side of the Moon", 1973));
    laatikko.lisaa(new CDLevy("Wigwam", "Nuclear Nightclub", 1975));
    laatikko.lisaa(new CDLevy("Rendezvous Park", "Closer to Being Here", 2012));

    System.out.println(laatikko);
    
    Laatikko tokaLaatikko = new Laatikko(40);
    tokaLaatikko.lisaa(new CDLevy("Duff Man","Aww Yea!", 1989));
    tokaLaatikko.lisaa(new Kirja("Hogi","Metsästystä kivillä",19));
    tokaLaatikko.lisaa(laatikko);
    
        System.out.println(tokaLaatikko);
        tokaLaatikko.lisaa(tokaLaatikko);
        System.out.println(tokaLaatikko);
    
    }

}
