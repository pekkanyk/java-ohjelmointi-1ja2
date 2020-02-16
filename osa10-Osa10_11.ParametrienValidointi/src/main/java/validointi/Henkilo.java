package validointi;

public class Henkilo {

    private String nimi;
    private int ika;

    public Henkilo(String nimi, int ika) {
        if ((nimi == null || nimi.length()>40) || nimi.isEmpty()) throw new IllegalArgumentException("Nimi ei voi olla null, tai nimi liian pitkä.");
        if (ika  < 0 || ika >120) throw new IllegalArgumentException("Iän tulee olla väliltä 0-120");
        this.nimi = nimi;
        this.ika = ika;
    }

    public String getNimi() {
        return nimi;
    }

    public int getIka() {
        return ika;
    }
}
