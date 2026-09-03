package setlearning;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetLearning {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //add()
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);

        //contains()
        System.out.println(set.contains(6));

        //remove(element)
        set.remove(1);
        System.out.println(set);

        //size()
        System.out.println(set.size());

        set.add(1);
        set.add(4);
        set.add(5);
        System.out.println(set);

        //enhanced for loop
        for (int num : set)
            System.out.println(num);

        //Iterator
        Iterator it = set.iterator();

        //next() - gives the next element
        //hasNext() - returns true or false regarding the existence of next element

        while (it.hasNext()) {
            System.out.println(it.next()); //automatically moves to next element
        }

        //isEmpty()
        System.out.println(set.isEmpty());

        //clear()
        set.clear();
        System.out.println(set);

    }
}

/*
a set does not allow duplicate elements

Insert/ Add - O(1)
Search/ Contains - O(1)
Delete/Remove - O(1)

set has no indexes
set is unordered collection of data


| Feature         | List                  | Set                             |
| --------------- | --------------------- | ------------------------------- |
| Duplicates      | ✅ Allowed             | ❌ Not allowed                   |
| Index           | ✅ Yes                 | ❌ No                            |
| `get(index)`    | ✅ Yes                 | ❌ No                            |
| Insertion order | Usually maintained    | Depends on implementation       |
| Examples        | ArrayList, LinkedList | HashSet, LinkedHashSet, TreeSet |


*/

/*
HashSet is the most commonly used Set when you simply need unique elements and don't care about their order.
HashSet does NOT guarantee insertion order.

HashSet is internally backed by a: HashMap

Conceptually:
HashSet
   |
   ↓
HashMap
   |
   ↓
Hash table / buckets

When you do:
set.add("Mahesh");

Java calculates a hash code for "Mahesh".
Conceptually:
"Mahesh"
   ↓
hashCode()
   ↓
hash value
   ↓
bucket

This is why HashSet can perform operations like:
add()
contains()
remove()
very efficiently on average.

Average time complexity is approximately:
add()       → O(1)
contains()  → O(1)
remove()    → O(1)

When storing objects in a HashSet, Java uses:
hashCode()
equals()
to determine uniqueness.
 */

