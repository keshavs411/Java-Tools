# Java Utility Classes

This repository contains various Java utility classes designed to simplify common programming tasks. Each class addresses specific aspects of Java programming and offers usage examples.

## SetterGetterGenerator

### Overview

The `SetterGetterGenerator` utility class automates the generation of constructor, setter, and getter methods for Java classes' fields.

### Usage

 **Compile the SetterGetterGenerator class:**

   ```bash
   javac SetterGetterGenerator.java

1) Run the compiled class, providing the class name as a command-line argument:
java SetterGetterGenerator com.example.MyClass

To generate constructors along with setters and getters, use the `constructor=true` flag:
java SetterGetterGenerator com.example.MyClass constructor=true

2) The utility generates constructor, setter, and getter methods for the class fields, saving them in a temporary file named `tmp.tmp`.

Example
Assuming you have a class `Person` with fields `name` and `age`, running:

java SetterGetterGenerator Person
Generates constructor, setter, and getter methods for the `name` and `age` fields.


PWPrintln
Overview
The PWPrintln utility class reads lines from an input file and generates Java code lines that can be used to print each line to a PrintWriter. It handles escaping double quotes within the lines.

Usage
1)Compile the PWPrintln class:

javac PWPrintln.java

2) Run the compiled class, providing the input file's name as a command-line argument:

java PWPrintln input.txt

3) The utility creates a temporary Java file named tmp.tmp containing Java code lines for printing each line from the input file to a PrintWriter.

Example
Given an input file input.txt with content:

Hello, World!
This is a test.

Running the utility as follows:

java PWPrintln input.txt

Generates Java code for printing the lines to a PrintWriter.




