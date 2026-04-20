# Lecture Notes — Design Patterns & TDD

---

# Lecture 5 — Test Driven Development (TDD)

## What is TDD?

- A software development technique where the test is written **before** the functional code
- Contrast with traditional approach: testing is done **after** writing the code
- XP (Extreme Programming) introduced test-first programming in 1999

---

## TDD Sequence of Steps

### 1. Add a Test
- Every new feature starts by writing the test case first
- Developer uses requirements (use cases, user stories) to write tests for normal and exceptional scenarios
- Good requirement elicitation technique — forces the developer to focus on requirements

### 2. Run Tests (and see if the new one fails)
- The new test will always fail since the code doesn't exist yet
- After seeing it fail, the developer writes code to make it pass

### 3. Write Some Code
- Write just enough code to make the failing test pass
- Do not write code beyond what the test checks
- The code at this stage is not perfect — it will be refactored later

### 4. Run All Tests
- Run all tests again to confirm they pass
- If they don't pass, keep enhancing the code

### 5. Refactor Code
- Clean up the code
- Remove duplications and redundancies
- Add extra functionality and reorganize modules, classes, and methods to improve readability and maintainability

### 6. Repeat
- Add a new test and repeat the whole process

---

## The Three Laws of TDD

1. You must write a failing test before you write any production code
2. You must not write more of a test than is sufficient to fail
3. You must not write more production code than is sufficient to make the currently failing test pass

---

## Red, Green, Refactor

A TDD framework based on the three laws:

- **Red** — think about what you want to develop (write a failing test)
- **Green** — think about how to make your tests pass (write just enough code)
- **Refactor** — think about how to improve your existing implementation

### Red-Green-Refactor Cycle

- Create a test to introduce a change
  - If it passes (green) → the change was redundant
  - If it fails (red) → implement the change, then run the test again
- Refactor to improve design and performance, then re-run tests
- Previously written tests should also be run before any change is committed

---

## Advantages of TDD

- Increased developer productivity
- Reduced defect density
- Proactive vs. reactive QA
- Better software design (low coupling, higher cohesion)
- Better code quality
- Quicker delivery
- Better client relationship

---

## Test Types

- **Positive tests** — when everything goes well and ends well
- **Negative tests** — when something should go wrong (e.g. exception cases)
- Write a test for each case and make sure it fails first

---

## Sources of Test Cases

- **Requirements** — what a feature should and shouldn't do
- **Errors** — failures and bugs reported by testers and users

---

## Limitations of TDD

- Does not work well where full functional tests are required (e.g. user interfaces, database programs, network-dependent programs)
- **Blind spots** — the developer writes the tests, so any requirements they misinterpret will be left out
- Badly written tests become a maintenance overhead

---

# Lecture 6 — Design Patterns: Singleton, Adapter, MVC

## Software Design Patterns

- A solution to a commonly occurring problem within a given context in software design
- The Gang of Four (GoF) defined 23 fundamental patterns in *Elements of Reusable Object-Oriented Software*

---

## Creational Pattern: Singleton

### Intent
- Ensure a class has only **one instance**
- Provide a **global point of access** to it

### Motivation
- Some classes must only have one instance (e.g. file system, window manager)

### Applicability
- When there must be exactly one instance of a class
- When it must be accessible from a known location

### Features
- The sole instance is extensible by subclassing
- Clients can use the extended instance without modification
- Reduces namespace pollution — avoids global variables storing a single instance

### Implementation (C#)
```csharp
public class Singleton
{
    private static Singleton instance;
    private Singleton() {}

    public static Singleton Instance
    {
        get
        {
            if (instance == null)
            {
                instance = new Singleton();
            }
            return instance;
        }
    }
}
```

---

## Structural Pattern: Adapter

### Intent
- Allows the interface of an existing class to be used as another interface
- Makes existing classes work with others **without modifying their source code**
- Modeled on the real-world electrical adapter (e.g. two-prong plug into a three-prong socket)

### When to Use
- To connect contemporary software to legacy code
- When a system needs to use classes whose interfaces don't match its requirements
- For off-the-shelf code, toolkits, and libraries

### Participants
- **Client** — the class that wants to use the Adaptee's functionality
- **ITarget** — the interface the client uses to achieve functionality
- **Adapter** — implements ITarget and calls the Adaptee code
- **Adaptee** — the existing functionality the client wants, but with an incompatible interface

### Implementation (C# — Online Shopping Portal Example)
```csharp
interface ITarget
{
    List<string> GetProducts();
}

class VendorAdapter : ITarget
{
    public List<string> GetProducts()
    {
        VendorAdaptee adaptee = new VendorAdaptee();
        return adaptee.GetListOfProducts();
    }
}

public class VendorAdaptee
{
    public List<string> GetListOfProducts()
    {
        List<string> products = new List<string>();
        products.Add("Gaming Consoles");
        products.Add("Television");
        products.Add("Books");
        return products;
    }
}
```

---

## Architectural Pattern: MVC (Model-View-Controller)

### What is MVC?
- An architectural design pattern that divides a software system into three interconnected but independent components
- Widely used for graphical user interfaces and web applications

### The Three Components

#### Model
- The central component — manages data, logic, and rules
- Does all the actual processing
- Independent of both the Controller and the View
- Provides services (methods) for the View and Controller

#### View
- The component the user interacts with
- Presentation of the model in a particular format
- Provides the user access to the model through methods
- Should not display what the Controller thinks is happening

#### Controller
- Accepts user input, validates it, and forwards it to the Model
- Serves as intermediary between the View and the Model
- Design depends on the Model, but the Model does not depend on the Controller

### Advantages
- Input processing is separated from output processing
- Controllers can be interchanged, allowing different interaction modes
- Multiple views of the same model can be supported easily

### MVC Variants
- **Combining Controller and View** — for small, highly interdependent programs (never mix in the Model)
- **No Model-View interaction** — all interaction goes through the Controller

### MVC Features
- Provides logical structure for heavily interactive systems
- Adheres to good engineering principles: information hiding, low coupling, simplicity, delegated control
- Separation eases maintenance — divide and conquer

---

# Lecture 7 — Design Patterns: Observer, Iterator, Facade

## Observer Pattern

### Intent
- Define a **one-to-many** dependency between objects
- When one subject changes state, all dependent observers are notified and updated automatically
- Also known as: **Dependents** or **Publish-Subscribe (Pub-Sub)**

### When to Use
- You have a subject that can change state
- Multiple observers need to be notified about the change

### Example
- A dataset can be modified (internally or externally)
- Observers are specialized views presenting the data
- Observers register to receive updates when the dataset changes

### Participants

**Subject**
- Knows its observers
- Provides interface for attaching, detaching, and notifying observers

**Observer**
- Defines an updating interface for all observers

**Concrete Subject**
- Stores state of interest to concrete observers
- Notifies observers when its state changes

**Concrete Observer**
- Maintains a reference to its concrete subject
- Stores state that corresponds to the subject's state
- Implements the Observer updating interface

### Consequences
- Abstract coupling between subject and observer
- Permits changing the number of observers dynamically
- Subject and observer can belong to different layers
- Supports broadcast communication
- Observers can depend on more than one subject

---

## Iterator Pattern

### Intent
- Access elements of a container **sequentially** without exposing the underlying representation

### When to Use
- You have a container (list, tree, array, set, etc.) with elements
- You want to access elements sequentially without exposing internal structure
- You may want to traverse in various orders (e.g. different tree traversals)
- You don't want to extend the container interface

### Participants

**Iterator**
- Defines interface for accessing and traversing a container's contents

**Concrete Iterator**
- Implements the iterator interface
- Keeps track of current position in the traversal
- Determines the next object in the sequence

**Aggregate**
- Can provide a method to create an instance of an iterator

**Concrete Aggregate**
- Implements the iterator creation interface to return the appropriate Concrete Iterator

### Applicability
- Access a container's contents without knowing its internal representation
- Provide a uniform interface for traversing different container types
- Support polymorphic iteration (iterating collections of various types)

---

## Facade Pattern

### Intent
- Provide a **simplified interface** to a more complex subsystem
- Minimize communication and dependencies between the client and the subsystems

### Participants

**Facade**
- Knows which subsystem classes are responsible for a request
- Delegates client requests to the appropriate subsystem objects

**Subsystem**
- Implements the actual system functionality
- Handles work assigned by the Facade
- Has **no knowledge** of the Facade

### How it Works
- Clients send requests to the Facade
- Facade forwards requests to the appropriate subsystem
- Facade may translate its interface to the subsystem interface (can use the Adapter pattern here)
- Clients that use Facade do not have direct access to the subsystems

### Benefits
- Shields clients from subsystem complexity
- Reduces the number of objects clients need to deal with
- Promotes weak coupling between subsystems and clients
- Subsystem components can be changed without affecting clients

### Liability
- Does not prevent expert clients from accessing subsystems directly
- Trade-off between ease of use and generality

### Example (C# — Car Facade)
```csharp
public class CarFacade
{
    CarModel model;
    CarEngine engine;
    CarBody body;
    CarAccessories accessories;

    public CarFacade()
    {
        model = new CarModel();
        engine = new CarEngine();
        body = new CarBody();
        accessories = new CarAccessories();
    }
}
```
