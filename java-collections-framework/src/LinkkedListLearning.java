import java.util.LinkedList;
import java.util.Collections;

public class LinkkedListLearning {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        //addFirst() - adds an element in the beginning of the list
        list.addFirst("is");
        list.addFirst("The");
        System.out.println(list);

        //addLast() - adds an element in the end of the list
        list.addLast("a");
        list.add("list"); //add() - by default it will add at the end
        System.out.println(list);

        //add(i,element) - adds an element at index i
        list.add(0, "Hello");
        System.out.println(list);
        list.removeFirst();

        //size() - returns the length of the list
        System.out.println(list.size());

        //loop get(i) - retrieves an element at index i
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " -> ");
        System.out.println("null");

        //enhanced for loop
        for (String word : list)
            System.out.println(word);

        //getFirst() - gives the first element getLast()-gives last element
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        //removeFirst() - removes the first element in the list
        list.removeFirst();
        System.out.println(list);

        //removeLast() - removes the last element in the list
        list.removeLast();
        System.out.println(list);
        list.remove(); // by default removes the first element
        System.out.println(list);

        list.addFirst("is");
        list.addFirst("This");
        list.add("list");
        System.out.println(list);

        //remove(i) - removes the element at ith index
        list.remove(2);
        System.out.println(list);

        //remove(element) - remove by value
        list.remove("is");
        System.out.println(list);

        //set(i,element) - changes an element
        list.set(0, "That");
        System.out.println(list);

        //contains(element) - returns true or false
        System.out.println(list.contains("That"));

        //indexOf(element) - returns index of an element
        System.out.println(list.indexOf("list"));

        //isEmpty() - returns true or false
        System.out.println(list.isEmpty());

        System.out.println(list);
        Collections.reverse(list); //reverses a list
        System.out.println(list);

        Collections.sort(list); //sorts the list
        System.out.println(list);

        //clear() - truncates the list
        list.clear();
        System.out.println(list);
    }
}

/*
LinkedList
Variable Size
Non-contiguous Memory
Insert : O(1)
Search : O(n)

Types
Singly LL
Doubly LL
Circular LL


| Feature                      | ArrayList                  | LinkedList                                             |
| ---------------------------- | -------------------------- | ------------------------------------------------------ |
| Maintains order              | Yes                        | Yes                                                    |
| Allows duplicates            | Yes                        | Yes                                                    |
| Index access                 | Fast                       | Slower                                                 |
| Getting element by index     | Very efficient             | Less efficient                                         |
| Adding at end                | Usually fast               | Fast                                                   |
| Inserting/removing in middle | Can require shifting       | Can be efficient once position/node is known           |
| Memory usage                 | Generally lower            | Generally higher                                       |
| Common use                   | Most general-purpose lists | Frequent insert/remove operations in certain positions |

LinkedList is always better for adding/removing.

 */