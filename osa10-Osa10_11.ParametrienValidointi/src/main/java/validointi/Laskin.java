package validointi;

public class Laskin {

    public int kertoma(int luvusta) {
        if (luvusta <0) throw new IllegalArgumentException("Luvun tulee olla positiivinen");

        int kertoma = 1;
        for (int i = 1; i <= luvusta; i++) {
            kertoma *= i;
        }

        return kertoma;
    }

    public int binomikerroin(int joukonKoko, int osaJoukonKoko) {
        if (joukonKoko < 0 || osaJoukonKoko < 0 ) throw new IllegalArgumentException("Lukujen tulee olla positiivisia.");
        if (joukonKoko < osaJoukonKoko) throw new IllegalArgumentException("Jokon koko ei voi olla pienempi kuin osajoukon koko.");
        int osoittaja = kertoma(joukonKoko);
        int nimittaja = kertoma(osaJoukonKoko) * kertoma(joukonKoko - osaJoukonKoko);

        return osoittaja / nimittaja;
    }
}
