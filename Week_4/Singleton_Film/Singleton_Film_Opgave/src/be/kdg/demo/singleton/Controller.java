package be.kdg.demo.singleton;

import java.util.List;

/**
 * In deze klasse mag (moet) je op twee gelijkaardige regels iets aanpassen
 */
public class Controller {
    private UniekeVerzameling verzameling;
    private UniekeVerzameling andereVerzameling;

    public Controller() {
        verzameling = new UniekeVerzameling();

        verzameling.add(new Film("Psycho", 1998));
        verzameling.add(new Film("Taxi Driver", 1976));
        verzameling.add(new Film("Psycho", 1960));

        andereVerzameling = new UniekeVerzameling();

        andereVerzameling.add(new Film("Joyride", 1996));
        andereVerzameling.add(new Film("Vanishing Point", 1971));
        andereVerzameling.add(new Film("Joyride", 2001));
        andereVerzameling.add(new Film("Vanishing Point", 1997));
    }

    public List<Film> getGesorteerdeLijst() {
        verzameling.sorteer();
        return verzameling.getVerzameling();
    }

     public List<Film> getGesorteerdeAndereLijst() {
        andereVerzameling.sorteer();
        return andereVerzameling.getVerzameling();
    }


}
