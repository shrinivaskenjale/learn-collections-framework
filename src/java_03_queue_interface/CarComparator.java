package java_03_queue_interface;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    public int compare(Car a, Car b) {
        return Integer.compare(a.speed, b.speed);
    }
}