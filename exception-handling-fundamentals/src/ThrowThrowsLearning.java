public class ThrowThrowsLearning {
    public static void main(String[] args) {

        int age = -18;
        //throw example

        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        } else {
            System.out.println("Valid age");
        }

        //throws example
        /*
        public void readFile() throws IOException {
            // code
        }
        */
    }
}

/*
throw is used when you explicitly want to throw an exception.

throws
Used in a method declaration to say:
"This method may throw this exception, and the caller must deal with it when required."

| `throw`                               | `throws`                             |
| ------------------------------------- | ------------------------------------ |
| Actually throws an exception          | Declares possible exceptions         |
| Used inside method body               | Used in method declaration           |
| Throws one exception object at a time | Can declare multiple exception types |
| `throw new Exception()`               | `method() throws Exception`          |

throw
→ "Throw this NOW."

throws
→ "This method MAY throw this."

try
→ code that may cause an exception

catch
→ handle a matching exception

finally
→ cleanup/final processing

throw
→ explicitly throw an exception

throws
→ declare possible exceptions from a method

 */