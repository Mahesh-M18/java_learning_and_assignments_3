import java.util.ArrayList;
import java.util.Collections;

public class ArrayListLearning {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        //ArrayList<String> list2 = new ArrayList<>();

        //add(element) - Adds an element
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        System.out.println(list);

        //get(i) - gets an elements at index i
        int element = list.get(0);
        System.out.println(element);

        //add(i,element) - add element in list in between
        list.add(0, 1);
        System.out.println(list);

        //set(i,element) - changes an existing element
        list.set(0, 50);
        System.out.println(list);

        //remove(i) - removes an element at index i
        list.remove(0);
        System.out.println(list);

        //size() - returns the number of elements
        System.out.println(list.size());

        //loop
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

        //enhanced for loop
        for (int num : list)
            System.out.println(num);

        //Collections.reverse() - reverses an list
        Collections.reverse(list);
        System.out.println(list);

        //Collection.sort() - sorts a list
        Collections.sort(list);
        System.out.println(list);

        //contains - checks whether an element exists
        System.out.println(list.contains(5));

        //isEmpty() - check whether list contains no elements
        System.out.println(list.isEmpty());

        //clear() - removes all elements
        list.clear();
        System.out.println(list);

    }
}


/*
A List is a collection that:

Maintains insertion order
Allows duplicate elements
Allows access using an index

ArrayList uses heap memory

Insert : O(n)
Search : O(1)
*/

