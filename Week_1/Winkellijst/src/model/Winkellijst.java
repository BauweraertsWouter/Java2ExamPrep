package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * model.Winkellijst bevat 1 attribuut: een ArrayList van producten
 */
public class Winkellijst {

    private List<Product> producten;
    /**
     * Initialiseer het attribuut
     */
    public Winkellijst() {
        producten = new ArrayList<>();
    }

    /**
     * Voeg product toe. Sorteer ook telkens de lijst.
     * @param product Het product
     */
    public void addProduct(Product product) {
        producten.add(product);
        Collections.sort(producten);
    }

    /**
     * Maak de lijst leeg
     */
    public void clear() {
        producten.clear();
    }

    /**
     * toString: returns een String die alle producten achter elkaar bevat (met newlines ertussen)
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Product s : producten){
            sb.append(s.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    /**
     * Deze main kan je gebruiken om te testen wat je tot nu toe hebt. Verwachte output staat onderaan
     * @param args Niet gebruikt
     */
    public static void main(String[] args) {
        Winkellijst lijst = new Winkellijst();
        Product p = new Product("Appels", "Fruit");
        lijst.addProduct(p);
        p = new Product("Peren", "Fruit");
        lijst.addProduct(p);
        try {
            new Product("Cola", "Drankje");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        p = new Product("Pizza", "Diepvries");
        lijst.addProduct(p);
        System.out.println("model.Winkellijst:\n" + lijst);
        lijst.clear();
        System.out.println("model.Winkellijst:\n" + lijst);
    }
}

/* Verwachte output:
Onbekend type...!
model.Winkellijst:
Diepvries:	Pizza
Fruit:	Appels
Fruit:	Peren

model.Winkellijst:

*/
