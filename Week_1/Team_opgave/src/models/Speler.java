package models;

/**
 * Created by Wouter on 8/01/2017.
 */
public class Speler {
    private int rugNummer;
    private String naam;
    private Adres adres;

    public Speler(int rugNummer, String naam, Adres adres){
        this.rugNummer = rugNummer;
        this.naam = naam;
        this.adres = adres;
    }

    public  Speler(int rugNummer, String naam, String straat, int postNummer, String gemeente){
        this(rugNummer, naam, new Adres(straat, postNummer, gemeente));
    }

    public int getRugNummer() {return rugNummer;}

    @Override
    public String toString() {
        return String.format("%2d %-20s %-46s", rugNummer, naam, adres.toString());
    }
}
