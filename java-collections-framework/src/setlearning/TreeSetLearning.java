package setlearning;

import java.util.TreeSet;

public class TreeSetLearning {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10);

        System.out.println(numbers);

        /*
        HashSet, LinkedHashSet, and TreeSet all share the same add(), remove(), and contains() methods
        because they implement the Java Set interface, but they have different performance speeds and ordering rules.
         */

        //first() - returns first element
        System.out.println(numbers.first());

        //last() - returns last element
        System.out.println(numbers.last());

        //higher(element) - returns the smallest element greater than the given element
        System.out.println(numbers.higher(20));

        //lower(element) - returns the largest element lesser than the given element
        System.out.println(numbers.lower(30));

        //ceiling(element) - returns the smallest element greater than or equal to given element
        System.out.println(numbers.ceiling(20));
        System.out.println(numbers.ceiling(21));

        //floor(element) - returns the largest element lesser than or equal to given element
        System.out.println(numbers.floor(30));
        System.out.println(numbers.floor(29));
    }
}

/*
TreeSet
Unique elements + sorted order

TreeSet uses a tree internally

TreeSet is backed by a:
TreeMap
which uses a Red-Black Tree.

Conceptually:
TreeSet
   |
   ↓
TreeMap
   |
   ↓
Red-Black Tree

Because it maintains sorted order, operations generally take:

add()       → O(log n)
contains()  → O(log n)
remove()    → O(log n)

This is slower than the average O(1) hash-based operations of HashSet,
but TreeSet gives you sorted-order behavior and navigation operations.


| Feature              | HashSet         | LinkedHashSet                      | TreeSet                      |
| -------------------- | --------------- | ---------------------------------- | ---------------------------- |
| Duplicates           | ❌ No            | ❌ No                               | ❌ No                         |
| Insertion order      | ❌ No guarantee  | ✅ Yes                              | ❌ No                         |
| Sorted order         | ❌ No            | ❌ No                               | ✅ Yes                        |
| Internal structure   | Hash table      | Hash table + linked list           | Red-Black tree               |
| Backed by            | HashMap         | HashMap-like linked hash structure | TreeMap                      |
| `add()` average      | O(1)            | O(1)                               | O(log n)                     |
| `contains()` average | O(1)            | O(1)                               | O(log n)                     |
| `remove()` average   | O(1)            | O(1)                               | O(log n)                     |
| `null`               | Allows one      | Allows one                         | Generally doesn't allow null |
| Best use             | Unique elements | Unique + insertion order           | Unique + sorted order        |


                 SET
                  |
       ┌──────────┼──────────┐
       ↓          ↓          ↓
   HashSet   LinkedHashSet  TreeSet
       |          |           |
    Unique     Unique       Unique
    only       + order      + sorted


Use HashSet when:
"I only care that values are unique."

Use LinkedHashSet when:
"I want unique values but I also want to preserve the order in which they were added."

Use TreeSet when:
"I want unique values and I want them automatically sorted."


Do I need duplicates?
       |
       ├── YES → List
       |
       └── NO → Set
                  |
                  ├── Don't care about order
                  |       → HashSet
                  |
                  ├── Need insertion order
                  |       → LinkedHashSet
                  |
                  └── Need sorted order
                          → TreeSet
 */