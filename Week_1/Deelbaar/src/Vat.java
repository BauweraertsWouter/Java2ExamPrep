/*
    Pas aan:
    De klasse Vat implementeert de interface Deelbaar
 */
public class Vat implements Deelbaar{
    int capaciteit;
    int inhoud;

    public Vat(int capaciteit, int inhoud) {
        this.capaciteit = capaciteit;
        this.inhoud = inhoud;
    }

    public String toString() {
        return "capaciteit: " + capaciteit + "l"
            + " inhoud: " + inhoud + "l";
    }

    @Override
    public Deelbaar getHelft() {
        inhoud /= 2;
        return this;
    }
}
