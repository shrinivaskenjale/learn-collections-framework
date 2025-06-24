package java_03_queue_interface;

public class Car {
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