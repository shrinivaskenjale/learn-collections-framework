package java_04_map_interface;

import java.util.*;

public class L02_HashMap {
    public static void main(String[] args) {
        // ==================
        // Create a HashMap
        // ==================

        // When creating map, define type of key and type of value inside <>.
        Map<String, Integer> numbers = new HashMap<>();

        // Create map from other map implementation
        // Map<KeyType, ValueType> map = new HashMap<>(any map implementaion);

        // ==============
        // Add elements
        // ==============

        // put(key, value): Adds or updates the value for given key
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 5);

        // Value gets updated if key already exists
        numbers.put("four", 4);

        System.out.println(numbers);

        // putIfAbsent(key, value): Add key-value pair only if key is not present or
        // value associated with it is null.
        numbers.putIfAbsent("five", 5);
        numbers.putIfAbsent("one", 10); // No effect

        System.out.println(numbers);

        // putAll(map): Copies entries of specified map into this map.

        // put(), putIfAbsent() return previous value associated with the key else null.

        // ================
        // Access elements
        // ================

        // get(key): Returns value associated with key else null
        System.out.println(numbers.get("five"));
        System.out.println(numbers.get("twenty")); // null

        // getOrDefault(key, default value): Returns value associated with key else
        // default value
        System.out.println(numbers.getOrDefault("ten", 0));

        // keySet(): Returns set of keys in the map.
        // Set because keys are unique.
        Set<String> keys = numbers.keySet();
        System.out.println(keys);

        // values(): Returns collection of values in the map.
        // Collection because values can repeat.
        Collection<Integer> values = numbers.values();
        System.out.println(values);

        // entrySet(): Returns set of entries in the map.
        Set<Map.Entry<String, Integer>> entries = numbers.entrySet();
        System.out.println(entries);

        // java.util.Map.Entry

        // ================
        // Update elements
        // ================

        // replace(key, value): Updates the value for the specified key only if the key
        // already exists.
        // Returns old value if key is present else null.
        numbers.replace("one", 100);
        numbers.replace("twenty", 20); // No effect - Key not present

        System.out.println(numbers);

        // replace(key, old value, new value): Updates the value for the specified key
        // only if the key already exists with specified old value.
        // Returns true if value was replaced.
        numbers.replace("one", 100, 1);

        System.out.println(numbers);

        // replaceAll():

        // put() also updates the value associated with the key.
        // replace() ensures that only existing keys are updated without adding new
        // keys.

        // ===================
        // IMPORTANT METHODS
        // ===================

        // size(): Returns size of the map
        System.out.println(numbers.size());

        // isEmpty(): Check if map is empty
        System.out.println(numbers.isEmpty());

        // containsKey(key): Check if key is present
        System.out.println(numbers.containsKey("three"));

        // containsValue(value): Check if value is present
        System.out.println(numbers.containsValue(9));

        // merge():

        // ====================================================
        // Iterate on the map
        // ====================================================

        // https://www.geeksforgeeks.org/iterate-map-java/

        // Iteration on key-value pairs
        for (Map.Entry<String, Integer> entry : numbers.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Iteration on keys
        for (String key : numbers.keySet()) {
            System.out.println(key);
        }

        // Iteration on values
        for (Integer value : numbers.values()) {
            System.out.println(value);
        }

        // =================
        // Remove elements
        // =================

        // remove(key): Removes the entry associated with the key.
        // Returns value if key is present else null.
        System.out.println(numbers.remove("five"));
        System.out.println(numbers.remove("fifty")); // null
        System.out.println(numbers);

        // remove(key, value): Removes the entry only if both key and value match.
        // Returns true if entry was removed else false.
        System.out.println(numbers.remove("four", 4));
        System.out.println(numbers.remove("two", 4));

        // clear(): Removes all mappings from the map
        numbers.clear();
        System.out.println(numbers);

        // ================================================
        // HashMap and LinkedHashMap of custom object keys
        // ================================================

        Person p1 = new Person(1, "John", 11);
        Person p2 = new Person(2, "Brock", 12);
        Person p3 = new Person(3, "Randy", 13);
        Person p4 = new Person(2, "Brock", 10); // Logically duplicate object

        Map<Person, Integer> map = new LinkedHashMap<>();

        map.put(p1, 1);
        map.put(p2, 2);
        map.put(p3, 3);

        // Although p2 and p4 are different objects (look at age). But equals() and
        // hashCode() depend on id and name which are same for these two objects.
        // So, put() here updates the value associated with the p2 key but does not
        // replace the key.
        map.put(p4, 4);

        // If you wanted to change the key, you first need to remove the old entry using
        // old key and then insert new entry using new key.

        for (Person key : map.keySet()) {
            System.out.printf("%s => %d \n", key, map.get(key));
        }

    }
}

class Person {
    int id;
    String name;
    int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    // id and name are considered for equality
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

}

/*
 * ===============
 * HashMap class
 * ===============
 * 
 * The HashMap class of the Java collections framework provides the
 * functionality of the hash table data structure.
 * 
 * It stores elements in key/value pairs. Here, keys are unique identifiers used
 * to associate each value on a map.
 * 
 * The HashMap class implements the Map interface.
 * 
 * 
 * 
 * 
 * =================================================
 * HashMap and LinkedHashMap of custom object keys
 * =================================================
 * 
 * Override both equals() and hashCode() in the class of the objects that are
 * keys. Both methods should depend on same fields. These methods help to find
 * the right bucket for the key.
 * 
 * 
 * =====================================
 * Hashmap vs LinkedHashMap vs TreeMap
 * =====================================
 * 
 * Hashmap is unordered.
 * LinkedHashMap maintains insertion order
 * TreeMap maintains natural order
 * 
 * ==========================
 * Capacity and load factor
 * ==========================
 * 
 * While creating a hashmap, we can include optional parameters: capacity and
 * load factor. For example,
 * 
 * HashMap<K, V> numbers = new HashMap<>(8, 0.6f);
 * 
 * Here,
 * 8 (capacity is 8) - This means it can store 8 entries.
 * 0.6f (load factor is 0.6) - This means whenever our hash table is filled by
 * 60%, the entries are moved to a new hash table double the size of the
 * original hash table.
 * If the optional parameters not used, then the default capacity will be 16 and
 * the default load factor will be 0.75.
 */