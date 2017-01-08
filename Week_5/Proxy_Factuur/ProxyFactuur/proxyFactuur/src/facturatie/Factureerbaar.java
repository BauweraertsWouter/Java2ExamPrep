package facturatie;

import Artikel.Artikel;
import klant.Klant;

/**
 * Created by Wouter on 8/01/2017.
 */
public interface Factureerbaar {
    Klant getKlant();

    void setKlant(Klant klant);

    String getDatum();

    void setDatum(String datum);

    int getFactuurNr();

    void voegLijnToe(Artikel artikel, int aantal);

    void verwijderLijn(Artikel artikel);

    public double getTotaalExcl();

    public double getBTW();

    public double getTotaalIncl();

    public void printFactuur();
}
