
public class Main {

    public static void main(String[] args) {
        // käytä tätä pääohjelmaa luokkiesi testaamiseen!
        Lahja kirja = new Lahja("Aapiskukko", 2);

        Pakkaus paketti = new Pakkaus();
        
        System.out.println(paketti.yhteispaino());
    }
}
