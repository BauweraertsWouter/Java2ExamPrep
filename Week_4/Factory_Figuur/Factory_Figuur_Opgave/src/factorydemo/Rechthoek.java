package factorydemo;

/**
 * Created by Wouter on 8/01/2017.
 */
public class Rechthoek implements Figuur {
    private double breedte;
    private double hoogte;

    private Rechthoek(double b, double h) {
        this.breedte = b;
        this.hoogte = h;
    }

    public static Rechthoek newRechthoek(double breedte, double hoogte) {
        return new Rechthoek(breedte, hoogte);
    }

    public double getBreedte() {
        return breedte;
    }

    public double getHoogte() {
        return hoogte;
    }

    @Override
    public String toString() {
        return "Rechthoek " + breedte + " " + hoogte;
    }

    @Override
    public double oppervlakte() {
        return breedte * hoogte;
    }
}
