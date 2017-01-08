package be.kdg.state;

/**
 * Het gedrag van de methode greet is afhankelijk van de toestande van de boolean isFrog.
 * Pas op deze klasse het State pattern toe (maak gebruik van een interface).
 */
public class Creature {
    private boolean isFrog = true;

    public String greet() {
        if (isFrog) {
            return "Ribbet!";
        } else {
            return "Darling!";
        }
    }

    public void kiss() {
        isFrog = false;
    }
}
