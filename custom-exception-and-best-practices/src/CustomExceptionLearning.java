public class CustomExceptionLearning {
    public static void main(String[] args) {



    }
}

/*
Java provides built-in exceptions:
ArithmeticException
NullPointerException
NumberFormatException
ArrayIndexOutOfBoundsException

But sometimes application may have a specific business rule that Java doesn't have a built-in exception for.

For example, in your Contact Manager:
Name cannot be empty
Phone number must contain 10 digits
Email must be valid
Phone number cannot already exist

Java doesn't have exceptions called:
InvalidPhoneNumberException
InvalidEmailException
DuplicateContactException

So we can create our own exception classes.
These are called:
Custom Exceptions or User-Defined Exceptions

Custom Exception = Normal Java Class
This is a very important concept.
A custom exception is basically a class that extends an existing exception class.

For example:
class InvalidContactException extends Exception {

}

We have created our own exception:
InvalidContactException
        ↓
      Exception
Because it extends Exception, Java recognizes it as an exception.


If we write:
class InvalidContactException extends Exception {
}
then our custom exception is a:
Checked custom exception
because it extends Exception rather than RuntimeException.

Unchecked Custom Exception
We can also create:
class InvalidContactException extends RuntimeException {

    public InvalidContactException(String message) {
        super(message);
    }
}
Now it becomes an:
Unchecked custom exception
because:
InvalidContactException
        ↓
RuntimeException

The compiler doesn't force us to catch or declare it.


|                                       | Checked Custom Exception                    | Unchecked Custom Exception                               |
| ------------------------------------- | ------------------------------------------- | -------------------------------------------------------- |
| Extends                               | `Exception`                                 | `RuntimeException`                                       |
| Compiler requires handling/declaring? | Yes                                         | No                                                       |
| Good for                              | Conditions callers should explicitly handle | Invalid arguments/programming or domain-state violations |
| Example                               | `InvalidContactException extends Exception` | `InvalidContactException extends RuntimeException`       |


Use checked exceptions when:
The caller is reasonably expected to recover from the condition and the API wants to force callers to acknowledge it.
Example:
File could not be read
Database operation failed

Use unchecked exceptions when:
The problem represents invalid input/arguments or an invalid state and you don't want every caller forced to catch it.
Example:
Invalid phone number
Invalid email
Invalid age
 */