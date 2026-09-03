package maplearning;

import java.util.Hashtable;

public class HashtableLearning {
    public static void main(String[] args) {
        Hashtable<Integer, String> employees = new Hashtable<>();

        employees.put(101, "Mahesh");
        employees.put(102, "Rahul");

        System.out.println(employees);

    }
}

/*
Hashtable is an older Map implementation.

Characteristics
Unique keys
No guaranteed ordering
Does not allow null keys
Does not allow null values
Methods are synchronized
Generally slower than HashMap in modern applications

It is considered a legacy class.

For new code, you would generally prefer:
HashMap
or, when thread safety is required, consider modern concurrent collections such as ConcurrentHashMap.



| Feature          | HashMap       | LinkedHashMap            | TreeMap       | Hashtable                      |
| ---------------- | ------------  | ------------------------ | ------------- | -----------------------------  |
| Duplicate keys   | ❌            | ❌                       | ❌            | ❌                            |
| Ordering         | No guarantee  | Insertion order          | Sorted by key | No guarantee                   |
| Null key         | ✅ One        | ✅ One                   | ❌            | ❌                            |
| Null values      | ✅            | ✅                       | ✅            | ❌                            |
| Basic operations | O(1) average  | O(1) average             | O(log n)       | O(1) average                  |
| Synchronized     | ❌            | ❌                       | ❌            | ✅                            |
| Modern choice    | ✅            | ✅                       | ✅            | Usually ❌                    |
| Main use         | Fast lookup   | Lookup + insertion order | Sorted keys    | Legacy/thread-safe older code |



                    Map
                     |
       ┌─────────────┼─────────────┐
       ↓             ↓             ↓
   HashMap     LinkedHashMap    TreeMap
       |             |             |
    Fast          Fast +        Sorted
   lookup         order          keys


HashMap
"I need key-value pairs. I don't care about order."

LinkedHashMap
"I need key-value pairs and want insertion order."

TreeMap
"I need key-value pairs sorted by key."

Hashtable
"I'm dealing with older/legacy Java code that uses synchronized Hashtable."


Set                          Map

HashSet                      HashMap
LinkedHashSet                LinkedHashMap
TreeSet                      TreeMap

The idea is similar:

HashSet
→ unique values
→ no ordering guarantee
HashMap
→ unique keys + values
→ no ordering guarantee

LinkedHashSet
→ unique values + insertion order
LinkedHashMap
→ unique keys + insertion order

TreeSet
→ unique values + sorted order
TreeMap
→ unique keys + sorted order

Map is separate from the Collection interface

 */