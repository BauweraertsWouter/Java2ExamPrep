import java.util.Scanner;

/**
 * Created by Wouter on 10/01/2017.
 */
public class RunKarakterThread {
    public static void main(String[] args) {
        Thread thread = new KarakterThread();
        System.out.printf("State: %s Alive: %s\n", thread.getState(), thread.isAlive());

        thread.start();
        System.out.printf("State: %s Alive: %s\n", thread.getState(), thread.isAlive());

        Scanner s = new Scanner(System.in);
        s.nextLine();
        thread.interrupt();
        System.out.printf("State: %s Alive: %s\n", thread.getState(), thread.isAlive());

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("State: %s Alive: %s\n", thread.getState(), thread.isAlive());
        System.out.println("Einde van programma");
    }
}
