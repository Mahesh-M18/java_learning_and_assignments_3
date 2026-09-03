package maplearning;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapLearning {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        //put - to add key and value elements
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map);

        map.put("China", 180); //updates the value for the existing key
        System.out.println(map);

        //containsKey(key) - returns true or false
        System.out.println(map.containsKey("China"));

        //containsValue(value) - return true or false
        System.out.println(map.containsValue(30));

        //get(key) - returns value for given key or null if no key exists
        System.out.println(map.get("China"));
        System.out.println(map.get("Indonesia"));

        //loop
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            System.out.println(m);
            System.out.println(m.getKey());
            System.out.println(m.getValue());
        }

        Set<String> keys = map.keySet(); //to make a set of keys
        for (String key : keys)
            System.out.println(key + " " + map.get(key));

        /*
        A Map itself isn't directly an Iterable, so you typically iterate through:
        keySet()
        values()
        entrySet()
        */
        //employees.keySet();    all keys
        //employees.values();    all values
        //employees.entrySet();  key-value pairs

        //remove(key) - delete a data using key
        map.remove("China");
        System.out.println(map);

        //size - returns number of mappings / data
        System.out.println(map.size());

        //isEmpty - returns true or false
        System.out.println(map.isEmpty());

        //clear() - truncates the mappings
        map.clear();
        System.out.println(map);
    }
}

/*
Map as a collection used to store data in key-value pairs.

Keys must be unique
Values can be duplicated
A Map is not a subtype of Collection
Maps are useful for fast lookup using a key
Unordered collection of data

Use a key to associate and retrieve a value.


HashMap is one of the most commonly used Map implementations.

Characteristics
Unique keys
No guaranteed ordering
Allows one null key
Allows multiple null values
Average put(), get(), remove() → O(1)

Conceptually:

HashMap
   ↓
Hash table



| Feature               | List                    | Set                       | Map                          |
| --------------------- | ----------------------- | ------------------------- | ---------------------------- |
| Stores                | Values                  | Values                    | Key-value pairs              |
| Duplicates            | Allowed                 | Not allowed               | Keys not allowed; values can |
| Index                 | Yes                     | No                        | No                           |
| Example               | Student names           | Unique IDs                | ID → Student                 |
| Common implementation | ArrayList               | HashSet                   | HashMap                      |
| Order                 | Usually insertion order | Depends on implementation | Depends on implementation    |


HashMap lookup is usually fast because
A HashMap uses hashing to determine where the key should be located.

Conceptually:
"Rahul"
   ↓
hash
   ↓
location
   ↓
associated value

Therefore it doesn't normally have to check every contact one by one.
That's why HashMap is generally much better suited for key-based lookup than searching through a normal list.
 */