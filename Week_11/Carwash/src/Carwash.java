/**
 * Created by Wouter on 10/01/2017.
 */
public class Carwash {
    private boolean straat1, straat2;

    public void aankomstWagen(int wagenNr) {
        if (straat1 && straat2) {
            synchronized (this) {
                System.out.println("Wagen " + wagenNr + " moet wachten");
                try {
                    wait();
                } catch (Exception e) {
                    //
                }
            }
        }
        System.out.println("Start wagen " + wagenNr);
        if (straat1) {
            straat2 = true;
        } else {
            straat1 = true;
        }
    }

    public synchronized void vertrekWagen(int wagenNr) {
        System.out.println("Wagen " + wagenNr + " is klaar");
        if (straat2) {
            straat2 = false;
        } else if (straat1) {
            straat1 = false;
        }
        try {
            notify();
        } catch (Exception e) {
        }
    }
}
