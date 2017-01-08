package be.kdg.demo.singleton;

import java.util.List;

/**
 * Vul deze klasse aan.
 */
public class UniekeVerzameling {
    private static Verzameling verzameling = new Verzameling();

    public List<Film> getVerzameling(){
        return verzameling.getVerzameling();
    }

    public void sorteer(){
        verzameling.sorteer();
    }

    public void add(Film film){
        verzameling.add(film);
    }
}
