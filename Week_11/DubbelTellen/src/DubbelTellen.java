import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Wouter on 10/01/2017.
 */
public class DubbelTellen {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        Runnable teller = () -> {

            lock.lock();
            for (int i = 0; i < 10; i++) {
                System.out.print((i + 1) + " ");
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                //
            }
            lock.unlock();
        };

        for (int i = 0; i < 2; i++) {
            Thread t = new Thread(teller);
            t.start();
        }
    }
}
