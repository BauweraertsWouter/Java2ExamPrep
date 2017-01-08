package models;

import modelInterface.Showable;

public class AmateurTeam extends Team implements Showable{

    public AmateurTeam(String naam){
        super(naam);
    }

    public String getNaam(){return super.getName();}

    @Override
    public void showTeam() {
        System.out.println("Naam: " + getNaam());
        if (getSpelers().size() != 0) {
            System.out.println("Leden:");
            for (Speler s : this.getSpelers()) {
                System.out.println(s);
            }
        }
        System.out.println();
    }
}
