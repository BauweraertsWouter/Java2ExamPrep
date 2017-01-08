package doos;

import lichaam.Kubus;

public class DoosKubus extends Kubus implements Doos {

    public DoosKubus(double ribbe) {
        super(ribbe);
    }

    @Override
    public double verpakkingsOppervlakte() {
        return super.grondvlak() * 6;
    }

    @Override
    public double tapeLengte() {
        return super.verticaleOmtrek() * 2;
    }

    @Override
    public String toString() {
        return String.format(
                "Kubusvormige doos:\n\t" +
                        "volume: %5.2f m3\n\t" +
                        "benodigde verpakking: %5.2f m2\n\t" +
                        "tapelengte: %5.2f m",
                super.volume(),
                verpakkingsOppervlakte(),
                tapeLengte()
        );
    }
}