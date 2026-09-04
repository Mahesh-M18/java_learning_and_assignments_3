import java.io.FileReader;
import java.io.FileNotFoundException;

public class CheckedUncheckedExceptionsLearning {
    public static void main(String[] args) {

        //example for checked exception
        try {
            FileReader file = new FileReader("data.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println("File not found.");
        }

        //example for unchecked exception
        int a = 10, b = 0;
        System.out.println(a / b);
    }
}

/*

Exception Hierarchy

At the top:
Object
  ↓
Throwable
  ├── Error
  └── Exception

Under Exception, we have many exceptions:
Exception
 ├── RuntimeException
 │    ├── ArithmeticException
 │    ├── NullPointerException
 │    ├── ArrayIndexOutOfBoundsException
 │    └── NumberFormatException
 │
 └── Other checked exceptions
      ├── IOException
      ├── SQLException
      └── ...

The key distinction is:
Exception
   |
   +---- RuntimeException
   |          ↓
   |       Unchecked
   |
   +---- Other Exception subclasses
              ↓
           Checked

Checked Exception  (The compiler checks Have you handled or declared this exception?)
A checked exception is an exception that the compiler requires you to handle or declare.
Examples:
IOException
SQLException
FileNotFoundException

You can either catch id or declare it using throws

Unchecked Exception (The compiler doesn't require explicit handling)
Unchecked exceptions are generally subclasses of:
RuntimeException
Examples:
ArithmeticException
NullPointerException
ArrayIndexOutOfBoundsException
NumberFormatException
The compiler does not force you to catch or declare them.

| Feature                               | Checked                                            | Unchecked                                        |
| ------------------------------------- | -------------------------------------------------- | ------------------------------------------------ |
| Compiler requires handling/declaring? | Yes                                                | No                                               |
| Usually extends                       | `Exception` but not `RuntimeException`             | `RuntimeException`                               |
| Examples                              | `IOException`, `SQLException`                      | `ArithmeticException`, `NullPointerException`    |
| Usually represents                    | Conditions that code should explicitly account for | Programming errors or invalid runtime operations |

 */