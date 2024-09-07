package java_01_collections_framework;

public class L01_CollectionsFramework {

}

/*
 * The Java collections framework provides a set of interfaces and classes to
 * implement various data structures and algorithms.
 * 
 * ====================================
 * Interfaces of Collections FrameWork
 * ====================================
 * 
 * The Java collections framework provides various interfaces. These interfaces
 * include several methods to perform different operations on collections.
 * 
 * See interface.webp
 * 
 * ==========================
 * Collection Interface
 * ==========================
 * 
 * The Collection interface is the root interface of the collections framework
 * hierarchy.
 * 
 * Java does not provide direct implementations of the Collection interface but
 * provides implementations of its subinterfaces like List, Set, and Queue.
 * For example, the ArrayList class implements the List interface which is a
 * subinterface of the Collection Interface.
 * 
 * The Collection interface includes various methods that can be used to perform
 * different operations on objects. These methods are available in all its
 * subinterfaces:
 * 
 * => add() - inserts the specified element to the collection
 * => size() - returns the size of the collection
 * => remove() - removes the specified element from the collection
 * => iterator() - returns an iterator to access elements of the collection
 * => addAll() - adds all the elements of a specified collection to the
 * collection
 * => removeAll() - removes all the elements of the specified collection from
 * the collection
 * => clear() - removes all the elements of the collection
 * 
 * ================================================
 * Collections Framework Vs. Collection Interface
 * ================================================
 * 
 * People often get confused between the collections framework and Collection
 * Interface.
 * 
 * The Collection interface is the root interface of the collections framework.
 * The framework includes other interfaces as well: Map and Iterator. These
 * interfaces may also have subinterfaces.
 * 
 * ==========================================
 * Subinterfaces of the Collection Interface
 * ==========================================
 * 
 * The Collection interface includes subinterfaces that are implemented by Java
 * classes.
 * 
 * All the methods of the Collection interface are also present in its
 * subinterfaces.
 * 
 * Here are the subinterfaces of the Collection Interface:
 * 
 * 1. List Interface
 * The List interface is an ordered collection that allows us to add and remove
 * elements like an array.
 * 
 * 2. Set Interface
 * The Set interface allows us to store elements in different sets similar to
 * the set in mathematics. It cannot have duplicate elements.
 * 
 * 3. Queue Interface
 * The Queue interface is used when we want to store and access elements in
 * First In, First Out manner.
 * 
 * Note - Map is part of the collections framework. But Map interface is not a
 * subinterface of the Collection interface.
 * 
 * ==============
 * Map Interface
 * ==============
 * 
 * In Java, the Map interface allows elements to be stored in key/value pairs.
 * Keys are unique names that can be used to access a particular element in a
 * map. And, each key has a single value associated with it.
 * 
 * ===================
 * Iterator Interface
 * ===================
 * 
 * In Java, the Iterator interface provides methods that can be used to access
 * elements of collections.
 */