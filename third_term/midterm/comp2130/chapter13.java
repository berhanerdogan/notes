// Abstract Classes and Interfaces
// respond to user actions, such as clicking a button to perform an action

// An abstract class forms a common base skeleton (blueprint) or contract for other classes.
// Cannot create an object from an abstract class, you need to extend it
public abstract class Animal {
    public abstract void makeSound();

    public static void eat(){
        System.out.println("eat");
    }
}
// Can include abstract methods and normal methods

// Abstract methods
// These are methods that do not have a body (i.e., the implementation code within {}).
// Only the method signature is declared.
// Abstract methods have to be overriden by inheriter

// Interfaces
// An interface defines what a class should do, not how it should do it.
// An interface is a type of contract:
// "The class that implements this interface must write all the methods defined there."
// Interface tanımı
interface Animal {
    void makeSound(); // abstract method
    void eat();
}

// class that implements interface
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }

    public void eat() {
        System.out.println("Dog is eating.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound(); // Woof!
        myDog.eat();       // Dog is eating.
    }
}
