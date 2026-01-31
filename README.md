1. ### PRIMITIVE
## Definition:
Primitive data types store simple values directly in memory (not objects)
- byte, short, int, long
- float, double
- char
- boolean
# Example
int age = 25;
double price = 99.9
char grade = 'A';
boolean isActive = true;
byte myByte = -128 to 127;
short degree = -32,768 to 32,767

2. ### REFERENCE TYPES
## Definition
Reference types stores memory addresses (refs) to objects
- Strings
- Arrays
- Classes
- Interfaces
# Examples
String name = "John";
int[] scores = {80, 90, 100}

3. ### WRAPPER CLASSES
## Definition
Wrapper classes converts primitives to objects
Primitive -> Wrapper
- int -> Integer
- double -> Double
- boolean -> Boolean
# Examples
int x = 10;
Integer y = Integer.valueOf(x); // boxing
int z = y.intValue(); // unboxing
## NB: Why they matter
- Required for Collections
- Provide utility methods

4. ### ARRAYS AND COLLECTIONS
## Definition
Arrays are for fixed-size and same-type elements
Collections are dynamic data structures from java.util
Collections Common types:
- List -> ArrayList
- Set -> HashSet (doesn't allow duplicates)
- Map -> HashMap
# Array Example
int[] numbers = {1,2,3,4,5};
System.out.println(numbers[0]);
# Collections Example
List<String> names = new ArrayList<>();
names.add("John");
names.add("Jane");

5. ### CONTROL FLOW STATEMENTS
## Example
# If-Else
if (age >= 18) {
 System.out.println("Adult");
} else {
 System.out.println("Minor");
}
# Ternary Operator Example
String result = (age >= 18) ? "Adult" : "Minor";
# Switch
int day = 2;
switch (day) {
 case 1:
    System.out.println("Monday");
    break;
 case 2:
    System.out.println("Tuesday");
    break;
 case 3:
    System.out.println("Wednesday");
    break;
 default:
    System.out.println("Unknown");
}

6. ### OOP: CLASSES AND OBJECTS
## Definition
Classes are blueprint of an object
Objects are instance of a class
# Class Example
class Person {
    String name;
    int age;
}
# Object Example
Person p = new Person;
p.name = "James"
p.age = 24;

7. ### METHOD OVERLOADING
## Definition
Same method name, different parameters
# Examples
class MathUtils{
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

8. ### SUPERCLASS
## Definition
A class that is inherited by another class
# Example
class Animal {
    void sound() {
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal {
}

9. ### this KEYWORD
## Definition
Refers to the current object
# Example
class Person {
    String name;

    Person(String name) {
        this.name = name
    }
}

10. ### SCANNER
## Definition
Used to read user inputs
# Example
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
System.out.println("Enter name");
String name = scanner.nextLine();

11. ### LOOPS
## For Loop
for(int i = 0; i<5; 1++) {
    System.out.println(i);
}
## While Loop
int i = 0;
while (i<5) {
    i++
}
## Do-While Loop
do {
    System.out.println("Runs at least once")
} while (false);

12. ### INTERFACES
## Definition
A contract that a class must implement. It means the implementation of the method will be found in another class
# Example
interface Payment {
    void pay() { // method name must be lowercase
        System.out.println("Pay with Card");
    }
}
class CardPayment implements Payment {
    public void pay() {
        System.out.println("Pay with Card");
    }
}

13. ### ERROR AND EXCEPTION HANDLING (Try-Catch)
## Definition
Handles runtime errors gracefully. Handle errors in the catch block
Types:
- Runtime
- Compile time
# Example
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero);
} finally {
    System.out.println("Done")
}

14. ### GENERICS
## Definition
Allows for type safety in classes and methods
# Example 
List<String> names = new ArrayList<String>();
names.add("Grace");
// names.add(10); will throw compile-time error

class Box<T> {
    T value;
    
    void set(T value) {
        this.value = value
    }

    T get() {
        return value
    }
}
Box<String> stringBox = new Box<>();
stringBox.set("Hello");
System.out.println("Value: " + stringBox.get());

Box<Integer> intBox = new Box<>();
intBox.set(50);
System.out.println("Value: " + stringBox.get());