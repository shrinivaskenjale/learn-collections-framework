package java_02_list_interface;

// import java.util.Vector;

public class L04_Vector {
    public static void main(String[] args) {
        // Vector<Type> vector = new Vector<>();

        // All the methods are same as arraylist
    }
}

/*
 * The Vector class is an implementation of the List interface that allows us to
 * create resizable-arrays similar to the ArrayList class.
 * 
 * The Vector class synchronizes each individual operation. This means whenever
 * we want to perform some operation on vectors, the Vector class automatically
 * applies a lock to that operation.
 * 
 * However, in arraylists, methods are not synchronized.
 * 
 * Note: It is recommended to use ArrayList in place of Vector because vectors
 * less efficient.
 */