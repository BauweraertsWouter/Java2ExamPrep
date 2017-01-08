import klant.Adres;
import klant.Klant;
import klant.Klanten;

/**
 * Werk in deze klasse Klanten de methode serialize en deserialize uit.
 * Probeer dan deze DemoKlanten te runnen. Vergelijk jouw afdruk met de verwachte afdruk onderaan.
 */
public class DemoKlanten {
    public static void main(String[] args) {
        Klanten klanten = new Klanten();
        klanten.voegToe(new Klant("Erik Mouwen", new Adres("Deurnestraat 184", 2640, "Mortsel"), 112145));
        klanten.voegToe(new Klant("Dirk Oomen", new Adres("Jacobuslei 82", 2930, "Brasschaat"), 174144));
        klanten.voegToe(new Klant("Betty Boop", new Adres("Kerkstraat 1", 2000, "Antwerpen"), 178905));

        System.out.println("Controleafdruk:");
        System.out.println(klanten);

        klanten.serialize();
        klanten.verwijderAlles();
        klanten.deserialize();

        System.out.println("Na serialize en weer deserialize:");
        System.out.println(klanten);
    }
}

/* VERWACHTE AFDRUK:
Controleafdruk:
Klanten:
	112145 Erik Mouwen (Deurnestraat 184, Mortsel - 2640)
	178905 Betty Boop (Kerkstraat 1, Antwerpen - 2000)
	174144 Dirk Oomen (Jacobuslei 82, Brasschaat - 2930)

Na serialize en weer deserialize:
Klanten:
	112145 Erik Mouwen (Deurnestraat 184, null - 2640)
	174144 Dirk Oomen (Jacobuslei 82, null - 2930)
	178905 Betty Boop (Kerkstraat 1, null - 2000)

*/
