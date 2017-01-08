import models.Adres;
import models.Speler;
import models.Team;

public class TestTeam {

    public static void main(String[] args) {
        Speler[] spelers = {
                new Speler(13, "Goosens Erik", "Heieinde 36", 9200, "Appels"),
                new Speler(21, "Vermeersch Marcel", new Adres("Hoogstraat 25", 9000,  "Gent")),
                new Speler(2, "Cornelis Clem", "Nationalestraat 5", 2000, "Antwerpen"),
                new Speler(13, "Gils Jos", new Adres("Kouterdreef 181", 2970, "Schilde")),

        };

        Team myTeam = new Team("De Kampioenen") {
            public void showTeam() {
            }
        };

        for (Speler speler : spelers) {
            myTeam.voegToe(speler);
        }
        myTeam.sortSpelers();

        for (Speler speler : myTeam.getSpelers()) {
            System.out.println(speler);
        }

        System.out.print("\nZoek speler nummer 13: ");
        System.out.println(myTeam.zoekSpeler(13));
        System.out.print("Zoek speler nummer 14: ");
        System.out.println(myTeam.zoekSpeler(14));
    }

}