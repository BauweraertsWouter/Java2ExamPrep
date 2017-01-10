/**
 * Created by Wouter on 10/01/2017.
 */
public class Car implements Runnable {
    private int wagenNr;
    private int aankomstTijd;
    private Carwash carwash;

    public Car(int wagenNr, int aankomstTijd, Carwash carwash) {
        this.wagenNr = wagenNr;
        this.aankomstTijd = aankomstTijd;
        this.carwash = carwash;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000 * aankomstTijd);
        } catch (Exception e) {
            //
        }
        System.out.println("Wagen " + wagenNr + " komt aan");
        carwash.aankomstWagen(this.wagenNr);
        try {
            Thread.sleep(1600);
        } catch (Exception e) {
            //
        }
        carwash.vertrekWagen(this.wagenNr);
    }
}
