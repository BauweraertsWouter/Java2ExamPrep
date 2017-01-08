package view;

import model.AModel;
import model.BModel;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Wouter on 8/01/2017.
 */
public class ConsoleView implements Observer {
    private AModel aModel;
    private BModel bModel;

    public ConsoleView(AModel aModel, BModel bModel) {
        this.aModel = aModel;
        this.bModel = bModel;

        aModel.addObserver(this);
        bModel.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        String changed = (String) arg;
        if (changed.equals("A")) {
            System.out.println("De waarde van a werd gewijzigd in: " + aModel.getA());
        } else if (changed.equals("B")) {
            System.out.println("De waarde van b werd gewijzigd in: " + bModel.getB());
        }
    }
}
