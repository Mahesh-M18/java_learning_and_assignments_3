public class ExceptionHandlingLearning {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        int[] numbers = {10, 20, 30};

        //try - executes the code and tries to find an exception
        try {
            int result = a / b; //ArithmeticException: / by zero
            System.out.println(numbers[5]); //ArrayIndexOutOfBoundsException
            //Once an exception occurs inside the try block, the remaining statements in that try block are skipped.
        }
        //catch tells Java: If a particular exception occurs in the preceding try block, execute this code.
        catch (Exception exception) {
            System.out.println(exception);
        }

        try {
            System.out.println(numbers[5]);
            int result = a / b; //ArithmeticException: / by zero
        } catch (ArithmeticException e) { // we can add multiple catch blocks for multiple types of exception
            System.out.println("The exception is : " + e);
            System.out.println(e.getMessage());
            e.printStackTrace(); //prints detailed debugging information, including where the exception occurred.
            System.out.println("Cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array error: Invalid index accessed.");
        }
        //finally block contains code that is intended to execute after the try/catch processing.
        finally {
            System.out.println("Finally executed");
        }

        try {
            int result = a + b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } finally {
            System.out.println("Addition is done");
        }

        try {
            System.out.println(numbers[5]);
        } catch (ArithmeticException e) { //this catch doesn't match the exception caused
            System.out.println("Arithmetic Exception");
        } finally {
            System.out.println("Array operation");
        }
        //in this above case finally executes first and exception warning is shown next in the output
    }
}

/*
An exception is an event that occurs while a program is running and disrupts the normal flow of execution.

try {
    // code that might cause an exception
}
catch (ExceptionType e) {
    // code that handles the exception
}

Normally, the program is:
Start
  ↓
Statement 1
  ↓
Statement 2
  ↓
Statement 3
  ↓
End

But when an exception occurs:
Start
  ↓
Statement 1
  ↓
Exception occurs
  ↓
Normal execution interrupted
  ↓
Program may terminate

Exception handling is a mechanism provided by Java to:
Detect, handle, and manage runtime problems without allowing them to unexpectedly terminate the program.
The main keywords are:
try
catch
finally
throw
throws

Prefer:
catch (ArithmeticException e)

when you specifically want to handle division-by-zero problems.

Rather than:
catch (Exception e)

for everything.

Because specific exceptions make your code:
clearer
easier to debug
easier to maintain
more precise about what went wrong

Order of catch block
Specific
   ↓
General

catch (ArithmeticException e) {
    ...
}
catch (Exception e) {
    ...
}
 */