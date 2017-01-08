package factorydemo;

/**
 * Created by Wouter on 8/01/2017.
 */
public final class FiguurFactory {

    public FiguurFactory() {
    }

    public static Figuur getFiguur(FiguurType type, double zijde) {
        switch (type) {
            case RECHTHOEK:
                return Rechthoek.newRechthoek(zijde, zijde);
            case RUIT:
                return Ruit.newRuit(zijde, zijde);
            case VIERKANT:
                return Vierkant.newVierkant(zijde);
        }
        return null;
    }

    public static Figuur getFiguur(FiguurType type, double dimEen, double dimTwee) {
        switch (type) {
            case RECHTHOEK:
                return Rechthoek.newRechthoek(dimEen, dimTwee);
            case RUIT:
                return Ruit.newRuit(dimEen, dimTwee);
        }
        return null;
    }

    public static Figuur getRechthoek(double breedte, double hoogte) {
        return Rechthoek.newRechthoek(breedte, hoogte);
    }

    public static Figuur getRechthoek(double zijde) {
        return Rechthoek.newRechthoek(zijde, zijde);
    }

    public static Figuur getVierkant(double zijde) {
        return Vierkant.newVierkant(zijde);
    }
}
