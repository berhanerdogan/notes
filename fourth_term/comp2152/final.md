# Python & Git — Course Notes

---

# 1 — Exceptions, System Modules, Threading & Unit Testing

## Python Topics

### Exceptions

- Types of built-in exceptions: `TypeError`, `ValueError`, `IndexError`, `KeyError`, `FileNotFoundError`
- `try`, `except`, `else`, `finally` blocks
- Catching multiple exceptions
- Raising exceptions with `raise`
- Creating custom exception classes

### System & Application Modules

#### The `sys` Module

- `sys.argv` — command-line arguments
- `sys.path` — module search path
- `sys.exit()` — exit the program
- `sys.stdin`, `sys.stdout`, `sys.stderr`

#### The `os` Module
https://docs.python.org/3/library/os.html

- `os.getcwd()`, `os.chdir()`
- `os.listdir()`, `os.mkdir()`, `os.makedirs()`
- `os.remove()`, `os.rename()`
- `os.path.join()`, `os.path.exists()`, `os.path.isfile()`, `os.path.isdir()`
- `os.environ` — environment variables

#### The `platform` Module
https://docs.python.org/3/library/platform.html

- `platform.system()` — OS name
- `platform.version()`, `platform.machine()`
- `platform.python_version()`

#### The `subprocess` Module
https://docs.python.org/3/library/subprocess.html

- `subprocess.run()` — running shell commands
- Capturing output: `stdout`, `stderr`
- `subprocess.Popen()` — advanced process control

### Threading in Python

#### Forking and Piping

- What is a process fork?
- Pipes: communication between processes
- `os.fork()`, `os.pipe()`

#### The `socket` Module

- What is a socket?
- Creating a TCP server and client
- `socket.socket()`, `bind()`, `listen()`, `accept()`, `connect()`, `send()`, `recv()`

### Unit Testing

- Why write tests?
- `unittest` module
- `TestCase` class, `setUp()`, `tearDown()`
- Assertions: `assertEqual`, `assertRaises`, `assertTrue`, `assertFalse`
- Running tests: `python -m unittest`

## Git Topics

- None this week — Upcoming next week: `git merge`

---

# 2 — Python & Databases

## Python Topics

### How to Use Python to Work with a Database

- What is a database and why use one from Python?

### How to Connect to a SQLite Database

- `import sqlite3`
- `sqlite3.connect('database.db')` — creating/opening a database
- Connection object and cursor object

### How to Execute SELECT Statements

- `cursor.execute("SELECT ...")`
- Filtering with `WHERE`, sorting with `ORDER BY`

### How to Get the Rows in a Result Set

- `cursor.fetchone()` — retrieve one row
- `cursor.fetchall()` — retrieve all rows
- `cursor.fetchmany(n)` — retrieve n rows
- Iterating over a cursor

### How to Execute INSERT, UPDATE, and DELETE Statements

- `INSERT INTO ... VALUES (...)`
- `UPDATE ... SET ... WHERE ...`
- `DELETE FROM ... WHERE ...`
- `connection.commit()` — saving changes
- Using parameterized queries to prevent SQL injection

### How to Test the Database Code

- Unit testing database interactions
- Using in-memory database for tests: `sqlite3.connect(':memory:')`
- Mocking database calls

### How to Handle Database Exceptions

- Common exceptions: `OperationalError`, `IntegrityError`, `ProgrammingError`
- Wrapping database calls in `try/except`
- Closing connections safely with `finally` or context managers (`with`)

## Git Topics

### `git merge`

- What is merging?
- Fast-forward merge vs. three-way merge
- `git merge <branch>`
- Resolving merge conflicts
- `git merge --abort`

---

# 3 — OOP, Web Programming & REST APIs

## Python Topics

### OOP — Object-Oriented Programming

#### Encapsulation

- Bundling data and methods inside a class
- Public, protected (`_`), and private (`__`) attributes
- Getters, setters, and the `@property` decorator

#### Composition

- "has-a" relationship between classes
- Building complex objects from simpler ones
- Composition vs. Inheritance

#### Special Methods (Dunder / Magic Methods)

- `__init__`, `__str__`, `__repr__`
- `__len__`, `__add__`, `__eq__`
- `__iter__`, `__next__`

#### Inheritance

- Subclass / Child class / Derived class
- Superclass / Parent class / Base class
- `super()` — calling the parent class
- Single vs. multiple inheritance
- Method Resolution Order (MRO)

#### Polymorphism

- Overriding methods in a subclass
- Same interface, different behavior
- Duck typing in Python

### A Quick Overview on Python and Web Programming

#### Flask and Django

- What is a web framework?
- Flask: lightweight, micro-framework
- Django: full-featured, "batteries included"
- Flask vs. Django — when to use which

#### REST APIs

- What is a REST API?
- HTTP methods: `GET`, `POST`, `PUT`, `DELETE`
- JSON as the data format
- Building a simple API endpoint with Flask
- Consuming an API with the `requests` library

## Git Topics

- None specified

---

# 13 — Machine Learning with Python

## Part 1: The ML Process Using a Decision Tree

### What is Machine Learning?

- Subfield of Artificial Intelligence (AI)
- Early AI: task-specific programs (e.g. IBM Deep Blue — chess)
- ML goal: one program that solves many problems without being rewritten
- Machine Learning = algorithms that learn from examples and experience instead of hard-coded rules

**Traditional Programming vs Machine Learning:**

| | Input | Output |
|---|---|---|
| Traditional Programming | Rules + Data | Answers |
| Machine Learning | Data + Answers | Rules |

### What is a Classifier?

- ML algorithms define rules automatically
- A classifier: `f(x) = y` — takes features as input, outputs a label
- Example: image → `"Apple"` or `"Orange"`
- The technique to write the classifier automatically: **Supervised Learning**
  - Begins with examples of a problem, finds patterns in those examples

### Supervised Learning Recipe

#### Step 1 — Collect Training Data

- The more data, the better the classifier
- Features + Labels = Training examples
- Example dataset:

| Weight | Texture | Label  |
|--------|---------|--------|
| 150g   | Bumpy   | Orange |
| 140g   | Smooth  | Apple  |

- Features and labels are replaced with integer values for the algorithm

#### Step 2 — Train the Classifier

- Using a **Decision Tree** model
- A classifier = a box of rules; a learning algorithm = the procedure that creates those rules
- Learning algorithm finds patterns in training data
- In `scikit-learn`: `classifier.fit(features, labels)`
- Example decision tree logic:
  - `Texture = bumpy?` → Yes → Orange / No → `Weight > 150g?` → ...

#### Step 3 — Make Predictions

- `classifier.predict([[value1, value2]])`
- The same program can be reused for a new problem by simply changing the training data

### Important Concepts

- How much training data do we need?
- How is the decision tree created automatically?
- What makes a good feature?

---

## Part 2: Decision Tree Visualization (Slides 1–10)

### Visualizing a Decision Tree

- Adding code to visualize the Decision Tree to understand how it works under the hood

### Types of Classifiers

- Artificial Neural Network (ANN)
- Support Vector Machine (SVM)
- Decision Tree
  - Why start with Decision Tree?
    - Easy to read and understand
    - One of the few interpretable models

### A Classic Machine Learning Problem — Iris Flower Dataset

- Dataset: https://en.wikipedia.org/wiki/Iris_flower_data_set
- Features: sepal length, sepal width, petal length, petal width
- Labels: species of Iris flower

### Defining a Hands-on Project

**Goals:**

1. Import dataset
2. Train a classifier
3. Predict label for new flower(s)
4. Visualize the tree

- Working with existing datasets: http://scikit-learn.org/stable/datasets/
