package be.kdg.laptop;

import java.util.Comparator;

public class PrijsComparator implements Comparator<Laptop> {
    @Override
    public int compare(Laptop l1, Laptop l2) {
        return Double.compare(l1.getPrijs(), l2.getPrijs());
    }
}
