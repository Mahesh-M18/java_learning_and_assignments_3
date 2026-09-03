import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class EnhacedforloopLearning {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Mahesh");
        names.add("Rahul");
        names.add("Priya");

        //enhanced for-loop or for-each loop
        for (String name : names) {
            System.out.println(name);
        }

        HashSet<String> places = new HashSet<>();

        places.add("Chikmagalur");
        places.add("Coorg");
        places.add("Madikeri");

        for (String place : places) {
            System.out.println(place);
        }

        HashMap<Integer, String> employee = new HashMap<>();
        employee.put(101, "Mahesh");
        employee.put(102, "Suresh");
        employee.put(103, "Ramesh");

        for (int empId : employee.keySet()) {
            System.out.println(empId);
        }

        for (String empName : employee.values()) {
            System.out.println(empName);
        }

        for (Map.Entry<Integer, String> entry : employee.entrySet()) {

            System.out.print(entry.getKey() + " -> ");
            System.out.println(entry.getValue());
        }
    }
}

/*
Enhanced for-loop or for-each loop
is designed to make traversal of arrays and Iterable collections simpler.

| Feature                       | Iterator                       | Enhanced for-loop |
| ----------------------------- | ------------------------------ | ----------------- |
| Traversal                     | Yes                            | Yes               |
| Simple iteration              | More verbose                   | Very simple       |
| Access each element           | Yes                            | Yes               |
| Safe removal during traversal | Yes, using `iterator.remove()` | Not directly      |
| Manual control                | More                           | Less              |
| Beginner-friendly             | Moderate                       | Very easy         |


Use enhanced for-loop when:
You simply want to read/process each element.

Use Iterator when:
You need more control, particularly safe removal while traversing.
 */