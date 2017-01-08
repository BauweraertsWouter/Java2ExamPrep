package factorydemo;

/**
 * Created by Wouter on 8/01/2017.
 */
public class Vierkant implements Figuur {
    private double zijde;

    private Vierkant(double zijde) {
        this.zijde = zijde;
    }

    public static Vierkant newVierkant(double zijde) {
        return new Vierkant(zijde);
    }

    public double getZijde() {
        return zijde;
    }

    @Override
    public String toString() {
        return "Vierkant " + zijde;
    }

    @Override
    public double oppervlakte() {
        return Math.pow(zijde, 2);
    }
}
