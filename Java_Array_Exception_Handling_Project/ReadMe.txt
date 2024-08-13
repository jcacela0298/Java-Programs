I built an array exception handling Java program that tests various exception handling scenarios for arrays.

If you would like a tutorial on how to upload/download Java Eclipse projects to/from GitHub, check out my YouTube video: https://www.youtube.com/watch?v=qCrTzBX3OOg&t=2s

To use this program, open the .Java files in your favorite IDE for Java (I use Eclipse), and after ensuring that each file is within the same package, run the ArrayUtilsDemo.java file. Once you do so, it will run through each of the exception handling scenarios and should yield "OK" results for each test.

There is another file in this folder called Perfect Output.txt that shows the correct output.
.
.
.
.
.
During this project I learned more about class inheritance by extending other classes, constructor classes, super(parameters) for inheritance, exception handling method definition containing "throws" + exception name, (here is an example: public static int minValue(int[] list)  throws BadArrayException {} ), throw statements within if statements (example:  throw new BadArrayException("Array is null");), how to initialize a variable to the first element of an array (int min = list[0];), how ArrayIndexOutOfBoundsException takes an exception object parameter and how this exception is already part of Java and does not need a new class to define it, how to manipulate for loops to start at a certain index and to assign elements of one array starting at that certain index into a brand new array, (which I learned in the copyRange method in the ArrayUtils.java class), returning the index of the first matching value only after one loop pass by including the return function within the loop as seen in the "indexOf" method, as well as how to return the index of a the last occurance of a matching value by setting a variable to that value within the loop and then placing the return function after the loop, and learning that when an exception is thrown, most commonly the  exception is thrown back to the calling code to handle for throwing / catching, and how in these cases the client code should have the exception condition in it's catch block, how try  catch blocks don't execute the rest of the try block if a exception is thrown properly, how "Exception" catches most other unexpected exceptions, how e.toString is how to print the thrown exception's message parameter, how to copy one array into another: (int[] list8copy = arrayCopyOf(list8);), and how to test to see if two arrays are equal: 
if (!arrayEquals(list8, list8copy)) {
                System.out.println("  ERROR - minValue altered the contents of the array (it can't change the array)");
            }
 
