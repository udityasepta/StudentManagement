# Student Management System

A simple **Student Management System built using Java and Object-Oriented Programming (OOP)**.

This is a console-based application that allows users to add, view, search, update, and delete student records. It also calculates the student's grade and pass/fail status based on marks.

## Features

* Add a new student
* Display all students
* Search student by ID
* Update student details
* Delete student
* Calculate student grade
* Display Pass/Fail status
* Store students using `ArrayList`
* Menu-driven console interface

## Technologies Used

* **Java**
* **Object-Oriented Programming (OOP)**
* **ArrayList**
* **Scanner**
* **Java Collections Framework**

## OOP Concepts Used

### 1. Encapsulation

Student information is stored using private variables and accessed through getters and setters.

```java
private int studentId;
private String course;
private double marks;
```

### 2. Abstraction

The `Person` class is an abstract class containing the common properties of a person.

```java
abstract class Person {
    public abstract void displayDetails();
}
```

### 3. Inheritance

The `Student` class inherits properties and methods from the `Person` class.

```java
class Student extends Person
```

### 4. Polymorphism

The `Student` class overrides the `displayDetails()` method from the `Person` class.

```java
@Override
public void displayDetails() {
    // Student details
}
```

### 5. Constructor

Constructors are used to initialize student objects.

```java
Student(int studentId, String name, int age,
        String course, double marks)
```

## Project Structure

```text
StudentManagement/
│
├── Person.java
├── Student.java
├── StudentManagementSystem.java
└── README.md
```

## Class Description

### Person.java

Contains the common properties of a person:

* Name
* Age

It also contains the abstract `displayDetails()` method.

### Student.java

Extends the `Person` class and contains:

* Student ID
* Course
* Marks
* Grade calculation
* Pass/Fail calculation
* Student details display

### StudentManagementSystem.java

Contains the main application and menu.

It handles:

* Adding students
* Displaying students
* Searching students
* Updating students
* Deleting students
* Running the application

## How to Run

### Step 1: Clone the Repository

```bash
git clone <your-repository-url>
```

### Step 2: Open the Project

Open the project in:

* VS Code
* IntelliJ IDEA
* Eclipse

### Step 3: Compile

From the project directory:

```bash
javac StudentManagement/*.java
```

### Step 4: Run

```bash
java StudentManagement.StudentManagementSystem
```

## Example

```text
===== STUDENT MANAGEMENT SYSTEM =====

1. Add Student
2. Display Students
3. Search Student
4. Update Student
5. Delete Student
6. Exit

Enter your choice: 1

Enter Student ID: 101
Enter Name: Rahul
Enter Age: 20
Enter Course: BCA
Enter Marks: 85

Student added successfully!
```

Displaying the student:

```text
----------------------------
Student ID : 101
Name       : Rahul
Age        : 20
Course     : BCA
Marks      : 85.0
Grade      : A
Status     : PASS
```

## Grade System

|    Marks | Grade |
| -------: | :---- |
|   90–100 | A+    |
|    80–89 | A     |
|    70–79 | B     |
|    60–69 | C     |
|    40–59 | D     |
| Below 40 | F     |

## Learning Objectives

This project helps beginners understand:

* Java classes and objects
* Constructors
* Inheritance
* Encapsulation
* Abstraction
* Polymorphism
* Method overriding
* ArrayList
* Loops and conditional statements
* User input using Scanner
* Menu-driven applications

## Future Improvements

The project can be extended by adding:

* Database connectivity using MySQL
* JDBC
* Student login system
* Admin login
* GUI using Java Swing or JavaFX
* Attendance management
* Multiple subjects and marks
* File handling
* Exception handling
* Sorting and filtering students

## Author

**Uditya Septa**

BCA Student | Java | OOP | Web Development

---

## License

This project is created for **learning and educational purposes**.
