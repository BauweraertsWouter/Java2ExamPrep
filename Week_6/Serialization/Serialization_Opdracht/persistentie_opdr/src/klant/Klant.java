package klant;

import java.io.Serializable;

public class Klant implements Serializable {
    private String naam;
    private Adres adres;
    private int klantNr;

    public Klant(String naam, Adres adres, int klantNr) {
        this.naam = naam;
        this.adres = adres;
        this.klantNr = klantNr;
    }

    public int getKlantNr() {
        return klantNr;
    }

    @Override
    public String toString() {
        return String.format("%d %s (%s)", klantNr, naam, adres.toString());
    }
}
