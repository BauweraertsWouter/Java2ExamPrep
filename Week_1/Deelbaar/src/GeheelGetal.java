/*
    Pas aan:
    De klasse GeheelGetal erft over van de abstracte klasse Getal
    en implementeert de interface Deelbaar
 */
public class GeheelGetal extends Getal implements Deelbaar{
    private Integer integer;

    public GeheelGetal(int i) {
        integer = i;
    }

    public GeheelGetal(Integer integer) {
        this.integer = integer;
    }

    public String toString() {
        return integer.toString();
    }

    @Override
    public Deelbaar getHelft() {
        integer /= 2;
        return this;
    }

    @Override
    public void increment(int step) {
        integer += step;
    }

    @Override
    public void decrement(int step) {
        integer -= step;
    }
}
