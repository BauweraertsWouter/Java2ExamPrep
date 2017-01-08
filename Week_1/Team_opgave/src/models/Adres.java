package models;

/**
 * Created by Wouter on 8/01/2017.
 */
public class Adres {
    private String straat;
    private int postNummer;
    private String gemeente;

    public Adres(String straat, int postNummer, String gemeente){
        this.straat = straat;
        this.postNummer = postNummer;
        this.gemeente = gemeente;
    }

    @Override
    public String toString() {
        return String.format("%-20s %4d %-20s", this.straat, this.postNummer, this.gemeente);
    }
}
