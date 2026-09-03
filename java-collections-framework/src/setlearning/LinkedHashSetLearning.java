package setlearning;

import java.util.LinkedHashSet;
import java.util.Iterator;


public class LinkedHashSetLearning {
    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();

        names.add("Mahesh");
        names.add("Rahul");
        names.add("Arun");
        names.add("Mahesh");

        System.out.println(names);

        Iterator it = names.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        //LinkedHashSet and HashSet share the exact same methods like add(), remove(), and contains()
        //because they both implement the Set interface.
    }
}


/*
LinkedHashSet

Now suppose you want:
Unique elements + maintain insertion order

Set<String> names = new LinkedHashSet<>();

LinkedHashSet is essentially a HashSet with a linked structure that maintains insertion order.

LinkedHashSet
      |
      ↓
Hash table + linked list

Fast hash-based lookup
Insertion-order maintenance
That's why it generally uses more memory than HashSet.

This is particularly useful when you want to remove duplicates without changing the original order.
 */