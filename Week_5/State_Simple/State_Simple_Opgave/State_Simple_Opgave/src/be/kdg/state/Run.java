package be.kdg.state;

/**
 * Deze klasse mag je niet wijzigen!!
 */
public class Run {
    public static void main(String[] args) {
        Creature creature = new Creature();

        System.out.println(creature.greet());
        creature.kiss();
        System.out.println(creature.greet());
    }
}

/*
Ribbet!
Darling!
*/