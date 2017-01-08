package models;

import modelInterface.Showable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Wouter on 8/01/2017.
 */
public class ProTeam extends Team implements Showable {
    private String sponsorNaam;
    private SponsorSoort sponsorSoort;

    public ProTeam(String naaam, String sponsorNaam, SponsorSoort sponsorSoort){
        super(naaam);
        this.sponsorNaam = sponsorNaam;
        this.sponsorSoort = sponsorSoort;
    }

    public String getSponsorNaam() {
        return sponsorNaam;
    }

    public SponsorSoort getSponsorSoort() {
        return sponsorSoort;
    }

    public String getNaam(){return super.getName();}

    @Override
    public void showTeam() {
        System.out.println("Naam: " + this.getNaam());
        System.out.printf("Sponsor: %s (%s)", getSponsorNaam(), getSponsorSoort().toString());
        if (getSpelers().size() != 0){
            System.out.println("Leden:");
            for (Speler s : getSpelers()){
                System.out.println(s);
            }
        }
        System.out.println();
    }

    public String verhaspelSponsornaam(){
        List<Character> charList = new ArrayList<>();
        for (Character c : getSponsorNaam().toCharArray()){
            charList.add(c);
        }

        Collections.shuffle(charList);
        String shuffled = new String();

        for (Character c : charList){
            shuffled += c;
        }

        return shuffled;
    }
}
