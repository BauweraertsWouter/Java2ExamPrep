package model;

import java.util.Arrays;

/**
 * De opgaves staan in de code. Implementeer eerst model.Product, dan model.Winkellijst en dan view.WinkellijstUI
 */
public class Product implements Comparable<Product> {
    static final String[] TYPES = {"Drank", "Fruit", "Groenten", "Zuivel", "Non-food", "Diepvries", "Baby", "Bakkerij", "Overige"};

    private String naam;
    private String type;

    /**
     * Initialisatie van de attributen via de constructor
     * Controleer of de naam niet leeg is en of het type uit de lijst TYPES komt, zoniet: IllegalArgumentException throwen!
     */
    public Product(String naam, String type) throws IllegalArgumentException {
        if (naam.length() != 0) {
            this.naam = naam;
        }else {
            throw new IllegalArgumentException("Naam moet ingevuld zijn");
        }
        if (Arrays.asList(TYPES).stream().filter(s->s.equals(type)).findFirst().isPresent()) {
            this.type = type;
        }else {
            throw new IllegalArgumentException("Ondeldig type");
        }
    }

    /**
     * Creeer getters voor beide attributen
     */
    public String getNaam() {
        return naam;
    }

    public String getType() {
        return type;
    }
    /**
     * Creeer toString: geeft "type:    naam" (bv: "Fruit:  bananen")
     */
    @Override
    public String toString() {
        return String.format("%s: %s", type, naam);
    }

    /**
     * Implementeer: sorteer eerst op type daarna op naam
     */
    public int compareTo(Product product) {
        //...
        if (this.equals(product)) {
            return 0;
        }else {
            if (this.type.equals(product.type)){
                return this.naam.compareTo(product.naam);
            }else {
                return this.type.compareTo(product.type);
            }
        }
    }
}
