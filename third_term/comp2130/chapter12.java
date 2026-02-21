// Exception handling and text IO

// By handling InputMismatchException,
// your program will continuously read an input until it is correct.

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContinuousInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctNumber;

        System.out.println("Please enter an integer:");

        // Loop until a correct integer is provided
        while (true) {
            try {
                // Attempt to read an integer
                correctNumber = scanner.nextInt();
                // If successful, exit the loop
                break;
            } catch (InputMismatchException e) {
                // Catch the error if the input is not an integer (e.g., a word)
                System.out.println("Invalid input. Please enter a whole number only.");

                /* CRUCIAL STEP: The scanner's buffer must be cleared.
                 * Otherwise, the invalid input (like "hello") remains,
                 * and the loop will immediately fail again without asking for new input.
                 */
                scanner.next();
            }
        }
        System.out.println("Success! You entered: " + correctNumber);
        scanner.close();
    }
}

// System errors
// System errors are thrown by JVM, describes internal system errors

// Exceptions
// Exception describes errors caused by your program and external circumstances
// These errors can be caught and handled by your program.

// Runtime exceptions
// RuntimeException is caused by programming errors, such as bad casting,
// accessing an out-of-bounds array, and numeric errors

// RuntimeException, Error and their subclasses are known as unchecked exceptions.
// All other exceptions are known as checked exceptions

// Declaring and Throwing Exceptions
// Every method must state the types of checked exeptions it might throw.
// public void myMethod()
//      throws IOException
// public void myMethod()
//      throws IOException, OtherException

// In short, if a method refuses to handle a Checked Exception (i.e., try-catch is not used),
// it must declare the method with the switch to throw those exceptions
// in order to delegate durability to the calling code.

// catch with try-catch block

// Rethrow exception
// Re-throwing is used when a method cannot fully resolve the exception at its own level
// but still needs to complete some critical steps before the exception is thrown.
// logging for example
try {
statements;
}
        catch(TheException ex) {
perform operations before exits;
throw ex;
}

// Assertions
assert condition;
assert condition : expression; // detailed
// Assertions are designed to check for situations that should never occur or always be true;
// namely, to detect logic errors: