package models;

import modelInterface.Showable;

import java.util.*;

/**
 * Created by Wouter on 8/01/2017.
 */
public abstract class Team implements Showable{
    private String name;
    private List<Speler> spelers;

    public Team(String name) {
        this.name = name;
        spelers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Speler> getSpelers() {
        return spelers;
    }

    public void voegToe(Speler speler){
        if (spelers.stream().filter(s->s.getRugNummer() == speler.getRugNummer()).count()==0){
            spelers.add(speler);
        }
    }

    public void sortSpelers(){
        Collections.sort(spelers);
    }

    public Speler zoekSpeler(int rugNummer){
        Optional<Speler> speler = spelers.stream().filter(s->s.getRugNummer()==rugNummer).findFirst();
        if (speler.isPresent()){
            return speler.get();
        }else {
            return null;
        }
    }


}
