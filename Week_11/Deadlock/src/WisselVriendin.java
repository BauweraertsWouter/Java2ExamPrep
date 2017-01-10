/**
 * Created by Wouter on 10/01/2017.
 */
public class WisselVriendin {
    public static void main(String[] args) {
        String vEen = "Jane";
        String vTwee = "Lucy";

        Runnable sEen = new Student("John", vEen, vTwee);
        Runnable sTwee = new Student("Mike", vTwee, vEen);

        Thread threadEen = new Thread(sEen);
        Thread threadTwee = new Thread(sTwee);

        threadEen.start();
        threadTwee.start();
    }
}
