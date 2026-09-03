import java.util.ArrayList;
import java.util.Iterator;

public class IteratorLearning {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Mahesh");
        names.add("Rahul");
        names.add("Priya");

        Iterator<String> it = names.iterator();

        //next() - retrieves the next element and moves the iterator forward
        //hasNext() - checks for the existence of another element

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //iterator has its own remove method
        //it.remove() - removes the current element
    }
}

/*
An Iterator is an object that allows you to traverse elements of a collection one by one.
Think of it like a cursor.

Imagine:
[Mahesh] [Rahul] [Priya]
   ↑
 cursor

The iterator starts before/at the beginning and moves through the collection.

Why do we need Iterators?
One important reason is safe removal while traversing a collection.

Suppose you want to remove names starting with "A".
You can use:
Iterator<String> iterator = names.iterator();

while (iterator.hasNext()) {
    String name = iterator.next();
    if (name.startsWith("A")) {
        iterator.remove();
    }
}

This is one of the important practical uses of Iterator.

Why not simply remove inside an enhanced for-loop?
For example, this is problematic:

for (String name : names) {

    if (name.startsWith("A")) {
        names.remove(name);
    }
}

Modifying many collections structurally while using a normal enhanced for loop can cause:
ConcurrentModificationException
Instead, use an iterator when you need to remove elements during traversal:

 */