package java_05_set_interface;

// Class implements Comparable functional interface
class Person implements Comparable<Person> {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

}