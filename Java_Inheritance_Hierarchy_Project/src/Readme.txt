I built a program that can ask the user for a list of shapes -- the user can specify colors (red, blue, or green) and shape parameters such as radius, length, and width depending on the shape. The program will then automatically calculate the areas accordingly. Then, this list of shapes with specified features will be added into an array and will be sorted based on the areas of the shapes. 

If you would like a tutorial on how to upload/download Java Eclipse projects to/from GitHub, check out my YouTube video: https://www.youtube.com/watch?v=qCrTzBX3OOg&t=2s

To use this program, open the .Java files in your favorite IDE for Java (I use Eclipse). Please ensure that the name of the package at the top of the file corresponds to the name of the project's package that the file is in. Then, run the ShapeDemo.java file which contains the main method, making sure the Shape.java file is the first one to compile since this is the base class and the other classes extend it. Once the ShapeDemo file is running, it will prompt you to enter the shapes and their specifications. Keep in mind that this list is designed to hold up to 50 items.

There is another file in this folder called Output.txt that has an input and output example.
.
.
.
.
.
During this project, I learned more about scanner functionality, overall Java syntax, packages, inheritance, private instance variable accessibility, ensuring the order of assigning parameters to instance variables in a statement, overriding methods, using "super" to identify  parameters from the base class in child classes, employing Math.PI and Math.pow(x,y) for math functions, new line syntax for methods that return information (\n), defining a method that accepts arrays with the type being the name of the class (instead of String[] array it is Shape[] array since Shape is the name of the class we are making more references to), employing the bubble sort algorithm to swap array components based on area, the swapped function in the bubble sort algorithm, how "null" can break a loop, while loops, dynamic binding to retrieve specific information of classes with methods that override their base class methods, keeping console window alive until enter is pressed, the potential for sc.close functionality to prevent data leaking, equalsIgnoreCase method, "continue;" which disregards the current iteration and makes the loop start new again, how to incrementally add shape information from the user into an array, order of compilation, and in general adding projects to GitHub.
