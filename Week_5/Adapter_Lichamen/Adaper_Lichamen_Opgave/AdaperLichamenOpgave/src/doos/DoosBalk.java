package doos;

import lichaam.Balk;

public class DoosBalk extends Balk implements Doos {

    public DoosBalk(double hoogte, double lengte, double breedte) {
        super(hoogte, lengte, breedte);
    }

    @Override
    public double verpakkingsOppervlakte() {
        double vertOpp = super.verticaleOmtrek() * super.getBreedte();
        double dubbelGrondvlak = (super.getLengte() * super.getHoogte()) * 2;

        return vertOpp + dubbelGrondvlak;
    }

    @Override
    public double tapeLengte() {
        return 2 * super.verticaleOmtrek();
    }

    @Override
    public String toString() {
        return String.format("Balkvormige doos:\n\tvolume: %5.2f m3\n\t" +
                        "benodigde verpakking: %5.2f m2\n\t" +
                        "tapelengte: %5.2f m",
                super.volume(),
                verpakkingsOppervlakte(),
                tapeLengte());
    }
}