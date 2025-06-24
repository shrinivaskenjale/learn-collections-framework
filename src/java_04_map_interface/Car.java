package java_04_map_interface;

class Car implements Comparable<Car> {
    String name;
    int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    // TreeMap depends on compareTo() implementation
    // Car objects are comparable based on speed value
    public int compareTo(Car other) {
        return Integer.compare(speed, other.speed);
    }

    @Override
    public String toString() {
        return "Car [name=" + name + ", speed=" + speed + "]";
    }

    // TreeMap doesn't depend on hashCode() and equals().
}