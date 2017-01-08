package models;

/**
 * Created by Wouter on 8/01/2017.
 */
public class Speler implements Comparable<Speler> {
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
    public String getNaam() {return naam;}

    @Override
    public String toString() {
        return String.format("%2d %-20s %-46s", rugNummer, naam, adres.toString());
    }

    @Override
    public int compareTo(Speler o) {
        if (this == o || this.equals(o)) {
            return 0;
        }else {
            return this.naam.compareTo(o.getNaam());
        }
    }
}
