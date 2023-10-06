<!DOCTYPE html>
<html>
<body>

<h1>Java Tools</h1>

<p>This repository contains a collection of Java utility classes designed to simplify common programming tasks. Each class addresses specific aspects of Java programming and offers usage examples.</p>

<h2>Table of Contents</h2>
<ul>
    <li><a href="#settergettergenerator">SetterGetterGenerator</a></li>
    <li><a href="#pwprintln">PWPrintln</a></li>
    <li><a href="#keyboard">Keyboard</a></li>
    <li><a href="#collection-tmarraylist-and-tmlinkedlist">Collection - TMArrayList and TMLinkedList</a></li>
</ul>

<h2 id="settergettergenerator">SetterGetterGenerator</h2>

<h3>Overview</h3>

<p>The SetterGetterGenerator utility class automates the generation of constructor, setter, and getter methods for Java classes' fields.</p>

<h3>Usage</h3>

<ol>
    <li>Compile the SetterGetterGenerator class:</li>
    <pre>javac SetterGetterGenerator.java</pre>
   <ul>
    <li>Run the compiled class, providing the class name as a command-line argument:</li>
    <pre>java SetterGetterGenerator com.example.MyClass</pre>
   </ul>
<ul>
    <li>To generate constructors along with setters and getters, use the constructor=true flag:</li>
    <pre>java SetterGetterGenerator com.example.MyClass constructor=true</pre>
</ul>
      
</ol>

<p>The utility generates constructor, setter, and getter methods for the class fields, saving them in a temporary file named tmp.tmp.</p>

<h3>Example</h3>

<p>Assuming you have a class Person with fields name and age, running:</p>
<pre>java SetterGetterGenerator Person</pre>

<p>Generates constructor, setter, and getter methods for the name and age fields.</p>

<h2 id="pwprintln">PWPrintln</h2>

<h3>Overview</h3>

<p>The PWPrintln utility class reads lines from an input file and generates Java code lines that can be used to print each line to a PrintWriter. It handles escaping double quotes within the lines.</p>

<h3>Usage</h3>

<ol>
    <li>Compile the PWPrintln class:</li>
    <pre>javac PWPrintln.java</pre>
    <ul>
    <li>Run the compiled class, providing the input file's name as a command-line argument:</li>
    <pre>java PWPrintln input.txt</pre>
    </ul>
</ol>

<p>The utility creates a temporary Java file named tmp.tmp containing Java code lines for printing each line from the input file to a PrintWriter.</p>

<h3>Example</h3>

<p>Given an input file input.txt with content:</p>
<pre>
Hello, World!
This is a test.
</pre>

<p>Running the utility as follows:</p>
<pre>java PWPrintln input.txt</pre>

<p>Generates Java code for printing the lines to a PrintWriter.</p>

<h2 id="keyboard">Keyboard</h2>

<h3>Overview</h3>

<p>The Keyboard utility class simplifies user input reading by providing methods to read strings, characters, and various numeric types from the keyboard using a BufferedReader.</p>

<h3>Usage</h3>

<ol>
    <li>Import the necessary package:</li>
    <pre>import com.java.util.*;</pre>
    <ul>
    <li>Create an instance of the Keyboard class:</li>
    <pre>Keyboard keyboard = new Keyboard();</pre>
</ul>
    <ul>
    <li>Use provided methods to read user input:</li>
    <pre>
String inputString = keyboard.getString("Enter a string: ");
char inputChar = keyboard.getCharacter("Enter a character: ");
long inputLong = keyboard.getLong("Enter a long: ");
int inputInt = keyboard.getInt("Enter an int: ");
    </pre>
    </ul>
</ol>

<h3>Example</h3>

<p>Refer to the provided KeyboardExample class for usage examples.</p>

<h2 id="collection-tmarraylist-and-tmlinkedlist">Collection - TMArrayList and TMLinkedList</h2>

<h3>Overview</h3>

<p>This section covers two utility classes: TMArrayList and TMLinkedList, designed for working with collections in Java, including lists.</p>

<h4>TMArrayList</h4>

<p>TMArrayList is an array-based list implementation.</p>

<h4>TMLinkedList</h4>

<p>TMLinkedList is a linked list implementation.</p>

<h3>Usage</h3>

<ol>
    <li>Import the necessary package:</li>

 
    import com.java.util.*;
<pre>
public class TMArrayListExample {
    public static void main(String[] args) {
        // Create a TMArrayList
        TMArrayList list = new TMArrayList();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Remove an element at a specific index
        int removedElement = list.removeAt(2); // Removes the element at index 2 (30)
        System.out.println("Removed element: " + removedElement);

        // Get an element at a specific index
        int elementAtIndex = list.get(2); // Gets the element at index 2 (40)
        System.out.println("Element at index 2: " + elementAtIndex);

        // Iterate through the elements using forEach
        System.out.println("Iterating through elements:");
        list.forEach(new TMListItemAcceptor() {
            @Override
            public void accept(int item) {
                System.out.println(item);
            }
        });

        // Update an element at a specific index
        list.update(1, 25); // Updates the element at index 1 (20) to 25

        // Iterate through the updated elements
        System.out.println("Iterating through updated elements:");
        list.forEach(new TMListItemAcceptor() {
            @Override
            public void accept(int item) {
                System.out.println(item);
            }
        });
    }
}
</pre>

    <li>Create an instance of either TMArrayList or TMLinkedList based on your preference:</li>
=======
    <pre>import com.java.util.*;</pre>
<ul>    <li>Create an instance of either TMArrayList or TMLinkedList based on your preference:</li>
>>>>>>> 9a160925cf4cbbb7dec3514a37470d07063228f9:readme.md
    <pre>
TMArrayList arrayList = new TMArrayList();
// OR
TMLinkedList linkedList = new TMLinkedList();
    </pre>
</ul>
<ul>
    <li>Use provided methods to perform operations on the collection:</li>
    <pre>
arrayList.add(element);
linkedList.add(element);
arrayList.remove(element);
linkedList.remove(element);
// ... and more
    </pre>
    </ul>

</ol>

<h3>Example</h3>

<h4>TMArrayList Examples</h4>

<pre>
// ... Previous content ...

// Iterate through the array list and print elements
arrayList.forEach(data -> System.out.println(data));

// ... Rest of the content ...
</pre>

<h4>TMLinkedList Examples</h4>

<pre>
// ... Previous content ...

// Iterate through the linked list and print elements
linkedList.forEach(data -> System.out.println(data));

// ... Rest of the content ...
</pre>

<p>These examples demonstrate the usage of methods provided by both TMArrayList and TMLinkedList, such as adding elements, getting elements by index, removing elements, getting the size, clearing the collection, updating elements, copying elements to/from other collections, appending elements, and iterating through collections. You can customize and expand these examples based on your specific requirements.</p>

</body>
</html>
