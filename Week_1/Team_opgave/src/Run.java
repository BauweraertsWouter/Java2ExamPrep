import models.*;

public class Run {

    public static void main(String[] args) {
        Team teams[] = {
                new AmateurTeam("De Kampioenen"),
                new ProTeam("PSV Eindhoven", "Philips", SponsorSoort.INTERNATIONAAL),
                new ProTeam("SK Laarne", "Brouwerij Walrave", SponsorSoort.LOKAAL)
        };

        Speler[] spelers = {
                new Speler(13, "Goosens Erik", "Heieinde 36", 9200, "Appels"),
                new Speler(21, "Vermeersch Marcel", new Adres("Hoogstraat 25", 9000, "Gent")),
                new Speler(2, "Cornelis Clem", "Nationalestraat 5", 2000, "Antwerpen"),
                new Speler(13, "Gils Jos", new Adres("Kouterdreef 181", 2970, "Schilde")),
                new Speler(14, "De Vos Eric", "Hoogstraat 104", 2000, "Antwerpen"),
                new Speler(6, "De Wilde Etiënne", "Vaartstraat 61", 9270, "Laarne"),
                new Speler(18, "Van Damme Albert", "Eekhoekstraat 15", 9270, "Laarne"),
                new Speler(7, "Raman Modest", "Quastraat 4", 9270, "Laarne")
        };

        for (int i = 0; i < 5; i++) {
            teams[0].voegToe(spelers[i]);
        }
        teams[0].sortSpelers();

        for (int i = 5; i < spelers.length; i++) {
            teams[2].voegToe(spelers[i]);
        }
        teams[2].sortSpelers();

        System.out.println("Team 1:");
        teams[0].showTeam();
        System.out.println("\nTeam 2:");
        teams[2].showTeam();


        System.out.println("\nNaam: " + new ProTeam("SK Laarne", "Brouwerij Walrave",
                SponsorSoort.LOKAAL).verhaspelSponsornaam());
    }

}