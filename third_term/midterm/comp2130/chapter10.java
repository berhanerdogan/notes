// Thinking in Objects

// Class Abstraction and Encapsulation
// Class abstraction means to separate class implementation from the use of the class.
// The creator of the class provides a description of the class
// and let the user know how the class can be used.
// The user of the class does not need to know how the class is implemented.
// The detail of implementation is encapsulated and hidden from the user.

// Class Association – A general relationship between two classes, showing that one class uses or knows about another.
// Class Aggregation – A “has-a” relationship where one class contains another, but the contained class can exist independently.
// Class Composition – A stronger “part-of” relationship where the contained class cannot exist without the container class.
// Class Inheritance – An “is-a” relationship where a subclass inherits attributes and methods from a parent class.


// Wrapper Classes
// In Java, primitive types (int, double, boolean, etc.) are not themselves objects.
// But sometimes they need to behave like objects.
// The wrapper classes do not have no-arg constructors.
// The instances of all wrapper classes are immutable, i.e., their internal values cannot be changed once the objects are created.
// You can construct a wrapper object either from a primitive data type value or from a string representing the numeric value.
// The constructors for Integer and Double are:
        // public Integer(int value)
        // public Integer(String s)
        // public Double(double value)
        // public Double(String s)

// ValueOf method --> read string value of a numeric data
Double doubleObject = Double.valueOf("12.4");
Integer integerObject = Integer.valueOf("12");

// Parsing Strings into Numbers
// parseInt(), parseDouble()

// BigInt and BigDecimal
//If you need to compute with very large integers or high precision floating-point values, you can use the BigInteger and BigDecimal classes in the java.math package.
// Both are immutable. Both extend the Number class and implement the Comparable interface

"Java".matches("Java");
"Java".equals("Java");
"Java is fun".matches("Java.*");
"Java is cool".matches("Java.*");
// also see replaceAll(), replaceFirst(), and split()

// converts to string
double d = 5.44;
String s = String.valueOf(d);
System.out.println(s); // "5.44"

// String Builder

// Normally string is an immutable class, if you change smth on a string, actually it creates a new string
// performance loss on big systems because of this
// StringBuilder is mutable

// empty StringBuilder
StringBuilder sb1 = new StringBuilder();

// StringBuilder with a starting value
StringBuilder sb2 = new StringBuilder("Hello");

// StringBuilder Methods / also see toString, capacity, length, setLength, and charAt Methods
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");       // "Hello World"
        sb.insert(5, ",");         // "Hello, World"
        sb.replace(7, 12, "Java"); // "Hello, Java"
        sb.delete(5, 6);           // "Hello Java"
        sb.reverse();               // "avaJ olleH"

        System.out.println(sb);
    }
}


