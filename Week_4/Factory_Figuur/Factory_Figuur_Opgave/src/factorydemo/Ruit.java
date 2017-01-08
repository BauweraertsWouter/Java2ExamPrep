package factorydemo;

/**
 * Created by Wouter on 8/01/2017.
 */
public class Ruit implements Figuur {
    private double groteDiagonaal, kleineDiagonaal;

    private Ruit(double groot, double klein) {
        this.groteDiagonaal = groot;
        this.kleineDiagonaal = klein;
    }

    public static Ruit newRuit(double groot, double klein) {
        return new Ruit(groot, klein);
    }

    public double getGroteDiagonaal() {
        return groteDiagonaal;
    }

    public double getKleineDiagonaal() {
        return kleineDiagonaal;
    }

    @Override
    public String toString() {
        return "Ruit " + " " + groteDiagonaal + " " + kleineDiagonaal;
    }

    @Override
    public double oppervlakte() {
        return groteDiagonaal * kleineDiagonaal;
    }
}
