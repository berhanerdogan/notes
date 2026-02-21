// Objects and Classes

// Classes are constructs that define objects of the same type
// In OOP, An object represents an entity in the real world that can be distinctly identified.
// Check UML class diagram

// class name: Circle
public class Circle{
    // Data fields
    double radius;

    // constructors
    // a default constructor, is provided automatically
    // only if no constructors are explicitly defined in the class.
    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    // methods

    double getArea(){
        return Math.PI * radius * radius;
    }
}

// Circle object 1
Circle circle = new Circle(5); // radius is 5, area is 78.54
// Circle object 2
Circle circle2 = new Circle(10); // radius is 10, area is 314.16
// Circle object 3
Circle circle3 = new Circle();

// An object has both a state and behavior.
// The state defines the object,
// and the behavior defines what the object does.


// Referencing the object’s data:
double x = circle.radius;

// Invoking the object methods
double y = circle.getArea();

// Reference Data Fields
public class Student {
    String name;          // reference type
    int age;              // primitive type
    boolean isScienceMajor; // primitive type
    char gender;          // primitive type
}

// The default value of a data field is null for a reference type,
// 0 for a numeric type,
// false for a boolean type,
// and '\u0000' for a char type.
// However, Java assigns no default value to a local variable inside a method


// Check for java date class, math random class, and Java Point2D class

// Instance variable
// every object has its own copy of instance variables
public class Student {
    String name;  // instance variable
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John";

        Student s2 = new Student();
        s2.name = "Doe";

        System.out.println(s1.name); // John
        System.out.println(s2.name); // Doe
    }
}

// Instance method
// A method that can only be called from an object of a class
public class Student {
    String name;

    // instance method
    void printName() {
        System.out.println(name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John";
        s1.printName();  // John

        Student s2 = new Student();
        s2.name = "Doe";
        s2.printName();  // Doe
    }
}

// Static variables, methods and constants
// Static variables are shared by all the instances of the class
// Static methods are not tied to a specific object.
// Static constants are final variables shared by all the instances of the class
// Use static modifier



// Visivility modifiers and Accessor/Mutator Methods
// By default, the class, variable, or method can be accessed by any class in the same package.
// public, private


// Array of Objects
Circle[] circleList = new Circle[3];
// An array of objects is actually an array of reference variables.

// The this keyword is the name of a reference that refers to an object itself.
// One common use of the this keyword is reference a class’s hidden data fields.

