package be.kdg.laptop;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class LaptopMap {
    private Map<String, Laptop> map;

    public LaptopMap() {
        map = new TreeMap<>();
    }

    public int getAantal() {
        return map.size();
    }

    public void voegToe(Laptop nieuw) {
        if (map.containsValue(nieuw)) {
            throw new IllegalArgumentException(nieuw.getNaam() + " komt reeds voor in map");
        }
        map.put(nieuw.getNaam(), nieuw);
    }

    public void verwijder(String naam) {
        Laptop laptop = getLaptop(naam);
        if (laptop != null) {
            map.remove(laptop.getNaam());
        }
    }

    public Laptop getLaptop(String naam) {
        return map.get(naam);
    }

    public List<Laptop> getList(SortCriterium criterium) {
        //Opdracht 3
        return Collections.emptyList();
    }

    public enum SortCriterium {
        OP_NAAM, OP_PRIJS
    }


}
