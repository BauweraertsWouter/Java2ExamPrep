/**
 * Created by Wouter on 10/01/2017.
 */
public class Student implements Runnable {
    private final String naam;
    private final String oudeVriendin;
    private final String nieuweVriendin;

    public Student(String naam, String oudeVriendin, String nieuweVriendin) {
        this.naam = naam;
        this.oudeVriendin = oudeVriendin;
        this.nieuweVriendin = nieuweVriendin;
    }

    @Override
    public void run() {
        oudeVriendin();
    }

    private void oudeVriendin() {
        System.out.println(naam + " belt " + oudeVriendin);
        synchronized (oudeVriendin) {
            System.out.println(naam + " maakt het af met " + oudeVriendin);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                //
            }
        }
        nieuweVriendin();
    }

    private void nieuweVriendin() {
        System.out.println(naam + " belt " + nieuweVriendin);
        synchronized (nieuweVriendin) {
            System.out.println(naam + " vraagt het aan bij " + nieuweVriendin);
        }
        System.out.println(naam + " heeft een nieuwe vriendin");
    }
}
