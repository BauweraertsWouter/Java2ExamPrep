package klant;

import java.util.HashMap;
import java.util.Map;

/**
 * Werk in deze klasse de methode serialize en deserialize uit.
 * Vergeet ook niet dat bepaalde klassen de Serializable interface moeten implementeren!
 */
public class Klanten {
    private static final String FILENAME = "data\\klantendata.txt";
    private Map<Integer, Klant> klantenMap = new HashMap<Integer, Klant>();

    public void voegToe(Klant nieuw) {
        if (klantenMap.containsKey(nieuw.getKlantNr())) {
            System.out.println("KlantenNr is niet uniek");
            return;
        }
        klantenMap.put(nieuw.getKlantNr(), nieuw);
    }

    public Klant verwijderKlant(Klant oud) {
        return klantenMap.remove(oud.getKlantNr());
    }

    public void verwijderAlles() {
        klantenMap = new HashMap<Integer, Klant>();
    }

    public Klant zoekKlant(Klant zoek) {
        return klantenMap.get(zoek.getKlantNr());   //null indien niet gevonden
    }

    public void updateKlant(Klant klant) {
        if (!klantenMap.containsKey(klant.getKlantNr())) {
            System.out.println("Klant komt niet voor!");
            return;
        }
        klantenMap.put(klant.getKlantNr(), klant); //overschrijven bestaande klantgegevens
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Klanten:\n");
        for (Klant k : klantenMap.values()) {
            sb.append("\t");
            sb.append(k.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void serialize() {
        //uitwerken, maak gebruik van de constante FILENAME
    }

    public void deserialize() {
        //uitwerken, maak gebruik van de constante FILENAME
    }
}
