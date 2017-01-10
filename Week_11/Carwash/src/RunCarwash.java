/**
 * Created by Wouter on 10/01/2017.
 */
public class RunCarwash {
    public static void main(String[] args) {
        Carwash carwash = new Carwash();

        Car[] cars = {
                new Car(1, 0, carwash),
                new Car(2, 0, carwash),
                new Car(3, 1, carwash),
                new Car(4, 1, carwash),
                new Car(5, 3, carwash),
                new Car(6, 5, carwash),
                new Car(7, 8, carwash),
                new Car(8, 8, carwash),
                new Car(9, 8, carwash)
        };

        for (Car car : cars) {
            new Thread(car).start();
        }
    }
}
