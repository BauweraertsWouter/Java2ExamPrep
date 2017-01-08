package klant;

public class Adres {
    private String straatNr;
    private int postcode;
    private String gemeente;

    public Adres(String straatNr, int postcode, String gemeente) {
        this.gemeente = gemeente;
        this.postcode = postcode;
        this.straatNr = straatNr;
    }

    @Override
    public String toString() {
        return String.format("%s, %s - %d", straatNr, gemeente, postcode);
    }
}
