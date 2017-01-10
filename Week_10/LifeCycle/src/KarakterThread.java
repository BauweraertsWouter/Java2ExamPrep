/**
 * Created by Wouter on 10/01/2017.
 */
public class KarakterThread extends Thread {
    private static int counter = 0;

    @Override
    public void run() {
        while (true) {
            System.out.print((char) ('a' + counter++) + " ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                break;
            }
        }
        System.out.println("Thread beëindigd");
    }
}
