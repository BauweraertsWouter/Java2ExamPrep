package models;

/**
 * Created by Wouter on 8/01/2017.
 */
public enum SponsorSoort {
    LOKAAL("Lokaal"),
    INTERNATIONAAL("Internationaal");

    private final String soort;

    private SponsorSoort(String soort){
        this.soort = soort;
    }
}
