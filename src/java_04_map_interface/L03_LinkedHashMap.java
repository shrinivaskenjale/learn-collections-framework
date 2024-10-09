package java_04_map_interface;

public class L03_LinkedHashMap {
    public static void main(String[] args) {
        // ========================
        // Create a LinkedHashMap
        // ========================

        // Map<KeyType, ValueType> numbers = new LinkedHashMap<>();
        // Map<KeyType, ValueType> numbers = new LinkedHashMap<>(map implementaion);
        // Map<KeyType, ValueType> numbers = new LinkedHashMap<>(capacity, load factor);

        // All methods are same as HashMap.

    }
}

/*
 * =======================
 * LinkedHashMap class
 * =======================
 * 
 * The LinkedHashMap class of the Java collections framework provides the hash
 * table and linked list implementation of the Map interface.
 * 
 * The LinkedHashMap interface extends the HashMap class to store its entries in
 * a hash table. It internally maintains a doubly-linked list among all of its
 * entries to order its entries.
 * 
 * =================================
 * LinkedHashMap of custom objects as keys
 * =================================
 * 
 * Implement both equals() and hashCode() in the class of the objects that are
 * keys.
 * 
 * ===========================
 * LinkedHashMap Vs. HashMap
 * ===========================
 * 
 * Both the LinkedHashMap and the HashMap implement the Map interface. However,
 * there exist some differences between them.
 * 
 * => LinkedHashMap maintains a doubly-linked list internally. Due to this, it
 * maintains the insertion order of its elements.
 * 
 * => The LinkedHashMap class requires more storage than HashMap. This is
 * because LinkedHashMap maintains linked lists internally.
 * 
 * => The performance of LinkedHashMap is slower than HashMap.
 * 
 * ==========================
 * Capacity and load factor
 * ==========================
 * 
 * By default,
 * the capacity of the linked hashmap will be 16
 * the load factor will be 0.75
 * 
 * 
 * 
 */