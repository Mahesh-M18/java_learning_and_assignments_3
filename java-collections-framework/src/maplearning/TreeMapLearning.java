package maplearning;

import java.util.TreeMap;

public class TreeMapLearning {
    public static void main(String[] args) {
        TreeMap<Integer, String> employees = new TreeMap<>();

        employees.put(103, "Arun");
        employees.put(101, "Mahesh");
        employees.put(102, "Rahul");

        System.out.println(employees);
    }
}

/*
TreeMap stores entries according to sorted key order.

Characteristics
Unique keys
Keys are sorted
Generally does not allow null keys
Allows null values
Basic operations → O(log n)

Conceptually:
TreeMap
   ↓
Red-Black Tree

You can also use useful methods such as:
treeMap.firstKey();
treeMap.lastKey();
treeMap.higherKey(101);
treeMap.lowerKey(103);
 */