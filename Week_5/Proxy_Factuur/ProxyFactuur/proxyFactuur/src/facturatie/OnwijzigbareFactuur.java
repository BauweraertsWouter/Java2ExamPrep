package facturatie;

import Artikel.Artikel;
import klant.Klant;

/**
 * Created by Wouter on 8/01/2017.
 */
public class OnwijzigbareFactuur implements Factureerbaar {
    private Factuur original;

    public OnwijzigbareFactuur(Factuur original) {
        this.original = original;
    }

    @Override
    public Klant getKlant() {
        return original.getKlant();
    }

    @Override
    public void setKlant(Klant klant) {
        throw new UnsupportedOperationException("Klantgegevens kunnen niet gewijzigd worden");
    }

    @Override
    public String getDatum() {
        return original.getDatum();
    }

    @Override
    public void setDatum(String datum) {
        throw new UnsupportedOperationException("Factuurdatum kan niet gewijzigd worden");
    }

    @Override
    public int getFactuurNr() {
        return original.getFactuurNr();
    }

    @Override
    public void voegLijnToe(Artikel artikel, int aantal) {
        throw new UnsupportedOperationException("Er kunnen geen factuurlijnen toegevoed worden");
    }

    @Override
    public void verwijderLijn(Artikel artikel) {
        throw new UnsupportedOperationException("Er kunnen geen factuurlijnen verwijderd worden");
    }

    @Override
    public double getTotaalExcl() {
        return original.getTotaalExcl();
    }

    @Override
    public double getBTW() {
        return original.getBTW();
    }

    @Override
    public double getTotaalIncl() {
        return original.getTotaalIncl();
    }

    @Override
    public void printFactuur() {
        original.printFactuur();
    }
}
