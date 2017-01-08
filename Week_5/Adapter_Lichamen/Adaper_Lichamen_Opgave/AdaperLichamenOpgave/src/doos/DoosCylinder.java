package doos;

import lichaam.Cylinder;

public class DoosCylinder extends Cylinder implements Doos {

    public DoosCylinder(double straal, double hoogte) {
        super(straal, hoogte);
    }

    @Override
    public double verpakkingsOppervlakte() {
        double dubbelGrondvlak = super.grondvlak() * 2;
        double hoogteOmtrek = super.grondvlak() / super.getStraal() * 2 * super.getHoogte();
        return dubbelGrondvlak + hoogteOmtrek;
    }

    @Override
    public double tapeLengte() {
        return super.verticaleOmtrek() * 2;
    }

    @Override
    public String toString() {
        return String.format(
                "Cylindervormige doos:\n\t" +
                        "volume: %5.2f m3\n\t" +
                        "benodigde verpakking: %5.2f m2\n\t" +
                        "tapelengte: %5.2f m",
                super.volume(),
                verpakkingsOppervlakte(),
                tapeLengte()
        );
    }
}