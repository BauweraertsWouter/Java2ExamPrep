import models.Adres;
import models.Speler;

/**
 * Created by Wouter on 8/01/2017.
 */
public class TestSpeler {
    public static void main(String[] args) {
        Adres adres = new Adres("Nationalestraat 5", 2000, "Antwerpen");
        Speler speler1 = new Speler(10, "Cornelis Clem", adres);
        Speler speler2 = new Speler(7, "Gils Jos", "Kouterdreef 181", 2970, "Schilde");

        System.out.println(speler1);
        System.out.println(speler2);
    }
}
