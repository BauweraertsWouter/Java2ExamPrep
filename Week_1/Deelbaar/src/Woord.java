/*
    Pas aan:
    De klasse Woord implementeert de interface Deelbaar
 */
public class Woord implements Deelbaar{
    private String str;

    public Woord(String str){
        this.str = str;
    }

    public String toString() {
        return str;
    }

    @Override
    public Deelbaar getHelft() {
        int length = str.length()/2;
        str = str.substring(0, length);
        return this;
    }
}
