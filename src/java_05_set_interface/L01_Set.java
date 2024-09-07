package java_05_set_interface;

public class L01_Set {

}

/*
 * ===================
 * Set interface
 * ===================
 * 
 * The Set interface of the Java Collections framework provides the features of
 * the mathematical set in Java. It extends the `Collection` interface.
 * 
 * Unlike the List interface, sets cannot contain duplicate elements.
 * 
 * ============================
 * Classes that implement Set
 * ============================
 * 
 * Since Set is an interface, we cannot create objects from it.
 * 
 * In order to use functionalities of the Set interface, we can use these
 * classes:
 * => HashSet
 * => LinkedHashSet
 * => TreeSet
 * => EnumSet
 * 
 * ============================
 * Interfaces that extend Set
 * ============================
 * 
 * The Set interface is also extended by these subinterfaces:
 * => SortedSet
 * => NavigableSet
 * 
 * ================
 * Methods of Set
 * ================
 * 
 * The Set interface includes all the methods of the Collection interface. It's
 * because Collection is a super interface of Set.
 * 
 * Some of the commonly used methods of the Collection interface that's also
 * available in the Set interface are:
 * 
 * => add() - adds the specified element to the set
 * 
 * => addAll() - adds all the elements of the specified collection to the set
 * 
 * => iterator() - returns an iterator that can be used to access elements of
 * the set sequentially
 * 
 * => remove() - removes the specified element from the set
 * 
 * => removeAll() - removes all the elements from the set that is present in
 * another specified set
 * 
 * => retainAll() - retains all the elements in the set that are also present in
 * another specified set
 * 
 * => clear() - removes all the elements from the set
 * 
 * => size() - returns the length (number of elements) of the set
 * 
 * => toArray() - returns an array containing all the elements of the set
 * 
 * => contains() - returns true if the set contains the specified element
 * 
 * => containsAll() - returns true if the set contains all the elements of the
 * specified collection
 * 
 * => hashCode() - returns a hash code value (address of the element in the set)
 * 
 * 
 * ================
 * Set Operations
 * ================
 * 
 * The Java Set interface allows us to perform basic mathematical set operations
 * like union, intersection, and subset.
 * 
 * => Union - to get the union of two sets x and y, we can use x.addAll(y)
 * 
 * => Intersection - to get the intersection of two sets x and y, we can use
 * x.retainAll(y)
 * 
 * => Subset - to check if x is a subset of y, we can use y.containsAll(x)
 * 
 * => Difference - to get the difference x-y, we use x.removeAll(y)
 * 
 * 
 * ==============
 * BTS
 * ==============
 * 
 * Set implementations use Map implementations internally.
 * - HashSet uses HashMap
 * - LinkedHashSet uses LinkedHashMap
 * - TreeSet uses TreeMap
 * 
 */