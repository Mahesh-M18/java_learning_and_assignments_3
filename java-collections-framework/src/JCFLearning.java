public class JCFLearning {
    public static void main(String[] args) {

    }
}

/*

The Java Collections Framework (JCF) is a unified architecture in the java.util package that provides a set of
ready-made interfaces, concrete classes, and algorithms to efficiently store and manipulate groups of objects.

Java Collections Framework gives us ready-made data structures such as
List
 ├── ArrayList //Resizable array that maintains order and allows duplicates
 └── LinkedList //List with fast insert and remove operations

Set
 └── HashSet //Unordered collection of unique elements
 └── LinkedHashSet //Maintains the order in which elements were inserted
 └── TreeSet //Sorted set of unique elements (natural order)

Map
 ├── HashMap //Stores key/value pairs with no specific order
 ├── LinkedHashMap //Maintains the order in which keys were inserted
 └── TreeMap //Sorted map based on the natural order of keys


Java Collection Framework (JCF) is a set of classes and interfaces that provide ready-made data structures
to store and manipulate groups of objects efficiently.

Java provides collection interfaces like List, Set, Map, and Queue, with ready-made classes such as
ArrayList, HashSet, HashMap, and PriorityQueue, so you don’t have to write data-handling code from scratch.
The Collection Framework improves productivity by making code more reusable, maintainable and faster to develop.


↑
                                             Iterable (java.lang)
                                                      │
                                            Collection (java.util)
                ┌─────────────────────────────────────┼──────────────────────────────────┐
                │                                     │                                  │
               List                                 Queue                               Set
                ↑                                     ↑                                  ↑
    ┌───────────│───────────┐          ┌──────────────│─────────┐         ┌──────────────│───────────┐
ArrayList    LinkedList   Vector  PriorityQueue   LinkedList  Deque    HashSet     LinkedHashSet  SortedSet
                            ↑                                   ↑                                    ↑
                          Stack                             ArrayDeque                            TreeSet



                  Map (Standalone Interface)
      ┌────────────┼─────────────┐────────────┐
      │            │             │            │
   HashMap   LinkedHashMap   SortedMap    Hashtable
                                 ↑
                              TreeMap


Methods on Collections
add
size
remove
iterate
addAll
removeAll
clear


Collection vs Collections

Collection is an interface in Java.
It represents a group of objects.

For example:
Collection<String> names;

List, Set, and other collection types are related to this hierarchy.


Collections is a utility class containing useful methods for working with collections.

For example:
Collections.sort(names);
Collections.reverse(names);


Collection  - Interface representing a group of objects
Collections	- Utility class containing collection-related methods



Collection Selection
How do I decide which collection to use?


| Requirement                                      | Good choice     |
| ------------------------------------------------ | --------------- |
| General-purpose list                             | `ArrayList`     |
| Frequent linked-list-style insertion/removal     | `LinkedList`    |
| Unique values, order doesn't matter              | `HashSet`       |
| Key-value storage, fast lookup generally desired | `HashMap`       |
| Key-value storage + insertion order              | `LinkedHashMap` |
| Sorted keys                                      | `TreeMap`       |



Basic performance comparison
| Operation           |      ArrayList |                    LinkedList |      HashSet |                 HashMap |
| ------------------- | -------------: | ----------------------------: | -----------: | ----------------------: |
| Get by index        |           O(1) |                          O(n) |            — |                       — |
| Search by value/key |           O(n) |                          O(n) | Average O(1) | Average O(1) key lookup |
| Add at end          | Amortized O(1) |                          O(1) | Average O(1) |            Average O(1) |
| Remove by index     |           O(n) | O(n) to reach index + removal | Average O(1) |     Average O(1) by key |


ArrayList
→ excellent indexed access

HashSet
→ efficient uniqueness and membership checking

HashMap
→ efficient key-based lookup

LinkedList
→ useful for certain insertion/removal patterns
 */