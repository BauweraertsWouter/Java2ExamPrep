/*
    Pas aan:
    De klasse Reeks implementeert de interface Deelbaar
 */
public class Reeks implements Deelbaar{
    private int[] array;

    public Reeks(int[] array){
        this.array = array;
    }

    public String toString() {
        String str = "[";
        for(int i = 0; i < array.length; i++) {
            str += array[i];
            if(i < array.length - 1) str += ", ";
        }
        return str + "]";
    }

    @Override
    public Deelbaar getHelft() {
        int length = array.length/2;
        int[] newArray = new int[length];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }

        array = newArray;

        return this;
    }
}
