package be.kdg.junitdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

/**
 * In deze klasse vind je een aantal logische fouten terug.
 * Verbeter ze aan de hand van de bijgevoegde testklasse TestGemiddelden.
 * Zorg ervoor dat je voor alle testen een groene balk krijgt!
 */
public class Gemiddelden {
    private List<Double> getallen;
    private double som = 0.0;
    private double product = 0.0;

    public Gemiddelden() {
        this.getallen = new ArrayList<>();
    }

    public void voegGetalToe(double getal) {
        getallen.add(getal);
    }

    public void maakLeeg() {
        this.getallen = new ArrayList<>();
    }

    // Klassieke berekening van het gemiddelde
    public double rekenkundigGemiddelde() {
        som = 0;
        if (getallen.size()==0){
            throw new ArithmeticException("Geen getallen gevonden");
        }
        for(Double getal : getallen) {
            som += getal;
        }
        return som / ((double)getallen.size());
    }

    // Zie onder ander http://nl.wikipedia.org/wiki/Meetkundig_gemiddelde
    // en uiteraard Javadoc voor de pow-methode.
    public double meetkundigGemiddelde() {
        product = 1;
        if (getallen.size() == 0){
            throw new ArithmeticException("Geen getallen gevonden");
        }
        for(Double getal : getallen) {
            product *= getal;
        }
        return Math.pow(product, 1.0 / getallen.size());
    }
}
