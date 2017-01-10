import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Wouter on 10/01/2017.
 */
public class ExecuteFactoren {

    private static final long DEMOGETAL = 214_577_422_41L;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Geef een getal: ");
        long getal = DEMOGETAL;
        try {
            getal = s.nextLong();
        } catch (InputMismatchException i) {
            //geen probleem, we gebruiken getal DEMOGETAL
        }

        int aantalThreads = (int) (Math.sqrt(getal) / 100) + 1;
        for (int i = 0; i < aantalThreads; i++) {
            Thread thread = new Thread(new FactorenRunnable((i * 100), getal));
            thread.start();
        }

        if (FactorenRunnable.getAantalFactoren() == 0) {
            System.out.println("Dit is een priemgetal!");
        }
    }
}
