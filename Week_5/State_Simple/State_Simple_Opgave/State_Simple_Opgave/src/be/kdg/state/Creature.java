package be.kdg.state;

/**
 * Het gedrag van de methode greet is afhankelijk van de toestande van de boolean isFrog.
 * Pas op deze klasse het State pattern toe (maak gebruik van een interface).
 */
public class Creature {
    private Kissable state = new Frog();

    public String greet() {
        return state.greet();
    }

    public void kiss() {
        state = new Prince();
    }
}
