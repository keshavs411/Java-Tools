# Java Utility Classes

This README provides an overview of various Java utility classes designed to simplify common programming tasks. Each class addresses specific aspects of Java programming and offers usage examples.

## SetterGetterGenerator

**Overview**

The `SetterGetterGenerator` utility class automates the generation of constructor, setter, and getter methods for Java classes' fields.

**Usage**
**Compile the SetterGetterGenerator class:**
javac SetterGetterGenerator.java

1) Run the compiled class, providing the class name as a command-line argument:

java SetterGetterGenerator com.example.MyClass
To generate constructors along with setters and getters, use the constructor=true flag:
java SetterGetterGenerator com.example.MyClass constructor=true

2)The utility generates constructor, setter, and getter methods for the class fields, saving them in a temporary file named tmp.tmp.

Example
Assuming you have a class Person with fields name and age, running:

java SetterGetterGenerator Person

Generates constructor, setter, and getter methods for the name and age fields.

PWPrintln
Overview
The PWPrintln utility class reads lines from an input file and generates Java code lines that can be used to print each line to a PrintWriter. It handles escaping double quotes within the lines.

Usage
Compile the PWPrintln class:

bash
Copy code
javac PWPrintln.java
Run the compiled class, providing the input file's name as a command-line argument:

bash
Copy code
java PWPrintln input.txt
The utility creates a temporary Java file named tmp.tmp containing Java code lines for printing each line from the input file to a PrintWriter.

Example
Given an input file input.txt with content:

bash
Copy code
Hello, World!
This is a test.
Running the utility as follows:

bash
Copy code
java PWPrintln input.txt
Generates Java code for printing the lines to a PrintWriter.

Keyboard
Overview
The Keyboard utility class simplifies user input reading by providing methods to read strings, characters, and various numeric types from the keyboard using a BufferedReader.

Usage
Import the necessary package:

java
Copy code
import com.java.util.*;
Create an instance of the Keyboard class:

java
Copy code
Keyboard keyboard = new Keyboard();
Use provided methods to read user input:

java
Copy code
String inputString = keyboard.getString("Enter a string: ");
char inputChar = keyboard.getCharacter("Enter a character: ");
long inputLong = keyboard.getLong("Enter a long: ");
int inputInt = keyboard.getInt("Enter an int: ");
// ... and more
Example
Refer to the provided KeyboardExample class for usage examples.

Collection - TMArrayList and TMLinkedList
Overview
This section covers two utility classes: TMArrayList and TMLinkedList, designed for working with collections in Java, including lists.

TMArrayList
TMArrayList is an array-based list implementation.
TMLinkedList
TMLinkedList is a linked list implementation.
Usage
Import the necessary package:

java
Copy code
import com.java.util.*;
Create an instance of either TMArrayList or TMLinkedList based on your preference:

java
Copy code
TMArrayList arrayList = new TMArrayList();
// OR
TMLinkedList linkedList = new TMLinkedList();
Use provided methods to perform operations on the collection:

java
Copy code
arrayList.add(element);
linkedList.add(element);
arrayList.remove(element);
linkedList.remove(element);
// ... and more
Example
TMArrayList Examples
java
Copy code
// ... Previous content ...

// Iterate through the array list and print elements
arrayList.forEach(data -> System.out.println(data));

// ... Rest of the content ...
TMLinkedList Examples
java
Copy code
// ... Previous content ...

// Iterate through the linked list and print elements
linkedList.forEach(data -> System.out.println(data));

// ... Rest of the content ...
These examples demonstrate the usage of methods provided by both TMArrayList and TMLinkedList, such as adding elements, getting elements by index, removing elements, getting the size, clearing the collection, updating elements, copying elements to/from other collections, appending elements, and iterating through collections. You can customize and expand these examples based on your specific requirements.
