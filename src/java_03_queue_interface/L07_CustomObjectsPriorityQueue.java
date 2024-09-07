package java_03_queue_interface;

import java.util.*;

public class L07_CustomObjectsPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Car> cars = new PriorityQueue<>(new CarComparator());

        cars.offer(new Car("Ferrari", 200));
        cars.offer(new Car("Skoda", 150));
        cars.offer(new Car("Audi", 250));
        cars.offer(new Car("Tata", 50));

        System.out.println(cars);
        System.out.println(cars.poll());
        System.out.println(cars.peek());
    }
}

class Car {
    String name;
    int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    // public int compareTo(Car other) {
    // return Integer.compare(speed, other.speed);
    // }

    @Override
    public String toString() {
        return "Car [name=" + name + ", speed=" + speed + "]";
    }

}

class CarComparator implements Comparator<Car> {
    public int compare(Car a, Car b) {
        return Integer.compare(a.speed, b.speed);
    }
}