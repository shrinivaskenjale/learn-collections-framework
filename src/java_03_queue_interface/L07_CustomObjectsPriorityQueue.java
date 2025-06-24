package java_03_queue_interface;

import java.util.*;

public class L07_CustomObjectsPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Car> cars = new PriorityQueue<>(new CarComparator());

        cars.offer(new Car("Ferrari", 200));
        cars.offer(new Car("Skoda", 150));
        cars.offer(new Car("Audi", 250));
        cars.offer(new Car("Ford", 50));

        System.out.println(cars);
        System.out.println(cars.poll());
        System.out.println(cars.peek());
    }
}



