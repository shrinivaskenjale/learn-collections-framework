package java_06_algorithms;

public class Student implements Comparable<Student> {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNo=" + rollNo + "]";
    }

    @Override
    public int compareTo(Student other) {
        // If returned value is POSITIVE, `this` object is greater.
        // If returned value is NEGATIVE, `this` object is smaller.
        // If returned value is 0, both objects are equal.

        // Ascending with rollNo
        return this.rollNo - other.rollNo;

        // Alternate logic
        // if (this.rollNo == other.rollNo) {
        //     return 0;
        // } else if (this.rollNo < other.rollNo) {
        //     return -1;
        // } else {
        //     return 1;
        // }
    }

}