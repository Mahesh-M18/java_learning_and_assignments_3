package maplearning;

import java.util.LinkedHashMap;

public class LinkedHashMapLearning {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> employees = new LinkedHashMap<>();

        employees.put(103, "Arun");
        employees.put(101, "Mahesh");
        employees.put(102, "Rahul");

        System.out.println(employees);
    }
}

/*

LinkedHashMap is like HashMap, but it maintains insertion order.

Characteristics
Unique keys
Maintains insertion order
Allows one null key
Allows null values
Average basic operations → O(1)

Conceptually:

LinkedHashMap
      ↓
Hash table + linked structure


 */