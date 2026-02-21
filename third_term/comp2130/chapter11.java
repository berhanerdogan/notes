// Inheritance and Polymorphism

// Superclasses and Subclasses
// "A superclass is a class whose fields and methods are inherited by another class."
// Unlike properties and methods, a superclass's constructors are not inherited in the subclass.
// They can only be invoked from the subclasses' constructors, using the keyword super.
// If the keyword super is not explicitly used, the superclass's no-arg constructor is automatically invoked
// Add new properties, Add new methods, Override the methods of the superclass

// Constructor Chaining
// Constructing an instance of a class invokes all the superclasses’ constructors along the inheritance chain.

public class Faculty extends Employee {
    public static void main(String[] args) {
        new Faculty();
    }
    public Faculty() {
        System.out.println("(4) Faculty's no-arg constructor is invoked");
    }
}
class Employee extends Person {
    public Employee() {
        this("(2) Invoke Employee’s overloaded constructor");
        System.out.println("(3) Employee's no-arg constructor is invoked");
    }
    public Employee(String s) {
        System.out.println(s);
    }
}
class Person {
    public Person() {
        System.out.println("(1) Person's no-arg constructor is invoked");
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Person{}";
    }
}


// The object class and its methods
// Every class in Java is descended from the java.lang.Object class.
// If no inheritance is specified when a class is defined, the superclass of the class is Object.

// toString() --> The toString() method returns a string representation of the object.
Person person =  new Person();
System.out.println(person.toString)

// Polymorphism
// Polymorphism means that a variable of a supertype can refer to a subtype object.

public class PolymorphismDemo {
    public static void main(String[] args) {
        m(new GraduateStudent());
        m(new Student());
        m(new Person());
        m(new Object());
    }
    public static void m(Object x) {
        System.out.println(x.toString());
    }
}
class GraduateStudent extends Student {
}
class Student extends Person {
    public String toString() {
        return "Student";
    }
}
class Person extends Object {
    public String toString() {
        return "Person";
    }
// An object of a subtype can be used wherever its supertype value is required.
// This feature is known as polymorphism.
// m method above requires a Object which is a superclass for all
// Java Virtual Machine goes bottom-up in classes to find a implementation this is dynamic binding


// Method Matching
// when print(5) is called:
// Java compiler checks every method named print
// chekcs for int type parameter
// calls proper match
class Example {
    void print(int a) {
        System.out.println("int version");
    }

    void print(double a) {
        System.out.println("double version");
    }

    void print(String a) {
        System.out.println("String version");
    }

    public static void main(String[] args) {
        Example e = new Example();
        e.print(5);       // int version
        e.print(5.5);     // double version
        e.print("hello"); // String version
    }
}

// Generic Programming
// Polymorphism allows methods to be used generically for a wide range of object arguments.
// This is known as generic programming.
// If a method’s parameter type is a superclass (e.g., Object),
// you may pass an object to this method of any of the parameter’s subclasses


// Casting Objects
// Casting can also be used to convert an object of one class type to another within an inheritance hierarchy.
Object o = new Student();
Student b = o;
// The statement Object o = new Student(), known as implicit casting,
// is legal because an instance of Student is automatically an instance of Object.
// Student b = o; is wrong because
// This is because a Student object is always an instance of Object,
// but an Object is not necessarily an instance of Student.

// instanceof Operator
// Use the instanceof operator to test whether an object is an instance of a class:
Object myObject = new Circle();
... // Some lines of code
/** Perform casting if myObject is an instance of
 Circle */
if (myObject instanceof Circle) {
        System.out.println("The circle diameter is " +
                ((Circle)myObject).getDiameter());
...
    }

// equals Method
// The equals() method compares the contents of two objects
// == checks by reference

// default equals method does same with == but its commonly overriden
public boolean equals(Object obj) {
    return (this == obj);
}

// for example in string class equals works like this:
public boolean equals(Object obj) {
    if (this == obj) return true;                  // Is this the same reference? If same no need to check more its true.
    if (obj instanceof String s) {                 // Is other object a string?
        return this.value.equals(s.value);          // compare values
    }
    return false;
}

// how to override equals in your class


// ArrayLsit class
// You can create an array to store objects.
// But the array’s size is fixed once the array is created.
// Java provides the ArrayList class that can be used to store an unlimited number of objects.
// Also data type is generic you can choose


// protected modifier
// A protected data or a protected method in a public class can be accessed by any class in the same package
// or its subclasses,
// even if the subclasses are in a different package.

// final modifier
// The final class cannot be extended
// The final variable is a constant
// The final method cannot be overridden by its subclasses
