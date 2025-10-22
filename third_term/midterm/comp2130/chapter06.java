// Methods

// Defining
// public static part is method modifiers
// int is return value type
// max(int num1, int num2) is method signature
// max is method name
// (int num1, int num2) are parameters (formal)
public static int max(int num1, int num2) {// method header
    //method body
    int result;
    if (num1 > num2)
        result = num1;
    else
        result = num2;
    return result; // return value
}

// invoke a method
int z = max(x, y) // now x and y are actual parameters

//If the method does not return a value, the returnValueType is the keyword void
// If its not void you need return line

// Pass by value
int x = 5;
void addOne(int num) {
    num = num + 1; // only changes the copy
}
addOne(x);
System.out.println(x); // out still 5

// Pass by refrence
class Person {
    String name;
    Person(String name) { this.name = name; }
}

Person p = new Person("Bob");
void changeName(Person person) {
    person.name = "Alice"; // original object is changing
}
changeName(p);
System.out.println(p.name); // object itself changed

// PRIMITIVE DATA IS PASSED BY REFERENCE


// Method overloading
// defining in same class, with same name, but with different parameters
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

Calculator calc = new Calculator();
System.out.println(calc.add(2, 3));       // 5
        System.out.println(calc.add(2.5, 3.5));   // 6.0
        System.out.println(calc.add(1, 2, 3));    // 6


// Method overriding
// Subclass defining a method blongs to superclass
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

Animal a = new Dog();
a.sound();  // out dog barks



