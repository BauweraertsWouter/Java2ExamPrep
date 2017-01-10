/**
 * Created by Wouter on 10/01/2017.
 */
public class FactorenRunnable implements Runnable {
    private static long getal;
    private static int aantalFactoren = 0;
    private int begin;
    private int einde;

    public FactorenRunnable(int begin, long teOnderzoekenGetal) {
        if (begin == 0) {
            this.begin = 2;
        } else {
            this.begin = begin;
        }
        getal = teOnderzoekenGetal;
        einde = begin + 99;
    }

    public static int getAantalFactoren() {
        return aantalFactoren;
    }

    @Override
    public void run() {
        for (int i = begin; i < einde; i++) {
            if (getal % i == 0) {
                aantalFactoren++;
                System.out.printf("Factor %d --> %s\n", i, Thread.currentThread());
            }
        }
    }
}
